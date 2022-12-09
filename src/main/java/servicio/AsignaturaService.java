/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.*;

/**
 *
 * @author ochoa
 */
public interface AsignaturaService {
    
    public abstract void crear(Asignatura asignatura);
    public abstract List<Asignatura> listar();
    
}
