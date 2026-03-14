package badpractice;

public class RealVideoDownloader {
    public String downloadVideo(String videoUrl) {
        //caching logic missing
        //filtering logic missing
        //access logic missing

        System.out.println("Download the video from the url: " + videoUrl);
        String content = "Video content from: " + videoUrl;
        System.out.println(content);
        return content;
    }
}
