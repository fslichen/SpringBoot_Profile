package evolution.bean;

public class AnyBean {
	public AnyBean(String name) {
		super();
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AnyBean [name=" + name + "]";
	}
}
