package course.capitulo14.entities;

public class Product_Exemplo_TreeSet_Compara implements Comparable<Product_Exemplo_TreeSet_Compara>{
	private String name;
	private Double price;
	
	public Product_Exemplo_TreeSet_Compara(String name, Double price) {
		this.name = name;
		this.price = price;
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
	
	@Override
	public String toString() {
		return "Product [name= " + name + ", price= " + price + "]";
	}

	@Override
	public int compareTo(Product_Exemplo_TreeSet_Compara other) {
		// TODO Auto-generated method stub
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}

	//HashCode e Equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product_Exemplo_TreeSet_Compara other = (Product_Exemplo_TreeSet_Compara) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
	
	

}
