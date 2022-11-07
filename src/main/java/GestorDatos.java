import java.io.*;

public class GestorDatos {
    public static Hospital almacenarDoctores(Hospital hospital) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File ("doctores.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null ) {
                String[] datos = linea.split(",");
                hospital.addDoctor(datos[0], datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
            }


        }
        catch(Exception e){
            e.printStackTrace();

        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }


        }
        return hospital;
    }
    public static Hospital leerPacientes(Hospital hospital) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File ("pacientes.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null ) {
                String[] datos = linea.split(",");
                hospital.addPaciente(datos[0], datos[1],Integer.parseInt(datos[2]),Integer.parseInt(datos[3]));
            }


        }
        catch(Exception e){
            e.printStackTrace();

        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }


        }
        return hospital;
    }


}
