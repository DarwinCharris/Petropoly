package lab_final_edd1;

import java.util.Random;

/**
 *
 * @author Darwin
 */
public class Cofre {
    Carta head = null;
    Carta tail = null;

    public void addCarta(int data, String name) {
        Carta P = new Carta(data, name);
        if (head == null) {
            head = P;
            tail = P;
        } else {
            tail.next = P;
            tail = P;
        }
    }

    public void mostrarlista() {
        Carta recorrer = head;
        while (recorrer != null) {
            System.out.println(recorrer.num + "." + recorrer.info + "---->");
            recorrer = recorrer.next;

        }
    }

    public int cartaRandom() {
        Random random = new Random();
        int rnum = random.nextInt((14 + 1)) + 1;
        return rnum;
    }
}
