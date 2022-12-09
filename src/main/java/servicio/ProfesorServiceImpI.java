/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Profesor;

/**
 *
 * @author ochoa
 */
public class ProfesorServiceImpI implements ProfesorService{

    private List<Profesor> profesorList;

    public ProfesorServiceImpI() {

        this.profesorList = new ArrayList<>();

    }
    
    @Override
    public void crear(Profesor profesor) {
        
        this.profesorList.add(profesor);
        
    }

    @Override
    public List<Profesor> listar() {
        
        return this.profesorList;
        
    }

    @Override
    public Profesor codigoProfesor(int codigo) {
        
        Profesor retorno = null;
        for(var profesor:this.profesorList){
            if(codigo==profesor.getCodigo()){
                retorno = profesor;
                break;
            }
        }
        return retorno;
    }
    
    
}
