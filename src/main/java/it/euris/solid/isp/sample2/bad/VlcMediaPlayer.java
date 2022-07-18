package it.euris.solid.isp.sample2.bad;

public class VlcMediaPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println(" Playing audio ..........");

    }

    @Override
    public void playVideo() {
        System.out.println(" Playing video ..........");

    }
}