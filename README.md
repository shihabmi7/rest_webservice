# REST-WebService
You can learn how to create and deploy Jersy REST web service in Eclipse from this repository.

## Introduction: 
If you are interested to do everything from scratch then go through the following steps:
* Create a dynamic web project in eclipse.
* You need jery jar files to write a Jersy based REST web service. You can downlaod jersy jar files from  https://jersey.java.net/download.html. However, I have already downloaded and put them into project's /lib folder
* You have to change the default web.xml file to register Jersey as Servlet dispatcher. I have already done it.
* I have used Apache Tomcat 7.0 Server.

## Project Description
The project contains two classes:
* __RestWebService:__ This class contains two methods. One is a @Post method and another one is a @Get method. This class is actually our service class. Both methods return JSON String. The @Post method consumes JSON data.
* __Utility:__ This class is used to construct JSON data.

## Run and Test
* You can right click on the project and Run As>Run On Server. After running it might show HTTP 404, but don't worry, this is just for inappropriate URL of your service. As your service in running on tomcat server you can test it now.
* _Postman_ is a good tool to test REST service. If you do not have it yet get it in your google chrome browser as an extension. After adding it you can see a new icon in your windows task bar. Open Postman and test both @Post and @Get method in the following way:

__@Post method:__ The post method URL is http://localhost:8080/restbeesmart/classpath/postmethodpath. This method consumes JSON data. For example:
```Json
{
    "name":"Shohrab",
    "age":"30",
    "address":"Stuttgart, Germany"
}
```
Make sure that you have selected _POST_ from the URL area and _raw_ , _JSON_ from Body tab.

You should see the following response if you click on Send button

```Json
{
  "user_name": "User's name is Shohrab",
  "user_address": "User's address is Stuttgart, Germany",
  "user_age": "User's age is 30"
}
```

__@Get method:__ The get method URL is http://localhost:8080/restbeesmart/classpath/getmethodpath. You should see the following response:

```Json
{
  "user_name": "Shohrab",
  "phone_numbers": [
    {
      "landphone": "07554125",
      "mobile": "015210532185"
    }
  ],
  "user_address": "Stuttgart, Germany",
  "user_age": "30"
}
```
Make sure that you have selected _GET_ from the URL area. You do not need to set any input data from Body tab.

## Deploy

Deploying REST web service is easier than anything. Simply create a war file of your project. Then put that war file in your tomacat's webapps folder. At last restart the tomcat server. That's it. 
