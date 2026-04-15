/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UMG
 */
public class Empleado {
    int id;
    String nombre;
    String apellido;
    String direccion;
    float salario;
       
    public Empleado () { 
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.direccion = "";
        this.salario = 0;
    
    }

    public Empleado(int id, String nombre, String apellido, String direccion, float salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    float total;
    public float CalcularSalario() {

        salario = 5000;
  
        total = (float) (salario * 2);
        
        return total;
    }
    
    
    
}
