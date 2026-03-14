package badpractice;

public class Main {
    public static void main(String[] args) {
        System.out.println("user1 tries to download the video");
        RealVideoDownloader downloader = new RealVideoDownloader();
        downloader.downloadVideo("https://--------------");

        System.out.println();
        System.out.println("user2 downloads the video");
        downloader.downloadVideo("https://------");

    }
}
