public class Main {
    public static void main(String[] args) {
        System.out.println("==================================");
        Coche coche = new Coche(4, 200); //Sintaxis para crear una instancia de clase
        System.out.println(coche.velocidadActual);
        coche.acelerar();
        System.out.println(coche.velocidadActual);
        //coche.desalerar();


        Coche coche2 = new Coche();
    }
}

// SOBRECARGA DE FUNCIONES , SIRVEN PARA CREAR LAS MISMAS FUNCIONES PERO CON DISTINTAS CARACTERISTICAS


class Coche {
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    //CONSTRUTOR
    public Coche() {
        System.out.println("Estoy en el constructor sin parametros");
    }

    public Coche(int numeroPuertas, int velocidad) {
        System.out.println("Estoy en el constructor con parametros");
        this.numeroPuertas = numeroPuertas; //Cuando el nombre del parametro es igual al de una variable de clase se antepone un this.variable para hacer referencia a la de clase.

        velocidadMaxima = velocidad;
    }

    public void acelerar() {
        velocidadActual = 10;
    }

    public void desalerar() {

    }
}

