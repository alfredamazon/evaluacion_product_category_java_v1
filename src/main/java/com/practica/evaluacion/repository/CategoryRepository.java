package com.practica.evaluacion.repositorty;


import com.practica.evaluacion.entity.Category;
import com.springframework.data.jpa.repositorty.JpaRepository;

public interface ProdcutRepository extends JpaRepository<Category , Long>{}