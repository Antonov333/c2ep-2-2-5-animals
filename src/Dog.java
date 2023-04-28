public class Dog extends Animal {

    private boolean loveKids;

    public Dog(String name, boolean loveKids) {
        setSpecies("dog");
        setFood("meat");
        setLocation("yard");
        setName(name);
        this.loveKids = loveKids;
    }

    public boolean getLoveKids() {
        return loveKids;
    }

    public void setLoveKids(boolean loveKids) {
        this.loveKids = loveKids;
    }

    @Override
    public void makeNoise() {
        System.out.println(getSpecies() + " " + getName() + " barks");
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
