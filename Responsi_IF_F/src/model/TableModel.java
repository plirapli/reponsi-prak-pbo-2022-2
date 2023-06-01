/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class TableModel extends AbstractTableModel {

    List<ModelLomba> list;

    public TableModel(List<ModelLomba> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Judul";
            case 1:
                return "Alur";
            case 2:
                return "Orisinalitas";
            case 3:
                return "Pemilihan Kata";
            case 4:
                return "Nilai";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getJudul();
            case 1:
                return list.get(rowIndex).getAlur();
            case 2:
                return list.get(rowIndex).getOrisinalitas();
            case 3:
                return list.get(rowIndex).getPemilihanKata();
            case 4:
                return list.get(rowIndex).getNilai();
            default:
                return null;
        }
    }
}
