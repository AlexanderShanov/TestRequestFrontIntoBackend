package simple.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "/simple2", method = RequestMethod.POST, consumes ="application/json", produces ="application/json")
@RequestMapping(value = "/simple2", method = RequestMethod.POST)
public class SimpleController2 {


    @PostMapping("/simple2")
    public ResponseEntity<String> simple2(@RequestBody String inputData) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "*");
        responseHeaders.set("Access-Control-Allow-Headers","application/json, Content-Type, " +
                "origin, content-type, accept, authorization, X-Auth-Token");
        responseHeaders.set("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
        System.out.println("pizdec");
        //return "{\"pizdec\":\"pizdec123\"}";

        return ResponseEntity.ok()
                .headers(responseHeaders)
                .body("{\"pizdec\":\"pizdec1234\"}");
    }

    /*@GetMapping("/simple2")
    public String simpleget2(@RequestBody String inputData) {

        return "{\"pizdec\":\"pizdec\"}";
    }*/
}
