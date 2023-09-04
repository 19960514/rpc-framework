package com.wit.xzy.test;

import com.wit.xzy.api.HelloService;
import com.wit.xzy.netty.server.NettyServer;
import com.wit.xzy.registry.DefaultServiceRegistry;
import com.wit.xzy.registry.ServiceRegistry;

/**
 * 测试用Netty服务提供者（服务端）
 * @author ziyang
 */
public class NettyTestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        ServiceRegistry registry = new DefaultServiceRegistry();
        registry.register(helloService);
        NettyServer server = new NettyServer();
        server.start(9999);
    }

}
