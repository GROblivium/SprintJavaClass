package Ist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContenedorCap {
    private int cuentaCapacitacion = 1;
    private List<Capacitacion> capacitaciones;
    public ContenedorCap() {
        capacitaciones = new ArrayList<>();
    }
    public void listarCapacitaciones(){
        for (Capacitacion capacitacion : capacitaciones) {
            capacitacion.mostrarDetalle();
        }
    }
    public void almacenarCapacitacion(){

        Scanner entrada = new Scanner(System.in);
        Capacitacion capacitacion = new Capacitacion();

        capacitacion.setId(cuentaCapacitacion);

        String rut;
        do {
            System.out.println("Ingrese Rut de la empresa");
            rut = entrada.nextLine().trim();

            if (rut.isEmpty()) {
                System.out.println("El rut es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            }
        } while (rut.isEmpty());

        capacitacion.setRut(rut);


        String dia;
        do {
            System.out.println("Ingrese día de la capacitación entre lunes y Domingo):");
            dia = entrada.nextLine().trim().toLowerCase();

            if (Validador.validaDia(dia)) {
                capacitacion.setDia(dia);
            } else {
                System.out.println("Día inválido. Intente nuevamente.");
            }
        } while (!Validador.validaDia(dia));


        String lugar;
        do {
            System.out.println("Ingrese lugar de la capacitación");
            lugar = entrada.nextLine().trim();

            if (lugar.isEmpty()) {
                System.out.println("El lugar es obligatorio. Por favor, " +
                        "ingrese un dato válido.");
            } else if (lugar.length() < 10 || lugar.length() > 50) {
                System.out.println("El area debe tener entre 10 y 50 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }
        } while (lugar.isEmpty() || lugar.length() < 10 || lugar.length() > 50);
        capacitacion.setLugar(lugar);


        String duracion;
        do {
            System.out.println("Ingrese duración de la capacitación");
            duracion = entrada.nextLine().trim();

            if (duracion.length() > 70) {
                System.out.println("La duración no debe sobrepasar los 70 caracteres. " +
                        "Por favor, ingrese un dato válido.");
            }

        } while (duracion.length() > 70);


        String hora;
        do {
            System.out.println("Ingrese hora de la capacitación (formato HH:MM):");
            hora = entrada.nextLine().trim();

            if (Validador.validaRun(hora)) {
                capacitacion.setHora(hora);
            } else {
                System.out.println("Hora inválida. Intente nuevamente.");
            }
        } while (!Validador.validaHora(hora));

        int cantidad;
        do {
            System.out.println("Ingrese cantidad de asistentes a la capacitación\"");
            cantidad = entrada.nextInt();

            if (cantidad < 0  || cantidad > 150) {
                System.out.println("La cantidad es obligatoria y debe ser entre 0 y 1000 asistentes");

            }
        } while (cantidad < 0  || cantidad > 1000);

        capacitacion.setCantidadAsistentes(cantidad);
        capacitaciones.add(capacitacion);

        cuentaCapacitacion = cuentaCapacitacion++;

    }


}
