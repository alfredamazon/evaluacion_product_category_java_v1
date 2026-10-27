package com.practica.evaluacion.controller;



@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProdcutController{

    private final ProductService service;
    public ProductController(ProdcutService service){
        this.service = service;
    }

    @PostMapping
    public Prodcut crear(@RequestBody Prodcut Prodcut){
        return service.save(product);
    }
    @GetMapping
    public List<Prodcut> listar(){
        return service.findAll();
    }
}