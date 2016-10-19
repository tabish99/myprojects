/**
 * HelloserviceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.tabish.www;

/**
 * HelloserviceMessageReceiverInOut message receiver
 */

public class HelloserviceMessageReceiverInOut
        extends
            org.apache.axis2.receivers.AbstractInOutMessageReceiver
	{

		public void invokeBusinessLogic(
		        org.apache.axis2.context.MessageContext msgContext,
		        org.apache.axis2.context.MessageContext newMsgContext)
		        throws org.apache.axis2.AxisFault
			{

				try
					{

						// get the implementation class for the Web Service
						Object obj = getTheImplementationObject(msgContext);

						HelloserviceSkeleton skel = (HelloserviceSkeleton) obj;
						// Out Envelop
						org.apache.axiom.soap.SOAPEnvelope envelope = null;
						// Find the axisOperation that has been set by the
						// Dispatch phase.
						org.apache.axis2.description.AxisOperation op = msgContext
						        .getOperationContext().getAxisOperation();
						if (op == null)
							{
								throw new org.apache.axis2.AxisFault(
								        "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
							}

						java.lang.String methodName;
						if ((op.getName() != null)
						        && ((methodName = org.apache.axis2.util.JavaUtils
						                .xmlNameToJavaIdentifier(op.getName()
						                        .getLocalPart())) != null))
							{

								if ("add1".equals(methodName))
									{

										com.tabish.www.Add1ResponseE add1Response1 = null;
										com.tabish.www.Add1E wrappedParam = (com.tabish.www.Add1E) fromOM(
										        msgContext.getEnvelope()
										                .getBody()
										                .getFirstElement(),
										        com.tabish.www.Add1E.class,
										        getEnvelopeNamespaces(msgContext
										                .getEnvelope()));

										add1Response1 =

										skel.add1(wrappedParam);

										envelope = toEnvelope(
										        getSOAPFactory(msgContext),
										        add1Response1,
										        false,
										        new javax.xml.namespace.QName(
										                "http://www.tabish.com",
										                "add1"));
									} else

								if ("add".equals(methodName))
									{

										com.tabish.www.AddResponseE addResponse3 = null;
										com.tabish.www.AddE wrappedParam = (com.tabish.www.AddE) fromOM(
										        msgContext.getEnvelope()
										                .getBody()
										                .getFirstElement(),
										        com.tabish.www.AddE.class,
										        getEnvelopeNamespaces(msgContext
										                .getEnvelope()));

										addResponse3 =

										skel.add(wrappedParam);

										envelope = toEnvelope(
										        getSOAPFactory(msgContext),
										        addResponse3,
										        false,
										        new javax.xml.namespace.QName(
										                "http://www.tabish.com",
										                "add"));

									} else
									{
										throw new java.lang.RuntimeException(
										        "method not found");
									}

								newMsgContext.setEnvelope(envelope);
							}
					} catch (java.lang.Exception e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}
			}

		//
		private org.apache.axiom.om.OMElement toOM(com.tabish.www.Add1E param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(
						        com.tabish.www.Add1E.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.Add1ResponseE param, boolean optimizeContent)
		        throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(
						        com.tabish.www.Add1ResponseE.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(com.tabish.www.AddE param,
		        boolean optimizeContent) throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(com.tabish.www.AddE.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.om.OMElement toOM(
		        com.tabish.www.AddResponseE param, boolean optimizeContent)
		        throws org.apache.axis2.AxisFault
			{

				try
					{
						return param.getOMElement(
						        com.tabish.www.AddResponseE.MY_QNAME,
						        org.apache.axiom.om.OMAbstractFactory
						                .getOMFactory());
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}

			}

		private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		        org.apache.axiom.soap.SOAPFactory factory,
		        com.tabish.www.Add1ResponseE param, boolean optimizeContent,
		        javax.xml.namespace.QName methodQName)
		        throws org.apache.axis2.AxisFault
			{
				try
					{
						org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
						        .getDefaultEnvelope();

						emptyEnvelope.getBody().addChild(
						        param.getOMElement(
						                com.tabish.www.Add1ResponseE.MY_QNAME,
						                factory));

						return emptyEnvelope;
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}
			}

		private com.tabish.www.Add1ResponseE wrapadd1()
			{
				com.tabish.www.Add1ResponseE wrappedElement = new com.tabish.www.Add1ResponseE();
				return wrappedElement;
			}

		private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
		        org.apache.axiom.soap.SOAPFactory factory,
		        com.tabish.www.AddResponseE param, boolean optimizeContent,
		        javax.xml.namespace.QName methodQName)
		        throws org.apache.axis2.AxisFault
			{
				try
					{
						org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
						        .getDefaultEnvelope();

						emptyEnvelope.getBody().addChild(
						        param.getOMElement(
						                com.tabish.www.AddResponseE.MY_QNAME,
						                factory));

						return emptyEnvelope;
					} catch (org.apache.axis2.databinding.ADBException e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}
			}

		private com.tabish.www.AddResponseE wrapadd()
			{
				com.tabish.www.AddResponseE wrappedElement = new com.tabish.www.AddResponseE();
				return wrappedElement;
			}

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

						if (com.tabish.www.Add1E.class.equals(type))
							{

								return com.tabish.www.Add1E.Factory.parse(param
								        .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.Add1ResponseE.class.equals(type))
							{

								return com.tabish.www.Add1ResponseE.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.AddE.class.equals(type))
							{

								return com.tabish.www.AddE.Factory.parse(param
								        .getXMLStreamReaderWithoutCaching());

							}

						if (com.tabish.www.AddResponseE.class.equals(type))
							{

								return com.tabish.www.AddResponseE.Factory
								        .parse(param
								                .getXMLStreamReaderWithoutCaching());

							}

					} catch (java.lang.Exception e)
					{
						throw org.apache.axis2.AxisFault.makeFault(e);
					}
				return null;
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

		private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e)
			{
				org.apache.axis2.AxisFault f;
				Throwable cause = e.getCause();
				if (cause != null)
					{
						f = new org.apache.axis2.AxisFault(e.getMessage(),
						        cause);
					} else
					{
						f = new org.apache.axis2.AxisFault(e.getMessage());
					}

				return f;
			}

	}// end of class
