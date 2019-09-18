package Clases;

import java.util.ArrayList;

public class Cliente {

    public int Codigo;
    public String Nombre;
    public String Id;
    public String Direccion;
    public String Telefono;
    public String Correo;
    public boolean Sexo;
    public boolean Casa;
    public boolean Vehiculos;
    public boolean Otros;

    public Cliente() {
        this.Codigo = -1;
        this.Nombre = "<Vacio>";
        this.Id = "<Vacio>";
        this.Direccion = "<Vacio>";
        this.Telefono = "<Vacio>";
        this.Correo = "<Vacio>";
        this.Sexo = true;
        this.Casa = false;
        this.Vehiculos = false;
        this.Otros = false;
    }

    public void setCliente(int Codigo, String Nombre, String Id, String Direccion, String Telefono, String Correo, boolean Sexo, boolean Casa, boolean Vehiculos, boolean Otros) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Id = Id;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Sexo = Sexo;
        this.Casa = Casa;
        this.Vehiculos = Vehiculos;
        this.Otros = Otros;
    }

    public Cliente(int Codigo, String Nombre, String Id, String Direccion, String Telefono, String Correo, boolean Sexo, boolean Casa, boolean Vehiculos, boolean Otros) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Id = Id;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Sexo = Sexo;
        this.Casa = Casa;
        this.Vehiculos = Vehiculos;
        this.Otros = Otros;
    }

    public int Buscar(ArrayList Lc) {
        int Resp = -1;
        Cliente C1 = new Cliente();
        for (int i = 0; i < Lc.size(); i++) {
            C1 = (Cliente) Lc.get(i);
            if (C1.Codigo==(this.Codigo)) {
                Resp = i;
            }
        }
        return Resp;
    }
}
