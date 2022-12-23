package com.teste.TESTE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

    public class Control
{
    @GetMapping("/HELLO")
    @ResponseBody
    public String hello()
    {
        return "HELLO WORLD !!";
    }
}
