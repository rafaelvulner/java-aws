package br.com.estudos.aws.javaaws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class AwsController {

    @GetMapping
    public ResponseEntity<?> index(){
        return ResponseEntity.ok("Is Alive");
    }
}
