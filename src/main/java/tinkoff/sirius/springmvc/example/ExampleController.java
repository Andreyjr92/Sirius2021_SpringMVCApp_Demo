package tinkoff.sirius.springmvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {

    @RequestMapping("/")
    public String getExampleView(Model m) {
        m.addAttribute("message", "Success!");
        return "index";
    }

    @RequestMapping("/hello_world")
    public String sayHelloToTheWorld(Model m) {
        m.addAttribute("message2", "Hey there! Hello, world");
        return "hello_world";
    }

    @RequestMapping("/goodbay")
    public String sayGoodBayToTheWorld() {
        return "goodbay";
    }
}
