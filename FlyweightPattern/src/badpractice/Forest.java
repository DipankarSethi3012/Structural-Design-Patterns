package badpractice;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> treeList;

    public Forest() {
        treeList = new ArrayList<>();
    }

    public void plantTree(int x, int y) {
        Tree tree = new Tree(x, y, "oak", "green", "messy");
        treeList.add(tree);
    }

    public void draw() {
        for(Tree t : treeList) {
            t.draw();
        }
    }
}
