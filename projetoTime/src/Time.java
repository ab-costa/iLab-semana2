
public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int h, int m, int s) {
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}
	
	public void setTime(int h, int m) {
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(0);
	}
	
	public void setTime(int h) {
		this.setHora(h);
		this.setMinuto(0);
		this.setSegundo(0);
	}
	
	public String exibirHorasUniversal() {
		String horaUniversal;
		horaUniversal = this.formataZero(this.getHora()) + ":" + this.formataZero(this.getMinuto()) + ":" + this.formataZero(this.getSegundo());
		return horaUniversal;
	}
	
	public String exibirHoraPadrao() {
		String horaUniversal;
		if(this.getHora() < 12) {
			horaUniversal = this.formataZero(this.getHora()) + ":" + this.formataZero(this.getMinuto()) + ":" + this.formataZero(this.getMinuto()) + " AM";
		} else {
			horaUniversal = this.formataZero(this.getHora() - 12) + ":" + this.formataZero(this.getMinuto()) + ":" + this.formataZero(this.getSegundo()) + " PM";
		}
		return horaUniversal;
	}
	
	public String formataZero(int n) {
		if(n < 10) {
			return "0" + n;
		} else {
			return "" + n;
		}
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
}
