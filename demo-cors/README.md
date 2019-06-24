Cors跨域

- 前后端分离，ajax访问后台资源（当前demo里指的是controller）会产生跨域问题
  - 第一种方式：设置CorsFilterConfig,项目中有详细解释
  - 第二种方式：自定义filter,设置相应头信息

当前案例使用了上面两种方式，切换不同的方式只需将类上的@Configuration注解注释掉，将另一个解开即可，这写方法实际上都是一种，只是实现的方式各种各样，网上还有很多种写法

前段代码

	$.ajax({
		url:"http://127.0.0.1:8081/user/get-all-users",
		success:function(result){
			console.info(result)
		}
	})
@ConfigureProperties配置

```
@Component
@ConfigurationProperties(prefix =)
@PropertySource("classpath:/application.yml")//可以不写，默认配置
@EnableConfigurationProperties(CorsConfigProperties.class)//@SpringBootApplication中默认集成了，可以不写，作用是使@ConfigurationProperties生效
```