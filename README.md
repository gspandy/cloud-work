# cloud-work

一、cloud-register(云服务注册中心)
   1.引入依赖
        <dependency>
			<groupId>com.wl</groupId>
			<artifactId>cloud-register</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
	2.按照依赖jar包（cloud-register）中提供的配置文件模板（application.properties）配置
	    #注册中心端口
		server.port=8671

		#注册中心主机地址
		eureka.instance.hostname=localhost

		#标识自己是注册中心
		eureka.client.register-with-eureka=false

		#标识自己是注册中心
		eureka.client.fetch-registry=false

		#注册地址
		eureka.client.service-url.defaultZone=http://${eureka.instance.hostname}:${server.port}/eureka
		
二、cloud-server(云服务提供者)
	本服务需要两个子模块，一个是服务实现模块（例如cloud-service），另一个是对客户端提供接口的api模块（例如cloud-service-api）
	1.cloud-service（服务实现模块）
		(1).引入依赖
			<dependency>
				<groupId>com.wl</groupId>
				<artifactId>cloud-server</artifactId>
				<version>0.0.1-SNAPSHOT</version>
			</dependency>
		(2).按照依赖jar包（cloud-service）中提供的配置文件模板（application.properties）配置
			#服务端口
			server.port=8763

			#注册中心注册地址
			eureka.client.service-url.defaultZone=http://localhost:8671/eureka

			#服务名
			spring.application.name=cloud-service
		(3).编写具体服务，并暴露rest接口
		
		service简单例子：
			@RestController
			public class CloudService {

				@RequestMapping(value = "/hello", method = RequestMethod.GET)
				String hello(@RequestParam(value = "name") String name){
					return "hello";
				}
			}
			
	2.cloud-service-api(对外接口api模块)
		(1).引入依赖
			<dependency>
				<groupId>com.wl</groupId>
				<artifactId>cloud-client</artifactId>
				<version>0.0.1-SNAPSHOT</version>
			</dependency>
		(2).在api接口上增加注解
			@FeignClient(value = "CLOUD-SERVICE")，指定为本服务名
		(3).在具体方法上增加@RequestMapping注解
		
		api简单例子：
			@FeignClient(value = "CLOUD-SERVICE")
			public interface CloudServiceApi {

				@RequestMapping(value = "/hello", method = RequestMethod.GET)
				String hello(@RequestParam(value = "name") String name);
			}
			
三、具体客户端(服务消费者)
	1.引入云服务提供的api接口依赖（具体依赖以实际提供的为准）
		<dependency>
			<groupId>com.wl</groupId>
			<artifactId>cloud-service-api</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
	2.按照依赖jar包（cloud-service-api）中提供的配置文件模板（application.properties）配置
		#服务端口
		server.port=8088

		#服务名
		spring.application.name=cloud-client

		#注册中心注册地址
		eureka.client.service-url.defaultZone=http://localhost:8671/eureka
	3.注入服务接口即可
		@Autowired
		private CloudServiceApi cloudServiceApi;
		
具体例子清参考项目中的：example-demo
