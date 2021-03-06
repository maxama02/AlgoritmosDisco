/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificaciondisco;

import Clases.DatosNecesarios;
import Clases.Disco;
import Clases.OrdenaSegunAlgoritmos;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * GUI entrada datos para alimentar algoritmos
 *
 * @author Max Mena
 */
public class DatosPlanificacionDisco extends javax.swing.JFrame {

    /**
     * declaracion de variables
     */
    ArrayList<Disco> lista;
    // Funciones para la lista
    DefaultListModel Modelo = new DefaultListModel();
    String[] columnNames = {"Numeros en disco"};
    DatosNecesarios datosAnalisis;

    //Datos de Prueba
    Integer[] listaPrueba = {98, 183, 37, 122, 14, 124, 65, 67};
    int tamano = 199;
    int cabeza = 53;
    ArrayList <Integer> listaInt=new ArrayList <Integer>();
    
    //Datos para grafico
    //PanelLineas di;
    MarcoLineas mLineas;
    

    /**
     * Creates new form DatosPlanificacionDisco
     */
    public DatosPlanificacionDisco() {
        initComponents();
        Modelo.removeAllElements();
        jList.setModel(Modelo);
        lista = new ArrayList<Disco>();
        probarDatos();
    }

    /**
     * Funcion para probar la funcionalidad del sistema
     */
    public void probarDatos() {
        for (int i : listaPrueba) {
            lista.add(new Disco(i));
            Modelo.addElement(i);
        }
        txtUbicCabeza.setText("" + cabeza);
        txtTamanoDisco.setText("" + tamano);
        jList.setModel(Modelo);
    }

    /**
     * LLena el JList
     *
     * @param li ArrayList para llenar JList
     */
    public void Listar(ArrayList li) {
        Modelo.removeAllElements();
        ArrayList<Disco> data = li;
        for (int i = 0; i < data.size(); i++) {
            Modelo.addElement(data.get(i).getData());
        }
        jList.setModel(Modelo);
    }

    /**
     * Metodo para borrar los datos de los textBox
     * @param boton String
     */
    public void BorrarEspacios(String boton) {
        if (boton.equals("Insertar")) {
            this.txtNumeroConsulta.setValue(null);
            this.txtNumeroConsulta.requestFocus();
        } else if (boton.equals("Borrar")) {
            txtUbicCabeza.setValue(null);
            txtTamanoDisco.setValue(null);
            txtNumeroConsulta.setValue(null);
            Modelo.removeAllElements();
            jList.setModel(Modelo);
        }
    }

    /**
     * Deshabilita la edicion en los cuadros de texto
     *
     * @param est
     */
    public void estadoEditabilidad(boolean est) {
        txtUbicCabeza.setEnabled(est);
        txtTamanoDisco.setEnabled(est);
        txtNumeroConsulta.setEnabled(est);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroConsulta = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUbicCabeza = new javax.swing.JFormattedTextField();
        btnAgrega = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTamanoDisco = new javax.swing.JFormattedTextField();
        btnEjecutar = new javax.swing.JButton();
        btnBorrarTodo = new javax.swing.JButton();
        jLista = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Planificador de Disco");

        jLabel2.setText("Cosultas al disco:");

        txtNumeroConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setText("Direccion de Cabeza:");

        txtUbicCabeza.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnAgrega.setText("+");
        btnAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregaActionPerformed(evt);
            }
        });

        jLabel4.setText("Tamaño del Disco:");

        txtTamanoDisco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtTamanoDisco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnBorrarTodo.setText("Borrar");
        btnBorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList.setPreferredSize(new java.awt.Dimension(33, 20));
        jLista.setViewportView(jList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEjecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarTodo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumeroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgrega))
                    .addComponent(txtTamanoDisco)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUbicCabeza)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTamanoDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgrega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUbicCabeza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEjecutar)
                    .addComponent(btnBorrarTodo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Boton que agrega datos a la lista
     *
     * @param evt
     */
    private void btnAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregaActionPerformed
        int d = parseInt(this.txtNumeroConsulta.getText());

        if (parseInt(txtTamanoDisco.getText()) > d) {
            lista.add(new Disco(d));
            Listar(lista);
        } else {
            JOptionPane.showMessageDialog(null, "El valor ingresado no puede ser mayor que el tamaño del disco");
        }
        BorrarEspacios("Insertar");

    }//GEN-LAST:event_btnAgregaActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        //revisar que ninguno de los datos este vacio]
        if (this.txtUbicCabeza.isEditValid() && this.txtTamanoDisco.isEditValid() && 0 < this.jList.getComponentCount()) {
            datosAnalisis = new DatosNecesarios(parseInt(txtTamanoDisco.getText()), parseInt(txtUbicCabeza.getText()), lista);
            
            //FIFO
            System.out.println("FIFO");
            listaInt=new OrdenaSegunAlgoritmos(datosAnalisis).FIFO();
            
            for(int num:listaInt){
                System.out.println(num);
            }
            mLineas = new MarcoLineas(listaInt,parseInt(this.txtTamanoDisco.getText()),parseInt(this.txtUbicCabeza.getText()),"FIFO");
            mLineas.setVisible(true);
            
            //SSF
            System.out.println("SSF");
            listaInt=new OrdenaSegunAlgoritmos(datosAnalisis).SSF();
            
            for(int num:listaInt){
                System.out.println(num);
            }
            mLineas = new MarcoLineas(listaInt,parseInt(this.txtTamanoDisco.getText()),parseInt(this.txtUbicCabeza.getText()),"SSF");
            mLineas.setVisible(true);
            
            //SCAN
            System.out.println("SCAN");
            listaInt=new OrdenaSegunAlgoritmos(datosAnalisis).SCAN();
            
            for(int num:listaInt){
                System.out.println(num);
            }
            mLineas = new MarcoLineas(listaInt,parseInt(this.txtTamanoDisco.getText()),parseInt(this.txtUbicCabeza.getText()),"SCAN");
            mLineas.setVisible(true);
            
            //CSCAN
            System.out.println("CSCAN");
            listaInt=new OrdenaSegunAlgoritmos(datosAnalisis).CSCAN();
            
            for(int num:listaInt){
                System.out.println(num);
            }
            mLineas = new MarcoLineas(listaInt,parseInt(this.txtTamanoDisco.getText()),parseInt(this.txtUbicCabeza.getText()),"CSCAN");
            mLineas.setVisible(true);
            
            estadoEditabilidad(false);
        } else {
            JOptionPane.showMessageDialog(null, "Hace Falta algun dato.");
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnBorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTodoActionPerformed
        estadoEditabilidad(true);
        BorrarEspacios("Borrar");
    }//GEN-LAST:event_btnBorrarTodoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosPlanificacionDisco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosPlanificacionDisco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosPlanificacionDisco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosPlanificacionDisco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosPlanificacionDisco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrega;
    private javax.swing.JButton btnBorrarTodo;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jLista;
    private javax.swing.JFormattedTextField txtNumeroConsulta;
    private javax.swing.JFormattedTextField txtTamanoDisco;
    private javax.swing.JFormattedTextField txtUbicCabeza;
    // End of variables declaration//GEN-END:variables
}
