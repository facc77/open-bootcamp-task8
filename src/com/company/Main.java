package com.company;

public class Main {
    public static void main(String[] args){

        Persona señor = new Persona();

        señor.setEdad(47);
        señor.setNombre("Raul");
        señor.setTelefono(4234234);

        System.out.println(señor.getEdad());
        System.out.println(señor.getNombre());
        System.out.println(señor.getTelefono());


    }
}


class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}