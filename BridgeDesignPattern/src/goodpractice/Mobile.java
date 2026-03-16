package goodpractice;

public class Mobile extends VideoPlayer {
    public Mobile(VideoQuality videoQuality) {
        super(videoQuality);
    }
    @Override
    void play(String title) {
        System.out.println("Mobile Platform");
        videoQuality.load(title);
    }
}
