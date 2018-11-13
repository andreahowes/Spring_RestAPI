package com.restfulexample.restfuldemo.Presentation;

import com.restfulexample.restfuldemo.Logic.Phrase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {
    private static final String template = "Hello, %s!";

    @RequestMapping("/home")
    public Phrase home(@RequestParam(value = "nameOfPerson", defaultValue = "Andrea") String nameOfPerson) {
        return new Phrase(String.format(template, nameOfPerson));
    }


}
