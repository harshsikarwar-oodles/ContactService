package com.contact.Service;

import com.contact.Entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {
    public List<Contact> getContactOfUser(Long userId);
}
