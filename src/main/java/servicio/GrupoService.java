/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Grupo;

/**
 *
 * @author ochoa
 */
public interface GrupoService {
    
    public abstract void crear(Grupo grupo);
    public abstract List<Grupo> listar();
}
