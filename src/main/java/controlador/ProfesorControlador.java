/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Profesor;
import servicio.ProfesorServiceImpI;

/**
 *
 * @author ochoa
 */
public class ProfesorControlador {
    
     private final ProfesorServiceImpI profesorServi;

    public ProfesorControlador() {
        this.profesorServi = new ProfesorServiceImpI();
    }
    public void crear(String[] data) {
        var codigo = Integer.valueOf(data[0]).intValue();
        var nombre = data[1];
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var fecha = LocalDate.of(year,mes, dia);
        var profesion = data[5];
        var correo = data[6];
        var genero = data[7];
        var profesor = new Profesor(codigo,nombre,fecha,profesion,correo,genero);
        this.profesorServi.crear(profesor);
    }
    
    public List<Profesor>Listar(){
        return this.profesorServi.listar();
    }
}
