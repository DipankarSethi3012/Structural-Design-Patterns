package goodpractice;

public class RealVideoDownloader implements VideoDownloader{
    @Override
    public String downloadVideo(String videoUrl) {
        System.out.println("Downloading the video url: " + videoUrl);
        return "Video Content from: " + videoUrl;
    }
}
