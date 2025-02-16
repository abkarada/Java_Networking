import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class Server {

	public static void main(String[] args) {
		try {
			Chat server = new User();
			
			Registry registry = LocateRegistry.getRegistry(1099);
			
			Chat stub = (Chat)UnicastRemoteObject.exportObject(registry, 0);
			
			registry.rebind("ChatService", stub);
	}
		
		catch(Exception e){
			e.printStackTrace();
		
		
		
		}
		}

}
