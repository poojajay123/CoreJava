package javaProgram;

class SensitiveInformation{
	private String un = "contact@grotechminds.com";
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un=un;
		}
}
public class EncapsulationProgram {

	public static void main(String[] args) {
		SensitiveInformation s1 = new SensitiveInformation();
		s1.setUn("pooja@grotechminds.com");
		System.out.println(s1.getUn());
	}

}


