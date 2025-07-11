package Structural.Bridge.Classes;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreatheImpl());
        fish.breathingProcess();

        LivingThings human = new Human(new LandBreatheImpl());
        human.breathingProcess();

        LivingThings tree = new Tree(new TreeBreatheImpl());
        tree.breathingProcess();
    }
}
