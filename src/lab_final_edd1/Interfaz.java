/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_final_edd1;

import java.awt.Image;
import java.applet.AudioClip;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static lab_final_edd1.Lab_Final_EDD1.leertxt;

/**
 *
 * @author Darwin
 */
public class Interfaz extends javax.swing.JFrame {

    int cont = 0;
    int turno = 1;
    ListaCampo tablero = new ListaCampo();
    AudioClip sonido1, sonido2;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {

        initComponents();
        //Hacer fichas visibles dependiendo la cantidad de jugadores
        switch (Variables.njugadores) {
            case 2:
                azul.setVisible(false);
                TAzul.setVisible(false);
                verde.setVisible(false);
                TVerde.setVisible(false);
                DinAz.setVisible(false);
                DinV.setVisible(false);
                ProVerde.setVisible(false);
                ProAzul.setVisible(false);
                
                break;
            case 3:
                azul.setVisible(false);
                TAzul.setVisible(false);            
                DinAz.setVisible(false);
                ProAzul.setVisible(false);
                break;
        }

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        leertxt("txtPropiedades", tablero);
        setSize(1366, 720);
        ImageIcon wallpaper = new ImageIcon("src/Data1/monopoly.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(), jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();
        transparenciaButton();
        //sonido
        sonido1 = java.applet.Applet.newAudioClip(getClass().getResource("/audios/interfaz.wav"));
        //sonido1.play();
        sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/audios/interfaz2.wav"));
        //sonido2.loop();
        

    }

    @SuppressWarnings("unchecked")
    public void transparenciaButton() {
        dadoBtn.setOpaque(false);
        dadoBtn.setContentAreaFilled(false);
        dadoBtn.setBorderPainted(false);
        ProRojo.setOpaque(false);
        ProRojo.setContentAreaFilled(false);
        ProRojo.setBorderPainted(false);
        ProAmarillo.setOpaque(false);
        ProAmarillo.setContentAreaFilled(false);
        ProAmarillo.setBorderPainted(false);  
        ProVerde.setOpaque(false);
        ProVerde.setContentAreaFilled(false);
        ProVerde.setBorderPainted(false);  
        ProAzul.setOpaque(false);
        ProAzul.setContentAreaFilled(false);
        ProAzul.setBorderPainted(false);  

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        dadoBtn = new javax.swing.JButton();
        rojo = new javax.swing.JLabel();
        amarilla = new javax.swing.JLabel();
        azul = new javax.swing.JLabel();
        verde = new javax.swing.JLabel();
        TRojo = new javax.swing.JLabel();
        TAmarillo = new javax.swing.JLabel();
        TVerde = new javax.swing.JLabel();
        TAzul = new javax.swing.JLabel();
        nturno = new java.awt.Label();
        home = new javax.swing.JLabel();
        DinR = new java.awt.Label();
        DinA = new java.awt.Label();
        DinV = new java.awt.Label();
        DinAz = new java.awt.Label();
        ProRojo = new javax.swing.JButton();
        ProAmarillo = new javax.swing.JButton();
        ProVerde = new javax.swing.JButton();
        ProAzul = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        label2.setText("label2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dadoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 250, 70));

        rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/rojo.png"))); // NOI18N
        getContentPane().add(rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 600, 40, 70));

        amarilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/amarillo.png"))); // NOI18N
        getContentPane().add(amarilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, 40, 80));

        azul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/azul.png"))); // NOI18N
        getContentPane().add(azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/verde.png"))); // NOI18N
        getContentPane().add(verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        TRojo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/jRojoD.png"))); // NOI18N
        getContentPane().add(TRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 260, 50));

        TAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/jAmarilloD.png"))); // NOI18N
        getContentPane().add(TAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, -1, -1));

        TVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/jVerdeD.png"))); // NOI18N
        getContentPane().add(TVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, -1, -1));

        TAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/jAzulD.png"))); // NOI18N
        getContentPane().add(TAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        nturno.setBackground(new java.awt.Color(30, 102, 67));
        nturno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nturno.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        getContentPane().add(nturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 150, 120, 40));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 30, 60, 70));

        DinR.setBackground(new java.awt.Color(30, 102, 67));
        DinR.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        DinR.setText("$1500");
        getContentPane().add(DinR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 300, -1, -1));

        DinA.setBackground(new java.awt.Color(30, 102, 67));
        DinA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DinA.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        DinA.setText("$1500");
        getContentPane().add(DinA, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 340, -1, -1));

        DinV.setBackground(new java.awt.Color(30, 102, 67));
        DinV.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        DinV.setText("$1500");
        getContentPane().add(DinV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 390, -1, -1));

        DinAz.setBackground(new java.awt.Color(30, 102, 67));
        DinAz.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        DinAz.setText("$1500");
        getContentPane().add(DinAz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 440, -1, -1));

        ProRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProRojoActionPerformed(evt);
            }
        });
        getContentPane().add(ProRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 593, 70, 70));

        ProAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProAmarilloActionPerformed(evt);
            }
        });
        getContentPane().add(ProAmarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 70, 70));

        ProVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProVerdeActionPerformed(evt);
            }
        });
        getContentPane().add(ProVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 70, 70));

        ProAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProAzulActionPerformed(evt);
            }
        });
        getContentPane().add(ProAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 593, 80, 70));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Data1/monopoly.png"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoBtnActionPerformed
        int dado1;
        int dado2;//dado2
        int dado;
        boolean key = false;
        int caso = 6;
        //El vector representará [j1, j2, j3, j4], y las posiciones que tenga su turno ej: [3, 4, 1, 2]
        //turno++;
        //Buscar que posición del vector es (eliminar un jugador es hacer su atributo turno a 0; ej:
        //Se elimina el jugador 3 [3, 4, 0, 2] entonces en la busqueda si no lo encuentra tuno++, si es 
        //mayor a njugadores se reinicia, cuando busque arrojará la n posición que será para el swtich
        //De turno
        do {
            for (int i = 0; i < Variables.njugadores; i++) { //buscar en que posición está el turno actual
                if (Variables.vecTurnos[i] == turno) {
                    caso = i + 1;
                    key = true;//Si lo encuentra es true
                }

            }
            if (key == false) {//Si no lo encuentra avanza al siguiente turno 
                turno++;
            }
            if (turno == Variables.njugadores + 1) { //Si se pasa de la cantidad de jugadores lo reinicia
                turno = 1;
            }
        } while (key == false);//Lo hará hasta que encuentre una condición 
        switch (caso) {
            case 1:
                nturno.setText("Rojo");
                break;
            case 2:
                nturno.setText("Amarillo");
                break;
            case 3:
                nturno.setText("Verde");
                break;
            case 4:
                nturno.setText("Azul");
                break;
        }
        Variables.condition = condition(); //Verificar si algún jugador ganó o no
        if (Variables.condition == false) { //Si nadie ha ganado que siga el juego
            switch (caso) { //Corresponde a tu turno
                case 1:
                    if(Variables.jugador1.estado == 2){
                        String[] opciones  = {"PAGAR", "CANCELAR"};
                        int ventana = JOptionPane.showOptionDialog(null, "¿Quieres pagar $200 para salir de la carcel?",
                                    "Salir de la carcel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        switch(ventana){
                            case 0:
                                if(Variables.jugador1.dinero<=200){
                                    JOptionPane.showMessageDialog(null, "Dinero insuficiente");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Evadiste a la fiscalía con exito");
                                    Variables.jugador1.dinero = Variables.jugador1.dinero -200;
                                }
                                break;
                        }
                    }else{
                    dado1 = (int) ((Math.random()) * 60 / 10) + 1;//dado 1
                    dado2 = (int) ((Math.random()) * 60 / 10) + 1;//dado2
                    dado = dado1 + dado2;
                    dados(dado1, dado2);
                    mover(dado, rojo, Variables.jugador1); //Moverse
                    tablero.buscarn(Variables.jugador1, Variables.jugador2, Variables.jugador3, Variables.jugador4, rojo); //Buscar en el tablero/Comprar/Pagar/Cambiar tu estado
                    if (Variables.jugador1.dinero == 0) { //Si caieste a bancarrota...
                        rojo.setVisible(false); //Se desactiva tu fiha ... prox se desactiva tu label del dinero
                        DinR.setVisible(false);
                        Variables.vecTurnos[0] = 0; //Ya no estarás en los turnos pq nunca habrá un turno 0
                    }
                    DinR.setText("$" + Variables.jugador1.dinero);
                    DinA.setText("$" + Variables.jugador2.dinero);
                    DinV.setText("$" + Variables.jugador3.dinero);
                    DinAz.setText("$" + Variables.jugador4.dinero);
                    }
                    break;
                case 2:
                    if(Variables.jugador2.estado == 2){
                        String[] opciones  = {"PAGAR", "CANCELAR"};
                        int ventana = JOptionPane.showOptionDialog(null, "¿Quieres pagar $200 para salir de la carcel?",
                                    "Salir de la carcel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        switch(ventana){
                            case 0:
                                if(Variables.jugador2.dinero<=200){
                                    JOptionPane.showMessageDialog(null, "Dinero insuficiente");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Evadiste a la fiscalía con exito");
                                    Variables.jugador2.dinero = Variables.jugador2.dinero -200;
                                }
                                break;
                        }
                    }else{
                    dado1 = (int) ((Math.random()) * 60 / 10) + 1;//dado 1
                    dado2 = (int) ((Math.random()) * 60 / 10) + 1;//dado2
                    dado = dado1 + dado2;
                    dados(dado1, dado2);
                    mover(dado, amarilla, Variables.jugador2);
                    tablero.buscarn(Variables.jugador2, Variables.jugador1, Variables.jugador3, Variables.jugador4, amarilla);
                    if (Variables.jugador2.dinero == 0) {
                        amarilla.setVisible(false);
                        DinA.setVisible(false);
                        Variables.vecTurnos[1] = 0;
                    }
                    DinR.setText("$" + Variables.jugador1.dinero);
                    DinA.setText("$" + Variables.jugador2.dinero);
                    DinV.setText("$" + Variables.jugador3.dinero);
                    DinAz.setText("$" + Variables.jugador4.dinero);
            }
                    break;
                case 3:
                    if(Variables.jugador3.estado == 2){
                        String[] opciones  = {"PAGAR", "CANCELAR"};
                        int ventana = JOptionPane.showOptionDialog(null, "¿Quieres pagar $200 para salir de la carcel?",
                                    "Salir de la carcel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        switch(ventana){
                            case 0:
                                if(Variables.jugador3.dinero<=200){
                                    JOptionPane.showMessageDialog(null, "Dinero insuficiente");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Evadiste a la fiscalía con exito");
                                    Variables.jugador3.dinero = Variables.jugador3.dinero -200;
                                }
                                break;
                        }
                    }else{
                    dado1 = (int) ((Math.random()) * 60 / 10) + 1;//dado 1
                    dado2 = (int) ((Math.random()) * 60 / 10) + 1;//dado2
                    dado = dado1 + dado2;
                    dados(dado1, dado2);
                    mover(dado, verde, Variables.jugador3);
                    tablero.buscarn(Variables.jugador3, Variables.jugador1, Variables.jugador2, Variables.jugador4, verde);
                    if (Variables.jugador3.dinero == 0) {
                        verde.setVisible(false);
                        DinV.setVisible(false);
                        Variables.vecTurnos[2] = 0;
                    }
                    DinR.setText("$" + Variables.jugador1.dinero);
                    DinA.setText("$" + Variables.jugador2.dinero);
                    DinV.setText("$" + Variables.jugador3.dinero);
                    DinAz.setText("$" + Variables.jugador4.dinero);
                    }
                    break;
                case 4:
                    if(Variables.jugador4.estado == 2){
                        String[] opciones  = {"PAGAR", "CANCELAR"};
                        int ventana = JOptionPane.showOptionDialog(null, "¿Quieres pagar $200 para salir de la carcel?",
                                    "Salir de la carcel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
                        switch(ventana){
                            case 0:
                                if(Variables.jugador4.dinero<=200){
                                    JOptionPane.showMessageDialog(null, "Dinero insuficiente");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Evadiste a la fiscalía con exito");
                                    Variables.jugador4.dinero = Variables.jugador4.dinero -200;
                                }
                                break;
                        }
                    }else{
                    dado1 = (int) ((Math.random()) * 60 / 10) + 1;//dado 1
                    dado2 = (int) ((Math.random()) * 60 / 10) + 1;//dado2
                    dado = dado1 + dado2;
                    dados(dado1, dado2);
                    mover(dado, azul, Variables.jugador4);
                    tablero.buscarn(Variables.jugador4, Variables.jugador1, Variables.jugador2, Variables.jugador3, azul);
                    if (Variables.jugador4.dinero == 0) {
                        azul.setVisible(false);
                        DinAz.setVisible(false);
                        Variables.vecTurnos[3] = 0;
                    }
                    DinR.setText("$" + Variables.jugador1.dinero);
                    DinA.setText("$" + Variables.jugador2.dinero);
                    DinV.setText("$" + Variables.jugador3.dinero);
                    DinAz.setText("$" + Variables.jugador4.dinero);
                    }
                    break;
            }
        } else {
            //alguien ganó
            System.out.println("Alguien ganó");
            JOptionPane.showMessageDialog(null, "Alguien ganó", "CONGRATULATIONS!", JOptionPane.PLAIN_MESSAGE);        // TODO add your handling code here:        
        }
        turno++;
        
        if (turno == Variables.njugadores + 1) {
            turno = 1;
        }
        if(Variables.jugador1.estado == 2){
            Variables.jugador1.contador++;
            if(Variables.jugador1.contador ==4){
                Variables.jugador1.contador = 0;
                Variables.jugador1.estado = 0;
            }
        }
        if(Variables.jugador2.estado == 2){
            Variables.jugador2.contador++;
            if(Variables.jugador2.contador ==4){
                Variables.jugador2.contador = 0;
                Variables.jugador2.estado = 0;
            }
        }
        if(Variables.jugador3.estado == 2){
            Variables.jugador3.contador++;
            if(Variables.jugador3.contador ==4){
                Variables.jugador3.contador = 0;
                Variables.jugador3.estado = 0;
            }
        }
        if(Variables.jugador4.estado == 2){
            Variables.jugador4.contador++;
            if(Variables.jugador4.contador ==4){
                Variables.jugador4.contador = 0;
                Variables.jugador4.estado = 0;
            }
        }


    }//GEN-LAST:event_dadoBtnActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        Njugadores c = new Njugadores();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void ProRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProRojoActionPerformed
        // TODO add your handling code here:
        tablero.mostrarP(Variables.jugador1);
    }//GEN-LAST:event_ProRojoActionPerformed

    private void ProAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProAmarilloActionPerformed
        // TODO add your handling code here:
        tablero.mostrarP(Variables.jugador2);
    }//GEN-LAST:event_ProAmarilloActionPerformed

    private void ProVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProVerdeActionPerformed
        // TODO add your handling code here:
        tablero.mostrarP(Variables.jugador3);
    }//GEN-LAST:event_ProVerdeActionPerformed

    private void ProAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProAzulActionPerformed
        // TODO add your handling code here:
        tablero.mostrarP(Variables.jugador4);
    }//GEN-LAST:event_ProAzulActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label DinA;
    private java.awt.Label DinAz;
    private java.awt.Label DinR;
    private java.awt.Label DinV;
    private javax.swing.JButton ProAmarillo;
    private javax.swing.JButton ProAzul;
    private javax.swing.JButton ProRojo;
    private javax.swing.JButton ProVerde;
    private javax.swing.JLabel TAmarillo;
    private javax.swing.JLabel TAzul;
    private javax.swing.JLabel TRojo;
    private javax.swing.JLabel TVerde;
    private javax.swing.JLabel amarilla;
    private javax.swing.JLabel azul;
    private javax.swing.JButton dadoBtn;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel_wallpaper;
    private java.awt.Label label2;
    private java.awt.Label nturno;
    private javax.swing.JLabel rojo;
    private javax.swing.JLabel verde;
    // End of variables declaration//GEN-END:variables

    // metodo para los dados 
    public void dados(int dado1, int dado2) {
        ImageIcon icono = null;

        switch (dado1) { // ver las combinaciones 
            case 1:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/1,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/1,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/1,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/1,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/1,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/1,6.png"));
                        break;
                }
                break;
            case 2:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/2,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/2,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/2,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/2,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/2,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/2,6.png"));
                        break;
                }
                break;
            case 3:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/3,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/3,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/3,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/3,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/3,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/3,6.png"));
                        break;
                }
                break;
            case 4:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/4,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/4,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/4,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/4,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/4,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/4,6.png"));
                        break;
                }
                break;
            case 5:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/5,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/5,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/5,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/5,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/5,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/5,6.png"));
                        break;
                }
                break;
            case 6:
                switch (dado2) {
                    case 1:
                        icono = new ImageIcon(getClass().getResource("/dados/6,1.png"));
                        break;
                    case 2:
                        icono = new ImageIcon(getClass().getResource("/dados/6,2.png"));
                        break;
                    case 3:
                        icono = new ImageIcon(getClass().getResource("/dados/6,3.png"));
                        break;
                    case 4:
                        icono = new ImageIcon(getClass().getResource("/dados/6,4.png"));
                        break;
                    case 5:
                        icono = new ImageIcon(getClass().getResource("/dados/6,5.png"));
                        break;
                    case 6:
                        icono = new ImageIcon(getClass().getResource("/dados/6,6.png"));
                        break;
                }
                break;
        }
        JOptionPane.showMessageDialog(null, "", "DADOS", JOptionPane.PLAIN_MESSAGE, icono);
    }

    // metodo para mover el jugador, error con player 
    public void mover(int dado, JLabel rojo, Jugadores a) {
        //MOVIMIENTO DE UNA FICHA
        if ((a.posicion + dado >= 11 && a.posicion < 19) && a.posicion <= 10) { //para cuando dé la primera vuelta
            if (a.posicion + dado != 11) {
                do {
                    a.posicion++;
                    dado--;
                } while (a.posicion != 11);
            }
            //Si casualmente cae en 11 ya se situe acá
            a.x = 35;
            a.y = 540;
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if ((a.posicion + dado >= 21 && a.posicion < 29) && (a.posicion <= 19 && a.posicion > 10)) { //Para cuando de la primer vuelta
            if (a.posicion + dado != 21) {
                do {
                    a.posicion++;
                    dado--;

                } while (a.posicion != 21);
            }
            //Si casualmente cae en 21 ya se situe acá
            a.x = 90;
            a.y = 40;
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if ((a.posicion + dado >= 31 && a.posicion < 39) && (a.posicion <= 29 && a.posicion > 20)) {
            if (a.posicion + dado != 31) {
                do {
                    a.posicion++;
                    dado--;
                } while (a.posicion != 31);
            }
            a.x = 585;
            a.y = 95;
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if ((a.posicion + dado >= 41) && (a.posicion <= 39 && a.posicion > 30)) {
            if (a.posicion + dado != 41) {
                do {
                    a.posicion++;
                    dado--;
                } while (a.posicion != 41);

            }
            a.posicion = 1;
            a.x = 585 - 55;
            a.y = 603;
            rojo.setBounds(a.x, a.y, 35, 57);
            JOptionPane.showMessageDialog(null, "Gana 200");
            a.dinero = a.dinero + 200; // se le añade a la plata, los 200 de la salida 
        }

        a.posicion = a.posicion + dado; //Ya suma la pos del jugador con el dado
        if (a.posicion >= 0 && a.posicion <= 9) { //Si cae entre la a la 9
            a.x = a.x - (55 * dado);//mover x 55 pixeles
            rojo.setBounds(a.x, a.y, 35, 57);

        }
        if (a.posicion == 10) { // Si cae en la 10
            a.x = 35;
            rojo.setBounds(a.x, a.y, 35, 57);

        }
        if (a.posicion >= 12 && a.posicion <= 19) { //Si cae en la 12 a 19
            a.y = a.y - (55 * dado);
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if (a.posicion == 20) { //Si cae en la 20
            a.x = 35;
            a.y = 40;
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if (a.posicion >= 22 && a.posicion <= 29) { //Si cae de la 22 a la 29
            a.x = a.x + (55 * dado);
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if (a.posicion == 30) {
            a.x = 585;
            a.y = 40;
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if (a.posicion >= 32 && a.posicion <= 39) { //Si cae de la 32 a la 39
            a.y = a.y + (55 * dado);
            rojo.setBounds(a.x, a.y, 35, 57);
        }
        if (a.posicion == 40) {
            a.posicion = 0;
            a.x = 585;
            a.y = 603;
            rojo.setBounds(a.x, a.y, 35, 57);
            JOptionPane.showMessageDialog(null, "Gana 200");
            a.dinero = a.dinero + 200;
        }

    }

    public static boolean condition() {
        boolean condition = false;
        switch (Variables.njugadores) {
            case 2:
                //Caso que solo sean dos jugadores
                condition = (Variables.jugador1.estado == 0 && Variables.jugador2.estado == 1) || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 0);
                return condition;

            case 3:
                condition = (Variables.jugador1.estado == 0 && Variables.jugador2.estado == 1 && Variables.jugador3.estado == 1)
                        || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 0
                        && Variables.jugador3.estado == 1) || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 1 && Variables.jugador3.estado == 0);
                return condition;
            case 4:
                condition = (Variables.jugador1.estado == 0 && Variables.jugador2.estado == 1 && Variables.jugador3.estado == 1 && Variables.jugador4.estado == 1)
                        || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 0 && Variables.jugador3.estado == 1 && Variables.jugador4.estado == 1)
                        || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 1 && Variables.jugador3.estado == 0 && Variables.jugador4.estado == 1)
                        || (Variables.jugador1.estado == 1 && Variables.jugador2.estado == 1 && Variables.jugador3.estado == 1 && Variables.jugador4.estado == 0);
                return condition;

        }
        return condition;
    }
}
