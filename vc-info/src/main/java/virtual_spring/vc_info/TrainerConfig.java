package virtual_spring.vc_info;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("virtual_spring.vc_info")
@PropertySource("info.properties")
public class TrainerConfig {

}
