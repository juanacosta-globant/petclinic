package guru.springframework.sfgpetclinic.configuration;

import com.guru.springframework.sfgpetclinic.services.OwnerService;
import com.guru.springframework.sfgpetclinic.services.PetTypeService;
import com.guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import com.guru.springframework.sfgpetclinic.services.map.PetServiceMap;
import com.guru.springframework.sfgpetclinic.services.map.PetTypeServiceMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OwnerConfiguration {

    @Bean
    public PetTypeService petTypeService(){
        return new PetTypeServiceMap();
    }

    @Bean
    public OwnerService ownerService(){
        return new OwnerServiceMap(petTypeService(), new PetServiceMap());
    }
}
