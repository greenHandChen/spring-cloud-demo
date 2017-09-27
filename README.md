# spring-cloud-demo
## 服务介绍
### 1.cloud-config-server
配置服务-用于对其他项目进行额外的配置<br>
@EnableConfigServer注解:声明Config Server服务端。<br>
注:cloud-person的数据源配置就是在这里进行配置。<br>
###2.cloud-eureka-server 
服务发现-用于服务之间的通信<br>
@EnableEurekaServer注解:声明Eureka Server服务端。<br>
@EnableEurekaClient注解:声明Eureka Client客户端。<br>
###3.cloud-person
服务模块-采用srping-data-jpa来访问数据库<br>
数据源配置:存在于config-server服务的/src/main/resources/config下。<br>
表的生成:通过正向工程，使用实体类来维护表结构。<br>
初始化数据:初始化数据的文件存在于本服务/src/main/resources/data.sql中(第一次启动项目时，务必将文件名从dataSQL修改为data,项目启动成功后，务必将文件名修改回dataSQL)。<br>
###4.cloud-some
服务模块<br>
该服务的额外配置同样存在于config-server服务的/src/main/resources/config下。<br>
###5.cloud-ui
界面模块-具备了路由网关与负载均衡的功能<br>
路由网关:目的是为了让所有的微服务对外只暴露出一个接口，当访问其余服务时，通过网关把我们的请求代理到对应的服务上。<br>
负载均衡:采用Ribbon和Feign作为负载均衡的客户端。<br>
Ribbon:使用Ribbon时，只需注入RestTemplate对象即可，RestTemplate已做好负载均衡。<br>
Feign:使用Feign时，需要定义一个接口，在该定义的接口上添加@FeignClient注解，并且注入对应的远程服务名，再通过@RequestMapping(映射路径保持和远程服务的映射路径相同)在方法上来映射远程服务。<br>
@EnableFeignClients注解:开启对Feign客户端的支持。<br>
@EnableCircuitBreaker注解:开启对断路器的支持。<br>
@EnableZuulProxy:开启对网关代理的支持。<br>
###5.cloud-monitor
断路器监控模块<br>
## 启动服务
按照如下顺序启动：(1,2启动顺序固定，3之后不计较顺序)<br>
1.cloud-eureka-server<br>
2.cloud-config-server<br>
3.cloud-person<br>
4.cloud-some<br>
5.cloud-ui<br>
6.cloud-monitor<br>