package com.wit.xzy;

import com.wit.xzy.RpcClient;
import com.wit.xzy.RpcClientProxy;
import com.wit.xzy.api.HelloObject;
import com.wit.xzy.api.HelloService;
import com.wit.xzy.netty.client.NettyClient;

/**
 * 测试用Netty消费者
 * @author ziyang
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient("127.0.0.1", 9999);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);

    }

}
