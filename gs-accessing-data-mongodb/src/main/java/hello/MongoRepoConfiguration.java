package hello;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.MongoDbFactory;

@Configuration
@Profile("cloud")
public class MongoRepoConfiguration extends AbstractCloudConfig{
	
	@Bean
	public MongoDbFactory getMongoDBConfig(){
		return connectionFactory().mongoDbFactory();
	}
}
