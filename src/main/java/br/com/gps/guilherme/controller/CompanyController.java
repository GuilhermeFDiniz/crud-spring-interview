package br.com.gps.guilherme.controller;

import br.com.gps.guilherme.controller.DTO.CompanyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("company") //localhost:8080/company/
public class CompanyController {
    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getCompany(@PathVariable("id") int companyId) {
        return new ResponseEntity(new CompanyDTO(String.valueOf(companyId)), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteCompany(@PathVariable("id") int id) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}