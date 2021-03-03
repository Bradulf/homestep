package home.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHome(Model model){
        model.addAttribute("greetings", new String[]{"yo", "yolo", "goodbye"});
        return "home";
    }
}
