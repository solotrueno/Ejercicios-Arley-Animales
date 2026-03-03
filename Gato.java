
public class Gato extends Animal implements Mascota {


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        System.out.println("Miau");
    }


    public void moverse() {
        System.out.println("El gato salta sigilosamente");
    }


    public void jugar() {
        System.out.println("El gato juega con un ovillo");
    }
}
