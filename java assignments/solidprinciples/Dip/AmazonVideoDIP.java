package com.solidprinciples.Dip;

import com.solidprinciples.Dip.VideoStreamingDIP;

public class AmazonVideoDIP implements VideoStreamingDIP {
    public void streamVideo()
    {
        System.out.println("Start watching video");
    }
}
