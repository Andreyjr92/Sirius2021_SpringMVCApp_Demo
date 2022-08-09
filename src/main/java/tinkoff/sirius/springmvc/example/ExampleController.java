package tinkoff.sirius.springmvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
public class ExampleController {

    @RequestMapping("/index")
    public String getExampleView(Model model) {
        model.addAttribute("message", "Success!");
        return "index";
    }

    @RequestMapping("/hello_world")
    public String sayHelloToTheWorld(Model model) {
        model.addAttribute("message2", "Hey there! Hello, world");
        return "hello_world";
    }

    @RequestMapping("/goodbay")
    public String sayGoodBayToTheWorld(Locale locale, Model model) {
        System.out.println("Home Page Requested, locale = " + locale);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        return "goodbay";
    }
}
