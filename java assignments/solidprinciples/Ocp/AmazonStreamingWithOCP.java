package com.solidprinciples.Ocp;
import com.solidprinciples.Ocp.StreamingInterfaceOCP;
public class AmazonStreamingWithOCP implements StreamingInterfaceOCP{
    public void streamVideos() {
        System.out.println("stream videos");
    }
    public void streamMusic()
    {
        System.out.println("stream music");
    }
}
