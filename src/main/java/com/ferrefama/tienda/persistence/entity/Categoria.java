package com.ferrefama.tienda.persistence.entity;

import com.ferrefama.tienda.persistence.crud.CategoriaCrudRepository;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cat_categorias")

public class Categoria {

    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") //esta nos ayuda a definir el verdadero nombre
    private Integer idcategoria;

    @Column(name = "nombre_categoria")
    private String nombrecategoria;

    @ManyToOne
    @JoinColumn(name = "id_familia", insertable = false, updatable = false) //atraves de esta relacion no podremos borrar editar o agregar categorias
    private Familia familia;

    @OneToMany(mappedBy = "categoria")
    private List<Subcategoria> subcategorias;







    
    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }





}
