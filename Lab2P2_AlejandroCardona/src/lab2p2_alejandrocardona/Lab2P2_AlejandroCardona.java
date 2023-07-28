/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_alejandrocardona;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_AlejandroCardona {

    static Scanner read = new Scanner (System.in);
    static ArrayList<Chefs> staffChefs = new ArrayList();
    static ArrayList<Mesero> staffMesero = new ArrayList();
    static ArrayList<Bartender> staffBartender = new ArrayList();
    static int despChef = 0;
    static int matuChef = 0;
    static int despMesero = 0;
    static int matuMesero = 0;
    static int despBartender = 0 ;
    static int matuBartender = 0;
    
    
    public static void main(String[] args) {
        
        boolean login = false;
        System.out.println("""
                           Iniciar Sesión
                           Ingrese su usuario: """);
        String user = read.nextLine();
        System.out.println("""
                           Ingrese su contraseña: """);
        String pass = read.nextLine();
        if ( user.equals("gerente") && pass.equals("g3r$nt0")){
            login = true;
        }
        boolean continuar = true;
        while (continuar){
            
            
                if ( login ){
                System.out.println("""
                                   MENU
                                   1. Chefs
                                   2. Meseros
                                   3. Bartenders
                                   4. Mesas
                                   5. Salir""");
                int opcionMenu = read.nextInt();
                switch (opcionMenu){
                    
                    case 1 : {
                        
                        System.out.println("""
                                           Qué operación desea realizar?
                                           1. Crear
                                           2. Modificar
                                           3. Eliminar
                                           4. Listar""");
                        int opcionChef = read.nextInt();
                        switch ( opcionChef ){
                            
                            case 1 : {
                                if( despChef + matuChef <= 14){
                                    Scanner lea = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre del chef");
                                    String nameChef = lea.nextLine();

                                    System.out.println("Ingrese la edad del chef");
                                    int edadChef = read.nextInt();

                                    System.out.println("Ingrese la cantidad de estrellas Michelin del chef");
                                    int estrellas = read.nextInt();
                                    int turnoChef = 2;
                                    do{
                                        System.out.println("Ingrese el turno del chef (0. Matutino/1. Despertino");
                                        turnoChef = read.nextInt();
                                    }while (turnoChef != 0 && turnoChef != 1);

                                    String turnoChef_String;
                                    if(turnoChef == 0){

                                        turnoChef_String = "Matutino";
                                        matuChef+=1;

                                    }
                                    else{

                                        turnoChef_String = "Despertino";
                                        despChef+=1;

                                    }

                                    System.out.println("Ingrese el sueldo del chef");
                                    double sueldo = read.nextDouble();
                                    Scanner read = new Scanner(System.in);

                                    Chefs chef = new Chefs(nameChef , edadChef , estrellas , turnoChef_String , sueldo);

                                    staffChefs.add(chef);
                                }
                                else{
                                    System.out.println("Considere eliminar algun chef");
                                }
                            }//fin case 1 agregar chefs
                            break;
                            
                            case 2 : {
                                Scanner read = new Scanner(System.in);
                                boolean hayChefs = false;
                                for ( Object x: staffChefs) {
                                    
                                    if( x instanceof Chefs){
                                        
                                        hayChefs = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayChefs ){
                                    
                                    String printChefs = "";
                                    for ( Object x: staffChefs) {
                                    
                                        if( x instanceof Chefs){

                                            printChefs+= staffChefs.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del chef a modificar\n"+printChefs);
                                    int i = read.nextInt();
                                    
                                    if ( i < staffChefs.size()&&i>= 0){
                                        
                                        System.out.println("""
                                                           Qué desea modificar?
                                                           1. Nombre
                                                           2. Edad
                                                           3. Estrellas Michelin
                                                           4. Turno
                                                           5. Sueldo""");
                                        int chefMod = read.nextInt();
                                        
                                        modificarChef(i , chefMod);
                                        
                                    }
                                    
                                }//fin if hayChefs
                                else{
                                    
                                    System.out.println("Debe ingresar un chef primero");
                                    
                                }
                                
                            }//fin case 2 modificar chefs
                            break;
                            
                            case 3 : {
                                 Scanner read = new Scanner(System.in);
                                boolean hayChefs = false;
                                for ( Object x: staffChefs) {
                                    
                                    if( x instanceof Chefs){
                                        
                                        hayChefs = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayChefs ){
                                    
                                    String printChefs = "";
                                    for ( Object x: staffChefs) {
                                    
                                        if( x instanceof Chefs){

                                            printChefs+= staffChefs.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del chef a eliminar\n"+printChefs);
                                    int i = read.nextInt();
                                    
                                    eliminarChef(i);
                                    
                                }//fin if hayChefs
                                else{
                                    
                                    System.out.println("Debe ingresar un chef primero");
                                    
                                }
                                
                            }//fin case 3 eliminar chefs
                            break; 
                            
                            case 4 : {
                                 Scanner read = new Scanner(System.in);
                                String printChefs = "";
                                    for ( Object x: staffChefs) {
                                    
                                        if( x instanceof Chefs){

                                            printChefs+= staffChefs.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                System.out.println(printChefs);
                                
                            }//fin case 4 listar chefs
                            
                        }//fin switch chefs
                        
                    }//fin case 1
                    break;
                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 2 : {
                        
                        System.out.println("""
                                           Qué operación desea realizar?
                                           1. Crear
                                           2. Modificar
                                           3. Eliminar
                                           4. Listar""");
                        int opcionMesero = read.nextInt();
                        switch ( opcionMesero ){
                            
                            case 1 : {
                                if( despMesero+ matuMesero <= 8){
                                    
                                    Scanner lea = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre del mesero");
                                    String nameMesero = lea.nextLine();

                                    System.out.println("Ingrese la edad del mesero");
                                    int edadMesero = read.nextInt();

                                    System.out.println("Ingrese la propina del mesero");
                                    double propina = read.nextInt();
                                    int turnoMesero = 2;
                                    do{
                                        System.out.println("Ingrese el turno del mesero (0. Matutino/1. Despertino");
                                        turnoMesero = read.nextInt();
                                    }while (turnoMesero != 0 && turnoMesero != 1);

                                    String turnoMesero_String;
                                    if(turnoMesero == 0){

                                        turnoMesero_String = "Matutino";
                                        matuMesero+=1;

                                    }
                                    else{

                                        turnoMesero_String = "Despertino";
                                        despChef+=1;

                                    }

                                    System.out.println("Ingrese el sueldo del mesero");
                                    double sueldo = read.nextDouble();
                                    Scanner read = new Scanner(System.in);

                                    Mesero meserx = new Mesero(nameMesero , turnoMesero_String , edadMesero , sueldo ,  propina);

                                    staffMesero.add(meserx);
                                }
                                else{
                                    System.out.println("Considere eliminar algun mesero");
                                }
                            }//fin case 1 agregar mesero
                            
                            case 2 : {
                                 Scanner read = new Scanner(System.in);
                                boolean hayChefs = false;
                                for ( Object x: staffChefs) {
                                    
                                    if( x instanceof Chefs){
                                        
                                        hayChefs = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayChefs ){
                                    
                                    String printMesero= "";
                                    for ( Object x: staffMesero) {
                                    
                                        if( x instanceof Mesero){

                                            printMesero+= staffChefs.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del mesero a modificar\n"+printMesero);
                                    int i = read.nextInt();
                                    
                                    if ( i < staffMesero.size()&&i>= 0){
                                        
                                        System.out.println("""
                                                           Qué desea modificar?
                                                           1. Nombre
                                                           2. Edad
                                                           3. Propina
                                                           4. Turno
                                                           5. Sueldo""");
                                        int meseroMod = read.nextInt();
                                        
                                        modificarMesero(i , meseroMod);
                                        
                                    }
                                    
                                }//fin if hayMesero
                                else{
                                    
                                    System.out.println("Debe ingresar un mesero primero");
                                    
                                }
                                
                            }//fin case 2 modificar
                            break;
                            
                            case 3 : {
                                 Scanner read = new Scanner(System.in);
                                boolean hayMeseros = false;
                                for ( Object x: staffMesero) {
                                    
                                    if( x instanceof Mesero){
                                        
                                        hayMeseros = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayMeseros ){
                                    
                                    String printMesero = "";
                                    for ( Object x: staffMesero) {
                                    
                                        if( x instanceof Mesero){

                                            printMesero+= staffMesero.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del mesero a eliminar\n"+printMesero);
                                    int i = read.nextInt();
                                    
                                    eliminarMesero(i);
                                    
                                }//fin if hayChefs
                                else{
                                    
                                    System.out.println("Debe ingresar un mesero primero");
                                    
                                }
                                
                                
                            }//fin case 3 eliminar
                            break;
                            
                            case 4  : {
                                 Scanner read = new Scanner(System.in);
                                String printMesero = "";
                                    for ( Object x: staffMesero) {
                                    
                                        if( x instanceof Mesero){

                                            printMesero+= staffMesero.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                System.out.println(printMesero);
                                
                            }//fin case 4 listar
                            break;
                            
                        }//fin switch meseros
                        
                    }//fin case 2 meseros
                    break;
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 3 : {
                        
                        System.out.println("""
                                           Qué operación desea realizar?
                                           1. Crear
                                           2. Modificar
                                           3. Eliminar
                                           4. Listar""");
                        int opcionBartender = read.nextInt();
                         Scanner read = new Scanner(System.in);
                        switch ( opcionBartender ){
                            
                            case 1 : {
                                if( despBartender+ matuBartender <= 8){
                                    Scanner lea = new Scanner(System.in);
                                    System.out.println("Ingrese el nombre del Bartender");
                                    String nameBartender = lea.nextLine();

                                    System.out.println("Ingrese la edad del Bartender");
                                    int edadBartender = read.nextInt();
                                    
                                    System.out.println("Ingrese la cantidad de licores del Bartender");
                                    int licores = read.nextInt();
                                    int turnoBartender = 2;
                                    do{
                                        System.out.println("Ingrese el turno del Bartender (0. Matutino/1. Despertino");
                                        turnoBartender = read.nextInt();
                                    }while (turnoBartender != 0 && turnoBartender != 1);

                                    String turnoBartender_String;
                                    if(turnoBartender == 0){

                                        turnoBartender_String = "Matutino";
                                        matuBartender+=1;

                                    }
                                    else{

                                        turnoBartender_String = "Despertino";
                                        despBartender+=1;

                                    }

                                    System.out.println("Ingrese el sueldo del Bartender");
                                    double sueldo = read.nextDouble();
                                    read = new Scanner(System.in);

                                    Mesero meserx = new Mesero(nameBartender , turnoBartender_String , edadBartender , sueldo ,  licores);

                                    staffMesero.add(meserx);
                                }
                                else{
                                    System.out.println("Considere eliminar algun Bartender");
                                }
                            }//fin case 1 agregar mesero
                            
                            case 2 : {
                                
                                boolean hayBartender = false;
                                for ( Object x: staffBartender) {
                                    
                                    if( x instanceof Bartender){
                                        
                                        hayBartender = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayBartender ){
                                    
                                    String printBartender= "";
                                    for ( Object x: staffBartender) {
                                    
                                        if( x instanceof Bartender){

                                            printBartender+= staffBartender.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del Bartender a modificar\n"+printBartender);
                                    int i = read.nextInt();
                                    
                                    if ( i < staffMesero.size()&&i>= 0){
                                        
                                        System.out.println("""
                                                           Qué desea modificar?
                                                           1. Nombre
                                                           2. Edad
                                                           3. Licores
                                                           4. Turno
                                                           5. Sueldo""");
                                        int BartenderMod = read.nextInt();
                                        
                                        modificarBartender(i , BartenderMod);
                                        
                                    }
                                    
                                }//fin if hayMesero
                                else{
                                    
                                    System.out.println("Debe ingresar un Bartender primero");
                                    
                                }
                                
                            }//fin case 2 modificar
                            break;
                            
                            case 3 : {
                                
                                boolean hayBartender= false;
                                for ( Object x: staffBartender) {
                                    
                                    if( x instanceof Bartender){
                                        
                                        hayBartender = true;
                                        
                                    }
                                    
                                }//fin for
                                
                                if ( hayBartender ){
                                    
                                    String printBartender = "";
                                    for ( Object x: staffBartender) {
                                    
                                        if( x instanceof Mesero){

                                            printBartender+= staffBartender.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                    System.out.println("Ingrese el indice del Bartender a eliminar\n"+printBartender);
                                    int i = read.nextInt();
                                    
                                    eliminarBartender(i);
                                    
                                }//fin if hayChefs
                                else{
                                    
                                    System.out.println("Debe ingresar un Bartender primero");
                                    
                                }
                                
                                
                            }//fin case 3 eliminar
                            break;
                            
                            case 4  : {
                                
                                String printBartender = "";
                                    for ( Object x: staffBartender) {
                                    
                                        if( x instanceof Bartender){

                                            printBartender+= staffBartender.indexOf(x)+". "+x;

                                        }
                                    
                                    }//fin for
                                System.out.println(printBartender);
                                
                            }//fin case 4 listar
                            break;
                            
                        }//fin switch Bartender
                        
                    }//fin case 3 bartenders
                    break;
                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 4 : {
                        
                    }//fin case 4 mesas
                    break;
                    
                    case 5 : {
                        
                        continuar = false;
                        
                    }//fin case 5
                    break;
                    
                    default : {
                        System.out.println("Ingresó un valor no valido");
                    }
                    
                    
                }//fin switch
                
                
            }
            else{
                
                System.out.println("Usuario no valido");
                System.out.println("Desea salir? [Y/N]");
                String salir  = read.nextLine();
                char x = salir.charAt(0);
                if ( x == 'y' || x == 'Y'){
                    
                    continuar = false;
                    
                }
                else{
                    System.out.println("""
                           Iniciar Sesión
                           Ingrese su usuario: """);
                    user = read.nextLine();
                    System.out.println("""
                                       Ingrese su contraseña: """);
                    pass = read.nextLine();
                    if ( user.equals("gerente") && pass.equals("g3r$nt0")){
                        login = true;
                    }
                }
                
                
            }
            
            
        }

    }//fin main
    
    static void eliminarChef(int i){
        
        if ( i <= staffChefs.size()-1&& i>= 0){
                                        
            if(staffChefs.get(i).getTurno().equals("Matutino")){

                matuChef-=1;

            }
            else{

                despChef -= 1;

            }
            staffChefs.remove(i);
            System.out.println("Ha eliminado el chef de manera exitosa");


        }
        
    }
    static void eliminarMesero(int i){
        
        if ( i <= staffMesero.size()-1&& i>= 0){
                                        
            if(staffMesero.get(i).getTurno().equals("Matutino")){

                matuMesero-=1;

            }
            else{

                despMesero -= 1;

            }
            staffMesero.remove(i);
            System.out.println("Ha eliminado el mesero de manera exitosa");


        }
        
    }
    static void eliminarBartender(int i){
        
        if ( i <= staffBartender.size()-1&& i>= 0){
                                        
            if(staffBartender.get(i).getTurno().equals("Matutino")){

                matuBartender-=1;

            }
            else{

                despBartender -= 1;

            }
            staffBartender.remove(i);
            System.out.println("Ha eliminado el bartender de manera exitosa");


        }
        
    }
    static void modificarChef(int i , int chefMod){
        
        switch (chefMod){
                                            
            case 1 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo nombre");
                String nombreN = read.nextLine();
                staffChefs.get(i).setNombre(nombreN);

            }//fin case 1 nombre
            break;

            case 2 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva edad");
                int edadN = read.nextInt();
                staffChefs.get(i).setEdad(edadN);

            }//fin case 2 edad
            break;

            case 3 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva cantidad de estrellas Michelin");
                int estrellasN = read.nextInt();
                staffChefs.get(i).setEstrellas(estrellasN);

            }//fin case 3 estrellas
            break;

            case 4 : {
                 Scanner read = new Scanner(System.in);
                int turnoChef;
                System.out.println("Ingrese el nuevo turno del chef");
                do{
                    System.out.println("Ingrese el turno del chef (0. Matutino/1. Despertino");
                    turnoChef = read.nextInt();
                }while (turnoChef != 0 && turnoChef != 1);

                String turnoChef_String;
                if(turnoChef == 0){

                    turnoChef_String = "Matutino";
                    matuChef+=1;

                }
                else{

                    turnoChef_String = "Despertino";
                    despChef+=1;

                }
                staffChefs.get(i).setTurno(turnoChef_String);

            }//fin case 4 turno
            break;

            case 5  : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo sueldo");
                double sueldoN = read.nextDouble();
                staffChefs.get(i).setSueldo(sueldoN);


            }//fin case 5 suelldo
            break;

            default : {

                System.out.println("Ingreso un valor invalido");

            }

        }
        
    }
    static void modificarMesero(int i , int meseroMod){
        
        switch (meseroMod){
                                            
            case 1 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo nombre");
                String nombreN = read.nextLine();
                staffMesero.get(i).setNombre(nombreN);

            }//fin case 1 nombre
            break;

            case 2 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva edad");
                int edadN = read.nextInt();
                staffMesero.get(i).setEdad(edadN);

            }//fin case 2 edad
            break;

            case 3 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva propina");
                double propinaN = read.nextDouble();
                staffMesero.get(i).setPropina(propinaN);

            }//fin case 3 estrellas
            break;

            case 4 : {
                 Scanner read = new Scanner(System.in);
                int turnoMesero;
                System.out.println("Ingrese el nuevo turno del mesero");
                do{
                    System.out.println("Ingrese el turno del mesero (0. Matutino/1. Despertino");
                    turnoMesero = read.nextInt();
                }while (turnoMesero!= 0 && turnoMesero!= 1);

                String turnoMesero_String;
                if(turnoMesero== 0){

                    turnoMesero_String = "Matutino";
                    matuMesero+=1;

                }
                else{

                    turnoMesero_String = "Despertino";
                    despMesero+=1;

                }
                staffMesero.get(i).setTurno(turnoMesero_String);

            }//fin case 4 turno
            break;

            case 5  : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo sueldo");
                double sueldoN = read.nextDouble();
                staffMesero.get(i).setSueldo(sueldoN);


            }//fin case 5 suelldo
            break;

            default : {

                System.out.println("Ingreso un valor invalido");

            }

        }
        
    }
    static void modificarBartender(int i , int BartenderMod){
        
        switch (BartenderMod){
                                            
            case 1 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo nombre");
                String nombreN = read.nextLine();
                staffBartender.get(i).setNombre(nombreN);

            }//fin case 1 nombre
            break;

            case 2 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva edad");
                int edadN = read.nextInt();
                staffBartender.get(i).setEdad(edadN);

            }//fin case 2 edad
            break;

            case 3 : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese la nueva cantidad de licores");
                int licoresN = read.nextInt();
                staffBartender.get(i).setLicores(licoresN);

            }//fin case 3 estrellas
            break;

            case 4 : {
                 Scanner read = new Scanner(System.in);
                int turnoBartender;
                System.out.println("Ingrese el nuevo turno del Bartender");
                do{
                    System.out.println("Ingrese el turno del Bartender (0. Matutino/1. Despertino");
                    turnoBartender = read.nextInt();
                }while (turnoBartender!= 0 && turnoBartender!= 1);

                String turnoBartender_String;
                if(turnoBartender== 0){

                    turnoBartender_String = "Matutino";
                    matuBartender+=1;

                }
                else{

                    turnoBartender_String = "Despertino";
                    despBartender+=1;

                }
                staffBartender.get(i).setTurno(turnoBartender_String);

            }//fin case 4 turno
            break;

            case 5  : {
                 Scanner read = new Scanner(System.in);
                System.out.println("Ingrese el nuevo sueldo");
                double sueldoN = read.nextDouble();
                staffBartender.get(i).setSueldo(sueldoN);


            }//fin case 5 suelldo
            break;

            default : {

                System.out.println("Ingreso un valor invalido");

            }

        }
        
    }
    
}//fin clase
