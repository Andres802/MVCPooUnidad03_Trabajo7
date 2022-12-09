/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Profesor;

/**
 *
 * @author ochoa
 */
public interface ProfesorService {
    
    public abstract void crear(Profesor profesor);
    public abstract List<Profesor> listar();
}
