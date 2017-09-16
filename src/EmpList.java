import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "list")
	public class EmpList {

		public EmpList() {
		}

		public EmpList(List<Emp> el) {
			dude = el;
		}


		private List<Emp> dude;

		public List<Emp> getDude() {
			return dude;
		}

		@XmlElement(name = "dude")
		public void setDude(List<Emp> dude) {
			this.dude = dude;
		}

		@Override
		public String toString() {
			return "EmpList [dude=" + dude + "]";
		}

	}