package android.server.project.main;

public class Studenti {

	private String ime;
	private String prezime;
	private int godine;
	private double dug;
	
	public Studenti() {}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}

	public double getDug() {
		return dug;
	}

	public void setDug(double dug) {
		this.dug = dug;
	}

	public Studenti(String ime, String prezime, int godine, double dug) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
		this.dug = dug;
	}
	
	
}
