/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_edd1;

/**
 *
 * @author Emily Roldán
 */
public class Jugadores {
    String nombre;
    int turno; //1, 2, 3, 4
    int x;
    int y;
    int posicion;
    int estado; // 0 jugando, 1 bancarrota, 2 encarcelado
    int dinero;//empieza en 1500
    int contador;
    int Csuerte;
    int CArca;
    public Jugadores(int posicion, int estado, int dinero, int x, int y, String nombre, int contador, int Csuerte, int CArca) {
        this.posicion = posicion;
        this.estado = estado;
        this.dinero = dinero;
        this.x = x;
        this.y = y;
        this.nombre = nombre;
        this.contador = contador;
        this.Csuerte = Csuerte;
        this.CArca = CArca;
    }
}
