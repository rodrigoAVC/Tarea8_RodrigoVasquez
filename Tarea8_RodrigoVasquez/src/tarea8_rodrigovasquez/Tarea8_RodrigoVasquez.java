package tarea8_rodrigovasquez;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Tarea8_RodrigoVasquez {

    public static void main(String[] args) throws ParseException {
        Scanner scMain = new Scanner(System.in);
        ArrayList<Clase> clases = new ArrayList();
        ArrayList<Ruta> rutas = new ArrayList();
        ArrayList<Alumno> alumnos = new ArrayList();
        ArrayList<Transportista> transportistas = new ArrayList();
        ArrayList<Transporte> transportes = new ArrayList();
        int opcion;
        do {
            System.out.println("-------------------------------");
            System.out.println("    < B I E N V E N I D O >");
            System.out.println("-------------------------------");
            System.out.print("""
                               [0] Salir 
                               [1] Crear Clase
                               [2] Crear Ruta
                               [3] Crear Alumno
                               [4] Agregar Clase a Alumno
                               [5] Crear Transportista
                               [6] Crear Transporte
                               [7] Simulaciión
                               [8] Listar Clases
                               [9] Listar Rutas
                               [10] Listar Alumnos 
                               [11] Listar Transportistas
                               [12] Listar Transportes
                               """);
            System.out.println("-------------------------------");
            System.out.print("Ingrese que acción desea realizar: ");
            opcion = scMain.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    crearClase(clases);
                    break;
                case 2:
                    break;
                case 3:
                    crearAlumno(alumnos, clases);
                    break;
                case 4:
                    agregarClase(alumnos, clases);
                    break;
                case 5:
                    crearTransportista(transportistas);
                    break;
                case 6:
                    crearTransporte(transportes, transportistas);
                    break;
                case 7:
                    break;
                case 8:
                    if (clases.isEmpty()) {
                        System.out.println("No hay clases que listar");
                    } else {
                        listar(clases, rutas, alumnos, transportistas, transportes, 8);
                    }
                    break;
                case 9:
                    if (rutas.isEmpty()) {
                        System.out.println("No hay rutas que listar");
                    } else {
                        listar(clases, rutas, alumnos, transportistas, transportes, 9);
                    }
                    break;
                case 10:
                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos que listar");
                    } else {
                        listar(clases, rutas, alumnos, transportistas, transportes, 10);
                    }
                    break;
                case 11:
                    if (transportistas.isEmpty()) {
                        System.out.println("No hay transportistas que listar");
                    } else {
                        listar(clases, rutas, alumnos, transportistas, transportes, 11);
                    }
                    break;
                case 12:
                    if (transportes.isEmpty()) {
                        System.out.println("No hay transportes que listar");
                    } else {
                        listar(clases, rutas, alumnos, transportistas, transportes, 12);
                    }
                    break;
            }
        } while (opcion != 0);
    }

    public static ArrayList<Clase> crearClase(ArrayList<Clase> clases) {
        Scanner scClase = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("                < C L A S E s >");
        System.out.println("-----------------------------------------------");
        System.out.println("Ingrese el nombre de la clase: ");
        String nombre = scClase.nextLine();
        clases.add(new Clase(nombre, clases.size() + 1));
        System.out.println("La clase ha sido creada");
        System.out.println("-----------------------------------------------");
        return clases;
    }

    public static ArrayList<Alumno> crearAlumno(ArrayList<Alumno> alumnos, ArrayList<Clase> clases) throws ParseException {
        Scanner scAlumno = new Scanner(System.in);
        boolean newId = true;
        System.out.println("-----------------------------------------------");
        System.out.println("               < A L U M N O S >");
        System.out.println("-----------------------------------------------");
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scAlumno.nextLine();
        System.out.print("Ingrese su fecha de nacimiento [dd/MM/yyyy]: ");
        String fechaNac = scAlumno.next();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = format.parse(fechaNac);
        int id = (int) (100000 * Math.random());
        do {
            newId = true;
            for (Alumno alumno : alumnos) {
                if (alumno.getId() == id) {
                    newId = false;
                }
            }
            if (newId == false) {
                id = (int) (100000 * Math.random());
            }
        } while (newId == false);
        int studentId = (int) (100000 * Math.random());
        do {
            newId = true;
            for (Alumno alumno : alumnos) {
                if (alumno.getStudentId() == studentId) {
                    newId = false;
                }
            }
            if (newId == false) {
                studentId = (int) (100000 * Math.random());
            }
        } while (newId == false);
        alumnos.add(new Alumno(id, nombre, studentId, fechaNacimiento));
        return alumnos;
    }

    public static void agregarClase(ArrayList<Alumno> alumnos, ArrayList<Clase> clases) {
        Scanner scClase = new Scanner(System.in);
        int numLista = 0;
        char caracter = 's';
        int clase;
        int numAlumno;
        System.out.println("-----------------------------------------------");
        for (Alumno alumno : alumnos) {
            System.out.println("#" + numLista + ": " + alumno);
            numLista++;
        }
        do {
            System.out.print("Eliga a que alumno desea agregarle clases: ");
            numAlumno = scClase.nextInt();
            if (numAlumno < 0 || numAlumno > alumnos.size()) {
                System.out.println("Opcion Invalida");
                System.out.println("-----------------------------------------------");
            } else {
                do {
                    System.out.println("-----------------------------------------------");
                    for (Clase clase1 : clases) {
                        System.out.println("#" + numLista + ": " + clase1);
                        numLista++;
                    }
                    System.out.println("[" + numLista + "] Salir");
                    System.out.print("Ingrese que clases cursa el alumno: ");
                    clase = scClase.nextInt();
                    if (clase < 0 || clase > clases.size()) {
                        System.out.println("Opcion Invalida");
                        numLista = 0;
                        System.out.println("-----------------------------------------------");
                    } else {
                        numLista = 0;
                        boolean claseRepe = false;
                        for (Clase clase1 : clases) {
                            if (clase1 == alumnos.get(numAlumno).getClases().get(numLista)) {
                                claseRepe = true;
                            }
                            numLista++;
                        }
                        if (claseRepe) {
                            System.out.println("El alumno ya cursa esta clase");
                            numLista = 0;
                            System.out.println("-----------------------------------------------");
                        } else {
                            alumnos.get(numAlumno).getClases().add(clases.get(clase));
                            System.out.print("¿Desea añadir otra clase? [S/N] ");
                            caracter = scClase.next().charAt(0);
                            numLista = 0;
                            System.out.println("-----------------------------------------------");
                        }
                    }
                } while (caracter == 's' || caracter == 'S' || caracter == 'y' || caracter == 'Y' || clase == numLista);
            }
        } while (numAlumno < 0 || numAlumno > alumnos.size());
    }

    public static ArrayList<Transportista> crearTransportista(ArrayList<Transportista> transportistas) throws ParseException {
        Scanner scTrans = new Scanner(System.in);
        boolean newId = true;
        System.out.println("-----------------------------------------------");
        System.out.println("         < T R A N S P O R T I S T A >");
        System.out.println("-----------------------------------------------");
        System.out.print("Ingrese el nombre del transportista: ");
        String nombre = scTrans.nextLine();
        System.out.print("Ingrese su fecha de nacimiento [dd/MM/yyyy]: ");
        String fechaNac = scTrans.next();
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = format.parse(fechaNac);
        System.out.print("Ingrese su apodo: ");
        String apodo = scTrans.nextLine();
        int exp;
        do {
            System.out.print("Ingrese cuantos años de experiencia tiene: ");
            exp = scTrans.nextInt();
            if (exp < 0) {
                System.out.println("Numero Invalido");
                System.out.println("-----------------------------------------------");
            } else {
                int id = (int) (100000 * Math.random());
                do {
                    newId = true;
                    for (Transportista transportista : transportistas) {
                        if (transportista.getId() == id) {
                            newId = false;
                        }
                    }
                    if (newId == false) {
                        id = (int) (100000 * Math.random());
                    }
                } while (newId == false);
                transportistas.add(new Transportista(exp, apodo, nombre, id, fechaNacimiento));
                System.out.println("-----------------------------------------------");
            }
        } while (exp < 0);
        return transportistas;
    }

    public static ArrayList<Transporte> crearTransporte(ArrayList<Transporte> transportes, ArrayList<Transportista> transportistas) {
        Scanner scTrans = new Scanner(System.in);
        boolean newPlaca = true;
        boolean transportista = true;
        int tipo;
        System.out.println("-----------------------------------------------");
        System.out.println("            < T R A N S P O R T E >");
        System.out.println("-----------------------------------------------");
        String placa = "";
        do {
            newPlaca = true;
            System.out.print("Ingrese la placa del vehículo: ");
            placa = scTrans.next();
            for (Transporte transporte : transportes) {
                if (transporte.getPlaca().equals(placa)) {
                    newPlaca = false;
                }
            }
            if (newPlaca == false) {
                System.out.println("Placa Invalida");
                System.out.println("-----------------------------------------------");
            }
        } while (newPlaca == false);
        System.out.print("Ingrese el color: ");
        Color color = JColorChooser.showDialog(null, "Eliga el color", Color.yellow);
        int numLista = 0;
        int trans;
        boolean repeTrans = false;
        do {
            for (Transportista transportista1 : transportistas) {
                System.out.println("#" + numLista + ": " + transportista1);
                numLista++;
            }
            numLista = 0;
            System.out.print("Eliga al transportista encargado del vehículo: ");
            trans = scTrans.nextInt();
            if (trans < 0 || trans > transportistas.size()) {
                System.out.println("Opcion Invalida");
                System.out.println("-----------------------------------------------");
                transportista = false;
            } else {
                for (Transporte transporte : transportes) {
                    if (transporte.getTransportista().equals(transportistas.get(trans))) {
                        repeTrans = true;
                    }
                }
                if (repeTrans == true) {
                    System.out.println("Este transportista ya tiene un vahículo");
                    System.out.println("-----------------------------------------------");
                    transportista = false;
                } else {
                    do {
                        System.out.println("-----------------------------------------------");
                        System.out.println("""
                                       [0] Bus
                                       [1] Rapidito
                                       [2] Taxi
                                       [3] MotoTaxi
                                       """);
                        System.out.println("-----------------------------------------------");
                        System.out.print("Eliga que tipo de transporte desea: ");
                        tipo = scTrans.nextInt();
                        switch (tipo) {
                            case 0:
                                System.out.print("Ingrese el numero de sillas: ");
                                int sillas = scTrans.nextInt();
                                System.out.print("Ingrese cuantas pesonas pueden ir de pie: ");
                                int capPie = scTrans.nextInt();
                                System.out.println("-----------------------------------------------");
                                transportes.add(new Bus(sillas, capPie, placa, color, transportistas.get(trans)));
                                transportista = true;
                                break;
                            case 1:
                                System.out.print("Ingrese el numero de sillas: ");
                                sillas = scTrans.nextInt();
                                System.out.println("-----------------------------------------------");
                                transportes.add(new Rapidito(sillas, placa, color, transportistas.get(trans)));
                                transportista = true;
                                break;
                            case 2:
                                boolean taxi = true;
                                do {
                                    System.out.print("Ingrese el numero de taxi: ");
                                    int numTaxi = scTrans.nextInt();
                                    taxi = true;
                                    for (Transporte transporte : transportes) {
                                        if (transporte instanceof Taxi) {
                                            if (((Taxi) transporte).getNumTaxi() == numTaxi) {
                                                taxi = false;
                                            }
                                        }
                                    }
                                    if (taxi == false) {
                                        System.out.println("Numero Invalido");
                                        System.out.println("-----------------------------------------------");
                                    } else {
                                        transportes.add(new Taxi(numTaxi, placa, color, transportistas.get(trans)));
                                        System.out.println("-----------------------------------------------");
                                    }
                                } while (taxi == false);
                                transportista = true;
                                break;
                            case 3:
                                transportes.add(new MotoTaxi(placa, color, transportistas.get(trans)));
                                System.out.println("-----------------------------------------------");
                                transportista = true;
                                break;
                            default:
                                System.out.println("Opcion Invalida");
                                System.out.println("-----------------------------------------------");
                        }
                    } while (tipo != 0 && tipo != 1 && tipo != 2 && tipo != 3);
                }
            }
        } while (transportista == false);
        return transportes;
    }

    public static void listar(ArrayList<Clase> clases, ArrayList<Ruta> rutas, ArrayList<Alumno> alumnos, ArrayList<Transportista> transportistas, ArrayList<Transporte> transportes, int num) {
        int numLista = 1;
        switch (num) {
            case 8:
                for (Clase clase : clases) {
                    System.out.println("#" + num + ": " + clase);
                    numLista++;
                }
                break;
            case 9:
                for (Ruta ruta : rutas) {
                    System.out.println("#" + num + ": " + ruta);
                    numLista++;
                }
                break;
            case 10:
                for (Alumno alumno : alumnos) {
                    System.out.println("#" + num + ": " + alumno);
                    numLista++;
                }
                break;
            case 11:
                for (Transportista transportista : transportistas) {
                    System.out.println("#" + num + ": " + transportista);
                    numLista++;
                }
                break;
            case 12:
                for (Transporte transporte : transportes) {
                    System.out.println("#" + num + ": " + transporte);
                    numLista++;
                }
                break;
        }
    }

    public static void sim() {
        Scanner scSim = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("         < S I M U L A C I Ó N >");
            System.out.println("-----------------------------------------");
            System.out.print("""
                           [0] Salir
                           [1] Subir Alumno al Transporte
                           [2] Bajar Alumno al Transporte
                           [3] Listar Alumnos en el Transporte
                           [4] Escoger Transportista
                           [5] Quitar Transportista
                           [6] Añadir Ruta
                           [7] Quitar Ruta 
                           [8] Imprimir Transporte
                           [9] Comenzar
                           """);
            System.out.println("-----------------------------------------");
            opcion = scSim.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } while (opcion != 0);
    }

}
