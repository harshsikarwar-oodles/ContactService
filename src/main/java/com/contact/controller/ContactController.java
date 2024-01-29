package com.contact.controller;

import com.contact.Entity.Contact;
import com.contact.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    @GetMapping(value = "/user/{userId}")
    public List<Contact> getContact(@PathVariable("userId") Long userId){
        return contactService.getContactOfUser(userId);
    }
}
