/**
 * HelloInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.tabish.www;

/**
 * HelloInput bean class
 */
@SuppressWarnings(
	{"unchecked", "unused"})
public class HelloInput implements org.apache.axis2.databinding.ADBBean
	{
		/*
		 * This type was generated from the piece of schema that had name =
		 * helloInput Namespace URI = http://www.tabish.com Namespace Prefix =
		 * ns1
		 */

		/**
		 * field for B
		 */

		protected boolean localB;

		/*
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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
		 * This tracker boolean wil be used to detect whether the user called
		 * the set method for this attribute. It will be used to determine
		 * whether to include this field in the serialized XML
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

		public void serialize(final javax.xml.namespace.QName parentQName,
		        javax.xml.stream.XMLStreamWriter xmlWriter)
		        throws javax.xml.stream.XMLStreamException,
		        org.apache.axis2.databinding.ADBException
			{
				serialize(parentQName, xmlWriter, false);
			}

		public void serialize(final javax.xml.namespace.QName parentQName,
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
								        "type",
								        namespacePrefix + ":helloInput",
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
						writeStartElement(null, namespace, "b", xmlWriter);

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
						writeStartElement(null, namespace, "f", xmlWriter);

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
						writeStartElement(null, namespace, "l", xmlWriter);

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
						writeStartElement(null, namespace, "l1", xmlWriter);

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
						writeStartElement(null, namespace, "str", xmlWriter);

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
						writeStartElement(null, namespace, "str2", xmlWriter);

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
				java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
				if (writerPrefix != null)
					{
						xmlWriter.writeStartElement(namespace, localPart);
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
						xmlWriter.writeAttribute(namespace, attName, attValue);
					}
			}

		/**
		 * Util method to write an attribute without the ns prefix
		 */
		private void writeQNameAttribute(java.lang.String namespace,
		        java.lang.String attName, javax.xml.namespace.QName qname,
		        javax.xml.stream.XMLStreamWriter xmlWriter)
		        throws javax.xml.stream.XMLStreamException
			{

				java.lang.String attributeNamespace = qname.getNamespaceURI();
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
						xmlWriter.writeAttribute(attName, attributeValue);
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
								xmlWriter.writeNamespace(prefix, namespaceURI);
								xmlWriter.setPrefix(prefix, namespaceURI);
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
						// we have to store this data until last moment since it
						// is not possible to write any
						// namespace data after writing the charactor data
						java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
						java.lang.String namespaceURI = null;
						java.lang.String prefix = null;

						for (int i = 0; i < qnames.length; i++)
							{
								if (i > 0)
									{
										stringToWrite.append(" ");
									}
								namespaceURI = qnames[i].getNamespaceURI();
								if (namespaceURI != null)
									{
										prefix = xmlWriter
										        .getPrefix(namespaceURI);
										if ((prefix == null)
										        || (prefix.length() == 0))
											{
												prefix = generatePrefix(namespaceURI);
												xmlWriter.writeNamespace(
												        prefix, namespaceURI);
												xmlWriter.setPrefix(prefix,
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
						xmlWriter.writeCharacters(stringToWrite.toString());
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
				java.lang.String prefix = xmlWriter.getPrefix(namespace);
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
		 * databinding method to get an XML representation of this object
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
						elementList.add(new javax.xml.namespace.QName("", "b"));

						elementList
						        .add(org.apache.axis2.databinding.utils.ConverterUtil
						                .convertToString(localB));
					}
				if (localFTracker)
					{
						elementList.add(new javax.xml.namespace.QName("", "f"));

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
						elementList.add(new javax.xml.namespace.QName("", "l"));

						elementList
						        .add(org.apache.axis2.databinding.utils.ConverterUtil
						                .convertToString(localL));
					}
				if (localL1Tracker)
					{
						elementList
						        .add(new javax.xml.namespace.QName("", "l1"));

						elementList
						        .add(org.apache.axis2.databinding.utils.ConverterUtil
						                .convertToString(localL1));
					}
				if (localStrTracker)
					{
						elementList
						        .add(new javax.xml.namespace.QName("", "str"));

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
						elementList.add(new javax.xml.namespace.QName("",
						        "str2"));

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
				        qName, elementList.toArray(), attribList.toArray());

			}

		/**
		 * Factory class that keeps the parse method
		 */
		public static class Factory
			{

				/**
				 * static method to create the object Precondition: If this
				 * object is an element, the current or next start element
				 * starts this object and any intervening reader events are
				 * ignorable If this object is not an element, it is a complex
				 * type and the reader is at the event just after the outer
				 * start element Postcondition: If this object is an element,
				 * the reader is positioned at its end element If this object is
				 * a complex type, the reader is positioned at the end element
				 * of its outer element
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
												if (fullTypeName.indexOf(":") > -1)
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

												if (!"helloInput".equals(type))
													{
														// find namespace for
														// the prefix
														java.lang.String nsUri = reader
														        .getNamespaceContext()
														        .getNamespaceURI(
														                nsPrefix);
														return (HelloInput) com.tabish.www.ExtensionMapper
														        .getTypeObject(
														                nsUri,
														                type,
														                reader);
													}

											}

									}

								// Note all attributes that were handled. Used
								// to differ normal attributes
								// from anyAttributes.
								java.util.Vector handledAttributes = new java.util.Vector();

								reader.next();

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "b").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "f").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

										object.setF(java.lang.Float.NaN);

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "i").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{
										// A start element we are not expecting
										// indicates an invalid parameter was
										// passed
										throw new org.apache.axis2.databinding.ADBException(
										        "Unexpected subelement "
										                + reader.getName());
									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "l").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

										object.setL(java.lang.Long.MIN_VALUE);

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "l1").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

										object.setL1(java.lang.Long.MIN_VALUE);

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "str").equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement()
								        && new javax.xml.namespace.QName("",
								                "str2")
								                .equals(reader.getName()))
									{

										nillableValue = reader
										        .getAttributeValue(
										                "http://www.w3.org/2001/XMLSchema-instance",
										                "nil");
										if ("true".equals(nillableValue)
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

									} // End of if for expected property start
									  // element

								else
									{

									}

								while (!reader.isStartElement()
								        && !reader.isEndElement())
									reader.next();

								if (reader.isStartElement())
									// A start element we are not expecting
									// indicates a trailing invalid property
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
