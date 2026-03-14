package goodpractice;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new CachedVideoDownloader();
        System.out.println("User1 tries to download the video");
        videoDownloader.downloadVideo("https://--");

        System.out.println("------------------");

        System.out.println("User2 tries to download the video");
        videoDownloader.downloadVideo("https://--");

    }
}
