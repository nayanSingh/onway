/*package com.cab.onway.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.code.morphia.annotations.Entity;
import com.mongodb.MongoClient;

@Configuration
public class MorphiaAutoConfiguration {

	
	 @Autowired
	    private MongoClient mongoClient; // created from MongoAutoConfiguration

	    @Bean
	    public Datastore datastore() throws ClassNotFoundException {
	        Morphia morphia = new Morphia();

	        // map entities, there is maybe a better way to find and map all entities
	        ClassPathScanningCandidateComponentProvider entityScanner = new ClassPathScanningCandidateComponentProvider(true);
	        entityScanner.addIncludeFilter(new AnnotationTypeFilter(Entity.class));
	        for (BeanDefinition candidate : entityScanner.findCandidateComponents("your.basepackage")) { // from properties?
	            morphia.map(Class.forName(candidate.getBeanClassName()));
	        }

	        return morphia.createDatastore(mongoClient, "dataStoreInstanceId"); // "dataStoreInstanceId" may come from properties?
	    }
}
*/

//https://stackoverflow.com/questions/29365535/spring-boot-configuration-with-morphia