/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author ochoa
 */
public class AsignaturaServiceImpI implements AsignaturaService{

    private List<Asignatura> asignaturaList = new ArrayList<>();
    
    @Override
    public void crear(Asignatura asignatura) {
        this.asignaturaList.add(asignatura);
    }

    @Override
    public List<Asignatura> listar() {
    
        return this.asignaturaList;
    }

    @Override
    public Asignatura codigoAsignautra(int codigo) {
    
        Asignatura retorno = null;
        for(var asignatura:this.asignaturaList){
            if(codigo==asignatura.getCodigo()){
                retorno = asignatura;
                break;
            }
        }
        return retorno;
    }


    
    
}
