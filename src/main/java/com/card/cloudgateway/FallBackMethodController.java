package com.card.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/hostfallback")
    public String hostServiceFallBackMethod()
    {
        return "Server is taking longer thatn Expected. Please try again later";
    }

    @GetMapping("/clientfallback")
    public String clientServiceFallBackMethod()
    {
        return "User Service is taking longer thatn Expected. Please try again later";
    }
}
