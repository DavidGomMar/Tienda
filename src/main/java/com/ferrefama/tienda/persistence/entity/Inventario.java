package com.ferrefama.tienda.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "log_inventario")
public class Inventario {
    @Id //esto se pone dado que es llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_log_inventario") //esta nos ayuda a definir el verdadero nombre
    private Integer idloginventario;

    @Column(name = "cantidad_anterior_inventario")
    private Integer cantidadanteriorinventario;

    @Column(name = "cantidad_nuevo_inventario")
    private Integer cantidadnuevoinventario;

    @Column(name = "fecha_movimiento")
    private Date fechamovimiento;


    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false,updatable = false)
    private Producto producto;


    @ManyToOne
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;



    public Integer getIdloginventario() {
        return idloginventario;
    }

    public void setIdloginventario(Integer idloginventario) {
        this.idloginventario = idloginventario;
    }

    public Integer getCantidadanteriorinventario() {
        return cantidadanteriorinventario;
    }

    public void setCantidadanteriorinventario(Integer cantidadanteriorinventario) {
        this.cantidadanteriorinventario = cantidadanteriorinventario;
    }

    public Integer getCantidadnuevoinventario() {
        return cantidadnuevoinventario;
    }

    public void setCantidadnuevoinventario(Integer cantidadnuevoinventario) {
        this.cantidadnuevoinventario = cantidadnuevoinventario;
    }

    public Date getFechamovimiento() {
        return fechamovimiento;
    }

    public void setFechamovimiento(Date fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }
}
