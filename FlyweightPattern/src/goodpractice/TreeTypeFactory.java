package goodpractice;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String, TreeType> factory = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + "," + color + "," + texture;
        if(factory.containsKey(key)) {
            System.out.println("returning the old object.");
            return factory.get(key);
        }
        TreeType treeType = new TreeType(name, color, texture);
        System.out.println("Creating the new object.");
        factory.put(key, treeType);
        return factory.get(key);
    }
}
