public class Horse extends Animal {

    private boolean runsFast;

    public Horse(String name, boolean runsFast) {
        setSpecies("horse");
        setFood("grass");
        setLocation("farm");
        setName(name);
        this.runsFast = runsFast;
    }

    public boolean getRunsFast() {
        return runsFast;
    }

    public void setRunsFast(boolean runsFast) {
        this.runsFast = runsFast;
    }

    @Override
    public void makeNoise() {
        System.out.println(getSpecies() + " " + getName() + " neighs");
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
