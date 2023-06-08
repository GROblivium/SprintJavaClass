package Ist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validador {

    public static boolean validaFecha(String fecha) {
        try {
            // Definir el formato esperado de la fecha
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Intentar parsear la fecha
            LocalDate.parse(fecha, formato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean validaRun(String rut) {


        String rutNumberString = rut.split("-")[0];

        if (rut.length() > 10){
            return false;
        }

        if (!rutNumberString.matches("\\d+")) {
            return false;
        }
        int rutNumber = Integer.parseInt(rutNumberString);

        if (rutNumber >= 0 && rutNumber <= 99999999) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validaHora(String hora) {
        if (hora.length() != 5) {
            return false;
        }
        String[] partes = hora.split(":");
        if (partes.length != 2) {
            return false;
        }
        int horas, minutos;
        horas = Integer.parseInt(partes[0]);
        minutos = Integer.parseInt(partes[1]);
        return horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
    }

    public static boolean validaDia(String dia) {
        return dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") ||
                dia.equals("jueves") || dia.equals("viernes") || dia.equals("sabado") ||
                dia.equals("domingo");
    }


}
