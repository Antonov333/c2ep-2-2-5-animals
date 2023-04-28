public class Veterinarian {
    public static void treatAnimal(Animal animal) {
        System.out.println("Please keep " + animal.getSpecies() + " " + animal.getName() + " in " + animal.getLocation()
                + " and provide with good " + animal.getFood());
    }
}
