package org.softuni.mobilele.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//клас който посреща htpp заявките и чрез него ги обработваме
@Controller
public class UserLoginController {

    //оказваме какви методи искаме да обработваме - get push..

    //метод обработващ get заявки
    @GetMapping("/users/login")
    public String login(){
        return "auth-login"; //взимаме името от templates html за да го визуализираме

    }

}
