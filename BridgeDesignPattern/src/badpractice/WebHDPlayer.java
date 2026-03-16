package badpractice;

public class WebHDPlayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title + " in Web in HD Quality");
    }
}
