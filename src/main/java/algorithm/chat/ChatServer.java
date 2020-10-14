package algorithm.chat;

import java.io.PrintStream;
import java.util.ArrayList;

public class ChatServer {
  
  ArrayList<PrintStream> outputStreams = new ArrayList<>();
  int port;
  public ChatServer(int port) {
    this.port = port;
  }
  
  public static void main(String[] args) {
    
  }
  
  public void service() {
    try(ServerSocket serverSocket = new ServerSocket(port)){
      System.out.println("채팅 서버 시작!");
      
      while (true) {
        new Thread(new ChatAgent(serverSocket.accept()))
      }
    }
  }
}
