package goodpractice;

public class HDQuality implements VideoQuality{
    @Override
    public void load(String title) {
        System.out.println("Loading HD Quality for video: " + title);
    }
}
