public class porcentajes {
    public static void main(String[] args){
        int Porcentaje = 70;

        if(Porcentaje >= 90){
            System.out.println("Es nivel maximo");
        } else if (Porcentaje >= 75 && Porcentaje < 90){
            System.out.println("Es nivel medio");
        } else if (Porcentaje >= 50 && Porcentaje < 75) {
            System.out.println("Es nivel regular");
        } else {System.out.println("Es inferior");

        }
    }
}
