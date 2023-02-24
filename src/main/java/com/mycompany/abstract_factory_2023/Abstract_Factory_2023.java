/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstract_factory_2023;

/**
 *
 * @author nando
 */
public class Abstract_Factory_2023 {

    public static void main(String[] args) {
        AbstractFactoryFormas fabrica2D = new FabricaFormas2D();
        
        Shape circulo = fabrica2D.criarForma("Circulo");
        circulo.desenhar();
        
        AbstractFactoryFormas fabrica3D = new FabricaFormas3D();
        
        Shape Esfera = fabrica3D.criarForma("Esfera");
        Esfera.desenhar();
        
    }
}
