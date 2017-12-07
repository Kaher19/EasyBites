/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.view;

import eb.controller.Controller;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kirbey
 */
public class View extends javax.swing.JFrame {
    private final DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column < 0;
            }
        };
    
private final ImageIcon ebIcon = new ImageIcon("src/eb/images/eb_Icon.png");
private final Image icon = ebIcon.getImage();

Controller control = new Controller();

    /**
     * Creates new form Model
     */
    public View() {
        initComponents();
        setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("EasyBites");
        this.setIconImage(icon);
        this.beginTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabWindow = new javax.swing.JFrame();
        twCancelBTN = new javax.swing.JButton();
        twTableScrollPane = new javax.swing.JScrollPane();
        twTable = new javax.swing.JTable();
        twSelecciónPlatilloLabel = new javax.swing.JLabel();
        mwEasyBitesLabel = new java.awt.Label();
        mwSeleccionProductosTPane = new javax.swing.JTabbedPane();
        mwProductosPane = new javax.swing.JPanel();
        mwEntradasBTN = new javax.swing.JButton();
        mwPostresBTN = new javax.swing.JButton();
        mwPlatosFuertesBTN = new javax.swing.JButton();
        mwBebidasBTN = new javax.swing.JButton();
        mwAdministracionPane = new javax.swing.JPanel();
        mwAgregarPlatilloLabel = new javax.swing.JLabel();
        mwTipoPlatilloCB = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        mwAgregarPlatilloLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        mwAgregarPlatilloLabel2 = new javax.swing.JLabel();

        tabWindow.setTitle("Seleccionar Platillos");
        tabWindow.setIconImage(getIconImage());
        tabWindow.setMinimumSize(new java.awt.Dimension(800, 600));
        tabWindow.setPreferredSize(new java.awt.Dimension(800, 600));

        twCancelBTN.setText("Cancelar");
        twCancelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twCancelBTNActionPerformed(evt);
            }
        });

        twTable.setModel(model);
        twTableScrollPane.setViewportView(twTable);

        twSelecciónPlatilloLabel.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        twSelecciónPlatilloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twSelecciónPlatilloLabel.setText("Seleccione platillo o bebida");
        twSelecciónPlatilloLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout tabWindowLayout = new javax.swing.GroupLayout(tabWindow.getContentPane());
        tabWindow.getContentPane().setLayout(tabWindowLayout);
        tabWindowLayout.setHorizontalGroup(
            tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(twCancelBTN))
                    .addComponent(twSelecciónPlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabWindowLayout.createSequentialGroup()
                        .addComponent(twTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGap(280, 280, 280)))
                .addContainerGap())
        );
        tabWindowLayout.setVerticalGroup(
            tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(twSelecciónPlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98)
                .addComponent(twTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(twCancelBTN)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        mwEasyBitesLabel.setAlignment(java.awt.Label.CENTER);
        mwEasyBitesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mwEasyBitesLabel.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        mwEasyBitesLabel.setText("EasyBites");

        mwSeleccionProductosTPane.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N

        mwProductosPane.setLayout(new java.awt.GridLayout(2, 3));

        mwEntradasBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwEntradasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Entrada.png"))); // NOI18N
        mwEntradasBTN.setText("Entradas");
        mwEntradasBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwEntradasBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwEntradasBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mwEntradasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwEntradasBTNActionPerformed(evt);
            }
        });
        mwProductosPane.add(mwEntradasBTN);

        mwPostresBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwPostresBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Dessert.png"))); // NOI18N
        mwPostresBTN.setText("Postres");
        mwPostresBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwPostresBTN.setDisabledIcon(null);
        mwPostresBTN.setDisabledSelectedIcon(null);
        mwPostresBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwPostresBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mwPostresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwPostresBTNActionPerformed(evt);
            }
        });
        mwProductosPane.add(mwPostresBTN);

        mwPlatosFuertesBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwPlatosFuertesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_PlatoFuerte.png"))); // NOI18N
        mwPlatosFuertesBTN.setText("Platos Fuertes");
        mwPlatosFuertesBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwPlatosFuertesBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwPlatosFuertesBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mwPlatosFuertesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwPlatosFuertesBTNActionPerformed(evt);
            }
        });
        mwProductosPane.add(mwPlatosFuertesBTN);

        mwBebidasBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwBebidasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Bebidas.png"))); // NOI18N
        mwBebidasBTN.setText("Bebidas");
        mwBebidasBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwBebidasBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwBebidasBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mwBebidasBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mwBebidasBTNActionPerformed(evt);
            }
        });
        mwProductosPane.add(mwBebidasBTN);

        mwSeleccionProductosTPane.addTab("Productos", mwProductosPane);

        mwAgregarPlatilloLabel.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        mwAgregarPlatilloLabel.setText("Agregar nuevo platillo o bebida");

        mwTipoPlatilloCB.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        mwTipoPlatilloCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entrada", "Plato Fuerte", "Postre", "Bebida" }));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField1.setText("Nuevo nombre");

        mwAgregarPlatilloLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        mwAgregarPlatilloLabel1.setText("Precio del platillo");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField2.setText("000.0");

        mwAgregarPlatilloLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        mwAgregarPlatilloLabel2.setText("Nombre del platillo");

        javax.swing.GroupLayout mwAdministracionPaneLayout = new javax.swing.GroupLayout(mwAdministracionPane);
        mwAdministracionPane.setLayout(mwAdministracionPaneLayout);
        mwAdministracionPaneLayout.setHorizontalGroup(
            mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                        .addComponent(mwAgregarPlatilloLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                                .addComponent(mwAgregarPlatilloLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(mwTipoPlatilloCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))))))
            .addGroup(mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(mwAgregarPlatilloLabel2)
                    .addContainerGap(607, Short.MAX_VALUE)))
        );
        mwAdministracionPaneLayout.setVerticalGroup(
            mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mwAgregarPlatilloLabel)
                .addGap(27, 27, 27)
                .addComponent(mwAgregarPlatilloLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mwTipoPlatilloCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(mwAdministracionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mwAdministracionPaneLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(mwAgregarPlatilloLabel2)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        mwSeleccionProductosTPane.addTab("Administración", mwAdministracionPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mwSeleccionProductosTPane)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(mwEasyBitesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mwEasyBitesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mwSeleccionProductosTPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void twCancelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twCancelBTNActionPerformed
        // TODO add your handling code here:
        tabWindow.setVisible(false);
    }//GEN-LAST:event_twCancelBTNActionPerformed

    private void mwEntradasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwEntradasBTNActionPerformed
        // TODO add your handling code here:
        this.beginTableWindow();
        this.limpiarTabla();
        this.loadTableData(this.loadTypeOfSauce("pe"));
    }//GEN-LAST:event_mwEntradasBTNActionPerformed

    private void mwPostresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwPostresBTNActionPerformed
        // TODO add your handling code here:
        this.beginTableWindow();
        this.limpiarTabla();
        this.loadTableData(this.loadTypeOfSauce("pp"));
    }//GEN-LAST:event_mwPostresBTNActionPerformed

    private void mwPlatosFuertesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwPlatosFuertesBTNActionPerformed
        // TODO add your handling code here:
        this.beginTableWindow();
        this.limpiarTabla();
        this.loadTableData(this.loadTypeOfSauce("pf"));
    }//GEN-LAST:event_mwPlatosFuertesBTNActionPerformed

    private void mwBebidasBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mwBebidasBTNActionPerformed
        // TODO add your handling code here:
        this.beginTableWindow();
        this.limpiarTabla();
        this.loadTableData(this.loadTypeOfSauce("pb"));
    }//GEN-LAST:event_mwBebidasBTNActionPerformed

    /*
    Funciones  creadas por mi
    */
    
    //Este metodo carga los datos para la tabla
    private void loadTableData(String[][] datos){
        twTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        twTable.doLayout();
        
        //Función que rellena los datos de la tabla con los datos obtenidos
        String[] line = new String[datos[0].length];
        for (String[] dato : datos) {
            for (int column = 0; column<line.length; column++) {
                line[column] = "" + dato[column];
            }
            model.addRow(line);
        }
    }
    
    //Método que inicializa la ventana tableWindow
    private void beginTableWindow(){
        tabWindow.setVisible(true);
        tabWindow.setLocationRelativeTo(null);
    }
    
    //Método que inicializa la tabla
    private void beginTable(){
        String platillos[] = control.getHeader();
        for (String platillo : platillos) {
            model.addColumn(platillo);
        }
    }
    
    private String[][] loadTypeOfSauce(String type){
        String[][] table = null;
        try {
            table = control.getAllTypeOfSauces(type);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        return table;
    }
    
    private void limpiarTabla(){
        int tableTotalRow = twTable.getRowCount();
        if (tableTotalRow != 0){ 
                //Una vez obtenido el table limpiamos la tabla
                for(int i = tableTotalRow-1; i >= 0; i--){
                    model.removeRow(i);
                }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel mwAdministracionPane;
    private javax.swing.JLabel mwAgregarPlatilloLabel;
    private javax.swing.JLabel mwAgregarPlatilloLabel1;
    private javax.swing.JLabel mwAgregarPlatilloLabel2;
    private javax.swing.JButton mwBebidasBTN;
    private java.awt.Label mwEasyBitesLabel;
    private javax.swing.JButton mwEntradasBTN;
    private javax.swing.JButton mwPlatosFuertesBTN;
    private javax.swing.JButton mwPostresBTN;
    private javax.swing.JPanel mwProductosPane;
    private javax.swing.JTabbedPane mwSeleccionProductosTPane;
    private javax.swing.JComboBox<String> mwTipoPlatilloCB;
    private javax.swing.JFrame tabWindow;
    private javax.swing.JButton twCancelBTN;
    private javax.swing.JLabel twSelecciónPlatilloLabel;
    private javax.swing.JTable twTable;
    private javax.swing.JScrollPane twTableScrollPane;
    // End of variables declaration//GEN-END:variables
}
