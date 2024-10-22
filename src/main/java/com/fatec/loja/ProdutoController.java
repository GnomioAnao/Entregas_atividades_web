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
public class ProdutoController {
    @PostMapping("/api/produto/")
    public String gravar(@RequestBody Produto obj){
        return "o produto" + obj.getNome() + "Foi guardado com sucesso";
    }

    @PutMapping("/api/produto")
    public String alterar (@RequestBody Produto obj){
        return "o produto" + obj.getNome() + "foi alterado com sucesso";
    }

    @GetMapping("/api/produto/{codigo}")
    public Produto pegar (@PathVariable int codigo){
        Produto obj = new Produto(1,  "Martelo","martelo unha - cabo borracha", 30.00, 10, "ferramenta manuais");
        return obj;
    } 

    @DeleteMapping("/api/produto/{codigo}")
        public String apagar(@RequestBody Produto obj){
            return "o produto" + obj.getNome() + "foi apagado";
        }
        
    @GetMapping("/api/produto")
    public List<Produto> listar(){
        return new ArrayList<Produto>();
    }

}
