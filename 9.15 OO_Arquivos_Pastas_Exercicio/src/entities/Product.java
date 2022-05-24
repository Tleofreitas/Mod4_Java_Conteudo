package entities;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Double price;
	private Integer quantidade;

	public Product() {
	}

	public Product(String name, Double price, Integer quantidade) {
		super();
		this.name = name;
		this.price = price;
		this.quantidade = quantidade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double total() {
		return price * quantidade;
	}
}
