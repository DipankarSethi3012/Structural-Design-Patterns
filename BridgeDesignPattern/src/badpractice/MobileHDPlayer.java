package badpractice;

public class MobileHDPlayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing in mobile in HD Quality: " + title);
    }
}
