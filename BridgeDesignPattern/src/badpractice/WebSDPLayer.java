package badpractice;

public class WebSDPLayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title + " in Web in SD Quality");
    }
}
