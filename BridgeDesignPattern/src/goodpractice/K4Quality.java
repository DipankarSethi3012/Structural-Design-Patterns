package goodpractice;

public class K4Quality implements VideoQuality {
    @Override
    public void load(String title) {
        System.out.println("Loading 4K Quality for video: " + title);
    }
}
