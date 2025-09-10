package com.example.springbootmysqldocker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootmysqldocker.entity.FormData;
import com.example.springbootmysqldocker.service.FormDataService;

@RestController
@RequestMapping("/api/form")
public class FormDataController {

    @Autowired
    private FormDataService formDataService;

    @PostMapping("/submit")
    public FormData submitForm(@RequestBody FormData formData) {
        return formDataService.saveFormData(formData);
    }
}
