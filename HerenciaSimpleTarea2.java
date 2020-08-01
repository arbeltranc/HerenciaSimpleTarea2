/*
Diseñe e implemente un algoritmo, de tal manera que le permita crear una superclase y
dos subclase con respecto al paper ”DISEÑO EXPERIMENTAL DE VEHÍCULO AUTÓNOMO UTILIZANDO REDES
NEURONALES“
 */
package herenciasimpletarea2;

/**
 *
 * @author ALEX BELTRAN
 */

class Sensor_Infrarrojo{
    
    String tipo_sensor;
    int num_sensor;
    long precio_sensor;
    
    void MostrarCaracterisricasSensor(){
    System.out.println("El sensor es de tipo "+tipo_sensor+", en el vehiculo"
    + " se encuentran "+num_sensor+" sensores, y su precio es "+precio_sensor+" dólares");    
    }
}

class Sharp extends Sensor_Infrarrojo{
long tamanio_sensor;
String funcion_sensor;

void mostrarTamanioSensor(){
        System.out.println("El tamanio del sensor es "+tamanio_sensor+" centímetros");
    }
void mostrarFuncionSensor(){
        System.out.println("La función del sensor es "+funcion_sensor);
    }
    
}

class Line_Tracking extends Sensor_Infrarrojo{
String posicion_sensor;
String funcion_sensor;
    
void mostrarPosicionSensor(){
        System.out.println("El sensor está ubicado "+posicion_sensor);
    }
void mostrarFuncionSensor(){
        System.out.println("La función del sensor es "+funcion_sensor);
    }
    
}


public class HerenciaSimpleTarea2 {
    
    public static void main(String[] args) {
      
        System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE-L");
        System.out.println("\n\t\t\t   Ingeniería Automotriz");
        System.out.println("\t\t\t\tProgramación");
        System.out.println("\n\t\t\t Docente: Ing. Luis Guerra");
        System.out.println("\t\t\t Estudiante: Alex Beltran");
        
    Sharp sharp1=new Sharp();
    Line_Tracking line_tracking1=new Line_Tracking();
    
    sharp1.tipo_sensor="infrarrojo";
    sharp1.num_sensor=1;
    sharp1.precio_sensor=10;
    sharp1.tamanio_sensor=5;
    sharp1.funcion_sensor="medir distancia";
    
    line_tracking1.tipo_sensor="infrarrojo";
    line_tracking1.num_sensor=1;
    line_tracking1.precio_sensor=15;
    line_tracking1.posicion_sensor=" en el centro del vehículo";
    line_tracking1.funcion_sensor="seguir una linea";
    
    System.out.println("Información para Sharp: ");
    sharp1.MostrarCaracterisricasSensor();
    sharp1.mostrarTamanioSensor();
    sharp1.mostrarFuncionSensor();
    System.out.println();
    
    System.out.println("Información para Line Tracking: ");
    line_tracking1.MostrarCaracterisricasSensor(); 
    line_tracking1.mostrarPosicionSensor(); 
    line_tracking1.mostrarFuncionSensor(); 
    System.out.println();
    
    }
    
}
