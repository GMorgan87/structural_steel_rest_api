package com.gmorgan.framedesigner.controllers;

import com.gmorgan.framedesigner.Models.Section;
import com.gmorgan.framedesigner.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sections")
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping
    public ResponseEntity<List<Section>>getAllSections(){
        return new ResponseEntity<>(sectionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/rhs")
    public ResponseEntity<List<Section>>getAllRhs(){
        return new ResponseEntity<>(sectionRepository.findAllByDescContainsOrderByIxx("RHS"), HttpStatus.OK);
    }

    @GetMapping("/shs")
    public ResponseEntity<List<Section>>getAllShs(){
        return new ResponseEntity<>(sectionRepository.findAllByDescContainsOrderByIxx("SHS"), HttpStatus.OK);
    }

    @GetMapping("/{desc}/{minIxx}/{minZxx}")
    public ResponseEntity<Section>getNextRhs(@PathVariable("minIxx") double Ixx,
                                             @PathVariable("minZxx") double Zxx,
                                             @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findFirstByIxxGreaterThanAndZxxGreaterThanAndDescContainsIgnoreCase(Ixx, Zxx, desc), HttpStatus.OK);
    }

}
