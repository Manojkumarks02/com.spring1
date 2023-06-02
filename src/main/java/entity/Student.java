package entity;

public class Student {
	private long id;
	private String name;
	
	public void test() {
		System.out.println(id);
		System.out.println(name);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
