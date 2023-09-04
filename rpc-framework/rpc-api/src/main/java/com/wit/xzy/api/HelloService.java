package com.wit.xzy.api;


/**
 * 暴露的公共接口，客户端，服务端都可见(服务端有其实现类)
 */
public interface HelloService {
    String hello(HelloObject helloObject);
}
