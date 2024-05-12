package com.ak.controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class LocalController {

    @GetMapping("/language")
    public String showLanguagePage() {
        return "language";
    }

    @PostMapping("/changeLanguage")
    public String changeLanguage(HttpServletRequest request, HttpServletResponse response, String lang) {
        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);
        Locale newLocale = new Locale(lang);
        localeResolver.setLocale(request, response, newLocale);
        return "redirect:/";
    }
}

