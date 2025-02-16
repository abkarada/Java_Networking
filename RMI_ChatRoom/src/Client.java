import java.rmi.*;
import java.rmi.registry.*;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);  
            
            Chat chat = (Chat) registry.lookup("ChatService");  
            
            String user = "User1";
            String message = "Hello, this is a test message!";
            
            chat.sendMessage(user, message);  
            
            System.out.println("Sunucudan gelen mesajlar: ");
            System.out.println(chat.getMessages());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
