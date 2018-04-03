import java.io.*;
import java.net.*;
public class Client
{
  public static void main(String[] args) throws Exception
  {
     Socket sock = new Socket("127.0.0.1", 3000);
 // reading from keyboard (keyRead object)
     BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
  	 // sending to client (pwrite object)
     OutputStream ostream = sock.getOutputStream(); 
     PrintWriter pwrite = new PrintWriter(ostream, true);
 
     // receiving from server ( receiveRead  object)
     InputStream istream = sock.getInputStream();
  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
System.out.println("Client Start the chitchat, type and press Enter key ");
 
     String receiveMessage, sendMessage;               
    do
     	{
     		System.out.print("Client: ");  
     		sendMessage = keyRead.readLine();   // keyboard reading
		pwrite.println(sendMessage);       // sending to server
		pwrite.flush();   
		if(sendMessage.equalsIgnoreCase("ok"))
        	{
            		System.out.println("Client exiting..."); // displaying at prompt
			System.exit(0);
		} 
        	receiveMessage = receiveRead.readLine();		// flush the data
		System.out.println("Server: " + receiveMessage); 
        	if(receiveMessage.equalsIgnoreCase("ok")) //receive from server
        	{
			
			System.out.println("Client exiting..."); // displaying at prompt
			System.exit(0);
		}   
      }while(true) ;   
   }                    
}   
