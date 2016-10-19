package org.tabi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "hellomethod", portName = "helloport", serviceName = "helloservice", targetNamespace = "http://www.tabish.com")
// @SOAPBinding(style=Style.RPC)
public class Hello {

	public HelloOutput add(HelloInput input) {
		return new HelloOutput();
	}

	@WebResult(partName = "output")
	public HelloOutput add1(@WebParam(partName = "input") HelloInput input) {
		return new HelloOutput();
	}

	@WebMethod(exclude = true)
	public HelloOutput add2(HelloInput input) {
		return new HelloOutput();
	}
	/*
	 * @WebResult(partName="output") public HelloOutput
	 * add4(@WebParam(partName="input") HelloInput input) { return new
	 * HelloOutput(); } wwork with Style.RPC (change arg0 to input ant return to
	 * output)
	 */

}
