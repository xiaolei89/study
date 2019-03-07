package site.xiaolei.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudyApplication {

    @Autowired
    private Environment env;

    @RequestMapping("/arg")
    public String getArg(String name){
        return env.getProperty(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
}
