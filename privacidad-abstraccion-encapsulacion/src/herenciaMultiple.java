class  Animal {
    public Animal() {

        System.out.println("Este es el constructor de la clase Animal");
    }

    public void saluda() {
        System.out.println("Hola");
    }
}




class Salvaje {
    public Salvaje() {

        System.out.println("Este es el constructor de la clase Salvaje");
    }
}



//HERENCIA MULTIPLE
class Leon extends Salvaje {

}


//HERENCIA JERARQUICA



//HERENCIA HIBRIDA
class A {

}

class B extends A{

}

class C extends A {

}


class D extends B, C {

}



//POLIMORFISMO
//ES LA ACCION DE QUE UNA CLASE PUEDE HEREDAR UN METODO DE SU CLASE PADRE PERO PUEDA SOBREESCRIBIRLA PARA REALIZAR EL MISMO METODOO
//PERO CON DIFERENTE COMPORTAMIENTO.
class Perro extends Animal {
    public void saluda() {
        System.out.println("Soy un Perro que hereda de clase Animal");
    }
}




//INTERFFACES
interface Profesional {
    void Acelerar();
    void Frenar();
}


class Ingeniero implements Profesional {

    public void Acelerar() {

    }


    public void Frenar() {

    }
}