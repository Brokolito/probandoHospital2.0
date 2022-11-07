import java.io.IOException;

public class Launcher {

	public static void main(String[] args) throws IOException {
		Hospital hospital = new Hospital();
		GestorDatos gestorDatos = new GestorDatos();
		GestorPDF gestorPDF = new GestorPDF();
		hospital = gestorDatos.leerPacientes(hospital);
		gestorPDF.generarBoleta(hospital.getPacientes().get(0));

	}
}