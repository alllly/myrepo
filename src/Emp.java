import javax.xml.bind.annotation.XmlElement;


public class Emp {

	public Emp() {
	}

	public Emp(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	private String name;

	private Address address;

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	@XmlElement(name = "address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

}
