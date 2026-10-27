package com.practica.evaluacion.service;



@service
@RequiredArgsConstructor
public class ProdcutService{
    private final ProdcutRepository repositorty;

    public Prodcut save(Prodcut product){
        return repositorty.save(product);
    }
    public List<Prodcut> findAll(){
        return repositorty.findAll();
    }
}