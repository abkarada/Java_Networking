import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class User extends UnicastRemoteObject implements Chat {
    private Map<String, Chat> users;  
    private List<String> messages;    

    public User() throws RemoteException {
        super();
        users = new HashMap<>();
        messages = new ArrayList<>();
    }

    @Override
    public void sendMessage(String user, String message) throws RemoteException {
        String fullMessage = user + ": " + message; 
        
        if (users.containsKey(user)) {
                        Chat targetUser = users.get(user);
            targetUser.receiveMessage(fullMessage);
            System.out.println("Mesaj gönderildi: " + fullMessage);
        } else {
            System.out.println("Hedef kullanıcı bulunamadı!");
        }
    }

    public void receiveMessage(String message) throws RemoteException {
        System.out.println("Mesaj alındı: " + message);
        messages.add(message);
    }

    @Override
    public String getMessages() throws RemoteException {
        return String.join("\n", messages); 
    }

    @Override
    public void registerUser(String user) throws RemoteException {
        if (!users.containsKey(user)) {
            users.put(user, this);  
            System.out.println(user + " sunucuya kaydedildi.");
        } else {
            System.out.println(user + " zaten kayıtlı.");
        }
    }

    @Override
    public void broadcast(String message) throws RemoteException {
        for (Map.Entry<String, Chat> entry : users.entrySet()) {
            Chat user = entry.getValue();
            user.receiveMessage("Broadcast: " + message); 
        }
        System.out.println("Tüm kullanıcılara mesaj gönderildi: " + message);
    }
}
