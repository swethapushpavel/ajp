package hello.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
 @RequestMapping("/login")   
 public String registerform(@ModelAttribute("frm") Forms frm)
 {
    return "registration_form";
 }
 @RequestMapping("/registersucc")
 public String registersucc(@ModelAttribute("frm") Forms frm)
 {
    return "registration_succ";
}
}
