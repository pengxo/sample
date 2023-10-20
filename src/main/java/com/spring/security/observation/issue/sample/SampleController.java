package com.spring.security.observation.issue.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {

    @GetMapping(path = "/spring/security/observation/{userId}", produces = "application/json")
    public Mono<String> getUserId(@PathVariable String userId) {
        return Mono.just("The userId is " + userId);
    }
}
