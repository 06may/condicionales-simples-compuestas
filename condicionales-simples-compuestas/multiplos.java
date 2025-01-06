package variables;

public class multiplos {
    public static void main(String[] args ){
        int NumberOne = 10;
        int NumberTwo = 5;
        if (NumberOne == 0) {
            System.out.println("Error: no se puede dividir por cero");
        }else if (NumberOne % NumberTwo == 0) {
            System.out.println( NumberOne + " es multiplo de " + NumberTwo );
        } else {System.out.println(NumberOne + "no es multiplo de" + NumberTwo);



        }

    }
}
