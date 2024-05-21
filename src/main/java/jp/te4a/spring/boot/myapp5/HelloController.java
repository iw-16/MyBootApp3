package jp.te4a.spring.boot.myapp5;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Hello world!
 */
@Controller
public class HelloController{


    @RequestMapping("/")
    public String index(Model model){
       // model.addAttribute("msg", "this is a setting message");
        //return "Hello,Spring Boot!";
        return "index";
    }
    /*@RequestMapping("/miyagi")
    public String miyagi(){
        return "Miyagi desu!";
    }
    @RequestMapping("/te/taro")
    public String taro(){
        return "Taro desu!";
    }*/
}
