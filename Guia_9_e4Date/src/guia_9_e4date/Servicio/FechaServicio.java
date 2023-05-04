package guia_9_e4date.Servicio;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class FechaServicio {

    Scanner read = new Scanner(System.in);
    Date fecha = new Date();
    Date date1 = new Date();

    public FechaServicio() {
        fecha.getDay();
    }

    @Override
    public String toString() {
        return "FechaServicio{" + "fecha=" + fecha + '}';
    }

    /*
    Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
    Luego los pase por parámetro a un nuevo objeto Date. 
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia)
     */
    public Date fechaNacimiento() {
        System.out.println("Ingrese el año de nacimiento: ");
        System.out.print(">>");
        int aa = (read.nextInt() - 1900);

        System.out.println("Ingres el mes de nacimineto: ");
        System.out.print(">>");
        int mm = (read.nextInt() - 1);

        System.out.println("Ingrese al día de nacimineto: ");
        System.out.print(">>");
        int dd = read.nextInt();

        fecha = new Date(aa, mm, dd);
        System.out.println(fecha.toString());
        return fecha;
    }

    /*
    Método fechaActual que cree un objeto fecha con el día actual. 
    Para esto usaremos el constructor vacío de la clase Date. 
    Ejemplo: Date fechaActual = new Date()
    El método debe retornar el objeto Date
     */
    public Date fechaActual() {

        date1 = fecha;
        System.out.println(date1);
        return date1;
    }

    /*
    Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
    de años entre una y otra (edad del usuario)
     */
    public int diferenciar() {
        LocalDate d1 = LocalDate.parse("2021-03-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d2 = LocalDate.parse("2020-05-30", DateTimeFormatter.ISO_LOCAL_DATE);

        LocalDate d3 = LocalDate.parse("2023-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate d4 = LocalDate.parse("2020-01-23", DateTimeFormatter.ISO_LOCAL_DATE);

        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        Period period = Period.between(d3, d4);

        long diffDays = diff.toDays();
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.println("Diffrence between dates is : " + diffDays + "days");
        System.out.println("Diffrence is : " + years + " year, " + months + " months, " + days + " days");
       
        return years;

    }

}
