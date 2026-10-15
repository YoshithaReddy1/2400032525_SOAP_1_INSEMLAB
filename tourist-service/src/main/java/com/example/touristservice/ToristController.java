
package com.example.touristservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ToristController {

    @GetMapping("/tourists")
    public String getTourists(HttpServletRequest request) {
        return "Tourist Service running on port: "
                + request.getLocalPort()
                + " | Places: Tirupati, Araku Valley, Vizag";
    }
}


