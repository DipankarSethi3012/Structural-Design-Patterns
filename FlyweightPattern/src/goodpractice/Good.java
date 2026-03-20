package goodpractice;

public class Good {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 1, "oak", "green", "dark");
        forest.plantTree(2, 2, "oak", "green", "dark");
        forest.plantTree(1, 3, "oak", "green", "dark");

        forest.draw();
    }
}
