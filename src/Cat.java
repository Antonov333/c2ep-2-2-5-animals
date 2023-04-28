public class Cat extends Animal {

    private boolean looksCute;

    public Cat(String name, boolean looksCute) {
        setSpecies("cat");
        setFood("milk");
        setLocation("house");
        setName(name);
        this.looksCute = looksCute;
    }

    public boolean isLooksCute() {
        return looksCute;
    }

    public void setLooksCute(boolean looksCute) {
        this.looksCute = looksCute;
    }

    @Override
    public void makeNoise() {
        System.out.println(getSpecies() + " " + getName() + " meows");
    }

    @Override
    public void eat() {
        System.out.println(getSpecies() + " " + getName() + " eats");
    }

    @Override
    public void sleep() {
        System.out.println(getSpecies() + " " + getName() + " sleeps");
    }
}
