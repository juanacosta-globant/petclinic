package guru.springframework.sfgpetclinic.configuration;

import com.guru.springframework.sfgpetclinic.services.OwnerService;
import com.guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfiguration {

    @Bean
    public OwnerService ownerService(){
        return new OwnerServiceMap();
    }
}
