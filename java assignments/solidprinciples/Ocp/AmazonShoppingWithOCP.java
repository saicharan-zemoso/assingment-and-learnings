package com.solidprinciples.Ocp;
import com.solidprinciples.Ocp.ShoppingInterfaceOCP;
public class AmazonShoppingWithOCP implements ShoppingInterfaceOCP
{
    public void shopping() {
        System.out.println("start shopping");
    }
}