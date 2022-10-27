public class Main {
    public static void main(String[] args) {
        System.out.println("==============================");
        Cliente cliente =  new Cliente(20, "Samir", 927354672, 1000);
        cliente.Mostrar();
    }
}


class Persona {
    int edad;
    String nombre;
    int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

}



class Cliente extends Persona {
    int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }


    public void Mostrar() {
        System.out.println("Nombre : " + this.nombre + ", Edad : " + this.edad + ", Telefono : " + this.telefono + ", Creditos : " + this.credito);
    }
}




class Trabajador extends Persona {
    int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void Mostrar() {
        System.out.println("Nombre : " + this.nombre + ", Edad : " + this.edad + ", Telefono : " + this.telefono + ", Salario : " + this.salario);
    }
}