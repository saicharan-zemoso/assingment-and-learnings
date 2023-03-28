package com.basics.serverprograms;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideProgram {
    public static void main(String arg[])
    {
        try {
            ServerSocket ss = new ServerSocket(4000);
            Socket socket=ss.accept();
            DataInputStream ip=new DataInputStream(socket.getInputStream());
            int a;
            a=ip.read();
            while (a!=-1)
            {
                System.out.print((char)a);
                a=ip.read();
            }
        }
        catch (IOException e1)
        {
            System.out.println(e1.getMessage());
        }

    }
}
