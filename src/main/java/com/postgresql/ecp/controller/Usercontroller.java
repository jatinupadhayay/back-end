package com.postgresql.ecp.controller;

import com.postgresql.ecp.Service.Usersservice;
import com.postgresql.ecp.dto.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")

public class Usercontroller {

    private final Usersservice usersservice;

    // Constructor injection
    @Autowired
    public Usercontroller(Usersservice usersservice) {
        this.usersservice = usersservice;
    }

    @PostMapping
    public ResponseEntity<Userdto> createUser(@RequestBody Userdto userdto) {
        Userdto savedUser = usersservice.createUsers(userdto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
@GetMapping("/api/users/check")
    public ResponseEntity<String> checkEmail(@RequestParam String email) {

        return ResponseEntity.ok("Email exists");
    }
}
