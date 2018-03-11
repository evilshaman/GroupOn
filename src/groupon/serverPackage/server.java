/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupon.serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author apple
 */
public class server {
    public static void main(String str[]) throws IOException{
        ServerSocket serSocket=new ServerSocket(5555);
        while(true){
             Socket newSerSocket =serSocket.accept();   
             clientThread clThread = new clientThread(newSerSocket);
             clThread.start();
        }
    }
}

class clientThread extends Thread{
   
   public Socket socket;
   public clientThread(Socket socket){
       this.socket=socket;
   }
   public void run(){
       
        
    }
}
