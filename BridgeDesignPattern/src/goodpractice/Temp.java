package goodpractice;

public class Temp {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new WebPlayer(new HDQuality());
        videoPlayer.play("THe Rookie");
    }
}

//Here if the 8K Quality comes we just implement the video quality interface.
//Nothing to change anywhere
//IF smartTv Comes just extends the VideoPlayer class and we are good to go.
//Implementor -> The actual work -> VideoQuality
//Abstraction -> The platform -> VideoPlayer