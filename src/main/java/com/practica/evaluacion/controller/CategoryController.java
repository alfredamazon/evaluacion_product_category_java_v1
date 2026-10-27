package com.practica.evaluacion.controller;



@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController{

    private final CategoryService service;
    public CategoryController(CategoryService service){
        this.service = service;
    }

    @PostMapping
    public Category crear(@RequestBody Category category){
        return service.save(category);
    }
    @GetMapping
    public List<Category> listar(){
        return service.findAll();
    }
}