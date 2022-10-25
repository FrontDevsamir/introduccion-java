public class Main {
    public static void main(String[] args) {
        System.out.println("==========================");

        Persona persona1 = new Persona(20, "Samir", "963527463");
        System.out.println(persona1.getNombre() + " Tiene " + persona1.getEdad() + " Años Y su telefono es " + persona1.getTelefono());
        persona1.setEdad(19);
        persona1.setNombre("Samir");
        persona1.setTelefono("9253745286");
        System.out.println("==========================");
        System.out.println(persona1.getNombre() + " Tiene " + persona1.getEdad() + " Años Y su telefono es " + persona1.getTelefono());
    }
}




///CLASE PERSONA
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    //getters
    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
}