package com.solidprinciples.Lsp;
import com.solidprinciples.Lsp.StreamVideosForAllLsp;
public class AmazonVideoLSP extends StreamVideosForAllLsp
{
    public void streamMusic()
    {
        System.out.println("Listening to music");
    }
    public void streamVideo()
    {
        System.out.println("watching videos");
    }
    public void streamRegularVideos()
    {
        System.out.println("videos that can be watched by kids");
    }
}