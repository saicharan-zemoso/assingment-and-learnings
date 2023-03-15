package com.solidprinciples.Dip;

import com.solidprinciples.Dip.AmazonMusicDIP;
import com.solidprinciples.Dip.AmazonShoppingDIP;
import com.solidprinciples.Dip.AmazonShoppingInterfaceDIP;
import com.solidprinciples.Lsp.AmazonApplicationWithLSP;

public class AmazonApplicationWithDIP {
    AmazonShoppingInterfaceDIP shop= new AmazonShoppingDIP();
    MusicStreamDIP streamMusic =new AmazonMusicDIP();
    VideoStreamingDIP streamVideo = new AmazonVideoDIP();

    void useApplication()
    {
        shop.shopping();
        streamMusic.streamMusic();
        streamVideo.streamVideo();
    }
    public static void main(String args[])
    {
        AmazonApplicationWithDIP obj1=new AmazonApplicationWithDIP();
        obj1.useApplication();
    }
}










