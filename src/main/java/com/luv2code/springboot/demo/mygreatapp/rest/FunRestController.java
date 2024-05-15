package com.luv2code.springboot.demo.mygreatapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties form application.properties file
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Expose new endpoint
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Team name: " + teamName + " - Coach name: " + coachName;
    }

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for 'workout'

    @GetMapping("/workout")
    public String workout() {
        return "run 10 kms";
    }

    // expose a new endpoint for 'fortune'

    @GetMapping("/fortune")
    public String fortune() {
        return "It's your lucky day";
    }
}
