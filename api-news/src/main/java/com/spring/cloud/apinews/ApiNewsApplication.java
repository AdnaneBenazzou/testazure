package com.spring.cloud.apinews;

import com.spring.cloud.apinews.pojo.News;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ApiNewsApplication {

	private static Map<Integer,News> newsMap = new HashMap<>();

	public static void main(String[] args) {
		newsMap.put(1, new News(1, "Fallout 4", "Sortie de Fallout 4 en GOTY !",1, 1));
		newsMap.put(2, new News(2,"Java", "Sortie de Java 10",1, 2));
		newsMap.put(3, new News(3,"Soluce", "Soluce MassEffect",1, 1));
		SpringApplication.run(ApiNewsApplication.class, args);
	}

	@RequestMapping("/news")
	public Collection<News> getAllNews() {
		return newsMap.values();
	}

}
