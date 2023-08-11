package br.com.pedro.controller;

import br.com.pedro.model.Pessoa;
import br.com.pedro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public void save(@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }
    @GetMapping("/{id}")
    public Pessoa open(@PathVariable("id") long id){

        Pessoa pessoa = pessoaRepository.findById(id).get();


        return pessoa;
    }

}
