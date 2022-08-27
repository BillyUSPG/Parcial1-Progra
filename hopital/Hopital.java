/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hopital;
// @author Billy
import java.util.Scanner;
public class Hopital {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         boolean salir = false;
         Menu();
         String opcion = scan.nextLine();
         while(!salir){
         switch(opcion){
        case "0":
           System.out.println("\nBye, El programa finalizo");
           salir=true;
            break;
        case "1":
            PacienteRegistro();
            break;
        case "2":
            DocRegistro();
            break;
        case "3":
            NurseRegistro();
            break;
         }
         }
    }
    public static void Menu(){
     System.out.println("\t\n========== Menu del Hospital =========");
      System.out.println("\n1. Registrar Pacientes");
      System.out.println("2. Registrar Doctores");
      System.out.println("3. Registrar Enfermeras");
      System.out.println("0. Salir");
      System.out.println("\nElige una opcion");}
    static public void PacienteRegistro(){
        Paciente[] pacientes = new Paciente[1];
        Paciente[] guardar = new Paciente[1];
       Scanner scan = new Scanner(System.in);
       Scanner scaNum = new Scanner(System.in);
for(int i=0; i<pacientes.length; i++){
 System.out.println("\nIngresa tu ID");
 int id = scaNum.nextInt();
 System.out.println("\nIngresa tu Nombre");
 String name = scan.nextLine();
 System.out.println("\nIngresa tu Email");
 String email = scan.nextLine();
 System.out.println("\nIngresa tu Direccion");
 String dirrecion = scan.nextLine();
 System.out.println("\nIngresa tu Numero de telefono");
 int numero = scaNum.nextInt();
 System.out.println("\nIngresa tu fecha de nacimiento");
 String cumple = scan.nextLine();
 System.out.println("\nIngresa tu peso");
 double peso = scaNum.nextDouble();
 System.out.println("\nIngresa tu Altura");
 double altura = scaNum.nextDouble();
 System.out.println("\nIngresa tu Tipo de Sangre");
 String sangre = scan.nextLine();
 
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no]");
 String SN = scan.nextLine();
pacientes[i] = new Paciente(cumple,peso,altura,sangre,id,name,email,dirrecion,numero);

if(SN.equals("Si") || SN.equals("si")){
guardar=new Paciente[pacientes.length];

for(int j=0; j<pacientes.length; j++){
  guardar[j]=pacientes[j];}
 pacientes=new Paciente[pacientes.length+1];
  for(int k=0; k<pacientes.length-1; k++){
  pacientes[k]=guardar[k];}
}else{break;}
}

System.out.println("------- Pacientes Registrados -------");

for(int i=0; i<pacientes.length; i++){
    System.out.println("ID "+pacientes[i].id+"  "
            +"Nombre "+pacientes[i].name+"  "
            +"Dirreccion "+pacientes[i].dirrecion+"  "
            +"Email "+pacientes[i].email+"  "
            +"Telefono"+pacientes[i].numero+"  "
            +"Peso "+pacientes[i].peso+"  "
            +"Altura "+pacientes[i].altura+"  "
            +"Sangre "+pacientes[i].sangre);
            }
    
    }
    
    
     static public  void NurseRegistro(){
     Nurse[] enfermeras = new Nurse[1];
     Nurse[] guardar = new Nurse[1];
    Scanner scan = new Scanner(System.in);
    Scanner scaNum = new Scanner(System.in);
 for(int i=0; i<enfermeras.length; i++){
 System.out.println("\nIngresa tu ID");
 int id = scaNum.nextInt();
 System.out.println("\nIngresa tu Nombre");
 String name = scan.nextLine();
 System.out.println("\nIngresa tu Email");
 String email = scan.nextLine();
 System.out.println("\nIngresa tu Direccion");
 String dirrecion = scan.nextLine();
 System.out.println("\nIngresa tu Numero de telefono");
 int numero = scaNum.nextInt();
 System.out.println("\nIngresa la especialidad");
 String especialidad = scan.nextLine();
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no]");
 String SN = scan.nextLine();
enfermeras[i] = new Nurse(especialidad,id,name,email,dirrecion,numero);

if(SN.equals("Si") || SN.equals("si")){
guardar=new Nurse[enfermeras.length];

for(int j=0; j<enfermeras.length; j++){
  guardar[j]=enfermeras[j];}
 enfermeras=new Nurse[enfermeras.length+1];
  for(int k=0; k<enfermeras.length-1; k++){
  enfermeras[k]=guardar[k];}
}else{break;}
    }
 System.out.println("------- Enfermeras Registrados -------");
 for(int i=0; i<enfermeras.length; i++){
    System.out.println("ID "+enfermeras[i].id+"  "
            +"Nombre "+enfermeras[i].name+"  "
            +"Dirreccion "+enfermeras[i].dirrecion+"  "
            +"Email "+enfermeras[i].email+"  "
            +"Telefono"+enfermeras[i].numero+"  "
            +"Especialidad "+enfermeras[i].specialidad+"  "
            );
            }
     }
     static public  void DocRegistro(){
      Doctor[] doc = new Doctor[1];
      Doctor[] guardar = new Doctor[1];
      Scanner scan = new Scanner(System.in);
      Scanner scaNum = new Scanner(System.in);
     for(int i=0; i<doc.length; i++){
 System.out.println("\nIngresa tu ID");
 int id = scaNum.nextInt();
 System.out.println("\nIngresa tu Nombre");
 String name = scan.nextLine();
 System.out.println("\nIngresa tu Email");
 String email = scan.nextLine();
 System.out.println("\nIngresa tu Direccion");
 String dirrecion = scan.nextLine();
 System.out.println("\nIngresa tu Numero de telefono");
 int numero = scaNum.nextInt();
 System.out.println("\nIngresa la especialidad");
 String especialidad = scan.nextLine();
 System.out.println("Desea ingresar un nuevo registro -> [si] o [no]");
 String SN = scan.nextLine();
doc[i] = new Doctor(especialidad,id,name,email,dirrecion,numero);

if(SN.equals("Si") || SN.equals("si")){
guardar=new Doctor[doc.length];

for(int j=0; j<doc.length; j++){
  guardar[j]=doc[j];}
 doc=new Doctor[doc.length+1];
  for(int k=0; k<doc.length-1; k++){
  doc[k]=guardar[k];}
}else{break;}
    }
     System.out.println("------- Doctores Registrados -------");
    for(int i=0; i<doc.length; i++){
    System.out.println("ID "+doc[i].id+"  "
            +"Nombre "+doc[i].name+"  "
            +"Dirreccion "+doc[i].dirrecion+"  "
            +"Email "+doc[i].email+"  "
            +"Telefono"+doc[i].numero+"  "
            +"Especialidad "+doc[i].specialidad+"  "
            );
            }
    }
}
