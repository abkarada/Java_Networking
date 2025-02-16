import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote {
    void sendMessage(String user, String message) throws RemoteException;
    String getMessages() throws RemoteException;
    void registerUser(String user) throws RemoteException;
    void broadcast(String message)throws RemoteException;;
    public void receiveMessage(String message) throws RemoteException;
}
