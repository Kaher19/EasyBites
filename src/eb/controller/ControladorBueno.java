/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.controller;

import eb.model.Model;
import eb.model.Platillos;
import eb.view.View;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kirbey
 */
public class ControladorBueno implements ActionListener, FocusListener {

    private static Model model;
    private static View view;

    public ControladorBueno() {
        model = new Model();
        view = new View();

        view.getMwEntradasBTN().addActionListener(this);
        view.getMwBebidasBTN().addActionListener(this);
        view.getMwPlatosFuertesBTN().addActionListener(this);
        view.getMwPostresBTN().addActionListener(this);
        view.getAtTipoPlatilloCB().addActionListener(this);
        view.getTwCancelBTN().addActionListener(this);
        view.getAtPrecioFTF().addActionListener(this);
        view.getAtAreaNombreTF().addActionListener(this);
        view.getAtAgregarBTN().addActionListener(this);
        view.getEliminarBtn().addActionListener(this);

        view.getAtAreaNombreTF().addFocusListener(this);
        view.getAtPrecioFTF().addFocusListener(this);
        view.getPlatillosTable().addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {

        if (view.getMwEntradasBTN() == evt.getSource()) {
            getPlatillosPorTipo("Entrada");
        }

        if (view.getMwPlatosFuertesBTN() == evt.getSource()) {
            getPlatillosPorTipo("Plato Fuerte");
        }

        if (view.getMwPostresBTN() == evt.getSource()) {
            getPlatillosPorTipo("Postre");
        }

        if (view.getMwBebidasBTN() == evt.getSource()) {
            getPlatillosPorTipo("Bebida");
        }

        if (view.getTwCancelBTN() == evt.getSource()) {
            view.getTabWindow().setVisible(false);
        }

        if (view.getAtTipoPlatilloCB() == evt.getSource()) {
            ((Component) evt.getSource()).transferFocus();
        }

        if (view.getAtAreaNombreTF() == evt.getSource()) {
            ((Component) evt.getSource()).transferFocus();
        }

        if (view.getAtPrecioFTF() == evt.getSource()) {
            ((Component) evt.getSource()).transferFocus();
        }

        if (view.getAtAgregarBTN() == evt.getSource()) {
            JComboBox selector = view.getAtTipoPlatilloCB();

            String nombre = view.getAtAreaNombreTF().getText();
            double valor = Double.parseDouble(view.getAtPrecioFTF().getText());
            String tipo = String.valueOf(selector.getItemAt(selector.getSelectedIndex()));

            Platillos nPlat = new Platillos(nombre, valor, tipo);
            if (agregarPlatillo(nPlat) != -1) {
                JOptionPane.showMessageDialog(view, "Se agregó el elemento: " + nombre, "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "No se agregó el elemento: " + nombre, "Operación fallida", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        if (view.getEliminarBtn() == evt.getSource()) {
            try {
                String nombre = view.getPlatillosTable().getModel().getValueAt(view.getPlatillosTable().getSelectedRow(), 0).toString();
                if (eliminarPlatillo(nombre) != 0) {
                    JOptionPane.showMessageDialog(view, "Se eliminó el elemento: " + nombre, "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(view, "No se encontró el elemento: " + nombre, "No hubo eliminaciones", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, ex.getMessage(), ex.getClass().toString(), JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    @Override
    public void focusLost(FocusEvent evt) {

        if (view.getAtAreaNombreTF() == evt.getSource()) {
            if (view.getAtAreaNombreTF().getText().equals("")) {
                view.getAtAreaNombreTF().setText("Nuevo nombre");
            }
        }

        if (view.getPlatillosTable() == evt.getSource()) {
//            view.getEliminarBtn().setEnabled(false);
        }

    }

    @Override
    public void focusGained(FocusEvent evt) {

        if (view.getAtAreaNombreTF() == evt.getSource()) {
            if (view.getAtAreaNombreTF().getText().equals("Nuevo nombre")) {
                view.getAtAreaNombreTF().setText("");
            }

        }

        if (view.getAtPrecioFTF() == evt.getSource()) {
            if (view.getAtPrecioFTF().getValue() == null || view.getAtPrecioFTF().getValue().equals(0)) {
                view.getAtPrecioFTF().setValue(null);
            }
        }

        if (view.getPlatillosTable() == evt.getSource()) {
            view.getEliminarBtn().setEnabled(true);
        }

    }

    //Funciones propias
    private void getPlatillosPorTipo(String tipo) {
        ArrayList<Platillos> listaUsuarios;
        JTable tablaPlatillos = view.getPlatillosTable();
        DefaultTableModel tableModel = (DefaultTableModel) tablaPlatillos.getModel();
        Object[] fila = new Object[tableModel.getColumnCount()];
        try {
            listaUsuarios = model.getFromDBTipoPlatillos(tipo);
            view.initSecondaryWindow();

            clearTableModel(tableModel);

            for (int i = 0; i < listaUsuarios.size(); i++) {
                fila[0] = listaUsuarios.get(i).getNombre();
                fila[1] = listaUsuarios.get(i).getPrecio();

                tableModel.addRow(fila);
            }
            tablaPlatillos.setModel(tableModel);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(), "SQLException", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(), "FileNotFoundException", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearTableModel(javax.swing.table.DefaultTableModel modelo) {
        int size = modelo.getRowCount();
        if (size > 0) {

            for (int i = 0; i < size; i++) {
                modelo.removeRow(0);
            }

        }
    }

    private int agregarPlatillo(Platillos platillo) {
        int resultado = -1;
        try {
            resultado = model.addNewPlatillo(platillo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(), "SQLException", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage(), "FileNotFoundException", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    private int eliminarPlatillo(String nombre) throws SQLException, FileNotFoundException {
        Platillos platillo = new Platillos(nombre, 0, null);
        int respuesta = model.deletePlatillo(platillo);

        return respuesta;
    }

}
