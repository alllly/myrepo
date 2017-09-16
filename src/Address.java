import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

public class Address {

		public Address() {
		}

		public Address(String city, String street) {
			super();
			this.city = city;
			this.street = street;
		}

		private String city;
		private String street;

		public String getCity() {
			return city;
		}

		@XmlElement(name = "city")
		public void setCity(String city) {
			this.city = city;
		}

		public String getStreet() {
			return street;
		}

		@XmlElement(name = "street")
		public void setStreet(String street) {
			this.street = street;
		}

		@Override
		public String toString() {
			return "Address [city=" + city + ", street=" + street + "]";
		}

	}