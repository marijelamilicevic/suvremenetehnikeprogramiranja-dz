/**
 * @version Domaca zadaca 10B
 * @author Marijela Milicevic, FIPU - nastavni smjer
 */
package hr.unipu.java;
import javafx.scene.control.ColorPicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrameB() {
        initComponents();
    }

    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;

    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel02;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel04;

    private javax.swing.JTextField jTextField01;
    private javax.swing.JTextField jTextField02;
    private javax.swing.JTextField jTextField03;

    private void initComponents() {

        jButton01 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton04 = new javax.swing.JButton();

        jLabel01 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jLabel04 = new javax.swing.JLabel();

        jTextField01 = new javax.swing.JTextField();
        jTextField02 = new javax.swing.JTextField();
        jTextField03 = new javax.swing.JTextField();

        jTextField01.setBackground(Color.orange);
        jTextField02.setBackground(Color.orange);
        jTextField03.setBackground(Color.orange);

        jButton01.setBackground(Color.orange);
        jButton02.setBackground(Color.orange);
        jButton03.setBackground(Color.orange);
        jButton04.setBackground(Color.orange);
        jTextField01.setCaretColor(Color.orange);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel01.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel01.setText("Upišite 1. broj:");
        jLabel02.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel02.setText("Upišite 2. broj:");
        jLabel03.setFont(new java.awt.Font("Times New Roman", 1, 16));
        jLabel03.setText("Rezultat: ");
        jLabel04.setFont(new java.awt.Font("Times New Roman", 1, 20));
        jLabel04.setText("Kalkulator");


        jButton01.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton01.setText("Zbrajanje + ");
        jButton02.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton02.setText("Oduzimanje");
        jButton03.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton03.setText("Množenje");
        jButton04.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton04.setText("Dijeljenje");

        jTextField01.setFont(new java.awt.Font("Times New Roman", 1, 10));
        jTextField02.setFont(new java.awt.Font("Times New Roman", 1, 10));
        jTextField03.setFont(new java.awt.Font("Times New Roman", 1, 10));

        getContentPane().setBackground(Color.lightGray);

        jButton01.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2 = Double.parseDouble(jTextField02.getText());

                new Calculate(broj1, broj2).execute();
            }
        });

        jButton02.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2 = Double.parseDouble(jTextField02.getText());
                new Calculate1(broj1, broj2).execute();
            }
        });

        jButton03.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2 = Double.parseDouble(jTextField02.getText());

                new Calculate2(broj1, broj2).execute();
            }
        });

        jButton04.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){

                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2 = Double.parseDouble(jTextField02.getText());

                new Calculate3(broj1, broj2).execute();
            }
        });

        javax.swing.GroupLayout layout = new
                javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(layout.createSequentialGroup()

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                                        .addGroup(layout.createSequentialGroup()

                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel03)
                                                                                .addGap(45, 45, 45)
                                                                                .addComponent(jTextField03, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))

                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                layout.createSequentialGroup()
                                                                                        .addComponent(jButton01)
                                                                                        .addGap(5, 5, 5)
                                                                                        .addComponent(jButton02)))

                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton03)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(jButton04))

                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel02)
                                                                        .addComponent(jLabel01))
                                                                .addGap(20, 20, 20)

                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField01, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                                                        .addComponent(jTextField02)))))

                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(jLabel04, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(

                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel04)
                                .addGap(55, 55, 55)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                        .addGroup(layout.createSequentialGroup()

                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                                        .addComponent(jLabel01)
                                                        .addComponent(jTextField01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel02))
                                        .addComponent(jTextField02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton01)
                                        .addComponent(jButton02)
                                        .addComponent(jButton03)
                                        .addComponent(jButton04))
                                .addGap(35, 35, 35)

                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel03)
                                        .addComponent(jTextField03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))
        );
        pack();
    }

    public class Calculate extends SwingWorker<Double, Double>{
        private final double broj1;
        private final double broj2;
        public Calculate(double broj1, double broj2){
            this.broj1 = broj1;
            this.broj2 = broj2;
        }

        @Override
        protected Double doInBackground() throws Exception{

            double rezultat = 0.0;

            if(jButton01.isEnabled()) {

                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2;
                broj2 = Double.parseDouble(jTextField02.getText());
                rezultat = broj1 + broj2;
                jTextField03.setText(Double.toString(rezultat));
                return rezultat;
            }
            return rezultat;
        }

        @Override
        protected void done(){
            try{
                jTextField03.setText(String.valueOf(this.get()));

            }
            catch (Exception ex){
            }
        }
    }

    public class Calculate1 extends SwingWorker<Double, Double> {
        private final double broj1;
        private final double broj2;
        public Calculate1(double broj1, double broj2){
            this.broj1 = broj1;
            this.broj2 = broj2;
        }

        @Override
        protected Double doInBackground() throws Exception {
            double rezultat = 0.0;
            if(jButton02.isEnabled()){
                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2;
                broj2 = Double.parseDouble(jTextField02.getText());
                rezultat = broj1-broj2;
                jTextField03.setText(Double.toString(rezultat));
                return rezultat;
            }
            return rezultat;

        }
    }


    public class Calculate2 extends SwingWorker<Double, Double> {
        private final double broj1;
        private final double broj2;
        public Calculate2(double broj1, double broj2){
            this.broj1 = broj1;
            this.broj2 = broj2;
        }

        @Override
        protected Double doInBackground() throws Exception {
            double rezultat = 0.0;
            if(jButton03.isEnabled()){
                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2;
                broj2 = Double.parseDouble(jTextField02.getText());
                rezultat = broj1*broj2;
                jTextField03.setText(Double.toString(rezultat));
                return rezultat;
            }
            return rezultat;
        }
    }


    public class Calculate3 extends SwingWorker<Double, Double> {
        private final double broj1;
        private final double broj2;

        public Calculate3(double broj1, double broj2) {
            this.broj1 = broj1;
            this.broj2 = broj2;
        }

        protected Double doInBackground() throws Exception {
            double rezultat = 0.0;
            if(jButton04.isEnabled()){
                double broj1 = Double.parseDouble(jTextField01.getText());
                double broj2;
                broj2 = Double.parseDouble(jTextField02.getText());
                rezultat = broj1/broj2;
                jTextField03.setText(Double.toString(rezultat));
                return rezultat;
            }
            return rezultat;
        }
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent event){
    }
}