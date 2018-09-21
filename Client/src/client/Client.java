
package client;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {

    
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new  DataOutputStream(s.getOutputStream());
            int c;
            Scanner input =new Scanner(System.in);
            c=input.nextInt();
            //dout.writeUTF("hello server");
            dout.flush();
            dout.close();
            s.close();
        }
            catch(Exception e)
                    {
                System.out.println(e);
            
        }
        
    }
    
    }

