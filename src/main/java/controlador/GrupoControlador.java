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
     
    public GrupoControlador() {
        this.grupoServi = new GrupoServiceImpI();
    }
    public void crear(String[] data) {
        var numeroGrupo = Integer.valueOf(data[0]).intValue();
        var aula = Integer.valueOf(data[1]).intValue();;
        var numeroAlumnos = Integer.valueOf(data[2]).intValue();
        var nivelCiclo= data[3];
        
        //--------------------------------------------------------//
        var codigo1 = Integer.valueOf(data[4]);
        var nombreMateria = data[5];
        var horasClases = data[6];
        var planEstudio = data[7];
        var carreraAsignatura = data[8];
        var asignatura = new Asignatura(codigo1,nombreMateria,horasClases,planEstudio,carreraAsignatura);
        
        //---------------------------------------------------------------//
        var codigo2 = Integer.valueOf(data[9]).intValue();
        var nombre = data[10];
        var year = Integer.valueOf(data[11]).intValue();
        var mes = Integer.valueOf(data[12]).intValue();
        var dia = Integer.valueOf(data[13]).intValue();
        var fecha = LocalDate.of(year,mes, dia);
        var profesion = data[14];
        var correo = data[15];
        var genero = data[16];
        var profesor = new Profesor(codigo2,nombre,fecha,profesion,correo,genero);
        //---------------------------------------------------------------//
        
        var grupo = new Grupo(numeroGrupo,aula,numeroAlumnos,nivelCiclo,asignatura,profesor);
        this.grupoServi.crear(grupo);
        
        
    }
    
    public List<Grupo>Listar(){
        return this.grupoServi.listar();
    }
}
