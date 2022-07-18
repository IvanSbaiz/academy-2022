package it.euris.solid.isp.sample2.good;

public class DivMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {

    @Override
    public void playVideo() {
        System.out.println(" Playing video ..........");

    }

    @Override
    public void playAudio() {
        System.out.println(" Playing audio ..........");

    }
}