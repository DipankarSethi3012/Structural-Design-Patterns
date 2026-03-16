package badpractice;

public class Temp {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new WEb4KPlayer();
        videoPlayer.play("THe Rookie");

        VideoPlayer videoPlayer1 = new MobileHDPlayer();
        videoPlayer1.play("The Rookie");
    }
}
//THe issue with the current approach is:
//IF now smart TV Comes we have to implement All classes like: 4k, hd, sd
//if 8K Quality comes then again mobile 8k, web 8k, smrtTV 8k.
//so there's class explosion.
//Bridge patterns solves this problem