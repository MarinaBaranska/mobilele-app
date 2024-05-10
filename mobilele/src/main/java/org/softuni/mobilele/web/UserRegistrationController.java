package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.UserRegistrationDto;
import org.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserRegistrationController {
    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

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
        userService.registerUser(userRegistrationDto);
        return "redirect:/";//когато регистрацията приключи отиваме към хоум страницата
    }

}
