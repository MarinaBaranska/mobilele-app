package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserRegistrationController {
    //правим регистрационна форма
    //трябва да отворим login register с контролера
    //извиква се с линг и get даявка
    @GetMapping("/users/register")
    public String register(){
        return "auth-register";
    }

    //за да обработим заявката за регистрация трябва postMapprin
    @PostMapping("/users/register")
    public String register(UserRegistrationDto userRegistrationDto){
        return "redirect:/";//когато регистрацията приключи отиваме към хоум страницата
    }

}
