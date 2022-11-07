import java.util.ArrayList;
public class Hospital {
	private ArrayList<Paciente> pacientes;
	private ArrayList<Doctor> doctores;

	public Hospital() {
		this.doctores=new ArrayList<Doctor>();
		this.pacientes=new ArrayList<Paciente>();
	}

	public Paciente addPaciente(String nombre, String apellido, int edad,int rut) {
		Paciente paciente=new Paciente(nombre, apellido,edad, rut);
		pacientes.add(paciente);
		return paciente;
	}

	public Doctor addDoctor(String nombre, String apellido, int edad, int rut) {
		Doctor doctor=new Doctor(nombre,apellido,edad,rut);
		doctores.add(doctor);
		return  doctor;
	}

	public void removeDoctor(String nombre, String apellido, int edad, int rut) {
		for(Doctor doctor:this.doctores) {
			if (doctor.getNombre().equals(nombre) && doctor.getApellido().equals(apellido) && doctor.getEdad() == edad && doctor.getRut() == rut) {
				doctores.remove(doctor);
			}
		}
	}

	public void removePaciente(String nombre, String apellido, int edad,int rut) {
		for(Paciente paciente:this.pacientes) {
			if (paciente.getNombre().equals(nombre) && paciente.getApellido().equals(apellido) && paciente.getEdad() == edad && paciente.getRut() == rut) {
				pacientes.remove(paciente);
			}
		}
	}
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public ArrayList<Doctor> getDoctores() {
		return doctores;
	}
}