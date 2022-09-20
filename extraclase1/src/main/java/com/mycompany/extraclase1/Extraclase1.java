/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extraclase1;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Extraclase1 {

    public static void main(String[] args) {
        
        String Nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre completo");
        String LecturaSalSem = JOptionPane.showInputDialog("Por favor digite el monto de su salario semanal");
        
        double SalSem = Double.parseDouble(LecturaSalSem);
        
        double SalMen = SalSem * 4.2;
        
        double Deducciones = SalMen * 0.0934;
        
        double neto = SalMen - Deducciones;
        
        JOptionPane.showMessageDialog(null,"Estimado "+Nombre+", El salario de este mes se desglosa de la sigiente manera:\n"+
                "Salario bruto: "+SalMen+" Colones\n"+
                "Deducciones: "+Deducciones+" Colones\n"+
                "Salario neto: "+neto+" Colones");
        
        
                
        
     
    }
}


