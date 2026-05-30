package com.botmaker.be.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Tag(name = "User", description = "Endpoints accessible by USER and ADMIN roles")
public class UserController {

    @GetMapping
    @Operation(summary = "User endpoint accessible by USER and ADMIN roles")
    public ResponseEntity<String> userEndpoint() {
        return ResponseEntity.ok("This is a user content.");
    }
}
