public class Main {
    public static void main(String[] args) {

        double temperatura = 15.9;
        imprime(temperatura);

        int array[] = new int[5];
        System.out.println(array[4]);

        String palabras[] = new String[]{"One", "Two", "Three"};


        // ERROR DE OVERFLOW
        byte numero = 127;
        System.out.println(numero);

        numero += 5;
        System.out.println(numero);
    }


    public static  void imprime(double valor) {
        System.out.println(valor);
    }
}