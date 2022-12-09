/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Grupo;

/**
 *
 * @author ochoa
 */
public class GrupoServiceImpI implements GrupoService{

    private List<Grupo> grupoList;

    public GrupoServiceImpI() {

        this.grupoList = new ArrayList<>();

    }
    
    @Override
    public void crear(Grupo grupo) {
        
        this.grupoList.add(grupo);        
    }

    @Override
    public List<Grupo> listar() {
        
        return this.grupoList;
        
    }
    
}
