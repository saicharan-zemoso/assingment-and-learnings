package com.basics.serverprograms;

import java.io.*;
import java.net.*;
public class ClientSideClass {
    public static void main(String args[])
    {
        try {
            Socket socket=new Socket("localhost",4000);
            DataOutputStream op=new DataOutputStream(socket.getOutputStream());
            byte b[]="message form the client".getBytes();
            op.write(b);
            System.out.print("\"message from the client\" was sent to server");
        }
        catch (Exception e1)
        {
            System.out.println(e1.getMessage());
        }

    }
}
