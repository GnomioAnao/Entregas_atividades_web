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
public class ItemController {
    @PostMapping("/api/item/")
    public String gravar (@RequestBody Item obj){
        return "o item" + obj.getCodigo() + "foi salvo com sucesso";
    }

    @PutMapping("/api/item")
    public String alterar(@RequestBody Item obj){
        return "o item" + obj.getCodigo() + "foi alterado com sucesso";
    }

    @GetMapping ("/api/item/{codigo}")
    public Item pegar (@PathVariable int codigo){
        Item obj = new Item(1, null, 10, 30.00);
        return obj;
    }

    @DeleteMapping("/api/produto/{codigo}")
    public String apagar (@RequestBody Item obj){
        return "o item" + obj.getCodigo() + "foi apagado";
    }

    @GetMapping("/api/item")
    public List<Item> listar(){
        return new ArrayList<Item>();
    }
    

}