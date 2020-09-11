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

    @GetMapping("/{desc}/{minIyy}/{minZyy}")
    public ResponseEntity<List<Section>>getNextbeam(@PathVariable("minIyy") double Iyy,
                                             @PathVariable("minZyy") double Zyy,
                                             @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findAllByIyyGreaterThanAndZyyGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, desc), HttpStatus.OK);
    }

    @GetMapping("/{desc}/{minIyy}/{minZyy}/{csa}")
    public ResponseEntity<List<Section>>getNextRhs(@PathVariable("minIyy") double Iyy,
                                             @PathVariable("minZyy") double Zyy,
                                             @PathVariable("desc")  String desc,
                                             @PathVariable("csa") double csa){
        return new ResponseEntity<>(sectionRepository.findAllByIyyGreaterThanAndZyyGreaterThanAndCsaGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, csa, desc), HttpStatus.OK);
    }


    @GetMapping("/{desc}/{minIxx}/{minZxx}/{minIyy}/{minZyy}/{minX}")
    public ResponseEntity<List<Section>>getNextRhs(@PathVariable("minIxx") double Ixx,
                                             @PathVariable("minZxx") double Zxx,
                                             @PathVariable("minIyy") double Iyy,
                                             @PathVariable("minZyy") double Zyy,
                                             @PathVariable("minX") double X,
                                             @PathVariable("desc")  String desc){
        return new ResponseEntity<>(sectionRepository.findAllByIxxGreaterThanAndZxxGreaterThanAndIyyGreaterThanAndZyyGreaterThanAndYGreaterThanAndDescContainsIgnoreCase(Ixx, Zxx, Iyy, Zyy, X, desc), HttpStatus.OK);
    }

    @GetMapping("/flp/{minIyy}/{minZyy}")
    public ResponseEntity<List<Section>>getFLP(@PathVariable("minIyy") double Iyy,
                                         @PathVariable("minZyy") double Zyy){
        return new ResponseEntity<>(sectionRepository.findAllByIyyGreaterThanAndZyyGreaterThanAndXGreaterThanAndYGreaterThanAndDescContainsIgnoreCase(Iyy, Zyy, 210, 100, "rhs"), HttpStatus.OK);
    }
}
