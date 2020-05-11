# What is this?

This is a Spring boot 2 app to demonstrate 

1. How to create a Feign client using Open Feign and register it as a client with a Eureka server
2. How to consume the Feign client to make a call to a REST endpoint.

## Pre-requisite

1. Before running this app, you have to make sure that you have the a sample Eureka server is up and running. 
You can find the instructions and code to build and deploy a sample Eureka server using Spring Boot 2 at 

https://github.com/rajeshhereforyou/eureka-server-demo 


## How to build, deploy and run this app?

Step 1: Clone this repo at https://github.com/rajeshhereforyou/eureka-feignclient-demo.git

Step 2: Once you cloned the repo,all the gradle dependencies should be resolved and available in your classpath to run the app as an Eureka Client

Step 3: Now, you can run the app using Spring boot 'bootRun' command

Step 4: Once you have the app up and running, you can the health of the app using 'http://localhost:8081/actuator/health'. This should return '{"status":"UP"}'



## How to create a Feign client ?

Step 1: Create an interface 'SampleFeignClient' by adding an annotation '@FeignClient(value = "EurekaFeignClientDemoApplication")' at the interface level. You can see the code at 'src/main/java/com/example/eurekafeignclientdemo/controller/SampleFeignClient.java'. 

Step 2: Now create a rest controller 'SampleFeignClientController' by implementing the interface 'SampleFeignClient'. You can see the code at 'src/main/java/com/example/eurekafeignclientdemo/controller/SampleFeignClientController.java'

Step 3: Now, add the annotation '@EnableDiscoveryClient' in the EurekaFeignclientDemoApplication.java. This will register this app as Eureka client.

Step 4: That's it, now you have created a Feign client called 'SampleFeignClient' and registering that Feign client with Eureka server (the one that you have created as per the pre-requisite section)with the key 'EurekaFeignclientDemoApplication'


## How to consume a Feign client?

Step 1: Create a controller 'TestClientRequestController' and Autowire the Feign Client as shown below

```java
@Autowired
public SampleFeignClient feignClient;
```

Step 2: Now, you can hit the endpoint '/user/{userId}' of 'SampleFeignClientController' using the FeignClient method 'List<String> getUser(@PathVariable String userId)' as shown below

```java
feignClient.getUser(userId);
```

That's it, Now you have created a Feign client and created a Feign client consumer
