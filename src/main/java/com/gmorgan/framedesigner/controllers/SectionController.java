package com.gmorgan.framedesigner.controllers;

import com.gmorgan.framedesigner.Models.Section;
import com.gmorgan.framedesigner.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping
    public ResponseEntity<List<Section>>getAllSections(){
        return new ResponseEntity<>(sectionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{desc}")
    public ResponseEntity<List<Section>>getAll(@PathVariable("desc") String desc){
        return new ResponseEntity<>(sectionRepository.findAllByDescContainsOrderByIxx(desc.toUpperCase()), HttpStatus.OK);
    }

    @GetMapping("/{desc}/y/{minIyy}/{minZyy}/all")
    public ResponseEntity<List<Section>>getAllBeamsY(@PathVariable("minIyy") double Iyy,
                                                   @PathVariable("minZyy") double Zyy,
                                                   @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findAllByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, desc), HttpStatus.OK);
    }

    @GetMapping("/{desc}/x/{minIxx}/{minZxx}/all")
    public ResponseEntity<List<Section>>getAllBeamsX(@PathVariable("minIxx") double Ixx,
                                                   @PathVariable("minZxx") double Zxx,
                                                   @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findAllByIxxGreaterThanAndZxxGreaterThanAndDescContainsIgnoreCase(Ixx, Zxx, desc), HttpStatus.OK);
    }

    @GetMapping("/{desc}/y/{minIyy}/{minZyy}")
    public ResponseEntity<Section>getBeamY(@PathVariable("minIyy") double Iyy,
                                                   @PathVariable("minZyy") double Zyy,
                                                   @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findFirstByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, desc), HttpStatus.OK);
    }

    @GetMapping("/{desc}/x/{minIxx}/{minZxx}")
    public ResponseEntity<Section>getBeamX(@PathVariable("minIxx") double Ixx,
                                          @PathVariable("minZxx") double Zxx,
                                          @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findFirstByIxxGreaterThanAndZxxGreaterThanAndDescContainsIgnoreCase(Ixx, Zxx, desc), HttpStatus.OK);
    }

//    @GetMapping("/{desc}/{minIyy}/{minZyy}/{csa}")
//    public ResponseEntity<List<Section>>getNextRhs(@PathVariable("minIyy") double Iyy,
//                                             @PathVariable("minZyy") double Zyy,
//                                             @PathVariable("desc")  String desc,
//                                             @PathVariable("csa") double csa){
//        return new ResponseEntity<>(sectionRepository.findAllByIyyGreaterThanAndZyyGreaterThanAndCsaGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, csa, desc), HttpStatus.OK);
//    }


}
