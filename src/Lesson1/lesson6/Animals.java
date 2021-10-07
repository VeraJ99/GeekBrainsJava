package lesson6;

public class Animals {
    protected String type;
    protected String name;
    private final float maxRun;
    private final float maxSwim;

    public static int countAnimal = 0;

    public Animals(String type, String name, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++ countAnimal;
    }

    protected boolean run(float distance) {
        return distance <= maxRun;
    }

    protected String showResultRun(float distance) {
        return run(distance) ? " can do it!" : " can't do it!";
    }

    protected boolean swim(float distance) {
        return distance <= maxSwim;
    }
    protected String showResultSwim(float distance) {
        return swim(distance) ? " can do it!" : " can't do it!";
    }
    String getname() {
        return name;
    }

    float getMaxRun() {
        return maxRun;
    }

    float getMaxSwim() {
        return maxSwim;
    }

    String getFullInfo() {
        return this.type + " " +
                this.name + ", " +
                this.maxRun + "m. max run distance; " +
                this.maxSwim + "m. max swim distance";


    }


}
