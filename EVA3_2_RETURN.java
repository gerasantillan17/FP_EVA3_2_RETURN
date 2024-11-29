/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_return;

/**
 *
 * @author gerar
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GUARDARLO Y USARLO VARIAS VECES
        int valor;
        valor = sumarEnteros(100, 50);
        System.out.println("Resultado:" + valor);
        //USARLO UNA SOLA VEZ
        System.out.println("Resultado:" + sumarEnteros(100, 50));
        //IGNORAR EL VALOR
        sumarEnteros(100, 50);
    }
    
    public static int sumarEnteros(int num1, int num2){
        int resu;
        resu = num1 + num2;
      return resu;
    }
   
}
