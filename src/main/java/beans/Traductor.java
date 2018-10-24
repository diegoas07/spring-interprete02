package beans;

public class Traductor {
	
	private Interprete interprete;
	private String _nombre;
	
	public void hablar() {
		interprete.saludar();
		System.err.println(_nombre);
		interprete.despedirse();
	}
	
	public Interprete getInterprete() {
		return interprete;
	}
	public void setInterprete(Interprete interprete) {
		this.interprete = interprete;
	}
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	
	
	
}
