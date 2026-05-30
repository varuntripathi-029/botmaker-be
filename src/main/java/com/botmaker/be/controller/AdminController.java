package com.botmaker.be.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@Tag(name = "Admin", description = "Endpoints accessible by ADMIN role only")
public class AdminController {

    @GetMapping
    @Operation(summary = "Admin endpoint accessible by ADMIN role only")
    public ResponseEntity<String> adminEndpoint() {
        return ResponseEntity.ok("This is an admin content.");
    }
}
