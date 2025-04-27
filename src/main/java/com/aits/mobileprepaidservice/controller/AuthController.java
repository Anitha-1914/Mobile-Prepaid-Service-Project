package com.aits.mobileprepaidservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder; // ✅ important import
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.mobileprepaidservice.entity.User;
import com.aits.mobileprepaidservice.repoo.UserRepository;
import com.aits.mobileprepaidservice.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private JwtUtil jwtUtil;

    //Endpoint to register user
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }

    // Endpoint to login user
    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody User loginUser) {
        var user = userRepo.findByEmail(loginUser.getEmail())
            .orElseThrow(() -> new RuntimeException("User not found"));

        if (encoder.matches(loginUser.getPassword(), user.getPassword())) {
            String token = jwtUtil.generateToken(user.getEmail());
            return ResponseEntity.ok(
                Map.of(
                    "token", token,
                    "role", user.getRole().name()
                )
            );
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
