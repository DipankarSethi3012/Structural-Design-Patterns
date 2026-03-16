package badpractice;

public class MobileSDPlayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title + " in Mobile in SD Quality");
    }
}
