
public class Hello {
	String name;
	public Hello(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHello() {
		String Hello = "Hello " + getName();
		return Hello;
	}
}
