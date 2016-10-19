package com;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExpressionTag
	{

		Properties prop = new Properties();
		InputStream input = null;

		public  ExpressionTag()
			{
				try
					{

						input = getClass().getClassLoader()
						        .getResourceAsStream("hindi.properties");

						// load a properties file
						prop.load(input);

						// get the property value and print it out
						System.out.println(prop.getProperty("pin"));
						/*
						out.println(prop.getProperty("second"));*/

					} catch (IOException ex)
					{
						ex.printStackTrace();
					} finally
					{
						if (input != null)
							{
								try
									{
										input.close();
									} catch (IOException e)
									{
										e.printStackTrace();
									}
							}

					}
			}
		
		public String getProperties()
			{
			 return prop.getProperty("second");	
			}

	}
