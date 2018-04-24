/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Kirbey
 */
public class View extends javax.swing.JFrame {

    /**
     * Creamos la forma View()
     */
    public View() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("EasyBites");
    }

    public void initSecondaryWindow() {
        tabWindow.setVisible(true);
        tabWindow.setTitle("Lista de platillos");
        tabWindow.setLocationRelativeTo(null);
    }

    public JButton getMwEntradasBTN() {
        return mwEntradasBTN;
    }

    public JButton getMwBebidasBTN() {
        return mwBebidasBTN;
    }

    public JButton getMwPlatosFuertesBTN() {
        return mwPlatosFuertesBTN;
    }

    public JButton getMwPostresBTN() {
        return mwPostresBTN;
    }

    public JTable getPlatillosTable() {
        return platillosTable;
    }

    public JComboBox<String> getAtTipoPlatilloCB() {
        return atTipoPlatilloCB;
    }

    public JButton getTwCancelBTN() {
        return twCancelBTN;
    }

    public JFrame getTabWindow() {
        return tabWindow;
    }

    public JTextField getAtAreaNombreTF() {
        return atAreaNombreTF;
    }
    public JButton getAtAgregarBTN() {
        return atAgregarBTN;
    }

    public JFormattedTextField getAtPrecioFTF() {
        return atPrecioFTF;
    }

    public JButton getEliminarBtn() {
        return EliminarBtn;
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
        platillosTable = new javax.swing.JTable();
        twSelecciónPlatilloLabel = new javax.swing.JLabel();
        cantidadProductoSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        EliminarBtn = new javax.swing.JButton();
        mwEasyBitesLabel = new java.awt.Label();
        mwSeleccionProductosTPane = new javax.swing.JTabbedPane();
        productosTab = new javax.swing.JPanel();
        mwEntradasBTN = new javax.swing.JButton();
        mwPostresBTN = new javax.swing.JButton();
        mwPlatosFuertesBTN = new javax.swing.JButton();
        mwBebidasBTN = new javax.swing.JButton();
        listaPedidosTab = new javax.swing.JPanel();
        ltSelectorMesaCB = new javax.swing.JComboBox<>();
        ltSelectMesaTableScrollPane = new javax.swing.JScrollPane();
        pedidosTable = new javax.swing.JTable();
        lptTotalLabel = new javax.swing.JLabel();
        lptTotalTextField = new javax.swing.JTextField();
        administracionTab = new javax.swing.JPanel();
        atAgregarPlatilloLabel = new javax.swing.JLabel();
        atTipoPlatilloCB = new javax.swing.JComboBox<>();
        atAreaNombreTF = new javax.swing.JTextField();
        mwPrecioPlatilloLabel = new javax.swing.JLabel();
        atAgregarPlatilloLabel2 = new javax.swing.JLabel();
        atAgregarBTN = new javax.swing.JButton();
        atPrecioFTF = new javax.swing.JFormattedTextField();

        tabWindow.setTitle("Seleccionar Platillos");
        tabWindow.setIconImage(getIconImage());
        tabWindow.setMinimumSize(new java.awt.Dimension(800, 600));

        twCancelBTN.setText("Cancelar");

        platillosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platillo", "Precio"
            }
        ));
        platillosTable.getTableHeader().setReorderingAllowed(false);
        twTableScrollPane.setViewportView(platillosTable);

        twSelecciónPlatilloLabel.setFont(new java.awt.Font("MV Boli", 0, 48)); // NOI18N
        twSelecciónPlatilloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twSelecciónPlatilloLabel.setText("Seleccione platillo o bebida");
        twSelecciónPlatilloLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cantidadProductoSpinner.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setText("Seleccionar cantidad");

        EliminarBtn.setText("Eliminar");
        EliminarBtn.setEnabled(false);

        javax.swing.GroupLayout tabWindowLayout = new javax.swing.GroupLayout(tabWindow.getContentPane());
        tabWindow.getContentPane().setLayout(tabWindowLayout);
        tabWindowLayout.setHorizontalGroup(
            tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabWindowLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(cantidadProductoSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(twTableScrollPane)
                    .addComponent(twSelecciónPlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabWindowLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EliminarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(twCancelBTN)))
                .addContainerGap())
        );
        tabWindowLayout.setVerticalGroup(
            tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(twSelecciónPlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57)
                .addGroup(tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidadProductoSpinner))
                .addGap(18, 18, 18)
                .addComponent(twTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(tabWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twCancelBTN)
                    .addComponent(EliminarBtn))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(800, 600));

        mwEasyBitesLabel.setAlignment(java.awt.Label.CENTER);
        mwEasyBitesLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mwEasyBitesLabel.setFont(new java.awt.Font("MV Boli", 1, 48)); // NOI18N
        mwEasyBitesLabel.setText("EasyBites");

        mwSeleccionProductosTPane.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N

        productosTab.setLayout(new java.awt.GridLayout(2, 3));

        mwEntradasBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwEntradasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Entrada.png"))); // NOI18N
        mwEntradasBTN.setText("Entradas");
        mwEntradasBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwEntradasBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwEntradasBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productosTab.add(mwEntradasBTN);

        mwPostresBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwPostresBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Dessert.png"))); // NOI18N
        mwPostresBTN.setText("Postres");
        mwPostresBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwPostresBTN.setDisabledIcon(null);
        mwPostresBTN.setDisabledSelectedIcon(null);
        mwPostresBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwPostresBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productosTab.add(mwPostresBTN);

        mwPlatosFuertesBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwPlatosFuertesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_PlatoFuerte.png"))); // NOI18N
        mwPlatosFuertesBTN.setText("Platos Fuertes");
        mwPlatosFuertesBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwPlatosFuertesBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwPlatosFuertesBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productosTab.add(mwPlatosFuertesBTN);

        mwBebidasBTN.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        mwBebidasBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eb/images/eb_Bebidas.png"))); // NOI18N
        mwBebidasBTN.setText("Bebidas");
        mwBebidasBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mwBebidasBTN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mwBebidasBTN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        productosTab.add(mwBebidasBTN);

        mwSeleccionProductosTPane.addTab("Productos", productosTab);

        ltSelectorMesaCB.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        ltSelectorMesaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4" }));

        ltSelectMesaTableScrollPane.setViewportView(pedidosTable);

        lptTotalLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lptTotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lptTotalLabel.setText("Total:    $");

        lptTotalTextField.setEditable(false);
        lptTotalTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lptTotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lptTotalTextField.setText("0.00");

        javax.swing.GroupLayout listaPedidosTabLayout = new javax.swing.GroupLayout(listaPedidosTab);
        listaPedidosTab.setLayout(listaPedidosTabLayout);
        listaPedidosTabLayout.setHorizontalGroup(
            listaPedidosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listaPedidosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaPedidosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ltSelectMesaTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(listaPedidosTabLayout.createSequentialGroup()
                        .addComponent(lptTotalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lptTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(45, 45, 45)
                .addComponent(ltSelectorMesaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        listaPedidosTabLayout.setVerticalGroup(
            listaPedidosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listaPedidosTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listaPedidosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ltSelectorMesaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(listaPedidosTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lptTotalLabel)
                        .addComponent(lptTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ltSelectMesaTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
        );

        mwSeleccionProductosTPane.addTab("Lista de pedidos", listaPedidosTab);

        atAgregarPlatilloLabel.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        atAgregarPlatilloLabel.setText("Agregar nuevo platillo o bebida");

        atTipoPlatilloCB.setFont(new java.awt.Font("MV Boli", 0, 12)); // NOI18N
        atTipoPlatilloCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Entrada", "Plato Fuerte", "Postre", "Bebida" }));

        atAreaNombreTF.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        atAreaNombreTF.setText("Nuevo nombre");

        mwPrecioPlatilloLabel.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        mwPrecioPlatilloLabel.setText("Precio del platillo");

        atAgregarPlatilloLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        atAgregarPlatilloLabel2.setText("Nombre del platillo");

        atAgregarBTN.setText("Agregar...");

        atPrecioFTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        atPrecioFTF.setText("0");
        atPrecioFTF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        atPrecioFTF.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N

        javax.swing.GroupLayout administracionTabLayout = new javax.swing.GroupLayout(administracionTab);
        administracionTab.setLayout(administracionTabLayout);
        administracionTabLayout.setHorizontalGroup(
            administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administracionTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(administracionTabLayout.createSequentialGroup()
                        .addComponent(atAgregarPlatilloLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(administracionTabLayout.createSequentialGroup()
                        .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(administracionTabLayout.createSequentialGroup()
                                .addComponent(atAgregarBTN)
                                .addGap(168, 168, 168))
                            .addGroup(administracionTabLayout.createSequentialGroup()
                                .addComponent(atAreaNombreTF)
                                .addGap(44, 44, 44)))
                        .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mwPrecioPlatilloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atPrecioFTF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(atTipoPlatilloCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(administracionTabLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(atAgregarPlatilloLabel2)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );
        administracionTabLayout.setVerticalGroup(
            administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(administracionTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atAgregarPlatilloLabel)
                .addGap(27, 27, 27)
                .addComponent(mwPrecioPlatilloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atTipoPlatilloCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atAreaNombreTF)
                    .addComponent(atPrecioFTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(atAgregarBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(administracionTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(administracionTabLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(atAgregarPlatilloLabel2)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        mwSeleccionProductosTPane.addTab("Administración", administracionTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mwSeleccionProductosTPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarBtn;
    private javax.swing.JPanel administracionTab;
    private javax.swing.JButton atAgregarBTN;
    private javax.swing.JLabel atAgregarPlatilloLabel;
    private javax.swing.JLabel atAgregarPlatilloLabel2;
    private javax.swing.JTextField atAreaNombreTF;
    private javax.swing.JFormattedTextField atPrecioFTF;
    private javax.swing.JComboBox<String> atTipoPlatilloCB;
    private javax.swing.JSpinner cantidadProductoSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel listaPedidosTab;
    private javax.swing.JLabel lptTotalLabel;
    private javax.swing.JTextField lptTotalTextField;
    private javax.swing.JScrollPane ltSelectMesaTableScrollPane;
    private javax.swing.JComboBox<String> ltSelectorMesaCB;
    private javax.swing.JButton mwBebidasBTN;
    private java.awt.Label mwEasyBitesLabel;
    private javax.swing.JButton mwEntradasBTN;
    private javax.swing.JButton mwPlatosFuertesBTN;
    private javax.swing.JButton mwPostresBTN;
    private javax.swing.JLabel mwPrecioPlatilloLabel;
    private javax.swing.JTabbedPane mwSeleccionProductosTPane;
    private javax.swing.JTable pedidosTable;
    private javax.swing.JTable platillosTable;
    private javax.swing.JPanel productosTab;
    private javax.swing.JFrame tabWindow;
    private javax.swing.JButton twCancelBTN;
    private javax.swing.JLabel twSelecciónPlatilloLabel;
    private javax.swing.JScrollPane twTableScrollPane;
    // End of variables declaration//GEN-END:variables
}
