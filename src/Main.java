public class Main {
    public static void main(String[] args) {
        System.out.println("Course 2\nOOP\nextra problem 2-2-5\n");

        Dog arno = new Dog("Arno", true);
        arno.makeNoise();

        Cat lucky = new Cat("Lucky", true);
        lucky.makeNoise();

        Horse spirit = new Horse("Spirit", true);
        spirit.makeNoise();

        Animal[] pets = {arno, lucky, spirit};

        for (int i = 0; i <= pets.length - 1; i++) {
            Veterinarian.treatAnimal(pets[i]);
        }
    }
}