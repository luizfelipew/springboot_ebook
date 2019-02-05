package com.springboot.greendogdelivery.springbootgreendogdelivery.repository;

import com.springboot.greendogdelivery.springbootgreendogdelivery.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

public class RepositoryTest {
    private static final long ID_CLIENTE_FERNANDO = 11l;
    private static final long ID_CLIENTE_ZE_PEQUENO = 22l;
    private static final long ID_ITEM1 = 100l;
    private static final long ID_ITEM2 = 101l;
    private static final long ID_ITEM3 = 102l;
    private static final long ID_PEDIDO1 = 1000l;
    private static final long ID_PEDIDO2 = 1001l;
    private static final long ID_PEDIDO3 = 1002l;

    @Autowired
    private ClienteRepository clienteRepository;

    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println(">>> Iniciando carga de dados...");
        Cliente fernando = new Cliente(ID_CLIENTE_FERNANDO,"Fernando Boaglio","Sampa");
        Cliente zePequeno = new Cliente(ID_CLIENTE_ZE_PEQUENO, "Zé Pequeno","Cidade de Deus");
    }
}
