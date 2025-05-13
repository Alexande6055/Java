/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplocontroldeversiones;

/**
 *
 * @author adri0
 */
public class Adrian {
    private String lenguajeFavorito;
    private int edad;

    // Constructor
    public Adrian(String lenguajeFavorito, int edad) {
        this.lenguajeFavorito = lenguajeFavorito;
        this.edad = edad;
    }

    // Método para presentarse
    public void presentarse() {
        System.out.println("👋 ¡Hola! Soy Adrian, tengo " + edad + " años y mi lenguaje favorito es " + lenguajeFavorito + ".");
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        Adrian yo = new Adrian("php", 21);
        yo.presentarse();
    }
}
