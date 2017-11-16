package com.sks.learn.soap.rpc;

import javax.jws.WebService;

@WebService(endpointInterface = "com.sks.learn.soap.rpc.RpcStyleSoap")
public class RpcStyleSoapImpl implements RpcStyleSoap {

	/**
	 * Calculates nth fibonacci number in O(n)
	 */
	public int nthFibonacci(int n) {
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		int fib = 0;
		int fib1 = 0;
		int fib2 = 1;
		for (int i = 0; i < n - 1; i++) {
			fib = fib1 + fib2;
			fib2 = fib1;
			fib1 = fib;
		}
		return fib;
	}

}
