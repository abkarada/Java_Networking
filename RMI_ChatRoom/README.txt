RMI makes remoting transparent by making remote objects look like local objects.
RMI is based on three abstraction layers.

Stub / Skeleton layer
Remote Reference layer
Transport layer

--Seriliazation and hashing -->merge random ---->hash>Brute-Force handling cat-mouse game
 Transport Layer − This layer connects the client and the server. It manages the existing connection
and also sets up new connections.
 Stub − A stub is a representation (proxy) of the remote object at client. It resides in the client system;
it acts as a gateway for the client program.
 Skeleton − This is the object which resides on the server side. stub communicates with this skeleton
to pass request to the remote object.
 RRL(Remote Reference Layer) − It is the layer which manages the references made by the client to
the remote object. 

To write an RMI Java application, you would have to follow the steps given below −
 Define the remote interface
 Develop the implementation class (remote object)
 Develop the server program
 Develop the client program
 Compile the application
 Execute the application

To develop a server program −
 Create a client class from where you want invoke the remote object.
 Create a remote object by instantiating the implementation class as shown below.
 Export the remote object using the method exportObject() of the class
named UnicastRemoteObject which belongs to the package java.rmi.server.
 Get the RMI registry using the getRegistry() method of the LocateRegistry class which belongs to
the package java.rmi.registry.
 Bind the remote object created to the registry using the bind() method of the class named Registry.
To this method, pass a string representing the bind name and the object exported, as parameters.



To develop a client program −
 Create a client class from where your intended to invoke the remote object.
 Get the RMI registry using the getRegistry() method of the LocateRegistry class which belongs to
the package java.rmi.registry.
 Fetch the object from the registry using the method lookup() of the class Registry which belongs to
the package java.rmi.registry.
To this method, you need to pass a string value representing the bind name as a parameter. This will
return you the remote object.
 The lookup() returns an object of type remote, down cast it to the type Hello.
 Finally invoke the required method using the obtained remote object.  




To compile the application −
 Compile the Remote interface.
 Compile the implementation class.
 Compile the server program.
 Compile the client program. 


RMI applications
1. When the client makes a call to the remote object, it is received by the stub which eventually
passes this request to the RRL.
When the client-side RRL receives the request, it invokes a method called invoke() of the
object remoteRef. It passes the request to the RRL on the server side.
The RRL on the server side passes the request to the Skeleton (proxy on the server) which finally
invokes the required object on the server.
The result is passed all the way back to the client.
 Marshalling and Unmarshalling
 Whenever a client invokes a method that accepts parameters on a remote object, the parameters
are bundled into a message before being sent over the network. These parameters may be of
primitive type or objects. In case of primitive type, the parameters are put together and a header
is attached to it. In case the parameters are objects, then they are serialized. This process is
known as marshalling.
 At the server side, the packed parameters are unbundled and then the required method is invoked.
This process is known as unmarshalling. 





A JavaBean is a specially constructed Java class written in the Java and coded
according to the JavaBeans API specifications.
Following are the unique characteristics that distinguish a JavaBean from other Java
classes −
 It provides a default, no-argument constructor.
 It should be serializable and that which can implement the Serializable interface.
 It may have a number of properties which can be read or written.
 It may have a number of "getter" and "setter" methods for the properties. 










