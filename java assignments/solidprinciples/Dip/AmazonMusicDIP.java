package com.solidprinciples.Dip;

import com.solidprinciples.Dip.MusicStreamDIP;

public class AmazonMusicDIP implements MusicStreamDIP {
    public void streamMusic()
    {
        System.out.println("Listening to music");
    }
}