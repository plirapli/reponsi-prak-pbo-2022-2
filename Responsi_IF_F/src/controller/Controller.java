/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import dao.DAOInterface;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelLomba;
import model.TableModel;
import view.ViewMain;

/**
 *
 * @author Lab Informatika
 */
public class Controller {

    ViewMain view;
    DAOInterface dAOInterface;
    List<ModelLomba> list;

    public Controller(ViewMain view) {
        this.view = view;
        this.dAOInterface = new DAO();
    }

    public void readAllData() {
        list = dAOInterface.getAll();
        TableModel table = new TableModel(list);
        view.getTableLomba().setModel(table);
    }

    public void insertData() {
        String pesan = null;
        try {
            ModelLomba lomba = new ModelLomba();
            Double alur = Double.parseDouble(view.getInputAlur().getText());
            Double orisinalitas = Double.parseDouble(view.getInputOrisinalitas().getText());
            Double pemilihanKata = Double.parseDouble(view.getInputPemilihanKata().getText());
            if (alur < 0.0 || orisinalitas < 0.0 || pemilihanKata < 0.0) {
                throw new Exception("Minimal input adalah 0");
            }
            if (alur > 10.0 || orisinalitas > 10.0 || pemilihanKata > 10.0) {
                throw new Exception("Maksimal input adalah 10");
            }
            Double nilai = (alur + orisinalitas + pemilihanKata) / 3;
            String judul = view.getInputJudul().getText();

            String foundJudul = dAOInterface.getJudul(judul);
            if ("".equals(foundJudul)) {
                lomba.setJudul(view.getInputJudul().getText());
                lomba.setAlur(alur);
                lomba.setOrisinalitas(orisinalitas);
                lomba.setPemilihanKata(pemilihanKata);
                lomba.setNilai(nilai);
                dAOInterface.insert(lomba);

                pesan = "Data berhasil ditambahkan";
                readAllData();
                clearData();
            } else {
                throw new Exception("Judul tidak boleh ada yang sama!");
            }
        } catch (NumberFormatException e) {
            pesan = "Data yang diinputkan harus angka!";
        } catch (Exception e) {
            pesan = "Data gagal ditambahkan! (" + e.getMessage() + ")";
        } finally {
            JOptionPane.showMessageDialog(null, pesan);
        }
    }

    public void updateData() {
        String pesan = null;
        try {
            ModelLomba lomba = new ModelLomba();
            Double alur = Double.parseDouble(view.getInputAlur().getText());
            Double orisinalitas = Double.parseDouble(view.getInputOrisinalitas().getText());
            Double pemilihanKata = Double.parseDouble(view.getInputPemilihanKata().getText());
            String judul = view.getInputJudul().getText();

            if (alur < 0.0 || orisinalitas < 0.0 || pemilihanKata < 0.0) {
                throw new Exception("Minimal input adalah 0");
            }
            if (alur > 10.0 || orisinalitas > 10.0 || pemilihanKata > 10.0) {
                throw new Exception("Maksimal input adalah 10");
            }
            Double nilai = (alur + orisinalitas + pemilihanKata) / 3;

            lomba.setAlur(alur);
            lomba.setOrisinalitas(orisinalitas);
            lomba.setPemilihanKata(pemilihanKata);
            lomba.setNilai(nilai);

            if (judul.equals(view.getSelectedJudul())) {
                lomba.setJudul(judul);
                dAOInterface.update(lomba);
                pesan = "Data berhasil diubah";
                readAllData();
                clearData();
            } else {
                throw new Exception("Judul tidak boleh diubah!");
            }
        } catch (NumberFormatException e) {
            pesan = "Data yang diinputkan harus angka!";
        } catch (Exception e) {
            pesan = "Data gagal diubah! (" + e.getMessage() + ")";
        } finally {
            JOptionPane.showMessageDialog(null, pesan);
        }
    }

    public void deleteData() {
        String judul = view.getInputJudul().getText();
        dAOInterface.delete(judul);
        readAllData();
        clearData();
        JOptionPane.showMessageDialog(null, "Berhasil menghapus data"
        );
    }

    public void searchData() {
        String keyword = "%" + view.getInputCari().getText() + "%";
        list = dAOInterface.search(keyword);
        TableModel table = new TableModel(list);
        view.getTableLomba().setModel(table);
    }

    public void selectFieldData(int row) {
        view.setSelectedJudul(list.get(row).getJudul());
        view.getInputJudul().setText(list.get(row).getJudul());
        view.getInputAlur().setText(list.get(row).getAlur().toString());
        view.getInputOrisinalitas().setText(list.get(row).getOrisinalitas().toString());
        view.getInputPemilihanKata().setText(list.get(row).getPemilihanKata().toString());
    }

    public void clearData() {
        view.getInputJudul().setText("");
        view.getInputAlur().setText("");
        view.getInputOrisinalitas().setText("");
        view.getInputPemilihanKata().setText("");
    }
}
