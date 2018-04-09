package /home/dam1b/IdeaProjects/practica12/practica12.imlcom.company;

import com.company.model.Habitacion;
import com.company.manager.ManagerReserva;
import com.company.view.PantallaListarReservas;
import com.company.view.PantallaReserva;

public class Main {

    public static void main(String[] args) {

        Habitacion habitacionDoble = new Habitacion();

        Habitacion habitacionExecutive = new Habitacion();

        Habitacion suite = new Habitacion();

        //HABITACION-INDIVIDUAL//

        Habitacion habitacionIndividual_Blue = new Habitacion();
        habitacionIndividual_Blue.asignarNumerodeCamasIndividuales(3);
        habitacionIndividual_Blue.vistas=true;
        habitacionIndividual_Blue.bañoPublico=true;

        Habitacion habitacionIndividual_RedLava = new Habitacion();
        habitacionIndividual_RedLava.asignarNumerodeCamasIndividuales(2);
        habitacionIndividual_RedLava.vistas=true;
        habitacionIndividual_RedLava.bañoPrivado=true;
        habitacionIndividual_RedLava.wifi=true;

        ManagerReserva managerReserva = new ManagerReserva();


        PantallaReserva pantallaReserva = new PantallaReserva();
        pantallaReserva.mostrar(managerReserva);
        //pantallaReserva.iniciar(managerReserva);

        PantallaListarReservas pantallaListarReservas = new PantallaListarReservas();
        pantallaListarReservas.mostrar(managerReserva);

    }
}
