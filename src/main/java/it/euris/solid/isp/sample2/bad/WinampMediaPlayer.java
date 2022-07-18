package it.euris.solid.isp.sample2.bad;

public class WinampMediaPlayer implements MediaPlayer {

    // Play video is not supported in Winamp player
    public void playVideo() throws Exception {
        throw new Exception("Video not supported");
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio ..............");

    }
}