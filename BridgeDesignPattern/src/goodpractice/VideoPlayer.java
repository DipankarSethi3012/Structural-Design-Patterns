package goodpractice;

public abstract class VideoPlayer{
    protected VideoQuality videoQuality;
    public VideoPlayer(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    abstract void play(String title);
}
