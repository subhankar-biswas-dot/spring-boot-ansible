package com.example.alien.ansible;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
    @Autowired
    AlienRepo alienRepo;

    @GetMapping("/getAlien")
    public List<Alien> getAllAlien(){
        return alienRepo.findAll();
    }

    @PostMapping("/addAlien")
    public void addNewAlien(Alien alien){
        Alien addAlien = new Alien();
        addAlien.setId(alien.getId());
        addAlien.setName(alien.getName());

        alienRepo.save(addAlien);
    }
}
