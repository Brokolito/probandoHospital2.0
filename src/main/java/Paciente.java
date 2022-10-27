public class Paciente {
	private int edad;
	private String nombre;
	private String apellido;
	private int rut;

	public String getApellido() {
		return this.apellido;
	}

	public int getEdad() {
		return this.edad;
	}

	public int getRut() {
		return rut;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Paciente(int edad, String nombre, String apellido, int rut) {
		this.edad=edad;
		this.nombre=nombre;
		this.apellido=apellido;
		this.rut=rut;
	}
}