package tn.esprit.tpfoyer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@EnableAspectJAutoProxy
public class TpFoyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpFoyerApplication.class, args);
    }

}
