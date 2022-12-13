package com.example.hw3_2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String getStartInfo() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String getInfoAboutMe() {
        return  "Кузьмина Диана. " +
                "Книга рецептов. " +
                "Дата создания проекта: 13.12.2022. " +
                "Название проекта: Книга рецептов. " +
                "Описание проекта: В данном проекте будут подробно описаны рецепты блюд, включая " +
                "название, состав и способ приготовления. Проект будет реализован при помощи web-приложения. " +
                "Написано на языке Java.";
    }
}
