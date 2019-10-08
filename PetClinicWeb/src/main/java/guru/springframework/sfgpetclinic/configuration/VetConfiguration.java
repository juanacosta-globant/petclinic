package guru.springframework.sfgpetclinic.configuration;

import com.guru.springframework.sfgpetclinic.services.SpecialtyService;
import com.guru.springframework.sfgpetclinic.services.VetService;
import com.guru.springframework.sfgpetclinic.services.map.SpecialityServiceMap;
import com.guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VetConfiguration {

    @Bean
    public SpecialtyService specialtyService(){
        return new SpecialityServiceMap();
    }

    @Bean
    public VetService vetService(){
        return new VetServiceMap(specialtyService());
    }
}
