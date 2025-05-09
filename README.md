# ☕ Java RMI ChatRoom

A simple **multi-client chat application** built using **Java RMI (Remote Method Invocation)**. This project demonstrates the use of distributed objects in Java to create a basic but functional remote communication system.

## 💡 Overview

This project allows multiple clients to connect to a central server and exchange messages in real-time using **Java's built-in RMI** capabilities. The server maintains connected clients and distributes messages to all participants in the chatroom.

## 🧩 Features

- 🧑‍🤝‍🧑 Multi-client support  
- 🔄 Real-time message broadcasting  
- 🖥 Simple console-based interface  
- 🚫 Graceful disconnection and exit handling  
- 🔐 Basic input validation and stability

## 🛠 Technologies Used

- Java SE (RMI API)  
- OOP and Java Interfaces  
- Console I/O (Scanner, System.in/out)

## 📁 Project Structure

RMI-ChatRoom/
├── chat/
│ ├── ChatInterface.java # RMI Interface definition
│ ├── ChatClient.java # Client-side logic
│ └── ChatServer.java # Server-side logic
├── policy.policy # RMI security policy (if needed)
└── README.md


## 🚀 How to Run

### 1. Compile all Java files

```bash
javac chat/*.java

rmiregistry

java chat.ChatServer

java chat.ChatClient
[Client1] >> Hello everyone!
[Client2] >> Hi Client1 👋
[Client3] >> Welcome to the chatroom!
