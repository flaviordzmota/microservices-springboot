package one.digitalinnovation.expert.productcatalogspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackageClasses = "one.digitalinnovation.repsitory")

public class ElasticSearchConfig {

    
}