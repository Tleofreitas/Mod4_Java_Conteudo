package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	/* Ordenar por Sal�rio
	@Override
	public int compareTo(Employee other) {
		return salary.compareTo(other.getSalary());
		(usar -salary.compareTo(other.getSalary()) para ordem DECRESCENTE)
	}
	*/
}
