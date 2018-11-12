package br.com.application.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/v1/work/{time}", method = RequestMethod.GET)
    public String getClients(@PathVariable Long time) throws InterruptedException {
        Thread.sleep(time);
        return "Service 2, thread sleep: " + time + " miliseconds.";
    }
}
