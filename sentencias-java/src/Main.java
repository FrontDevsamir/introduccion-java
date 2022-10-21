



public class Main {
    public static void main(String[] args) {

        int numeroIf;

        // Ejercicio de condicional
        numeroIf = 4;

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }
        else {
            System.out.println("Es zero");
        }



        // Ejercicio con while
        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println("El valor ahora es -> " + numeroWhile);
        }


        // Ejercicio con Do-While
        int numeroDowhile = 0;
        do {
            System.out.println("El valor es igual a -> " + numeroDowhile);
        } while (numeroDowhile > 0);




        // Ejercicio con bucle for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++){
            System.out.println("El valor de numeroFor es -> " + numeroFor);
        }



        // Ejercicio con Case Switch
        var estacion = "Primavera";

        switch (estacion) {
            case "Primavera" :
                System.out.println("Estamos en Primavera");
                break;

            case "Otoño" :
                System.out.println("Estamos en Otoño");
                break;

            case "Invierno" :
                System.out.println("Estamos en Invierno");
                break;

            case "Verano" :
                System.out.println("Estamos en Verano");
                break;

            default:
                System.out.println("No es una estacion");
        }
    }
}