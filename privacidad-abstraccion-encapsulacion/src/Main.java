public class Main {
    public static void main(String[] args) {
        System.out.println("================");
        Vehiculo vehiculo = new Vehiculo();
        //vehiculo.tipo = "Lamborguini";
        //System.out.println(vehiculo.tipo);

        vehiculo.setTipo("Lamborguini");
        System.out.println(vehiculo.getTipo());
    }
}



class Vehiculo {
    private String tipo; // Define propiedad privada
    private int VelocidadMaxima;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}

