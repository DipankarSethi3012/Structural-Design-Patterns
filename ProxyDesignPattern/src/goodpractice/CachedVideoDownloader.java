package goodpractice;

import badpractice.RealVideoDownloader;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoDownloader implements VideoDownloader{
    private RealVideoDownloader realVideoDownloader;
    Map<String, String> cache;

    public CachedVideoDownloader() {
        realVideoDownloader = new RealVideoDownloader();
        cache = new HashMap<>();
    }
    @Override
    public String downloadVideo(String videoUrl) {
        if(cache.containsKey(videoUrl)) {
            System.out.println("Returning data from cache");
            return cache.get(videoUrl);
        }

        System.out.println("Cache miss");
        String url = realVideoDownloader.downloadVideo(videoUrl);
        cache.put(videoUrl, url);
        return url;
    }
}
