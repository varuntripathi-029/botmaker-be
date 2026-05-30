package com.botmaker.be.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Public", description = "Publicly accessible endpoint")
public class PublicController {

    @GetMapping("/public")
    @Operation(summary = "Public endpoint accessible by anyone")
    public ResponseEntity<String> publicEndpoint() {
        return ResponseEntity.ok("This is a public content.");
    }
}
