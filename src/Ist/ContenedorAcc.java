package Ist;

import java.util.Scanner;

public class ContenedorAcc {

    private int cuentaAccidente = 1;
    private int cuentaVisitaTerreno = 1;
    private int cuentaRevision = 1;
    public void almacenarVisitaTerreno(){
        Scanner entrada = new Scanner(System.in);
        VisitaTerreno visitaTerreno = new VisitaTerreno();

        visitaTerreno.setId(cuentaVisitaTerreno);

        String rut;
        do {
            System.out.println("Ingrese rut del visitador:");
            rut = entrada.nextLine().trim();

            if (Validador.validaRun(rut)) {
                visitaTerreno.setRun(rut);
            } else {
                System.out.println("Rut inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(rut));

        String fecha;
        do {
            System.out.println("Ingrese fecha de la visita (formato DD/MM/AAAA):");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha de visita es obligatoria. Por favor, " +
                        "ingrese una fecha válida.");
            } else if (!Validador.validaFecha(fecha)) {
                System.out.println("Fecha inválida. Por favor, ingrese una fecha " +
                        "en formato DD/MM/AAAA.");
            }
        } while (fecha.isEmpty() || ! Validador.validaFecha(fecha));

        visitaTerreno.setFechaVisita(fecha);

        String hora;
        do {
            System.out.println("Ingrese hora de la visita(formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                visitaTerreno.setHoraVisita(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));

        String lugar;
        do {
            System.out.println("Ingrese lugar de la visita");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar de visita es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El dato el lugar de visita debe tener entre 5 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        visitaTerreno.setLugar(lugar);

        String comentarios;
        do {
            System.out.println("Ingrese comentarios de la visita");
            comentarios = entrada.nextLine().trim();
            if (comentarios.length() > 100) {
                System.out.println("Los comentarios no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (comentarios.length() > 100);
        visitaTerreno.setComentarios(comentarios);
        cuentaAccidente = cuentaAccidente++;
    }

    public void almacenarRevision(){
        Scanner entrada = new Scanner(System.in);
        Revision revision = new Revision();

        revision.setId(cuentaRevision);
        revision.setId_visita(cuentaVisitaTerreno);

        String nombre;
        do {
            System.out.println("Ingrese nombre alusivo a la revisión");
            nombre = entrada.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("El nombre alusivo a la revisión es obligatorio. " +
                        "Por favor, ingrese un dato válido.");
            } else if (nombre.length() < 10 || nombre.length() > 50) {
                System.out.println("El nombre alusivo a la revisión debe tener " +
                        "entre 5 y 50 caracteres. Por favor, ingrese un dato válido.");
            }
        } while (nombre.isEmpty() || nombre.length() < 10 || nombre.length() > 50);
        revision.setNomRevision(nombre);

        String detalle;
        do {
            System.out.println("Ingrese detalle de la revisión");
            detalle = entrada.nextLine().trim();
            if (detalle.length() > 100) {
                System.out.println("El detalle no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (detalle.length() > 100);
        revision.setDetRevision(detalle);
        cuentaRevision = cuentaRevision++;
    }
    public void almacenarAccidente(){
        Scanner entrada = new Scanner(System.in);
        Accidente accidente = new Accidente();

        accidente.setId(cuentaAccidente);

        String run;
        do {
            System.out.println("Ingrese run del accidentado:");
            run = entrada.nextLine().trim();

            if (Validador.validaRun(run)) {
                accidente.setRun(run);
            } else {
                System.out.println("Run inválido. Intente nuevamente.");
            }
        } while (!Validador.validaRun(run));

        String fecha;
        do {
            System.out.println("Ingrese fecha del accidente(formato DD/MM/AAAA):");
            fecha = entrada.nextLine().trim();

            if (fecha.isEmpty()) {
                System.out.println("La fecha de ingreso es obligatoria. Por favor, ingrese una fecha válida.");
            } else if (!Validador.validaFecha(fecha)) {
                System.out.println("Fecha inválida. Por favor, ingrese una fecha en formato DD/MM/AAAA.");
            }
        } while (fecha.isEmpty() || !Validador.validaFecha(fecha));

        accidente.setFechaAccidente(fecha);

        String hora;
        do {
            System.out.println("Ingrese hora del accidente (formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                accidente.setHora(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));

        String lugar;
        do {
            System.out.println("Ingrese lugar del accidente");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El dato el lugar  debe tener entre 5 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        accidente.setLugar(lugar);

        String origen;
        do {
            System.out.println("Ingrese origen del accidente");
            origen = entrada.nextLine().trim();
            if (origen.length() > 100) {
                System.out.println("El origen no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (origen.length() > 100);
        accidente.setOrigen(origen);

        String consecuencia;
        do {
            System.out.println("Ingrese consecuencias del accidente");
            consecuencia = entrada.nextLine().trim();
            if (consecuencia.length() > 100) {
                System.out.println("El consecuencia no  debe sobrepasar los 100 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (consecuencia.length() > 100);
        cuentaAccidente = cuentaAccidente++;
    }
}
