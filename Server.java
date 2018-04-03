import java.io.*;
import java.net.*;

public class Server
{
  public static void main(String[] args) throws Exception
  {
      ServerSocket sersock = new ServerSocket(3000);
      System.out.println("Server  ready for chatting");
      Socket sock = sersock.accept( ); 
      // reading from keyboard (keyRead object)
      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
	  // sending to client (pwrite object)
      OutputStream ostream = sock.getOutputStream(); 
      PrintWriter pwrite = new PrintWriter(ostream, true);      
      // receiving from server ( receiveRead  object)
      InputStream istream = sock.getInputStream();
      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
      String receiveMessage, sendMessage;               
      do
      {
      		receiveMessage = receiveRead.readLine();
      		System.out.println("Client: " + receiveMessage); 
        	if(receiveMessage.equalsIgnoreCase("ok"))  
        	{
			System.out.println("Server exiting...");	
            		System.exit(0);   
        	}
        	System.out.print("Server: ");    		
        	sendMessage = keyRead.readLine(); 
        	pwrite.println(sendMessage); 
		if(sendMessage.equalsIgnoreCase("ok"))
        	{
            		System.out.println("Server exiting..."); // displaying at prompt
			System.exit(0);
        	}
        	pwrite.flush();
      } while(true);              
    }                    
}               
