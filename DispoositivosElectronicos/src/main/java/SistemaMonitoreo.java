import java.util.ArrayList;

public class SistemaMonitoreo {
        public static void main(String[] args) {
            ArrayList<Sensor> listaSensores = new ArrayList<>();
            SensorTemperatura sensor1 = new SensorTemperatura("DHN11","Pedro",20,true,"Celcius",true);
            SensorTemperatura sensor2=new SensorTemperatura("DHN11","luis",50,true,"Celcius",true);

            SensorPresion sensor3=new SensorPresion("LOH01","Paco",50,true,"Pascal",true);
            SensorPresion sensor4=new SensorPresion("SDR09","Lopez",100,true,"Kilopascal",true);

            SensorAceleracion sensor5=new SensorAceleracion("PQR45","Pancho",45,true,"m/s^2",true);
            SensorAceleracion sensor6=new SensorAceleracion("P09IU","Gabriel",55,true,"m/s^2",true);

            listaSensores.add(sensor1);
            listaSensores.add(sensor2);
            listaSensores.add(sensor3);
            listaSensores.add(sensor4);
            listaSensores.add(sensor5);
            listaSensores.add(sensor6);

           for(Sensor  s: listaSensores ){
               s.encender();
               s.calibrar();
               System.out.println(s.leerValor());
           }




        }
    }

