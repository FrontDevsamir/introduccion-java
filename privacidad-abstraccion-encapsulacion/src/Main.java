public class Main {
    public static void main(String[] args) {
        System.out.println("================");

        //vehiculo.tipo = "Lamborguini";
        //System.out.println(vehiculo.tipo);

        //Coche coche = new Coche();
        //coche.velocidadMaxima = 14;
        //coche.matricula = "A4B-53E";
        Animal gato = new Animal();

    }
}



class Vehiculo {
    //private String tipo; // Define propiedad privada
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula) {
        return matricula == "AD4";
    }

}


class Coche extends Vehiculo {

}


class CocheElectrico extends Coche {

}



//ABSTRACCION
abstract class Persona {
    int edad;
    String nombre;

    public Persona() {
        System.out.println("Estoy en el constructor de Persona");
    }

    abstract public String getEdad();
    abstract public void setEdad(int edad);


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}



class Alumno extends Persona {

    public String getEdad() {
        return "Esta es la edad del Alumno";
    }

    public void setEdad(int edda) {
        //Aqui se setea la edad de Alumno
    }

}