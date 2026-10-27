package com.practica.evaluacion.service;



@service
@RequiredArgsConstructor
public class CategoryService{
    private final CategoryRepository repositorty;

    public Category save(Category category){
        return repositorty.save(category);
    }
    public List<Category> findAll(){
        return repositorty.findAll();
    }
}