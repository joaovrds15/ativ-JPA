package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Modelo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;

    @Column(name = "potencia")
    private int potencia;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;
    
    public Modelo(Integer id, String descricao, Marca marca) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
	}

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

	@Override
	public String toString() {
		return "Modelo [id=" + id + ", descricao=" + descricao + ", potencia=" + potencia + ", marca=" + marca + "]";
	}
    
}
