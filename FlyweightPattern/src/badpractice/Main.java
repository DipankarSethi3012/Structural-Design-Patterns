package badpractice;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 1);
        forest.plantTree(2,2);
        forest.plantTree(3,3);
        forest.draw();
    }
}
//The x and y are changing but name, color and texture are same
//without flyweight pattern we create objects and waster the memory for the same attributes
//so this approach is not recommended for production
