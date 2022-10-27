public class Doctor {
	private String nombre;
	private String apellido;
	private int edad;
	private int rut;

	public String getNombre() {
		return this.nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public int getRut() {
		return this.rut;
	}

	public Doctor(String nombre, String apellido, int edad, int rut) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.rut=rut;
	}
}