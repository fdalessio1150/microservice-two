package br.com.application.controller;

import br.com.application.model.Client;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @RequestMapping(value = "/v1/work/{time}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String postClients(@PathVariable Long time, @RequestBody Client client) throws InterruptedException {
        System.out.println(client.getName());
        Thread.sleep(time);
        return "Service 2, thread sleep: " + time + " miliseconds.";
    }
    
    @RequestMapping(value = "/v1/work-list/{time}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String postClientsList(@PathVariable Long time, @RequestBody List<Client> clientList) throws InterruptedException {
        clientList.forEach(a -> System.out.println(a.getName()));
        Thread.sleep(time);
        return "Service 2 - List, thread sleep: " + time + " miliseconds.";
    }
}
