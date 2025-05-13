package com.quod.service;

import com.quod.dto.AutenticacaoCadastralRequest;
import com.quod.model.Cliente;
import com.quod.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoCadastralService {

    @Autowired
    private ClienteRepository repository;

    private boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public String autenticar(AutenticacaoCadastralRequest request) {
        if (isEmpty(request.getCpf()) ||
                isEmpty(request.getNomeCompleto()) ||
                isEmpty(request.getTelefone()) ||
                isEmpty(request.getEmail()) ||
                isEmpty(request.getEndereco())) {
            return "Todos os campos são obrigatórios";
        }

        if (repository.findByCpf(request.getCpf()).isPresent()) {
            return "Cliente já cadastrado";
        }

        Cliente cliente = new Cliente();
        cliente.setCpf(request.getCpf());
        cliente.setNomeCompleto(request.getNomeCompleto());
        cliente.setTelefone(request.getTelefone());
        cliente.setEmail(request.getEmail());
        cliente.setEndereco(request.getEndereco());

        repository.save(cliente);

        return "Cliente cadastrado com sucesso";
    }
}

