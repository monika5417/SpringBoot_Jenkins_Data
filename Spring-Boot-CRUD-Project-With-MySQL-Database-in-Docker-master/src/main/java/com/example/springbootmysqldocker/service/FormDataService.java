package com.example.springbootmysqldocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootmysqldocker.entity.FormData;
import com.example.springbootmysqldocker.repo.FormDataRepository;

@Service
public class FormDataService {

    @Autowired
    private FormDataRepository formDataRepository;

    public FormData saveFormData(FormData formData) {
        return formDataRepository.save(formData);
    }
}
