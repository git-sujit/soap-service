# Code-First Approach
# Why Apache CXF to create SOAP/REST Webservices?
	- Apache CXF is an Open Source Services Framework
	- CXF helps building services using frontend programming APIs like JAX-WS and JAX-RS
	- These services can speak to variety of protocols e.g. SOAP, XML/HTTP, RESTful/HTTP or CORBA
	- These services can work on variety of transports e.g HTTP, JMS or JBI(Java Business Integration)
	- JAX-WS support
	- RESTful services
	- Spring Integration
# JAX-WS Vs JAX-RS
	- JAX-WS represents SOAP. It is API for SOAP based web services
	- JAX-RS represents REST. It is API for REST based web services
# Two types of SOAP communication style
	- Document (Application data which is part of SOAP Body is sent as XML Document)
	- RPC (Consumer invokes method of services as if it is local method)
	Communication style is defined in WSDL
# pom.xml, web.xml & beans.xml
	- pom.xml configures libraries we need in project
	- web.xml configures servlets, listener, filter etc that is needed by Tomcat Servlet container
	- beans.xml is for Spring
# Steps
	1. Create maven project of archetype webapp
	2. pom.xml: Add Spring, Apache CXF dependencies
	3. web.xml: Add Spring ContextLoaderListener & Set contextConfigLocation (beans.xml location)
	4. web.xml: add CXFServlet
	5. Java Interface Having: @WebService / @WebMethod / @WebParam
	6. Implement Interface: mention endpoint interface and override interface-methods
	7. beans.xml: Mention jaxws:endpoint
	8. pom.xml: Plugin to create wsdl from the Java Class, mention Interface in the pom
	9. mvn install: It will create war file that will be deployed on Tomcat and It will generate the wsdl under gererated/wsdl folder
	
	
# Reference
	- http://cxf.apache.org/docs/writing-a-service-with-spring.html
	
	


