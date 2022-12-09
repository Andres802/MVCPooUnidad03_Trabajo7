/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Asignatura;
import modelo.Grupo;
import modelo.Profesor;
import servicio.GrupoServiceImpI;
import servicio.*;


/**
 *
 * @author ochoa
 */
public class GrupoControlador {
    
     private  GrupoServiceImpI grupoServi;
     private  AsignaturaServiceImpI asignaturaServi;
     private ProfesorServiceImpI profesorServi;
    public GrupoControlador() {
        this.grupoServi = new GrupoServiceImpI();
        this.asignaturaServi = new AsignaturaServiceImpI();
        this.profesorServi = new ProfesorServiceImpI();
    }
    public void crear(String[] data) {
        var numeroGrupo = Integer.valueOf(data[0]).intValue();
        var aula = Integer.valueOf(data[1]).intValue();
        var numeroAlumnos = Integer.valueOf(data[2]).intValue();
        var nivelCiclo= data[3];
        var asignatura = this.asignaturaServi.codigoAsignautra(Integer.valueOf(data[4]).intValue());
        var profesor = this.profesorServi.codigoProfesor(Integer.valueOf(data[5]).intValue());
        
        var grupo = new Grupo(numeroGrupo,aula,numeroAlumnos,nivelCiclo,asignatura,profesor);
        this.grupoServi.crear(grupo);
        
        
    }
    
    public List<Grupo>Listar(){
        return this.grupoServi.listar();
    }
}
