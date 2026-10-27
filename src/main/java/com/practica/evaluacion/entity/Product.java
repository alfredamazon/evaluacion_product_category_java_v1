package com.practica.evaluacion.entity;
 // va aqui exactoooooo...

@entity
@Table(name="products")
public class Prodcut{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String name;
private BigDecimal price;
private String sku;
@ManyToOne
private Category Category;
 //ya no tengo getters ni setters ...
// duracion del examen 30 minutos ..
}



