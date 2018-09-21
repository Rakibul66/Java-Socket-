/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
           
           String str = (String)dis.readUTF();
            System.out.println("message="+str);
            ss.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
