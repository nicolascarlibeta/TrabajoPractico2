package ar.edu.unlu.poo;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class TrabajoPractico {

    public void ejercicio1(){

        Club nuevoClub = new Club();
        Actividad natacion = new Actividad("Natacion",60,2);
        Actividad polo = new Actividad("Polo",50,1);
        Actividad jetski = new Actividad("Jet Ski",25,3);
        Actividad tenis = new Actividad("Tenis",40,1);
        Actividad waterpolo = new Actividad("Waterpolo",60,3);
        Socio juan = new Socio("Juan Ramirez","Jenner 545","43032524","juanramirez@hotmail.com", LocalDate.of(2002,11,6),"525-2432",1);
        Socio pietro = new Socio("Pietro Godoy","Jean Jaures","42433435","pietrojk@hotmail.com",LocalDate.of(1999,9,3),"525-2342",3);
        Socio julia = new Socio("Julia Marazzo","Santa Fe 1500","43325345","juli@hotmail.com",LocalDate.of(2000,7,3),"525-2662",2);
        nuevoClub.addActividad(natacion);
        nuevoClub.addActividad(polo);
        nuevoClub.addActividad(jetski);
        nuevoClub.addActividad(tenis);
        nuevoClub.addActividad(waterpolo);
        nuevoClub.addSocio(juan);
        nuevoClub.addSocio(pietro);
        nuevoClub.addSocio(julia);
        nuevoClub.getListadoActividades();
        nuevoClub.getListadoSocios();
        nuevoClub.getReporteMensual("09");

    }

    public void ejercicio2(){

        //Creamos el paquete de turismo
        Agencia agencia = new Agencia();
        Proveedor colectivo = new Proveedor("Transportes Ruta Bus",
                TipoProveedor.TRANSPORTE);
        Proveedor hotel = new Proveedor("Hoteles Mar Del Plata",
                TipoProveedor.HOSPEDAJE);
        Proveedor excursion = new Proveedor("Muelle",
                TipoProveedor.EXCURSION);
        Proveedor excursion2 = new Proveedor("Faro",
                TipoProveedor.EXCURSION);
        PaqueteTurismo paqueteTurismo = new PaqueteTurismo("Mar del Plata",colectivo,hotel,excursion,57000);
        paqueteTurismo.addExcursion(excursion2);
        agencia.addPaquete(paqueteTurismo);

        //Creamos pedidos
        PaqueteTurismo paqueteTurismo2 = new PaqueteTurismo("Chapadmalal",colectivo,hotel,excursion,6700);
        Cliente cliente = new Cliente("Juan Ramirez","Jenner 545","20-43032524-6","juanramirez@hotmail.com","525-3424");
        Cliente cliente2 = new Cliente("Alma Rodriguez","Jenner 545","20-43032524-6","jurodriguez@hotmail.com","525-3424");
        Pedido pedido = new Pedido(cliente,paqueteTurismo,2);
        Pedido pedido2 = new Pedido(cliente,paqueteTurismo2,1);
        Pedido pedido3 = new Pedido(cliente2,paqueteTurismo2,1);

        //Añadimos pedidos
        agencia.addPedido(pedido);
        agencia.addPedido(pedido2);
        agencia.addPedido(pedido3);
        agencia.getListadoVentasMensual("09");


    }

    public void ejercicio3(){

        Academia academia = new Academia();
        Alumno juan = new Alumno("Juan Ramirez","Jenner 545","20-43032524-6","juanramirez@hotmail.com","525-3424");
        Alumno jose = new Alumno("Jose Sanches","Jenner 545","20-43032524-6","jsnches@hotmail.com","525-3424");
        Alumno marcos = new Alumno("Marcos Ramos","Jenner 545","20-43032524-6","marcramos@hotmail.com","525-3424");
        Alumno julia = new Alumno("Julia Marazzo","Jenner 545","20-43032524-6","jmarazzo@hotmail.com","525-3424");
        Profesor martinez = new Profesor("Marili Martinez","Jenner 545","20-43032524-6","profemarimartinez@hotmail.com","525-3424");
        Diagramacion bachata = new Diagramacion("Bachata para adultos","Martes","06:00",1,2,martinez);
        Diagramacion tango = new Diagramacion("Tango para pre-adolescentes","Martes","06:00",0,0,martinez);
        academia.addDiagramacion(bachata);
        academia.addDiagramacion(tango);
        bachata.addAlumno(juan);
        bachata.addAlumno(jose);
        bachata.addAlumno(marcos);
        bachata.addAlumno(julia);
        tango.addAlumno(julia);
        tango.addAlumno(marcos);
        bachata.darPresente(juan);
        bachata.darPresente(jose);
        bachata.darPresente(jose);
        bachata.darPresente(marcos);
        bachata.darPresente(julia);
        bachata.darPresente(julia);
        float paga = academia.getListadoAlumnosXAsistencia(bachata);
        System.out.println("La paga del profesor será de $" + paga);
        academia.getReporteDisciplinaXMayorIngreso();

    }
    
    public void ejercicio4() throws ParseException{

    	ClienteBanco juan = new ClienteBanco("Juan Ramirez","Jenner 545","20-43032524-6","juanramirez@hotmail.com","525-3424");
    	CuentaNormal cuentaNormal = new CuentaNormal(juan);
    	CuentaCredito cuentaCredito = new CuentaCredito(juan);
    	cuentaNormal.cargar(1000);
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	System.out.println("Limite: " + cuentaNormal.getLimite());
    	cuentaNormal.comprar(1000);
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	cuentaNormal.comprar(1000);
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	System.out.println("Limite: " + cuentaNormal.getLimite());
    	cuentaNormal.cargar(2000);
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	System.out.println("Limite: " + cuentaNormal.getLimite());
    	Inversion inversion = cuentaNormal.invertir("30/07/2023", cuentaNormal, 2000);
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	System.out.println("Limite: " + cuentaNormal.getLimite());
    	inversion.obtenerInteres();
    	System.out.println("Saldo: " + cuentaNormal.getSaldo());
    	System.out.println("Limite: " + cuentaNormal.getLimite());
    	
    }

    public void ejercicio6() throws ParseException {

        Estacion ypf = new Estacion();
        Combustible axion = new Combustible("Axion Energy",1,560);
        Expendedor exp1 = new Expendedor(axion);
        Expendedor exp2 = new Expendedor(axion);
        Expendedor exp3 = new Expendedor(axion);
        ClienteEstacion juan = new ClienteEstacion("Juan Ramirez","Jenner 545","20-43032524-6","525-3424");
        ClienteEstacion julia = new ClienteEstacion("Julia Marazzo","Jenner 545","20-43032524-6","525-3424");
        Empleado martina = new Empleado("Martina Perez","06/11/1986","Jenner 545","20-43032524-6","juanramirez@hotmail.com","525-3424");
        Venta v1 = new Venta("ABC 102",juan,martina,exp1,120);
        Venta v2 = new Venta("JFK 325",julia,martina,exp1,100);
        Venta v3 = new Venta("ODE 432",julia,martina,exp2,250);
        Venta v4 = new Venta("YEW 125",juan,martina,exp3,50);
        ypf.addVenta(v1);
        ypf.addVenta(v2);
        ypf.addVenta(v3);
        ypf.addVenta(v4);
        List<ClienteEstacion> top10 = ypf.getListaTop10Clientes();
        for(ClienteEstacion ce: top10){
            System.out.println(ce);
        }

    }
    
    public void ejercicio7() throws ParseException {

        Estacion ypf = new Estacion();
        Combustible axion = new Combustible("Axion Energy",1,560);
        Expendedor exp1 = new Expendedor(axion);
        Expendedor exp2 = new Expendedor(axion);
        Expendedor exp3 = new Expendedor(axion);
        ClienteEstacion juan = new ClienteEstacion("Juan Ramirez","Jenner 545","20-43032524-6","525-3424");
        ClienteEstacion julia = new ClienteEstacion("Julia Marazzo","Jenner 545","20-43032524-6","525-3424");
        Empleado martina = new Empleado("Martina Perez","06/11/1986","Jenner 545","20-43032524-6","juanramirez@hotmail.com","525-3424");
        Venta v1 = new Venta("ABC 102",juan,martina,exp1,120);
        Venta v2 = new Venta("JFK 325",julia,martina,exp1,100);
        System.out.print(v1);
        System.out.print(v2);
        List<ClienteEstacion> top10 = ypf.getListaTop10Clientes();
        //List<Empleado> empleados = ypf.getEmpleadosXMontoTotal();
        //v1.setDescuento(top10, empleados, true);
        ypf.addVenta(v1);
        ypf.addVenta(v2);
        System.out.print(v1);
        System.out.print(v2);
       
    }

    public void ejercicio8(){

        Libro frankestein = new Libro("Frankestein","Mary Shelley",416,10,"978-987-0000");
        Libro dracula = new Libro("Dracula","Bram Stoker",512,12,"978-994-0012");
        Biblioteca b = new Biblioteca();
        SocioBiblioteca juan = new SocioBiblioteca("Juan Ramirez","Jenner 545","43032524","juanramirez@hotmail.com", LocalDate.of(2002,11,6),"525-2432");
        SocioBiblioteca julia = new SocioBiblioteca("Julia Marazzo","Santa Fe 1500","43032524","juli@hotmail.com",LocalDate.of(2002,11,6),"525-2432");
        b.cargar(frankestein);
        b.cargar(dracula);
        int id = dracula.prestar(juan);
        dracula.prestar(julia);
        frankestein.prestar(julia);
        b.totalPrestamos();
        dracula.mostrarEjemplaresPrestados();
        dracula.devolver(id);
        dracula.mostrarEjemplaresPrestados();
        b.totalPrestamos();

    }

    public void ejercicio9(){

    	FiguraGeometrica fg = new FiguraGeometrica();
    	fg = new Circulo(5);
    	fg.getArea();
    	fg = new Rectangulo(4,6);
    	fg.getArea();
    	fg = new Cuadrado(5);
    	fg.getArea();
    	fg = new Triangulo(4,3);
    	fg.getArea();
    	Fig3D esf = new Esfera(3);
    	fg = esf;
    	fg.getArea();
    	esf.getVolumen();	
    	Fig3D p = new Paralelepipedo(3, 6, 7);
    	fg = p;
    	fg.getArea();
    	p.getVolumen();
    	Fig3D c = new Cubo(4);
    	fg = c;
    	fg.getArea();
    	c.getVolumen();
    	Fig3D t = new Tetraedro(7);
    	fg = t;
    	fg.getArea();
    	t.getVolumen();
    	
    }
    
    public void ejercicio10() throws ParseException{

    	FullTime juan = new FullTime("Juan Ramirez","06/10/1979","Jenner 545","20-43032524-8","juanramirez@hotmail.com","525-2432",200000);
        PorComision marcelo = new PorComision("Marcelo Robles","15/03/1979","Jenner 545","20-43032524-8","mrobles@hotmail.com","525-2432",15);
        PorHora julia = new PorHora("Julia Marazzo","02/04/1979","Jenner 545","20-43032524-8","jmarazzo@hotmail.com","525-2432",500000,12);
        Pasante damian = new Pasante("Damian Otero","10/03/1979","Jenner 545","20-43032524-8","damianotero@hotmail.com","525-2432");
        PCySalario romina = new PCySalario("Romina Lopez","14/02/1979","Jenner 545","20-43032524-8","rominalopez@hotmail.com","525-2432",15,200000);
        System.out.println(juan.calcularSueldo());
        System.out.println(marcelo.calcularSueldo());
        System.out.println(julia.calcularSueldo());
        System.out.println(damian.calcularSueldo());
        System.out.println(romina.calcularSueldo());

    }

    public void ejercicio11(){

        Consecionaria cons = new Consecionaria();


    }

    public void ejercicio13(){

        System.out.println("1. Esto ocurre porque la clase Ticket solo se relaciona con la clase Pasajero, por lo tanto va a ser obligatorio que solo un pasajero sea capaz de recibir un ticket de vuelo. Ademas, no existe polimorfismo entre el Pasajero y el Tripulante porque ambas clases, si bien heredan de la clase Persona, estas no son compatibles.");
        System.out.println("2. Este problema se debe a un mal diseño de como se debe implementar el programa.");
        //1.
        Tripulante tripulante = new Tripulante("Martina Sanchez","555-6252","Tomas de Alvear 542","Co-Piloto");
        Pasajero pasajero = new Pasajero("Sebastian Martinez","543-3268","Rawson 1435");
        Vuelo nuevoVuelo = new Vuelo();
        nuevoVuelo.addPersona(pasajero);
        nuevoVuelo.addPersona(tripulante);
        Ticket nuevoTicket = new Ticket(nuevoVuelo,pasajero);
        Pasajero pasajTripulante = new Pasajero("Martina Sanchez","555-6252","Tomas de Alvear 542");
        Ticket nuevoTicketTripulante = new Ticket(nuevoVuelo,pasajTripulante);
        //3.
        TicketMejorado nuevoTicketMejorado = new TicketMejorado(nuevoVuelo,tripulante);

    }

}
