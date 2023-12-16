/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab8p2_marioocampo;

import java.awt.PopupMenu;
import static java.lang.Double.max;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author mario
 */
public class inicio extends javax.swing.JFrame {

    DefaultTableModel tabla = new DefaultTableModel();

    pg t1;

    int max = 0;
    int maximo = 0;

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();

        String[] titulos = new String[]{"Tipo", "Marca", "Precio", "Tiempo"};
        tabla.setColumnIdentifiers(titulos);
        tb1.setModel(tabla);
        tb2.setModel(tabla);
        tb3.setModel(tabla);
    }

    void agregar() {
        tabla.addRow(new Object[]{"-Japon-"});
        tabla.addRow(new Object[]{"Toyota", "Supra", 15000, 0});
        tabla.addRow(new Object[]{"Honda", "Civic", 10000, 0});
        tabla.addRow(new Object[]{"Mitsubishi", "Lancer", 11000, 0});
        tabla.addRow(new Object[]{"Nissan", "GTR", 16000, 0});
        tabla.addRow(new Object[]{"-Italia-"});
        tabla.addRow(new Object[]{"Ferrari", "La Ferrari", "50000", "0"});
        tabla.addRow(new Object[]{"Lamborghini", "Huracan", "46000", "0"});
        tabla.addRow(new Object[]{"-USA-"});
        tabla.addRow(new Object[]{"Ford", "Mustang", 25000, 0});
        tabla.addRow(new Object[]{"Chevrolet", "Camaro", 23000, 0});
        tabla.addRow(new Object[]{"Acora", "NSX", 20000, 0});
        tabla.addRow(new Object[]{"-Alemania-"});
        tabla.addRow(new Object[]{"BMW", "M3", 23000, 0});
        tabla.addRow(new Object[]{"Audi", "R8", 20000, 0});
        tabla.addRow(new Object[]{"Porche", "911 Carrera", 20000, 0});

    }

    class pg extends Thread {

        JProgressBar carga;
        JDialog menu;

        public pg(JProgressBar carga, JDialog menu) {
            this.carga = carga;
            this.menu = menu;
        }

        @Override
        public void run() {
            int min = 0;
            max = 10;

            carga.setMaximum(min);
            carga.setMaximum(max - 1);
            carga.setValue(0);

            for (int i = min; i < max; i++) {
                carga.setValue(i);

                try {
                    sleep(400);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(carga.getValue());
            if (carga.getValue() == max - 1) {

                for (Usuarios x : jugador) {
                    System.out.println("ajsda");
                    if (busqusuario.getText().equals(x.getUsuario()) && busqcontra.getText().equals(x.getPassword())) {
                        System.out.println("pija");
                        menu.setVisible(true);
                        menu.pack();
                        menu.setLocationRelativeTo(carga);

                    } else {
                        JOptionPane.showMessageDialog(null, "Este Usuario no existe");
                    }
                }
            }

        }

    }

    public void barra() {
        Thread t = new Thread() {
            public void run() {

            }

        };

    }

    class PG1 extends Thread {

        JProgressBar cargaCarro;
        JDialog Concesionaria;

        public PG1(JProgressBar cargaCarro, JDialog Concesionaria) {
            this.cargaCarro = cargaCarro;
            this.Concesionaria = Concesionaria;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            cargaCarro.setMaximum(minimo);
            cargaCarro.setMaximum(maximo - 1);
            cargaCarro.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                cargaCarro.setValue(i);

                try {
                    sleep(400);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(cargaCarro.getValue());
            if (cargaCarro.getValue() == maximo - 1) {
                agregar();

            }

        }

    }

    class PG2 extends Thread {

        JProgressBar pggaraje;
        JDialog garaje;

        public PG2(JProgressBar pggaraje, JDialog garaje) {
            this.pggaraje = pggaraje;
            this.garaje = garaje;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            pggaraje.setMaximum(minimo);
            pggaraje.setMaximum(maximo - 1);
            pggaraje.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                pggaraje.setValue(i);

                try {
                    sleep(400);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(pggaraje.getValue());

        }

    }

    class P1 extends Thread {

        Random random = new Random();
        int r = random.nextInt(601) + 400;

        JProgressBar C1;
        JDialog Carrera;

        public P1(JProgressBar C1, JDialog Carrera) {
            this.C1 = C1;
            this.Carrera = Carrera;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            C1.setMaximum(minimo);
            C1.setMaximum(maximo - 1);
            C1.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                C1.setValue(i);

                try {
                    sleep(r);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(C1.getValue());
            if (C1.getValue() == maximo - 1) {

            }

        }

    }

    class P2 extends Thread {

        Random random = new Random();
        int r = random.nextInt(601) + 400;

        JProgressBar C2;
        JDialog Carrera;

        public P2(JProgressBar C2, JDialog Carrera) {
            this.C2 = C2;
            this.Carrera = Carrera;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            C2.setMaximum(minimo);
            C2.setMaximum(maximo - 1);
            C2.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                C2.setValue(i);

                try {
                    sleep(r);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(C2.getValue());
            if (C2.getValue() == maximo - 1) {

            }

        }

    }

    class P3 extends Thread {

        Random random = new Random();
        int r = random.nextInt(601) + 400;

        JProgressBar C3;
        JDialog Carrera;

        public P3(JProgressBar C3, JDialog Carrera) {
            this.C3 = C3;
            this.Carrera = Carrera;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            C3.setMaximum(minimo);
            C3.setMaximum(maximo - 1);
            C3.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                C3.setValue(i);

                try {
                    sleep(r);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(C3.getValue());
            if (C3.getValue() == maximo - 1) {

            }

        }

    }

    class P4 extends Thread {

        Random random = new Random();
        int r = random.nextInt(601) + 400;

        JProgressBar C4;
        JDialog Carrera;

        public P4(JProgressBar C4, JDialog Carrera) {
            this.C4 = C4;
            this.Carrera = Carrera;
        }

        @Override
        public void run() {
            int minimo = 0;
            int maximo = 10;

            C4.setMaximum(minimo);
            C4.setMaximum(maximo - 1);
            C4.setValue(0);

            for (int i = minimo; i < maximo; i++) {
                C4.setValue(i);

                try {
                    sleep(r);
                } catch (InterruptedException ex) {
                    JOptionPane.showInputDialog("Error");
                }
            }
            System.out.println(C4.getValue());
            if (C4.getValue() == maximo - 1) {

            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        garaje = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        pggaraje = new javax.swing.JProgressBar();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Concesionaria = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cargaCarro = new javax.swing.JProgressBar();
        jButton9 = new javax.swing.JButton();
        Vender = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        Carrera = new javax.swing.JDialog();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        C1 = new javax.swing.JProgressBar();
        C2 = new javax.swing.JProgressBar();
        C3 = new javax.swing.JProgressBar();
        C4 = new javax.swing.JProgressBar();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        CB1 = new javax.swing.JComboBox<>();
        CB2 = new javax.swing.JComboBox<>();
        CB3 = new javax.swing.JComboBox<>();
        CB4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        carga = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        busqusuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        busqcontra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        menu.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("Garaje");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        menu.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Menu");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        menu.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 90));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("Concesionaria");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        menu.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("Vender Carros");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        menu.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setText("Carrera");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        menu.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));
        menu.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 10, 20));

        garaje.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Garaje");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        garaje.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 110));
        garaje.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 20, 20));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb2);

        garaje.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 360, 160));
        garaje.getContentPane().add(pggaraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 370, 10));

        jButton10.setText("Mostrar Carros");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        garaje.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jButton11.setText("Regresar");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        garaje.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        Concesionaria.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Concesionaria");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        Concesionaria.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 110));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tb1);

        Concesionaria.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 440, 180));
        Concesionaria.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 10, 20));

        jButton7.setText("Mostrar Carros");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        Concesionaria.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setText("Comprar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        Concesionaria.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 200, -1));
        Concesionaria.getContentPane().add(cargaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 380, 20));

        jButton9.setText("Regresar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        Concesionaria.getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        Vender.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Vender");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        Vender.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 90));

        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tb3);

        Vender.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 450, 190));
        Vender.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 10, 40));

        jButton12.setText("Regresar");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        Vender.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        Carrera.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Carrera.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 417, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setText("Carrera");
        Carrera.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));
        Carrera.getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 470, 30));
        Carrera.getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 470, 30));
        Carrera.getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 470, 30));
        Carrera.getContentPane().add(C4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 470, 30));

        jButton13.setText("Iniciar");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        Carrera.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Meta");
        Carrera.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supra", "Civic", "Lancer", "GTR", "La Ferrari", "Huracan", "Mustang", "Camaro", "NSX", "M3", "R8", "911 Carrera" }));
        Carrera.getContentPane().add(CB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        CB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supra", "Civic", "Lancer", "GTR", "La Ferrari", "Huracan", "Mustang", "Camaro", "NSX", "M3", "R8", "911 Carrera" }));
        Carrera.getContentPane().add(CB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        CB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supra", "Civic", "Lancer", "GTR", "La Ferrari", "Huracan", "Mustang", "Camaro", "NSX", "M3", "R8", "911 Carrera" }));
        Carrera.getContentPane().add(CB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        CB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supra", "Civic", "Lancer", "GTR", "La Ferrari", "Huracan", "Mustang", "Camaro", "NSX", "M3", "R8", "911 Carrera" }));
        Carrera.getContentPane().add(CB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Logn in");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 110, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sign Up");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 10, 340));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 10, 20));

        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setText("Contraseña:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 160, -1));
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, -1));

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        getContentPane().add(carga, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 240, 20));

        jLabel6.setText("Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));
        getContentPane().add(busqusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 170, -1));

        jLabel7.setText("Contraseña:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));
        getContentPane().add(busqcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 170, -1));

        jButton2.setText("Ingresar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Usuarios usuario1 = new Usuarios(usuario.getText(), contra.getText());
        jugador.add(usuario1);
        usuario.setText("");
        contra.setText("");


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        t1 = new pg(carga, menu);
        if (carga.getValue() == max - 1) {
            System.out.println("haha");
        }
        t1.start();


    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        garaje.setVisible(true);
        garaje.pack();
        garaje.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Concesionaria.setVisible(true);
        Concesionaria.pack();
        Concesionaria.setLocationRelativeTo(this);
        menu.setVisible(false);


    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        PG1 t2 = new PG1(cargaCarro, Concesionaria);
        t2.start();


    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        try {
            int obj = tb1.getSelectedRow();
            if (tb1.getSelectedRow() != -1) {
                DefaultTableModel model1 = (DefaultTableModel) tb1.getModel();
                DefaultTableModel model2 = (DefaultTableModel) tb2.getModel();
                Object[] rowData = new Object[model1.getColumnCount()];
                for (int i = 0; i < model1.getColumnCount(); i++) {
                    rowData[i] = model1.getValueAt(obj, i);
                }
                model1.removeRow(obj);
                model2.addRow(rowData);
                JOptionPane.showMessageDialog(null, "Compra exitosa");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }


    }//GEN-LAST:event_jButton8MouseClicked

    public void añadir() {
        int row = tb1.getSelectedRow();

    }


    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(this);
        Concesionaria.setVisible(false);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        PG2 t3 = new PG2(pggaraje, garaje);
        t3.start();
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(this);
        garaje.setVisible(false);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        Vender.setVisible(true);
        Vender.pack();
        Vender.setLocationRelativeTo(this);
        menu.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(this);
        Vender.setVisible(false);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        Carrera.setVisible(true);
        Carrera.pack();
        Carrera.setLocationRelativeTo(this);
        menu.setVisible(false);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        P1 t4 = new P1(C1, Carrera);
        t4.start();

        P2 t5 = new P2(C2, Carrera);
        t5.start();

        P3 t6 = new P3(C3, Carrera);
        t6.start();

        P4 t7 = new P4(C4, Carrera);
        t7.start();

        if (C1.getValue() > C2.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }

        if (C1.getValue() > C3.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }

        if (C1.getValue() > C4.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }

        if (C2.getValue() > C1.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C2.getValue() > C3.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C2.getValue() > C4.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C3.getValue() > C1.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C3.getValue() > C2.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C3.getValue() > C4.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C3.getValue() > C4.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C4.getValue() > C1.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C4.getValue() > C2.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
        if (C4.getValue() > C3.getValue()) {
            JOptionPane.showMessageDialog(null, "La primera posicion Gano!!!");
        }
    }//GEN-LAST:event_jButton13MouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar C1;
    private javax.swing.JProgressBar C2;
    private javax.swing.JProgressBar C3;
    private javax.swing.JProgressBar C4;
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JComboBox<String> CB2;
    private javax.swing.JComboBox<String> CB3;
    private javax.swing.JComboBox<String> CB4;
    private javax.swing.JDialog Carrera;
    private javax.swing.JDialog Concesionaria;
    private javax.swing.JDialog Vender;
    private javax.swing.JTextField busqcontra;
    private javax.swing.JTextField busqusuario;
    private javax.swing.JProgressBar carga;
    private javax.swing.JProgressBar cargaCarro;
    private javax.swing.JTextField contra;
    private javax.swing.JDialog garaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog menu;
    private javax.swing.JProgressBar pggaraje;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    ArrayList<Usuarios> jugador = new ArrayList();
    ArrayList<Object> carros = new ArrayList();

}
