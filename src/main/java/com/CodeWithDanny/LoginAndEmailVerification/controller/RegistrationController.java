package com.CodeWithDanny.LoginAndEmailVerification.controller;

import com.CodeWithDanny.LoginAndEmailVerification.request.RegistrationRequest;
import com.CodeWithDanny.LoginAndEmailVerification.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    // TODO 改成使用@Autowired注入
    private final RegistrationService registrationService;

    @PostMapping
    // TODO 回傳改成傳回物件或vo
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    // TODO 我看不太懂這支API要幹嘛，但是TOKEN是機密資料不可以用URL傳送
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
