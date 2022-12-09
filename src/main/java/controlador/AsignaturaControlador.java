/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.util.List;
import modelo.Asignatura;
import servicio.AsignaturaServiceImpI;
import servicio.*;

/**
 *
 * @author ochoa
 */
public class AsignaturaControlador {
    
    private  AsignaturaServiceImpI asignaturaServi;
   

    public AsignaturaControlador() {
        this.asignaturaServi = new AsignaturaServiceImpI();
    }
    public void crear(String[] data) {
        var codigo = Integer.valueOf(data[0]).intValue();
        var nombreMateria = data[1];
        var horasClases = data[2];
        var planEstudio = data[3];
        var carreraAsignatura = data[4];
        var asignatura = new Asignatura(codigo,nombreMateria,horasClases,planEstudio,carreraAsignatura);
        this.asignaturaServi.crear(asignatura);
        
    }
     public List<Asignatura>Listar(){
        return this.asignaturaServi.listar();
    }
}
