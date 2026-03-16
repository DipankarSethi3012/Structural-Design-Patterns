package badpractice;

public class Mobile4KPlayer implements VideoPlayer{
    @Override
    public void play(String title) {
        System.out.println("Playing video: " + title + " in 4K Quality in Mobile");
    }
}
