package com.example.demowebappget;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class SalutoController {

    @GetMapping(path = "/ciao/{provincia}")
    public Saluto saluta(
            @PathVariable(value = "provincia", required = true) String provincia,
            @RequestParam(value ="nome", required = false, defaultValue = " ") String nome
    ) {
        if (nome == null) {
            return new Saluto();
        } else {
            String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
            Saluto saluto1 = new Saluto(nome, provincia, saluto);
            return saluto1;
        }
    }
}
