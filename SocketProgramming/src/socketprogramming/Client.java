/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws IOException {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        Socket s=new Socket("127.0.0.1",1342);
        Scanner sc1=new Scanner(s.getInputStream());//input for server
        System.out.println("Enter any number:");
        n=sc.nextInt();
        PrintStream p=new PrintStream(s.getOutputStream());//pass number to server
        p.println(n);
        temp=sc1.nextInt();//store result
        System.out.println(temp);
    }
}
