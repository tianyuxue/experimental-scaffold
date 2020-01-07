package com.jitianyu.exp1.proxy;

/**
 * Proxy
 */
public class Proxy implements Subject{

    private Subject realSubject = new RealSubject();

	@Override
	public void request() {
        //do something special here
        realSubject.request();
    }
}