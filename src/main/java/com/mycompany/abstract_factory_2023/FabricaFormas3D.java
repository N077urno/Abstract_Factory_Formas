/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_factory_2023;

/**
 *
 * @author nando
 */
public class FabricaFormas3D implements AbstractFactoryFormas {
    @Override
    public Shape criarForma(String tipo){
        if(tipo.equals("Esfera")){
            return(new Esfera());
        }else if(tipo.equals("Cubo")){
            return(new Cubo());
        }else {
            return null;
        }
    }
}
