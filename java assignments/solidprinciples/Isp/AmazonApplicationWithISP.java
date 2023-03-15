package com.solidprinciples.Isp;

import com.solidprinciples.Isp.*;
import com.solidprinciples.Lsp.AmazonApplicationWithLSP;

public class AmazonApplicationWithISP {
    AmazonMusicISP streamMusic=new AmazonMusicISP();
    AmazonVideoISP streamVideo= new AmazonVideoISP();
    AmazonShoppingISP shop= new AmazonShoppingISP();
    public void useApplication()
    {
        shop.shopping();
        streamMusic.streamMusic();
        streamVideo.streamVideos();
    }
    public static void main(String args[])
    {
        AmazonApplicationWithISP obj1=new AmazonApplicationWithISP();
        obj1.useApplication();
    }
}












