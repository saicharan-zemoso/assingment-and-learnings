package com.solidprinciples.Dip;
import com.solidprinciples.Dip.AmazonShoppingInterfaceDIP;

class AmazonShoppingDIP implements AmazonShoppingInterfaceDIP{
    public void shopping()
    {
        System.out.println("start shopping");
    }
}