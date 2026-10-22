public class Main {

    public static void main(String[] args) {

        separador("SISTEMA DE URNA DE SORTEO GENÉRICA");

        separador("PRUEBA 1 - Urna Polimórfica (Urna<Elemento>)");

        Urna<Elemento> urnaPolimorfica = new Urna<>();

        Participante p1 = new Participante("Participante del concurso anual", "30456789", "Ana García");
        Participante p2 = new Participante("Participante del concurso anual", "28901234", "Luis Martínez");
        Premio       pr1 = new Premio("Primer premio", 1, 50000.00);
        Premio       pr2 = new Premio("Segundo premio", 2, 20000.00);
        Entrada      e1  = new Entrada("Recital de Rock Nacional", "ENT-001", 45);
        Entrada      e2  = new Entrada("Recital de Rock Nacional", "ENT-002", 102);

        urnaPolimorfica.agregarElemento(p1);
        urnaPolimorfica.agregarElemento(p2);
        urnaPolimorfica.agregarElemento(pr1);
        urnaPolimorfica.agregarElemento(pr2);
        urnaPolimorfica.agregarElemento(e1);
        urnaPolimorfica.agregarElemento(e2);

        System.out.println("Elementos en la urna polimórfica: " + urnaPolimorfica.consultarCantidad());
        System.out.println();

        System.out.println(">> Iniciando sorteos...");
        System.out.println();

        while (!urnaPolimorfica.estaVacia()) {
            Elemento sorteado = urnaPolimorfica.extraerElemento();
            System.out.println("  Sorteado → " + sorteado.mostrarInfo());
            System.out.println("  Elementos restantes: " + urnaPolimorfica.consultarCantidad());
            System.out.println();
        }

        separador("PRUEBA 2 - Intento de sorteo con urna vacía");

        System.out.println("La urna polimórfica está vacía: " + urnaPolimorfica.estaVacia());
        System.out.println("Intentando extraer un elemento de una urna vacía...");
        System.out.println();

        try {
            urnaPolimorfica.extraerElemento();
        } catch (IllegalStateException ex) {
            System.out.println("  ¡Excepción controlada! → " + ex.getMessage());
        }

        separador("PRUEBA 3 - Urna Homogénea (Urna<Premio>)");

        Urna<Premio> urnaPremios = new Urna<>();

        urnaPremios.agregarElemento(new Premio("Auto 0km",      10, 3500000.00));
        urnaPremios.agregarElemento(new Premio("Viaje a Europa", 11,  800000.00));
        urnaPremios.agregarElemento(new Premio("Smart TV 55\"",  12,  180000.00));

        System.out.println("Premios en la urna: " + urnaPremios.consultarCantidad());
        System.out.println();

        System.out.println(">> Sorteando premios...");
        System.out.println();

        int lugar = 1;
        while (!urnaPremios.estaVacia()) {
            Premio premiado = urnaPremios.extraerElemento();
            System.out.println("  Lugar N°" + lugar + " → " + premiado.mostrarInfo());
            System.out.println("  Premios restantes: " + urnaPremios.consultarCantidad());
            System.out.println();
            lugar++;
        }

        separador("PRUEBA 4 - Verificación de retiro y estado final");

        Urna<Participante> urnaParticipantes = new Urna<>();
        urnaParticipantes.agregarElemento(new Participante("Evento VIP", "11111111", "Pepe Pepon"));
        urnaParticipantes.agregarElemento(new Participante("Evento VIP", "22222222", "Juan Jjje"));
        urnaParticipantes.agregarElemento(new Participante("Evento VIP", "33333333", "Jorge El Curioso"));

        System.out.println("Participantes antes del sorteo: " + urnaParticipantes.consultarCantidad());
        System.out.println();

        Participante ganador = urnaParticipantes.extraerElemento();
        System.out.println("  Ganador → " + ganador.mostrarInfo());
        System.out.println("  Participantes después del sorteo: " + urnaParticipantes.consultarCantidad());
        System.out.println();

        System.out.println("  El ganador fue retirado de la urna.");
        System.out.println("  La urna está vacía: " + urnaParticipantes.estaVacia());

        separador("FIN DEL PROGRAMA");
    }


    private static void separador(String titulo) {
        System.out.println();
        System.out.println("══════════════════════════════════════════════════");
        System.out.println("  " + titulo);
        System.out.println("══════════════════════════════════════════════════");
        System.out.println();
    }
}
