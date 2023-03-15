package com.solidprinciples.Ocp;

import com.solidprinciples.Lsp.AmazonApplicationWithLSP;

public class AmazonApplicationWithOCP {
    AmazonStreamingWithOCP stream= new AmazonStreamingWithOCP();
    AmazonShoppingWithOCP shop= new AmazonShoppingWithOCP();
    public void useApplication()
    {
        stream.streamVideos();
        stream.streamMusic();
        shop.shopping();
    }
    public static void main(String args[])
    {
        AmazonApplicationWithOCP obj1=new AmazonApplicationWithOCP();
        obj1.useApplication();
    }
}







