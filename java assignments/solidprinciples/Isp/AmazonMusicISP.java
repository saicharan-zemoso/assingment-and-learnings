package com.solidprinciples.Isp;
import com.solidprinciples.Isp.MusicStreamingInterfaceISP;
public class AmazonMusicISP implements MusicStreamingInterfaceISP{
    public void streamMusic()
    {
        System.out.println("listening to music");
    }
}
