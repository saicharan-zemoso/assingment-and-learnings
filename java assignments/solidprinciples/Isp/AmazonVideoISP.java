package com.solidprinciples.Isp;
import com.solidprinciples.Isp.VideoStreamingInterfaceISP;
public class AmazonVideoISP implements VideoStreamingInterfaceISP{
    public void streamVideos()
    {
        System.out.println("Watch the videos");
    }
}