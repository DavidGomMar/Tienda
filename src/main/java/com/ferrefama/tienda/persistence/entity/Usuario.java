package com.ferrefama.tienda.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_usuario")

public class Usuario {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario") //esta nos ayuda a definir el verdadero nombre
    private Integer idusuario;

    @Column(name = "correo_usuario")
    private String correousuario;

    @Column(name = "nombre_usuario")
    private String nombreusuario;

    @Column(name = "contrasenia_usuario")
    private String contraseniausuario;


    @OneToMany(mappedBy = "usuario")
    private List<Pedido>pedidos;


    @OneToMany(mappedBy = "usuario")
    private List<Inventario>inventarios;



    @ManyToOne
    @JoinColumn(name = "id_rol", updatable = false, insertable = false)
    private Rol rol;


    @ManyToOne
    @JoinColumn(name = "id_persona", updatable = false, insertable = false)
    private Persona persona;




    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseniausuario() {
        return contraseniausuario;
    }

    public void setContraseniausuario(String contraseniausuario) {
        this.contraseniausuario = contraseniausuario;
    }
}
