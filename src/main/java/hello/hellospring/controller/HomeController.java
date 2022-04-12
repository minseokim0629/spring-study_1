package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //localhost8080
    @GetMapping("/")
    public String home(){
        //home.html 호출
        return "home";
    }
}
