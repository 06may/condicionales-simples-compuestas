package variables;

public class CalificacionEstudiante {
    public static void main(String[] args) {
        double decimal = 5.5;


        if (decimal < 0 || decimal > 10) {
            System.out.println("La calificación debe estar entre 0 y 10.");
        } else if (decimal <= 6) {
            System.out.println("Estás reprobado.");
        } else {
            System.out.println("Aprobaste.");
        }
    }
}
