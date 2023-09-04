package com.wit.xzy.test;

import com.wit.xzy.api.HelloService;
import com.wit.xzy.registry.DefaultServiceRegistry;
import com.wit.xzy.registry.ServiceRegistry;
import com.wit.xzy.socket.server.SocketServer;

public class SocketTestServer {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry serviceRegistry = new DefaultServiceRegistry();
        serviceRegistry.register(helloService);
        SocketServer socketServer = new SocketServer(serviceRegistry);
        socketServer.start(9000);
    }
}


