package com.practica.evaluacion.entity;
//imports lombook
 // va aqui exactoooooo...
// me falto los imports de lombook uso visual code lo cual no me ayuda mucho en las importaciones 
// no recuerdo si intellig o algun otro te ayuda a las importaciones de lombook por ejemplo

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
private Category Category;// obtenemos el objeto de la entidad categoria
 //ya no tengo getters ni setters ...
// duracion del examen 30 minutos ..
}



