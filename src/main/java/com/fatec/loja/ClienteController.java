package com.fatec.loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    ClienteRepository bd;

    @PostMapping("/api/cliente")
    public String gravar(@RequestBody ClienteModel obj){
        bd.save(obj);
        return "O cliente "+ obj.getNome() + " foi gravado !!";        
    }

    @PutMapping("/api/cliente")
    public String alterar(@RequestBody ClienteModel obj){
        bd.save(obj);
        return "O cliente "+ obj.getNome() + " foi alterado !!";        
    }

    @GetMapping("/api/cliente/{codigo}")
    public ClienteModel carregar(@PathVariable int codigo){
       Optional<ClienteModel> obj = bd.findById(codigo);
       if(obj.isPresent()){
        return obj.get();    
       } else {
        return null;
       }
    }    

    @DeleteMapping("/api/cliente/{codigo}")
    public String remover(@PathVariable int codigo){
        bd.deleteById(codigo);
        return "cliente "+ codigo +" removido com sucesso!";
    }

    @GetMapping("/api/clientes")
    public List<ClienteModel> todos(){
        return bd.findAll();
    }
}
