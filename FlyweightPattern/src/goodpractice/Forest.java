package goodpractice;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees;

    public Forest() {
        trees = new ArrayList<>();
    }

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType treeType = TreeTypeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, treeType);
        trees.add(tree);
    }

    public void draw() {
        for(Tree t : trees) {
            t.draw();
        }
    }
}
