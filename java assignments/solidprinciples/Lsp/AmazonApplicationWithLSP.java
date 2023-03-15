package com.solidprinciples.Lsp;

import com.solidprinciples.Lsp.AmazonVideoLSP;
import com.solidprinciples.Lsp.AmazonShoppingLSP;
import com.solidprinciples.Lsp.AmazonVideosForKidsLsp;

public class AmazonApplicationWithLSP {
    AmazonShoppingLSP shop= new AmazonShoppingLSP();
    AmazonVideoLSP streamVideos=new AmazonVideoLSP();
    AmazonVideosForKidsLsp kids=new AmazonVideosForKidsLsp();
    public void useApplication()
    {
        shop.shopping();
        kids.streamRegularVideos();
        streamVideos.streamMusic();
        streamVideos.streamVideo();
    }
    public static void main(String args[])
    {
        AmazonApplicationWithLSP obj1=new AmazonApplicationWithLSP();
        obj1.useApplication();
    }
}












