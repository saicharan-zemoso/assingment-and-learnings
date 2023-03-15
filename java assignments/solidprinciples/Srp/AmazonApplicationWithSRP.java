package com.solidprinciples.Srp;

public class AmazonApplicationWithSRP {
    ValidateSRP validate = new ValidateSRP();
    AmazonShoppingSRP userShop= new AmazonShoppingSRP();
    AmazonStreamingSRP userStreaming=new AmazonStreamingSRP();
    public void useApplications()
    {
        if(validate.validateUser())
        {
            userStreaming.streamVideos();
            userShop.shopping();
        }
    }
    public static void main(String args[])
    {
        AmazonApplicationWithSRP obj1=new AmazonApplicationWithSRP();
        obj1.useApplications();
    }
}





