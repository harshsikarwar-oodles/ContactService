package com.contact.Service;

import com.contact.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L,"Amit@gmail.com", "Amit", 1311L),
            new Contact(2L,"tejasvi@gmail.com", "tejasvi", 1311L),
            new Contact(3L,"Harsh@gmail.com", "Harsh", 1312L)
            );

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
