package com.example.personal.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.personal.dto.Person;

@RestController
public class PersonalController {
    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/personal")
    public Person getCustomerPersonalDetailsData() {
        HttpHeaders headers = new HttpHeaders();
        Person person = new Person(1,"sujit","pandey","3rd Feb 1980","Indian","Male");
        System.out.println("Displaying Personal information");
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        return person;
    }

    @RequestMapping(value = "/personal/address")
    public String getCustomerPersonalAddressDetailsData() {
        HttpHeaders headers = new HttpHeaders();
        InetAddress inetAddress = null;
        String ipAddress=null;
        try {
            inetAddress = InetAddress.getLocalHost();
            ipAddress = inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity <String> entity = new HttpEntity<String>(headers);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        System.out.println("Inside Personal Service to fetch Address Details");
        System.out.println("IPAddress in personal service 888888"+ipAddress);
        System.out.println("Cannonical host Host name"+inetAddress.getCanonicalHostName());
        System.out.println("Host name"+inetAddress.getHostName());
        System.out.println("getLoopbackAddress==="+inetAddress.getLoopbackAddress());
        System.out.println("Updated222222");
        return restTemplate.exchange("http://customerdiscover.local:8090/address", HttpMethod.GET, entity, String.class).getBody();
        //return restTemplate.exchange("http://127.0.0.1:8090/address", HttpMethod.GET, entity, String.class).getBody();

    }

}