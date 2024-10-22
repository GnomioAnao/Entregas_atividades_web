package com.fatec.loja;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.loja.ClienteModel;

@RestController
@CrossOrigin("*")
public class ClienteController {

    @GetMapping("/api/cliente/")
    public ResponseEntity<ClienteModel> detalhe(@RequestParam int codigo){
            ClienteModel obj = new ClienteModel();
            obj.setCodigo(codigo);
            obj.setNome("maria");
            obj.setDocumento("234234234");
            obj.setEmail("norton@norton.net.br");
            return ResponseEntity.ok(obj);
    }

    @PostMapping("/api/cliente")
    public ResponseEntity<String> inserir(@RequestBody ClienteModel obj){
        //TODO GRAVEI
        return ResponseEntity.ok("Registro inserido com sucesso");
    }
        
    @PutMapping("/api/cliente")
    public ResponseEntity<String> alterar(@RequestBody ClienteModel obj){
        //TODO alterei
        return ResponseEntity.ok("Registro alterado com sucesso");
    }

    @DeleteMapping("/api/cliente")
    public ResponseEntity<String> remover(@RequestBody ClienteModel obj){
        //TODO removido
        return ResponseEntity.ok("Registro removido com sucesso");
    }

}
