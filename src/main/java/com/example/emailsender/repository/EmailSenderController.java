package com.example.emailsender.repository;

import com.example.emailsender.service.EmailSenderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/send")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    public EmailSenderController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @GetMapping("/email")
    public void sendEmail(){
        emailSenderService.sendEmail("leo.esaki211@gmail.com","Hey there!", "Test");
    }

}
