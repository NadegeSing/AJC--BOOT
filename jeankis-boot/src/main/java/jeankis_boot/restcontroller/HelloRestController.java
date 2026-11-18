package jeankis_boot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/api/hello")
public class HelloRestController {

    @GetMapping 
    public String hello() {
        String hello = "Hello !";
        return hello;
    }

}
