
public class Perro extends Animal implements Mascota {


    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        System.out.println("Guau guau");
    }


    public void moverse() {
        System.out.println("El perro corre");
    }


    public void jugar() {
        System.out.println("El perro juega con la pelota");
    }
}
