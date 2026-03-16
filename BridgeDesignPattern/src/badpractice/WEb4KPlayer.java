package badpractice;

public class WEb4KPlayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title + " in Web in 4K Quality");
    }
}
