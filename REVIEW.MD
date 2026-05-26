
Core features of spring boot 


Important features of spring boot 


1. Production-Ready
**Spring Actuator**: check application 
- health( liveness = is it running ?  , readiness= is ready for accepting request ? )
- metrics: 
  - jvm memory consumption
  - cpu usage
- beans ( all bean inside your app)
- envs (environment variable )


2. Virtual Threads 
Lightweight application threads , better than the old traditional threads 

Heavyweight ( more resource consumption )

By using virtual threads, your application will handle more concurrent tasks , meaning handle more requests while keeping your CPU less heavy 

In Java 21+, JVM manage Virtual threads 

3. Getting values from configuration properties
```java
@Value("${app.config}")

```
***

Configuration 
There are two style: 
- `application.properties` 
- `application.yaml`(recommended)