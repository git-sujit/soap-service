package com.sks.learn.soap.rpc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface RpcStyleSoap {
	@WebMethod(operationName = "fibonacci")
	int nthFibonacci(@WebParam(name = "nth") int n);

}
