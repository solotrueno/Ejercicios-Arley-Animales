class Principal {

    public static void main(String[] args) {

        Animal[] animales = new Animal[3];

        animales[0] = new Perro("Max", 3);
        animales[1] = new Gato("Luna", 2);
        animales[2] = new Pajaro("Piolín", 1);

        for (Animal animal : animales) {

            animal.mostrarInfo();
            animal.hacerSonido();
            animal.moverse();

            if (animal instanceof Mascota) {
                Mascota mascota = (Mascota) animal;
                mascota.jugar();
            }

            System.out.println("-----------------------");
        }
    }
}
