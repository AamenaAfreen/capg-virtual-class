package virtual_spring.vc_info;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	Trainee trainee;
        
        ApplicationContext context=
     		   new AnnotationConfigApplicationContext(TrainerConfig.class);
     	//	   new AnnotationConfigApplicationContext("spring.xml");
        trainee=(Trainee) context.getBean("trainee");
        trainee.display();
    	
    }
}
