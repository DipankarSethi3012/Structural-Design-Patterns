package badpractice;

public class Tree {

    //attributes that keep of changig
    int x;
    int y;

    //attributes that remain the same

    String name;
    String color;
    String texture;

    public Tree(int x, int y, String name, String color, String texture) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public  void draw() {
        System.out.println("Drawing tree ae coordinates: " + x + " " + y + " properties: " + name + " " + color + " " + texture);
    }
}
