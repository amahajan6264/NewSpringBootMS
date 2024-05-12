package com.ak.controler;


import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LocalController {

    @GetMapping("/language")
    public String showLanguagePage() {
    	
        return "home";
    }

    @PostMapping("/changeLanguage")
    public String changeLanguage(HttpServletRequest request, HttpServletResponse response, String lang) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        Locale newLocale = new Locale(lang);
        localeResolver.setLocale(request, response, newLocale);
        return "redirect:/";
    }
}

