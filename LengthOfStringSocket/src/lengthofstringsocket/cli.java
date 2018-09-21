/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthofstringsocket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class cli {
    public static void main(String[] args) throws IOException {
        
        int n,n2,temp;
        
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",1342);
        Scanner sc1=new Scanner(s.getInputStream());
        System.out.println("Enter any number:");
        n=sc.nextInt();
        System.out.println("enter another number:");
        n2=sc.nextInt();
        PrintStream p=new PrintStream(s.getOutputStream());
        p.println(n);
        p.println(n2);
        temp=sc1.nextInt();
        System.out.println(temp);
        
    }
}
