public class Main {
    public static void main(String[] args) {

        int suma = 0;

        suma = suma + 16;

        System.out.println(suma);


        int valores[] = new int[5];
        int posicion = 4;
        System.out.println(valores[posicion]);
        funcion1();

    }


    public static  void funcion1() {
        funcion2();
    }


    public static void funcion2() {
        funcion3();
    }

    public static void funcion3() {
        funcion4();
    }

    public static void funcion4() {
        System.out.println("Hola");
        System.out.println(15 / 0);
    }
}