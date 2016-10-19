/**
 * HelloserviceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.tabish.www;

/*
 *  HelloserviceStub java implementation
 */

public class HelloserviceStub extends org.apache.axis2.client.Stub
	{
		protected org.apache.axis2.description.AxisOperation[] _operations;

		// hashmaps to keep the fault mapping
		private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
		private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
		private java.util.HashMap faultMessageMap = new java.util.HashMap();

		private static int counter = 0;

		private static synchronized java.lang.String getUniqueSuffix()
			{
				// reset the counter if it is greater than 99999
				if (counter > 99999)
					{
						counter = 0;
					}
				counter = counter + 1;
				return java.lang.Long.toString(java.lang.System
				        .currentTimeMillis()) + "_" + counter;
			}

		private void populateAxisService() throws org.apache.axis2.AxisFault
			{

				// creating the Service with a unique name
				_service = new org.apache.axis2.description.AxisService(
				        "Helloservice" + getUniqueSuffix());
				addAnonymousOperations();

				// creating the operations
				org.apache.axis2.description.AxisOperation __operation;

				_operations = new org.apache.axis2.description.AxisOperation[2];

				__operation = new org.apache.axis2.description.OutInAxisOperation();

				__operation.setName(new javax.xml.namespace.QName(
				        "http://www.tabish.com", "add1"));
				_service.addOperation(__operation);

				_operations[0] = __operation;

				__operation = new org.apache.axis2.description.OutInAxisOperation();

				__operation.setName(new javax.xml.namespace.QName(
				        "http://www.tabish.com", "add"));
				_service.addOperation(__operation);

				_operations[1] = __operation;

			}

		// populates the faults
		private void populateFaults()
			{

			}

		/**
		 * Constructor that takes in a configContext
		 */

		public HelloserviceStub(
		        org.apache.axis2.context.ConfigurationContext configurationContext,
		        java.lang.String targetEndpoint)
		        throws org.apache.axis2.AxisFault
			{
				this(configurationContext, targetEndpoint, false);
			}

		/**
		 * Constructor that takes in a configContext and useseperate listner
		 */
		public HelloserviceStub(
		        org.apache.axis2.context.ConfigurationContext configurationContext,
		        java.lang.String targetEndpoint, boolean useSeparateListener)
		        throws org.apache.axis2.AxisFault
			{
				// To populate AxisService
				populateAxisService();
				populateFaults();

				_serviceClient = new org.apache.axis2.client.ServiceClient(
				        configurationContext, _service);

				_serviceClient.getOptions().setTo(
				        new org.apache.axis2.addressing.EndpointReference(
				                targetEndpoint));
				_serviceClient.getOptions().setUseSeparateListener(
				        useSeparateListener);

			}

		/**
		 * Default Constructor
		 */
		public HelloserviceStub(
		        org.apache.axis2.context.ConfigurationContext configurationContext)
		        throws org.apache.axis2.AxisFault
			{

				this(configurationContext,
				        "http://localhost:7001/webIPPublish/services/helloport");

			}

		/**
		 * Default Constructor
		 */
		public HelloserviceStub() throws org.apache.axis2.AxisFault
			{

				this("http://localhost:7001/webIPPublish/services/helloport");

			}

		/**
		 * Constructor taking the target endpoint
		 */
		public HelloserviceStub(java.lang.String targetEndpoint)
		        throws org.apache.axis2.AxisFault
			{
				this(null, targetEndpoint);
			}

		/**
		 * Auto generated method signature
		 * 
		 * @see com.tabish.www.Helloservice#add1
		 * @param add10
		 */

		public com.tabish.www.HelloserviceStub.Add1ResponseE add1(

		com.tabish.www.HelloserviceStub.Add1E add10)

		throws java.rmi.RemoteException

			{
				org.apache.axis2.context.MessageContext _messageContext = null;
				try
					{
						org.apache.axis2.client.OperationClient _operationClient = _serviceClient
						        .createClient(_operations[0].getName());
						_operationClient
						        .getOptions()
						        .setAction(
						                "http://www.tabish.com/hellomethod/add1Request");
						_operationClient.getOptions()
						        .setExceptionToBeThrownOnSOAPFault(true);

						addPropertyToOperationClient(
						        _operationClient,
						        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
						        "&");

						// create a message context
						_messageContext = new org.apache.axis2.context.MessageContext();

						// create SOAP envelope with that payload
						org.apache.axiom.soap.SOAPEnvelope env = null;

						env = toEnvelope(getFactory(_operationClient
						        .getOptions().getSoapVersionURI()), add10,
						        optimizeContent(new javax.xml.namespace.QName(
						                "http://www.tabish.com", "add1")),
						        new javax.xml.namespace.QName(
						                "http://www.tabish.com", "add1"));

						// adding SOAP soap_headers
						_serviceClient.addHeadersToEnvelope(env);
						// set the message context with that soap envelope
						_messageContext.setEnvelope(env);

						// add the message contxt to the operation client
						_operationClient.addMessageContext(_messageContext);

						// execute the operation client
						_operationClient.execute(true);

						org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
						        .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
						org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
						        .getEnvelope();

						java.lang.Object object = fromOM(
						        _returnEnv.getBody().getFirstElement(),
						        com.tabish.www.HelloserviceStub.Add1ResponseE.class,
						        getEnvelopeNamespaces(_returnEnv));

						return (com.tabish.www.HelloserviceStub.Add1ResponseE) object;

					} catch (org.apache.axis2.AxisFault f)
					{

						org.apache.axiom.om.OMElement faultElt = f.getDetail();
						if (faultElt != null)
							{
								if (faultExceptionNameMap
								        .containsKey(new org.apache.axis2.client.FaultMapKey(
								                faultElt.getQName(), "add1")))
									{
										// make the fault by reflection
										try
											{
												java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												        .get(new org.apache.axis2.client.FaultMapKey(
												                faultElt.getQName(),
												                "add1"));
												java.lang.Class exceptionClass = java.lang.Class
												        .forName(exceptionClassName);
												java.lang.reflect.Constructor constructor = exceptionClass
												        .getConstructor(String.class);
												java.lang.Exception ex = (java.lang.Exception) constructor
												        .newInstance(f
												                .getMessage());
												// message class
												java.lang.String messageClassName = (java.lang.String) faultMessageMap
												        .get(new org.apache.axis2.client.FaultMapKey(
												                faultElt.getQName(),
												                "add1"));
												java.lang.Class messageClass = java.lang.Class
												        .forName(messageClassName);
												java.lang.Object messageObject = fromOM(
												        faultElt, messageClass,
												        null);
												java.lang.reflect.Method m = exceptionClass
												        .getMethod(
												                "setFaultMessage",
												                new java.lang.Class[]
													                {messageClass});
												m.invoke(ex,
												        new java.lang.Object[]
													        {messageObject});

												throw new java.rmi.RemoteException(
												        ex.getMessage(), ex);
											} catch (java.lang.ClassCastException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.ClassNotFoundException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.NoSuchMethodException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.reflect.InvocationTargetException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.IllegalAccessException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.InstantiationException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											}
									} else
									{
										throw f;
									}
							} else
							{
								throw f;
							}
					} finally
					{
						if (_messageContext.getTransportOut() != null)
							{
								_messageContext.getTransportOut().getSender()
								        .cleanup(_messageContext);
							}
					}
			}

		/**
		 * Auto generated method signature for Asynchronous Invocations
		 * 
		 * @see com.tabish.www.Helloservice#startadd1
		 * @param add10
		 */
		public void startadd1(

		com.tabish.www.HelloserviceStub.Add1E add10,

		final com.tabish.www.HelloserviceCallbackHandler callback)

		throws java.rmi.RemoteException
			{

				org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				        .createClient(_operations[0].getName());
				_operationClient.getOptions().setAction(
				        "http://www.tabish.com/hellomethod/add1Request");
				_operationClient.getOptions()
				        .setExceptionToBeThrownOnSOAPFault(true);

				addPropertyToOperationClient(
				        _operationClient,
				        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				        "&");

				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;
				final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

				// Style is Doc.

				env = toEnvelope(getFactory(_operationClient.getOptions()
				        .getSoapVersionURI()), add10,
				        optimizeContent(new javax.xml.namespace.QName(
				                "http://www.tabish.com", "add1")),
				        new javax.xml.namespace.QName("http://www.tabish.com",
				                "add1"));

				// adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// create message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message context to the operation client
				_operationClient.addMessageContext(_messageContext);

				_operationClient
				        .setCallback(new org.apache.axis2.client.async.AxisCallback()
					        {
						        public void onMessage(
						                org.apache.axis2.context.MessageContext resultContext)
							        {
								        try
									        {
										        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
										                .getEnvelope();

										        java.lang.Object object = fromOM(
										                resultEnv
										                        .getBody()
										                        .getFirstElement(),
										                com.tabish.www.HelloserviceStub.Add1ResponseE.class,
										                getEnvelopeNamespaces(resultEnv));
										        callback.receiveResultadd1((com.tabish.www.HelloserviceStub.Add1ResponseE) object);

									        } catch (org.apache.axis2.AxisFault e)
									        {
										        callback.receiveErroradd1(e);
									        }
							        }

						        public void onError(java.lang.Exception error)
							        {
								        if (error instanceof org.apache.axis2.AxisFault)
									        {
										        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
										        org.apache.axiom.om.OMElement faultElt = f
										                .getDetail();
										        if (faultElt != null)
											        {
												        if (faultExceptionNameMap
												                .containsKey(new org.apache.axis2.client.FaultMapKey(
												                        faultElt.getQName(),
												                        "add1")))
													        {
														        // make the
																// fault by
																// reflection
														        try
															        {
																        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
																                .get(new org.apache.axis2.client.FaultMapKey(
																                        faultElt.getQName(),
																                        "add1"));
																        java.lang.Class exceptionClass = java.lang.Class
																                .forName(exceptionClassName);
																        java.lang.reflect.Constructor constructor = exceptionClass
																                .getConstructor(String.class);
																        java.lang.Exception ex = (java.lang.Exception) constructor
																                .newInstance(f
																                        .getMessage());
																        // message
																		// class
																        java.lang.String messageClassName = (java.lang.String) faultMessageMap
																                .get(new org.apache.axis2.client.FaultMapKey(
																                        faultElt.getQName(),
																                        "add1"));
																        java.lang.Class messageClass = java.lang.Class
																                .forName(messageClassName);
																        java.lang.Object messageObject = fromOM(
																                faultElt,
																                messageClass,
																                null);
																        java.lang.reflect.Method m = exceptionClass
																                .getMethod(
																                        "setFaultMessage",
																                        new java.lang.Class[]
																	                        {messageClass});
																        m.invoke(
																                ex,
																                new java.lang.Object[]
																	                {messageObject});

																        callback.receiveErroradd1(new java.rmi.RemoteException(
																                ex.getMessage(),
																                ex));
															        } catch (java.lang.ClassCastException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (java.lang.ClassNotFoundException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (java.lang.NoSuchMethodException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (java.lang.reflect.InvocationTargetException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (java.lang.IllegalAccessException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (java.lang.InstantiationException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        } catch (org.apache.axis2.AxisFault e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd1(f);
															        }
													        } else
													        {
														        callback.receiveErroradd1(f);
													        }
											        } else
											        {
												        callback.receiveErroradd1(f);
											        }
									        } else
									        {
										        callback.receiveErroradd1(error);
									        }
							        }

						        public void onFault(
						                org.apache.axis2.context.MessageContext faultContext)
							        {
								        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								                .getInboundFaultFromMessageContext(faultContext);
								        onError(fault);
							        }

						        public void onComplete()
							        {
								        try
									        {
										        _messageContext
										                .getTransportOut()
										                .getSender()
										                .cleanup(
										                        _messageContext);
									        } catch (org.apache.axis2.AxisFault axisFault)
									        {
										        callback.receiveErroradd1(axisFault);
									        }
							        }
					        });

				org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
				if (_operations[0].getMessageReceiver() == null
				        && _operationClient.getOptions()
				                .isUseSeparateListener())
					{
						_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
						_operations[0].setMessageReceiver(_callbackReceiver);
					}

				// execute the operation client
				_operationClient.execute(false);

			}

		/**
		 * Auto generated method signature
		 * 
		 * @see com.tabish.www.Helloservice#add
		 * @param add2
		 */

		public com.tabish.www.HelloserviceStub.AddResponseE add(

		com.tabish.www.HelloserviceStub.AddE add2)

		throws java.rmi.RemoteException

			{
				org.apache.axis2.context.MessageContext _messageContext = null;
				try
					{
						org.apache.axis2.client.OperationClient _operationClient = _serviceClient
						        .createClient(_operations[1].getName());
						_operationClient.getOptions().setAction(
						        "http://www.tabish.com/hellomethod/addRequest");
						_operationClient.getOptions()
						        .setExceptionToBeThrownOnSOAPFault(true);

						addPropertyToOperationClient(
						        _operationClient,
						        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
						        "&");

						// create a message context
						_messageContext = new org.apache.axis2.context.MessageContext();

						// create SOAP envelope with that payload
						org.apache.axiom.soap.SOAPEnvelope env = null;

						env = toEnvelope(getFactory(_operationClient
						        .getOptions().getSoapVersionURI()), add2,
						        optimizeContent(new javax.xml.namespace.QName(
						                "http://www.tabish.com", "add")),
						        new javax.xml.namespace.QName(
						                "http://www.tabish.com", "add"));

						// adding SOAP soap_headers
						_serviceClient.addHeadersToEnvelope(env);
						// set the message context with that soap envelope
						_messageContext.setEnvelope(env);

						// add the message contxt to the operation client
						_operationClient.addMessageContext(_messageContext);

						// execute the operation client
						_operationClient.execute(true);

						org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
						        .getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
						org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
						        .getEnvelope();

						java.lang.Object object = fromOM(
						        _returnEnv.getBody().getFirstElement(),
						        com.tabish.www.HelloserviceStub.AddResponseE.class,
						        getEnvelopeNamespaces(_returnEnv));

						return (com.tabish.www.HelloserviceStub.AddResponseE) object;

					} catch (org.apache.axis2.AxisFault f)
					{

						org.apache.axiom.om.OMElement faultElt = f.getDetail();
						if (faultElt != null)
							{
								if (faultExceptionNameMap
								        .containsKey(new org.apache.axis2.client.FaultMapKey(
								                faultElt.getQName(), "add")))
									{
										// make the fault by reflection
										try
											{
												java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												        .get(new org.apache.axis2.client.FaultMapKey(
												                faultElt.getQName(),
												                "add"));
												java.lang.Class exceptionClass = java.lang.Class
												        .forName(exceptionClassName);
												java.lang.reflect.Constructor constructor = exceptionClass
												        .getConstructor(String.class);
												java.lang.Exception ex = (java.lang.Exception) constructor
												        .newInstance(f
												                .getMessage());
												// message class
												java.lang.String messageClassName = (java.lang.String) faultMessageMap
												        .get(new org.apache.axis2.client.FaultMapKey(
												                faultElt.getQName(),
												                "add"));
												java.lang.Class messageClass = java.lang.Class
												        .forName(messageClassName);
												java.lang.Object messageObject = fromOM(
												        faultElt, messageClass,
												        null);
												java.lang.reflect.Method m = exceptionClass
												        .getMethod(
												                "setFaultMessage",
												                new java.lang.Class[]
													                {messageClass});
												m.invoke(ex,
												        new java.lang.Object[]
													        {messageObject});

												throw new java.rmi.RemoteException(
												        ex.getMessage(), ex);
											} catch (java.lang.ClassCastException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.ClassNotFoundException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.NoSuchMethodException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.reflect.InvocationTargetException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.IllegalAccessException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											} catch (java.lang.InstantiationException e)
											{
												// we cannot intantiate the
												// class - throw the original
												// Axis fault
												throw f;
											}
									} else
									{
										throw f;
									}
							} else
							{
								throw f;
							}
					} finally
					{
						if (_messageContext.getTransportOut() != null)
							{
								_messageContext.getTransportOut().getSender()
								        .cleanup(_messageContext);
							}
					}
			}

		/**
		 * Auto generated method signature for Asynchronous Invocations
		 * 
		 * @see com.tabish.www.Helloservice#startadd
		 * @param add2
		 */
		public void startadd(

		com.tabish.www.HelloserviceStub.AddE add2,

		final com.tabish.www.HelloserviceCallbackHandler callback)

		throws java.rmi.RemoteException
			{

				org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				        .createClient(_operations[1].getName());
				_operationClient.getOptions().setAction(
				        "http://www.tabish.com/hellomethod/addRequest");
				_operationClient.getOptions()
				        .setExceptionToBeThrownOnSOAPFault(true);

				addPropertyToOperationClient(
				        _operationClient,
				        org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				        "&");

				// create SOAP envelope with that payload
				org.apache.axiom.soap.SOAPEnvelope env = null;
				final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

				// Style is Doc.

				env = toEnvelope(getFactory(_operationClient.getOptions()
				        .getSoapVersionURI()), add2,
				        optimizeContent(new javax.xml.namespace.QName(
				                "http://www.tabish.com", "add")),
				        new javax.xml.namespace.QName("http://www.tabish.com",
				                "add"));

				// adding SOAP soap_headers
				_serviceClient.addHeadersToEnvelope(env);
				// create message context with that soap envelope
				_messageContext.setEnvelope(env);

				// add the message context to the operation client
				_operationClient.addMessageContext(_messageContext);

				_operationClient
				        .setCallback(new org.apache.axis2.client.async.AxisCallback()
					        {
						        public void onMessage(
						                org.apache.axis2.context.MessageContext resultContext)
							        {
								        try
									        {
										        org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
										                .getEnvelope();

										        java.lang.Object object = fromOM(
										                resultEnv
										                        .getBody()
										                        .getFirstElement(),
										                com.tabish.www.HelloserviceStub.AddResponseE.class,
										                getEnvelopeNamespaces(resultEnv));
										        callback.receiveResultadd((com.tabish.www.HelloserviceStub.AddResponseE) object);

									        } catch (org.apache.axis2.AxisFault e)
									        {
										        callback.receiveErroradd(e);
									        }
							        }

						        public void onError(java.lang.Exception error)
							        {
								        if (error instanceof org.apache.axis2.AxisFault)
									        {
										        org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
										        org.apache.axiom.om.OMElement faultElt = f
										                .getDetail();
										        if (faultElt != null)
											        {
												        if (faultExceptionNameMap
												                .containsKey(new org.apache.axis2.client.FaultMapKey(
												                        faultElt.getQName(),
												                        "add")))
													        {
														        // make the
																// fault by
																// reflection
														        try
															        {
																        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
																                .get(new org.apache.axis2.client.FaultMapKey(
																                        faultElt.getQName(),
																                        "add"));
																        java.lang.Class exceptionClass = java.lang.Class
																                .forName(exceptionClassName);
																        java.lang.reflect.Constructor constructor = exceptionClass
																                .getConstructor(String.class);
																        java.lang.Exception ex = (java.lang.Exception) constructor
																                .newInstance(f
																                        .getMessage());
																        // message
																		// class
																        java.lang.String messageClassName = (java.lang.String) faultMessageMap
																                .get(new org.apache.axis2.client.FaultMapKey(
																                        faultElt.getQName(),
																                        "add"));
																        java.lang.Class messageClass = java.lang.Class
																                .forName(messageClassName);
																        java.lang.Object messageObject = fromOM(
																                faultElt,
																                messageClass,
																                null);
																        java.lang.reflect.Method m = exceptionClass
																                .getMethod(
																                        "setFaultMessage",
																                        new java.lang.Class[]
																	                        {messageClass});
																        m.invoke(
																                ex,
																                new java.lang.Object[]
																	                {messageObject});

																        callback.receiveErroradd(new java.rmi.RemoteException(
																                ex.getMessage(),
																                ex));
															        } catch (java.lang.ClassCastException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (java.lang.ClassNotFoundException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (java.lang.NoSuchMethodException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (java.lang.reflect.InvocationTargetException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (java.lang.IllegalAccessException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (java.lang.InstantiationException e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        } catch (org.apache.axis2.AxisFault e)
															        {
																        // we
																		// cannot
																		// intantiate
																		// the
																		// class
																		// -
																		// throw
																		// the
																		// original
																		// Axis
																		// fault
																        callback.receiveErroradd(f);
															        }
													        } else
													        {
														        callback.receiveErroradd(f);
													        }
											        } else
											        {
												        callback.receiveErroradd(f);
											        }
									        } else
									        {
										        callback.receiveErroradd(error);
									        }
							        }

						        public void onFault(
						                org.apache.axis2.context.MessageContext faultContext)
							        {
								        org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								                .getInboundFaultFromMessageContext(faultContext);
								        onError(fault);
							        }

						        public void onComplete()
							        {
								        try
									        {
										        _messageContext
										                .getTransportOut()
										                .getSender()
										                .cleanup(
										                        _messageContext);
									        } catch (org.apache.axis2.AxisFault axisFault)
									        {
										        callback.receiveErroradd(axisFault);
									        }
							        }
					        });

				org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
				if (_operations[1].getMessageReceiver() == null
				        && _operationClient.getOptions()
				                .isUseSeparateListener())
					{
						_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
						_operations[1].setMessageReceiver(_callbackReceiver);
					}

				// execute the operation client
				_operationClient.execute(false);

			}

		/**
		 * A utility method that copies the namepaces from the SOAPEnvelope
		 */
		private java.util.Map getEnvelopeNamespaces(
		        org.apache.axiom.soap.SOAPEnvelope env)
			{
				java.util.Map returnMap = new java.util.HashMap();
				java.util.Iterator namespaceIterator = env
				        .getAllDeclaredNamespaces();
				while (namespaceIterator.hasNext())
					{
						org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
						        .next();
						returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
					}
				return returnMap;
			}

		private javax.xml.namespace.QName[] opNameArray = null;
		private boolean optimizeContent(javax.xml.namespace.QName opName)
			{

				if (opNameArray == null)
					{
						return false;
					}
				for (int i = 0; i < opNameArray.length; i++)
					{
						if (opName.equals(opNameArray[i]))
							{
								return true;
							}
					}
				return false;
			}
		// http://localhost:7001/webIPPublish/services/helloport
		public static class Add1
		        implements
		            org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = add1 Namespace URI = http://www.tabish.com Namespace
				 * Prefix = ns1
				 */

				/**
				 * field for Arg0
				 */

				protected HelloInput localArg0;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localArg0Tracker = false;

				public boolean isArg0Specified()
					{
						return localArg0Tracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return HelloInput
				 */
				public HelloInput getArg0()
					{
						return localArg0;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Arg0
				 */
				public void setArg0(HelloInput param)
					{
						localArg0Tracker = param != null;

						this.localArg0 = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":add1", xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "add1", xmlWriter);
									}

							}
						if (localArg0Tracker)
							{
								if (localArg0 == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "arg0 cannot be null!!");
									}
								localArg0.serialize(
								        new javax.xml.namespace.QName("",
								                "arg0"), xmlWriter);
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (localArg0Tracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "arg0"));

								if (localArg0 == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "arg0 cannot be null!!");
									}
								elementList.add(localArg0);
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static Add1 parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								Add1 object = new Add1();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"add1"
														        .equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (Add1) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "arg0")
										                .equals(reader
										                        .getName()))
											{

												object.setArg0(HelloInput.Factory
												        .parse(reader));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class AddResponse
		        implements
		            org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = addResponse Namespace URI = http://www.tabish.com
				 * Namespace Prefix = ns1
				 */

				/**
				 * field for _return
				 */

				protected HelloOutput local_return;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean local_returnTracker = false;

				public boolean is_returnSpecified()
					{
						return local_returnTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return HelloOutput
				 */
				public HelloOutput get_return()
					{
						return local_return;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            _return
				 */
				public void set_return(HelloOutput param)
					{
						local_returnTracker = param != null;

						this.local_return = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":addResponse",
										        xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "addResponse",
										        xmlWriter);
									}

							}
						if (local_returnTracker)
							{
								if (local_return == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "return cannot be null!!");
									}
								local_return.serialize(
								        new javax.xml.namespace.QName("",
								                "return"), xmlWriter);
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (local_returnTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "return"));

								if (local_return == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "return cannot be null!!");
									}
								elementList.add(local_return);
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static AddResponse parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								AddResponse object = new AddResponse();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"addResponse"
														        .equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (AddResponse) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "return")
										                .equals(reader
										                        .getName()))
											{

												object.set_return(HelloOutput.Factory
												        .parse(reader));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class Add1E
		        implements
		            org.apache.axis2.databinding.ADBBean
			{

				public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				        "http://www.tabish.com", "add1", "ns1");

				/**
				 * field for Add1
				 */

				protected Add1 localAdd1;

				/**
				 * Auto generated getter method
				 * 
				 * @return Add1
				 */
				public Add1 getAdd1()
					{
						return localAdd1;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Add1
				 */
				public void setAdd1(Add1 param)
					{

						this.localAdd1 = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, MY_QNAME);
						return factory.createOMElement(dataSource, MY_QNAME);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it

						if (localAdd1 == null)
							{
								throw new org.apache.axis2.databinding.ADBException(
								        "add1 cannot be null!");
							}
						localAdd1.serialize(MY_QNAME, xmlWriter);

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it
						return localAdd1.getPullParser(MY_QNAME);

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static Add1E parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								Add1E object = new Add1E();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										while (!reader.isEndElement())
											{
												if (reader.isStartElement())
													{

														if (reader
														        .isStartElement()
														        && new javax.xml.namespace.QName(
														                "http://www.tabish.com",
														                "add1")
														                .equals(reader
														                        .getName()))
															{

																object.setAdd1(Add1.Factory
																        .parse(reader));

															} // End of if for
															  // expected
															  // property start
															  // element

														else
															{
																// A start
																// element we
																// are not
																// expecting
																// indicates an
																// invalid
																// parameter was
																// passed
																throw new org.apache.axis2.databinding.ADBException(
																        "Unexpected subelement "
																                + reader.getName());
															}

													} else
													{
														reader.next();
													}
											} // end of while loop

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class Add1ResponseE
		        implements
		            org.apache.axis2.databinding.ADBBean
			{

				public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				        "http://www.tabish.com", "add1Response", "ns1");

				/**
				 * field for Add1Response
				 */

				protected Add1Response localAdd1Response;

				/**
				 * Auto generated getter method
				 * 
				 * @return Add1Response
				 */
				public Add1Response getAdd1Response()
					{
						return localAdd1Response;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Add1Response
				 */
				public void setAdd1Response(Add1Response param)
					{

						this.localAdd1Response = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, MY_QNAME);
						return factory.createOMElement(dataSource, MY_QNAME);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it

						if (localAdd1Response == null)
							{
								throw new org.apache.axis2.databinding.ADBException(
								        "add1Response cannot be null!");
							}
						localAdd1Response.serialize(MY_QNAME, xmlWriter);

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it
						return localAdd1Response.getPullParser(MY_QNAME);

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static Add1ResponseE parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								Add1ResponseE object = new Add1ResponseE();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										while (!reader.isEndElement())
											{
												if (reader.isStartElement())
													{

														if (reader
														        .isStartElement()
														        && new javax.xml.namespace.QName(
														                "http://www.tabish.com",
														                "add1Response")
														                .equals(reader
														                        .getName()))
															{

																object.setAdd1Response(Add1Response.Factory
																        .parse(reader));

															} // End of if for
															  // expected
															  // property start
															  // element

														else
															{
																// A start
																// element we
																// are not
																// expecting
																// indicates an
																// invalid
																// parameter was
																// passed
																throw new org.apache.axis2.databinding.ADBException(
																        "Unexpected subelement "
																                + reader.getName());
															}

													} else
													{
														reader.next();
													}
											} // end of while loop

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class AddE
		        implements
		            org.apache.axis2.databinding.ADBBean
			{

				public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				        "http://www.tabish.com", "add", "ns1");

				/**
				 * field for Add
				 */

				protected Add localAdd;

				/**
				 * Auto generated getter method
				 * 
				 * @return Add
				 */
				public Add getAdd()
					{
						return localAdd;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Add
				 */
				public void setAdd(Add param)
					{

						this.localAdd = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, MY_QNAME);
						return factory.createOMElement(dataSource, MY_QNAME);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it

						if (localAdd == null)
							{
								throw new org.apache.axis2.databinding.ADBException(
								        "add cannot be null!");
							}
						localAdd.serialize(MY_QNAME, xmlWriter);

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it
						return localAdd.getPullParser(MY_QNAME);

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static AddE parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								AddE object = new AddE();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										while (!reader.isEndElement())
											{
												if (reader.isStartElement())
													{

														if (reader
														        .isStartElement()
														        && new javax.xml.namespace.QName(
														                "http://www.tabish.com",
														                "add")
														                .equals(reader
														                        .getName()))
															{

																object.setAdd(Add.Factory
																        .parse(reader));

															} // End of if for
															  // expected
															  // property start
															  // element

														else
															{
																// A start
																// element we
																// are not
																// expecting
																// indicates an
																// invalid
																// parameter was
																// passed
																throw new org.apache.axis2.databinding.ADBException(
																        "Unexpected subelement "
																                + reader.getName());
															}

													} else
													{
														reader.next();
													}
											} // end of while loop

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class ExtensionMapper
			{

				public static java.lang.Object getTypeObject(
				        java.lang.String namespaceURI,
				        java.lang.String typeName,
				        javax.xml.stream.XMLStreamReader reader)
				        throws java.lang.Exception
					{

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "add1".equals(typeName))
							{

								return Add1.Factory.parse(reader);

							}

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "add".equals(typeName))
							{

								return Add.Factory.parse(reader);

							}

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "helloOutput".equals(typeName))
							{

								return HelloOutput.Factory.parse(reader);

							}

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "helloInput".equals(typeName))
							{

								return HelloInput.Factory.parse(reader);

							}

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "add1Response".equals(typeName))
							{

								return Add1Response.Factory.parse(reader);

							}

						if ("http://www.tabish.com".equals(namespaceURI)
						        && "addResponse".equals(typeName))
							{

								return AddResponse.Factory.parse(reader);

							}

						throw new org.apache.axis2.databinding.ADBException(
						        "Unsupported type " + namespaceURI + " "
						                + typeName);
					}

			}

		public static class Add implements org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = add Namespace URI = http://www.tabish.com Namespace
				 * Prefix = ns1
				 */

				/**
				 * field for Arg0
				 */

				protected HelloInput localArg0;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localArg0Tracker = false;

				public boolean isArg0Specified()
					{
						return localArg0Tracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return HelloInput
				 */
				public HelloInput getArg0()
					{
						return localArg0;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Arg0
				 */
				public void setArg0(HelloInput param)
					{
						localArg0Tracker = param != null;

						this.localArg0 = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":add", xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "add", xmlWriter);
									}

							}
						if (localArg0Tracker)
							{
								if (localArg0 == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "arg0 cannot be null!!");
									}
								localArg0.serialize(
								        new javax.xml.namespace.QName("",
								                "arg0"), xmlWriter);
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (localArg0Tracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "arg0"));

								if (localArg0 == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "arg0 cannot be null!!");
									}
								elementList.add(localArg0);
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static Add parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								Add object = new Add();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"add".equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (Add) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "arg0")
										                .equals(reader
										                        .getName()))
											{

												object.setArg0(HelloInput.Factory
												        .parse(reader));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class Add1Response
		        implements
		            org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = add1Response Namespace URI = http://www.tabish.com
				 * Namespace Prefix = ns1
				 */

				/**
				 * field for _return
				 */

				protected HelloOutput local_return;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean local_returnTracker = false;

				public boolean is_returnSpecified()
					{
						return local_returnTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return HelloOutput
				 */
				public HelloOutput get_return()
					{
						return local_return;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            _return
				 */
				public void set_return(HelloOutput param)
					{
						local_returnTracker = param != null;

						this.local_return = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":add1Response",
										        xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "add1Response",
										        xmlWriter);
									}

							}
						if (local_returnTracker)
							{
								if (local_return == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "return cannot be null!!");
									}
								local_return.serialize(
								        new javax.xml.namespace.QName("",
								                "return"), xmlWriter);
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (local_returnTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "return"));

								if (local_return == null)
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "return cannot be null!!");
									}
								elementList.add(local_return);
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static Add1Response parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								Add1Response object = new Add1Response();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"add1Response"
														        .equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (Add1Response) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "return")
										                .equals(reader
										                        .getName()))
											{

												object.set_return(HelloOutput.Factory
												        .parse(reader));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class AddResponseE
		        implements
		            org.apache.axis2.databinding.ADBBean
			{

				public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
				        "http://www.tabish.com", "addResponse", "ns1");

				/**
				 * field for AddResponse
				 */

				protected AddResponse localAddResponse;

				/**
				 * Auto generated getter method
				 * 
				 * @return AddResponse
				 */
				public AddResponse getAddResponse()
					{
						return localAddResponse;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            AddResponse
				 */
				public void setAddResponse(AddResponse param)
					{

						this.localAddResponse = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, MY_QNAME);
						return factory.createOMElement(dataSource, MY_QNAME);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it

						if (localAddResponse == null)
							{
								throw new org.apache.axis2.databinding.ADBException(
								        "addResponse cannot be null!");
							}
						localAddResponse.serialize(MY_QNAME, xmlWriter);

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						// We can safely assume an element has only one type
						// associated with it
						return localAddResponse.getPullParser(MY_QNAME);

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static AddResponseE parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								AddResponseE object = new AddResponseE();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										while (!reader.isEndElement())
											{
												if (reader.isStartElement())
													{

														if (reader
														        .isStartElement()
														        && new javax.xml.namespace.QName(
														                "http://www.tabish.com",
														                "addResponse")
														                .equals(reader
														                        .getName()))
															{

																object.setAddResponse(AddResponse.Factory
																        .parse(reader));

															} // End of if for
															  // expected
															  // property start
															  // element

														else
															{
																// A start
																// element we
																// are not
																// expecting
																// indicates an
																// invalid
																// parameter was
																// passed
																throw new org.apache.axis2.databinding.ADBException(
																        "Unexpected subelement "
																                + reader.getName());
															}

													} else
													{
														reader.next();
													}
											} // end of while loop

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class HelloOutput
		        implements
		            org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = helloOutput Namespace URI = http://www.tabish.com
				 * Namespace Prefix = ns1
				 */

				/**
				 * field for B_out
				 */

				protected boolean localB_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localB_outTracker = false;

				public boolean isB_outSpecified()
					{
						return localB_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return boolean
				 */
				public boolean getB_out()
					{
						return localB_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            B_out
				 */
				public void setB_out(boolean param)
					{

						// setting primitive attribute tracker to true
						localB_outTracker = true;

						this.localB_out = param;

					}

				/**
				 * field for F_out
				 */

				protected float localF_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localF_outTracker = false;

				public boolean isF_outSpecified()
					{
						return localF_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return float
				 */
				public float getF_out()
					{
						return localF_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            F_out
				 */
				public void setF_out(float param)
					{

						// setting primitive attribute tracker to true
						localF_outTracker = !java.lang.Float.isNaN(param);

						this.localF_out = param;

					}

				/**
				 * field for I_out
				 */

				protected int localI_out;

				/**
				 * Auto generated getter method
				 * 
				 * @return int
				 */
				public int getI_out()
					{
						return localI_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            I_out
				 */
				public void setI_out(int param)
					{

						this.localI_out = param;

					}

				/**
				 * field for L1_out
				 */

				protected long localL1_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localL1_outTracker = false;

				public boolean isL1_outSpecified()
					{
						return localL1_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return long
				 */
				public long getL1_out()
					{
						return localL1_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            L1_out
				 */
				public void setL1_out(long param)
					{

						// setting primitive attribute tracker to true
						localL1_outTracker = param != java.lang.Long.MIN_VALUE;

						this.localL1_out = param;

					}

				/**
				 * field for L_out
				 */

				protected long localL_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localL_outTracker = false;

				public boolean isL_outSpecified()
					{
						return localL_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return long
				 */
				public long getL_out()
					{
						return localL_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            L_out
				 */
				public void setL_out(long param)
					{

						// setting primitive attribute tracker to true
						localL_outTracker = param != java.lang.Long.MIN_VALUE;

						this.localL_out = param;

					}

				/**
				 * field for Str2_out
				 */

				protected java.lang.String localStr2_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localStr2_outTracker = false;

				public boolean isStr2_outSpecified()
					{
						return localStr2_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return java.lang.String
				 */
				public java.lang.String getStr2_out()
					{
						return localStr2_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Str2_out
				 */
				public void setStr2_out(java.lang.String param)
					{
						localStr2_outTracker = param != null;

						this.localStr2_out = param;

					}

				/**
				 * field for Str_out
				 */

				protected java.lang.String localStr_out;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localStr_outTracker = false;

				public boolean isStr_outSpecified()
					{
						return localStr_outTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return java.lang.String
				 */
				public java.lang.String getStr_out()
					{
						return localStr_out;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Str_out
				 */
				public void setStr_out(java.lang.String param)
					{
						localStr_outTracker = param != null;

						this.localStr_out = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":helloOutput",
										        xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "helloOutput",
										        xmlWriter);
									}

							}
						if (localB_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "b_out",
								        xmlWriter);

								if (false)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "b_out cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localB_out));
									}

								xmlWriter.writeEndElement();
							}
						if (localF_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "f_out",
								        xmlWriter);

								if (java.lang.Float.isNaN(localF_out))
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "f_out cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localF_out));
									}

								xmlWriter.writeEndElement();
							}
						namespace = "";
						writeStartElement(null, namespace, "i_out", xmlWriter);

						if (localI_out == java.lang.Integer.MIN_VALUE)
							{

								throw new org.apache.axis2.databinding.ADBException(
								        "i_out cannot be null!!");

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localI_out));
							}

						xmlWriter.writeEndElement();
						if (localL1_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "l1_out",
								        xmlWriter);

								if (localL1_out == java.lang.Long.MIN_VALUE)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "l1_out cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localL1_out));
									}

								xmlWriter.writeEndElement();
							}
						if (localL_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "l_out",
								        xmlWriter);

								if (localL_out == java.lang.Long.MIN_VALUE)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "l_out cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localL_out));
									}

								xmlWriter.writeEndElement();
							}
						if (localStr2_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "str2_out",
								        xmlWriter);

								if (localStr2_out == null)
									{
										// write the nil attribute

										throw new org.apache.axis2.databinding.ADBException(
										        "str2_out cannot be null!!");

									} else
									{

										xmlWriter
										        .writeCharacters(localStr2_out);

									}

								xmlWriter.writeEndElement();
							}
						if (localStr_outTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "str_out",
								        xmlWriter);

								if (localStr_out == null)
									{
										// write the nil attribute

										throw new org.apache.axis2.databinding.ADBException(
										        "str_out cannot be null!!");

									} else
									{

										xmlWriter.writeCharacters(localStr_out);

									}

								xmlWriter.writeEndElement();
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (localB_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "b_out"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localB_out));
							}
						if (localF_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "f_out"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localF_out));
							}
						elementList.add(new javax.xml.namespace.QName("",
						        "i_out"));

						elementList
						        .add(org.apache.axis2.databinding.utils.ConverterUtil
						                .convertToString(localI_out));
						if (localL1_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "l1_out"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localL1_out));
							}
						if (localL_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "l_out"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localL_out));
							}
						if (localStr2_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "str2_out"));

								if (localStr2_out != null)
									{
										elementList
										        .add(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localStr2_out));
									} else
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "str2_out cannot be null!!");
									}
							}
						if (localStr_outTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "str_out"));

								if (localStr_out != null)
									{
										elementList
										        .add(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localStr_out));
									} else
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "str_out cannot be null!!");
									}
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static HelloOutput parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								HelloOutput object = new HelloOutput();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"helloOutput"
														        .equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (HelloOutput) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "b_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "b_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setB_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToBoolean(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "f_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "f_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setF_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToFloat(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setF_out(java.lang.Float.NaN);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "i_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "i_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setI_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToInt(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{
												// A start element we are not
												// expecting indicates an
												// invalid parameter was passed
												throw new org.apache.axis2.databinding.ADBException(
												        "Unexpected subelement "
												                + reader.getName());
											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "l1_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "l1_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setL1_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToLong(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setL1_out(java.lang.Long.MIN_VALUE);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "l_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "l_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setL_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToLong(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setL_out(java.lang.Long.MIN_VALUE);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "str2_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "str2_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setStr2_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToString(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "str_out")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "str_out"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setStr_out(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToString(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		public static class HelloInput
		        implements
		            org.apache.axis2.databinding.ADBBean
			{
				/*
				 * This type was generated from the piece of schema that had
				 * name = helloInput Namespace URI = http://www.tabish.com
				 * Namespace Prefix = ns1
				 */

				/**
				 * field for B
				 */

				protected boolean localB;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localBTracker = false;

				public boolean isBSpecified()
					{
						return localBTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return boolean
				 */
				public boolean getB()
					{
						return localB;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            B
				 */
				public void setB(boolean param)
					{

						// setting primitive attribute tracker to true
						localBTracker = true;

						this.localB = param;

					}

				/**
				 * field for F
				 */

				protected float localF;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localFTracker = false;

				public boolean isFSpecified()
					{
						return localFTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return float
				 */
				public float getF()
					{
						return localF;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            F
				 */
				public void setF(float param)
					{

						// setting primitive attribute tracker to true
						localFTracker = !java.lang.Float.isNaN(param);

						this.localF = param;

					}

				/**
				 * field for I
				 */

				protected int localI;

				/**
				 * Auto generated getter method
				 * 
				 * @return int
				 */
				public int getI()
					{
						return localI;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            I
				 */
				public void setI(int param)
					{

						this.localI = param;

					}

				/**
				 * field for L
				 */

				protected long localL;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localLTracker = false;

				public boolean isLSpecified()
					{
						return localLTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return long
				 */
				public long getL()
					{
						return localL;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            L
				 */
				public void setL(long param)
					{

						// setting primitive attribute tracker to true
						localLTracker = param != java.lang.Long.MIN_VALUE;

						this.localL = param;

					}

				/**
				 * field for L1
				 */

				protected long localL1;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localL1Tracker = false;

				public boolean isL1Specified()
					{
						return localL1Tracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return long
				 */
				public long getL1()
					{
						return localL1;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            L1
				 */
				public void setL1(long param)
					{

						// setting primitive attribute tracker to true
						localL1Tracker = param != java.lang.Long.MIN_VALUE;

						this.localL1 = param;

					}

				/**
				 * field for Str
				 */

				protected java.lang.String localStr;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localStrTracker = false;

				public boolean isStrSpecified()
					{
						return localStrTracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return java.lang.String
				 */
				public java.lang.String getStr()
					{
						return localStr;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Str
				 */
				public void setStr(java.lang.String param)
					{
						localStrTracker = param != null;

						this.localStr = param;

					}

				/**
				 * field for Str2
				 */

				protected java.lang.String localStr2;

				/*
				 * This tracker boolean wil be used to detect whether the user
				 * called the set method for this attribute. It will be used to
				 * determine whether to include this field in the serialized XML
				 */
				protected boolean localStr2Tracker = false;

				public boolean isStr2Specified()
					{
						return localStr2Tracker;
					}

				/**
				 * Auto generated getter method
				 * 
				 * @return java.lang.String
				 */
				public java.lang.String getStr2()
					{
						return localStr2;
					}

				/**
				 * Auto generated setter method
				 * 
				 * @param param
				 *            Str2
				 */
				public void setStr2(java.lang.String param)
					{
						localStr2Tracker = param != null;

						this.localStr2 = param;

					}

				/**
				 * 
				 * @param parentQName
				 * @param factory
				 * @return org.apache.axiom.om.OMElement
				 */
				public org.apache.axiom.om.OMElement getOMElement(
				        final javax.xml.namespace.QName parentQName,
				        final org.apache.axiom.om.OMFactory factory)
				        throws org.apache.axis2.databinding.ADBException
					{

						org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
						        this, parentQName);
						return factory.createOMElement(dataSource, parentQName);

					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{
						serialize(parentQName, xmlWriter, false);
					}

				public void serialize(
				        final javax.xml.namespace.QName parentQName,
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        boolean serializeType)
				        throws javax.xml.stream.XMLStreamException,
				        org.apache.axis2.databinding.ADBException
					{

						java.lang.String prefix = null;
						java.lang.String namespace = null;

						prefix = parentQName.getPrefix();
						namespace = parentQName.getNamespaceURI();
						writeStartElement(prefix, namespace,
						        parentQName.getLocalPart(), xmlWriter);

						if (serializeType)
							{

								java.lang.String namespacePrefix = registerPrefix(
								        xmlWriter, "http://www.tabish.com");
								if ((namespacePrefix != null)
								        && (namespacePrefix.trim().length() > 0))
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", namespacePrefix
										                + ":helloInput",
										        xmlWriter);
									} else
									{
										writeAttribute(
										        "xsi",
										        "http://www.w3.org/2001/XMLSchema-instance",
										        "type", "helloInput", xmlWriter);
									}

							}
						if (localBTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "b",
								        xmlWriter);

								if (false)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "b cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localB));
									}

								xmlWriter.writeEndElement();
							}
						if (localFTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "f",
								        xmlWriter);

								if (java.lang.Float.isNaN(localF))
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "f cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localF));
									}

								xmlWriter.writeEndElement();
							}
						namespace = "";
						writeStartElement(null, namespace, "i", xmlWriter);

						if (localI == java.lang.Integer.MIN_VALUE)
							{

								throw new org.apache.axis2.databinding.ADBException(
								        "i cannot be null!!");

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localI));
							}

						xmlWriter.writeEndElement();
						if (localLTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "l",
								        xmlWriter);

								if (localL == java.lang.Long.MIN_VALUE)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "l cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localL));
									}

								xmlWriter.writeEndElement();
							}
						if (localL1Tracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "l1",
								        xmlWriter);

								if (localL1 == java.lang.Long.MIN_VALUE)
									{

										throw new org.apache.axis2.databinding.ADBException(
										        "l1 cannot be null!!");

									} else
									{
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localL1));
									}

								xmlWriter.writeEndElement();
							}
						if (localStrTracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "str",
								        xmlWriter);

								if (localStr == null)
									{
										// write the nil attribute

										throw new org.apache.axis2.databinding.ADBException(
										        "str cannot be null!!");

									} else
									{

										xmlWriter.writeCharacters(localStr);

									}

								xmlWriter.writeEndElement();
							}
						if (localStr2Tracker)
							{
								namespace = "";
								writeStartElement(null, namespace, "str2",
								        xmlWriter);

								if (localStr2 == null)
									{
										// write the nil attribute

										throw new org.apache.axis2.databinding.ADBException(
										        "str2 cannot be null!!");

									} else
									{

										xmlWriter.writeCharacters(localStr2);

									}

								xmlWriter.writeEndElement();
							}
						xmlWriter.writeEndElement();

					}

				private static java.lang.String generatePrefix(
				        java.lang.String namespace)
					{
						if (namespace.equals("http://www.tabish.com"))
							{
								return "ns1";
							}
						return org.apache.axis2.databinding.utils.BeanUtil
						        .getUniquePrefix();
					}

				/**
				 * Utility method to write an element start tag.
				 */
				private void writeStartElement(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String localPart,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String writerPrefix = xmlWriter
						        .getPrefix(namespace);
						if (writerPrefix != null)
							{
								xmlWriter.writeStartElement(namespace,
								        localPart);
							} else
							{
								if (namespace.length() == 0)
									{
										prefix = "";
									} else if (prefix == null)
									{
										prefix = generatePrefix(namespace);
									}

								xmlWriter.writeStartElement(prefix, localPart,
								        namespace);
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
					}

				/**
				 * Util method to write an attribute with the ns prefix
				 */
				private void writeAttribute(java.lang.String prefix,
				        java.lang.String namespace, java.lang.String attName,
				        java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (xmlWriter.getPrefix(namespace) == null)
							{
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeAttribute(java.lang.String namespace,
				        java.lang.String attName, java.lang.String attValue,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName, attValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attValue);
							}
					}

				/**
				 * Util method to write an attribute without the ns prefix
				 */
				private void writeQNameAttribute(java.lang.String namespace,
				        java.lang.String attName,
				        javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						java.lang.String attributeNamespace = qname
						        .getNamespaceURI();
						java.lang.String attributePrefix = xmlWriter
						        .getPrefix(attributeNamespace);
						if (attributePrefix == null)
							{
								attributePrefix = registerPrefix(xmlWriter,
								        attributeNamespace);
							}
						java.lang.String attributeValue;
						if (attributePrefix.trim().length() > 0)
							{
								attributeValue = attributePrefix + ":"
								        + qname.getLocalPart();
							} else
							{
								attributeValue = qname.getLocalPart();
							}

						if (namespace.equals(""))
							{
								xmlWriter.writeAttribute(attName,
								        attributeValue);
							} else
							{
								registerPrefix(xmlWriter, namespace);
								xmlWriter.writeAttribute(namespace, attName,
								        attributeValue);
							}
					}
				/**
				 * method to handle Qnames
				 */

				private void writeQName(javax.xml.namespace.QName qname,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String namespaceURI = qname.getNamespaceURI();
						if (namespaceURI != null)
							{
								java.lang.String prefix = xmlWriter
								        .getPrefix(namespaceURI);
								if (prefix == null)
									{
										prefix = generatePrefix(namespaceURI);
										xmlWriter.writeNamespace(prefix,
										        namespaceURI);
										xmlWriter.setPrefix(prefix,
										        namespaceURI);
									}

								if (prefix.trim().length() > 0)
									{
										xmlWriter
										        .writeCharacters(prefix
										                + ":"
										                + org.apache.axis2.databinding.utils.ConverterUtil
										                        .convertToString(qname));
									} else
									{
										// i.e this is the default namespace
										xmlWriter
										        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(qname));
									}

							} else
							{
								xmlWriter
								        .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(qname));
							}
					}

				private void writeQNames(javax.xml.namespace.QName[] qnames,
				        javax.xml.stream.XMLStreamWriter xmlWriter)
				        throws javax.xml.stream.XMLStreamException
					{

						if (qnames != null)
							{
								// we have to store this data until last moment
								// since it is not possible to write any
								// namespace data after writing the charactor
								// data
								java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
								java.lang.String namespaceURI = null;
								java.lang.String prefix = null;

								for (int i = 0; i < qnames.length; i++)
									{
										if (i > 0)
											{
												stringToWrite.append(" ");
											}
										namespaceURI = qnames[i]
										        .getNamespaceURI();
										if (namespaceURI != null)
											{
												prefix = xmlWriter
												        .getPrefix(namespaceURI);
												if ((prefix == null)
												        || (prefix.length() == 0))
													{
														prefix = generatePrefix(namespaceURI);
														xmlWriter
														        .writeNamespace(
														                prefix,
														                namespaceURI);
														xmlWriter.setPrefix(
														        prefix,
														        namespaceURI);
													}

												if (prefix.trim().length() > 0)
													{
														stringToWrite
														        .append(prefix)
														        .append(":")
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													} else
													{
														stringToWrite
														        .append(org.apache.axis2.databinding.utils.ConverterUtil
														                .convertToString(qnames[i]));
													}
											} else
											{
												stringToWrite
												        .append(org.apache.axis2.databinding.utils.ConverterUtil
												                .convertToString(qnames[i]));
											}
									}
								xmlWriter.writeCharacters(stringToWrite
								        .toString());
							}

					}

				/**
				 * Register a namespace prefix
				 */
				private java.lang.String registerPrefix(
				        javax.xml.stream.XMLStreamWriter xmlWriter,
				        java.lang.String namespace)
				        throws javax.xml.stream.XMLStreamException
					{
						java.lang.String prefix = xmlWriter
						        .getPrefix(namespace);
						if (prefix == null)
							{
								prefix = generatePrefix(namespace);
								javax.xml.namespace.NamespaceContext nsContext = xmlWriter
								        .getNamespaceContext();
								while (true)
									{
										java.lang.String uri = nsContext
										        .getNamespaceURI(prefix);
										if (uri == null || uri.length() == 0)
											{
												break;
											}
										prefix = org.apache.axis2.databinding.utils.BeanUtil
										        .getUniquePrefix();
									}
								xmlWriter.writeNamespace(prefix, namespace);
								xmlWriter.setPrefix(prefix, namespace);
							}
						return prefix;
					}

				/**
				 * databinding method to get an XML representation of this
				 * object
				 * 
				 */
				public javax.xml.stream.XMLStreamReader getPullParser(
				        javax.xml.namespace.QName qName)
				        throws org.apache.axis2.databinding.ADBException
					{

						java.util.ArrayList elementList = new java.util.ArrayList();
						java.util.ArrayList attribList = new java.util.ArrayList();

						if (localBTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "b"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localB));
							}
						if (localFTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "f"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localF));
							}
						elementList.add(new javax.xml.namespace.QName("", "i"));

						elementList
						        .add(org.apache.axis2.databinding.utils.ConverterUtil
						                .convertToString(localI));
						if (localLTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "l"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localL));
							}
						if (localL1Tracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "l1"));

								elementList
								        .add(org.apache.axis2.databinding.utils.ConverterUtil
								                .convertToString(localL1));
							}
						if (localStrTracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "str"));

								if (localStr != null)
									{
										elementList
										        .add(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localStr));
									} else
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "str cannot be null!!");
									}
							}
						if (localStr2Tracker)
							{
								elementList.add(new javax.xml.namespace.QName(
								        "", "str2"));

								if (localStr2 != null)
									{
										elementList
										        .add(org.apache.axis2.databinding.utils.ConverterUtil
										                .convertToString(localStr2));
									} else
									{
										throw new org.apache.axis2.databinding.ADBException(
										        "str2 cannot be null!!");
									}
							}

						return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
						        qName, elementList.toArray(),
						        attribList.toArray());

					}

				/**
				 * Factory class that keeps the parse method
				 */
				public static class Factory
					{

						/**
						 * static method to create the object Precondition: If
						 * this object is an element, the current or next start
						 * element starts this object and any intervening reader
						 * events are ignorable If this object is not an
						 * element, it is a complex type and the reader is at
						 * the event just after the outer start element
						 * Postcondition: If this object is an element, the
						 * reader is positioned at its end element If this
						 * object is a complex type, the reader is positioned at
						 * the end element of its outer element
						 */
						public static HelloInput parse(
						        javax.xml.stream.XMLStreamReader reader)
						        throws java.lang.Exception
							{
								HelloInput object = new HelloInput();

								int event;
								java.lang.String nillableValue = null;
								java.lang.String prefix = "";
								java.lang.String namespaceuri = "";
								try
									{

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "type") != null)
											{
												java.lang.String fullTypeName = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "type");
												if (fullTypeName != null)
													{
														java.lang.String nsPrefix = null;
														if (fullTypeName
														        .indexOf(":") > -1)
															{
																nsPrefix = fullTypeName
																        .substring(
																                0,
																                fullTypeName
																                        .indexOf(":"));
															}
														nsPrefix = nsPrefix == null
														        ? ""
														        : nsPrefix;

														java.lang.String type = fullTypeName
														        .substring(fullTypeName
														                .indexOf(":") + 1);

														if (!"helloInput"
														        .equals(type))
															{
																// find
																// namespace for
																// the prefix
																java.lang.String nsUri = reader
																        .getNamespaceContext()
																        .getNamespaceURI(
																                nsPrefix);
																return (HelloInput) ExtensionMapper
																        .getTypeObject(
																                nsUri,
																                type,
																                reader);
															}

													}

											}

										// Note all attributes that were
										// handled. Used to differ normal
										// attributes
										// from anyAttributes.
										java.util.Vector handledAttributes = new java.util.Vector();

										reader.next();

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "b").equals(reader
										                .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "b"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setB(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToBoolean(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "f").equals(reader
										                .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "f"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setF(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToFloat(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setF(java.lang.Float.NaN);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "i").equals(reader
										                .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "i"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setI(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToInt(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{
												// A start element we are not
												// expecting indicates an
												// invalid parameter was passed
												throw new org.apache.axis2.databinding.ADBException(
												        "Unexpected subelement "
												                + reader.getName());
											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "l").equals(reader
										                .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "l"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setL(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToLong(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setL(java.lang.Long.MIN_VALUE);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "l1").equals(reader
										                .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "l1"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setL1(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToLong(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

												object.setL1(java.lang.Long.MIN_VALUE);

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "str")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "str"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setStr(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToString(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement()
										        && new javax.xml.namespace.QName(
										                "", "str2")
										                .equals(reader
										                        .getName()))
											{

												nillableValue = reader
												        .getAttributeValue(
												                "http://www.w3.org/2001/XMLSchema-instance",
												                "nil");
												if ("true"
												        .equals(nillableValue)
												        || "1".equals(nillableValue))
													{
														throw new org.apache.axis2.databinding.ADBException(
														        "The element: "
														                + "str2"
														                + "  cannot be null");
													}

												java.lang.String content = reader
												        .getElementText();

												object.setStr2(org.apache.axis2.databinding.utils.ConverterUtil
												        .convertToString(content));

												reader.next();

											} // End of if for expected property
											  // start element

										else
											{

											}

										while (!reader.isStartElement()
										        && !reader.isEndElement())
											reader.next();

										if (reader.isStartElement())
											// A start element we are not
											// expecting indicates a trailing
											// invalid property
											throw new org.apache.axis2.databinding.ADBException(
											        "Unexpected subelement "
											                + reader.getName());

									} catch (javax.xml.stream.XMLStreamException e)
									{
										throw new java.lang.Exception(e);
									}

								return object;
							}

					}// end of factory class

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.HelloserviceStub.Add1E param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(
						        com.tabish.www.HelloserviceStub.Add1E.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.HelloserviceStub.Add1ResponseE param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param
						        .getOMElement(
						                com.tabish.www.HelloserviceStub.Add1ResponseE.MY_QNAME,
						                org.apache.axiom.om.OMAbstractFactory
						                        .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.HelloserviceStub.AddE param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(
						        com.tabish.www.HelloserviceStub.AddE.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.HelloserviceStub.AddResponseE param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param
						        .getOMElement(
						                com.tabish.www.HelloserviceStub.AddResponseE.MY_QNAME,
						                org.apache.axiom.om.OMAbstractFactory
						                        .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		        org.apache.axiom.soap.SOAPFactory factory,
		        com.tabish.www.HelloserviceStub.Add1E param,
		        boolean optimizeContent, javax.xml.namespace.QName methodQName)
		        throws org.apache.axis2.AxisFault
			{

				try
					{

						org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
						        .getDefaultEnvelope();
						emptyEnvelope
						        .getBody()
						        .addChild(
						                param.getOMElement(
						                        com.tabish.www.HelloserviceStub.Add1E.MY_QNAME,
						                        factory));
						return emptyEnvelope;
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		/* methods to provide back word compatibility */

		private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		        org.apache.axiom.soap.SOAPFactory factory,
		        com.tabish.www.HelloserviceStub.AddE param,
		        boolean optimizeContent, javax.xml.namespace.QName methodQName)
		        throws org.apache.axis2.AxisFault
			{

				try
					{

						org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
						        .getDefaultEnvelope();
						emptyEnvelope
						        .getBody()
						        .addChild(
						                param.getOMElement(
						                        com.tabish.www.HelloserviceStub.AddE.MY_QNAME,
						                        factory));
						return emptyEnvelope;
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		/* methods to provide back word compatibility */

		/**
		 * get the default envelope
		 */
		private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		        org.apache.axiom.soap.SOAPFactory factory)
			{
				return factory.getDefaultEnvelope();
			}

		private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
		        java.lang.Class type, java.util.Map extraNamespaces)
		        throws org.apache.axis2.AxisFault
			{

				try
					{

						if (com.tabish.www.HelloserviceStub.Add1E.class
						        .equals(type))
							{

								return com.tabish.www.HelloserviceStub.Add1E.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.HelloserviceStub.Add1ResponseE.class
						        .equals(type))
							{

								return com.tabish.www.HelloserviceStub.Add1ResponseE.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.HelloserviceStub.AddE.class
						        .equals(type))
							{

								return com.tabish.www.HelloserviceStub.AddE.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.HelloserviceStub.AddResponseE.class
						        .equals(type))
							{

								return com.tabish.www.HelloserviceStub.AddResponseE.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

					} catch (java.lang.Exception e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}
				return null;
			}

	}
