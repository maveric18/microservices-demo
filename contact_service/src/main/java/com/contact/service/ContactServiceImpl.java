package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts
    List<Contact> contactList = List.of(
            new Contact(122L, "Jason@gmail.com", "Jason", 1223L),
            new Contact(134L, "Winston@gmail.com", "Winston", 1345L),
            new Contact(143L, "Rahul@gmail.com", "Rahul", 1432L),
            new Contact(133L, "Rohan@gmail.com", "Rohan", 1432L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
