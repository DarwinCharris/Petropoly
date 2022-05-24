/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_edd1;

/**
 *
 * @author Darwin
 */
public class Carta {
    int num;
        String info;
        Carta next;
        public Carta(int num, String info) {
            this.num = num;
            this.info = info;
            this.next = null;
        }
}
