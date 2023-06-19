package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Automovel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "anoFabricacao", nullable = false)
	private int anoFabricacao;

	@Column(name = "anoModelo", nullable = false)
	private int anoModelo;

	@Column(name = "observacoes", length = 255)
	private String observacoes;

	@Column(name = "preco", nullable = false)
	private float preco;

	@Column(name = "kilometragem")
	private int kilometragem;

	@ManyToOne
	@JoinColumn(name = "modelo_id", nullable = false)
	private Modelo modelo;

	public Automovel(Integer id, int anoFabricacao, int anoModelo, float preco, Modelo modelo) {
		super();
		this.id = id;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.preco = preco;
		this.modelo = modelo;
	}

	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Automovel [id=" + id + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo
				+ ", observacoes=" + observacoes + ", preco=" + preco + ", kilometragem=" + kilometragem + ", modelo="
				+ modelo + "]";
	}
	
}
