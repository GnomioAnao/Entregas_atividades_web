package com.fatec.loja;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CestaController {
    @PostMapping("/api/cesta/")
    public String gravar (@RequestBody Cesta obj){
        return "a cesta" + obj.getCodigo()  + "foi salva com sucesso";
    }
    
    @PutMapping("/api/cesta")
    public String alterar(@RequestBody Cesta obj){
        return "a cesta" + obj.getCodigo() + "foi alterada com sucesso";
    }

    @GetMapping ("/api/cesta/{codigo}")
    public Cesta pegar(@PathVariable int codigo){
        Cesta obj = new Cesta(1, null, 30.00, null);
        return obj;
    }

    @DeleteMapping("/api/cesta/{codigo}")
    public String apagar (@RequestBody Cesta obj){
        return "a cesta" + obj.getCodigo() + "foi apagada";
    }

    @GetMapping("/api/cesta")
    public List<Cesta> listar(){
        return new ArrayList<Cesta>();
    }
}