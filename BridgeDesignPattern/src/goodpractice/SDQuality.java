package goodpractice;

public class SDQuality implements VideoQuality {
    @Override
    public void load(String title) {
        System.out.println("Loading SD Quality for video: " + title);
    }
}
