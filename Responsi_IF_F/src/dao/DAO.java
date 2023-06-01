/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import helper.Connector;
import java.util.List;
import model.ModelLomba;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Lab Informatika
 */
public class DAO implements DAOInterface {

    Connection connect;

    public DAO() {
        this.connect = Connector.getConnection();
    }

    @Override
    public List<ModelLomba> getAll() {
        final String get = "SELECT * FROM lomba;";
        List<ModelLomba> list = null;

        try {
            list = new ArrayList<>();
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(get);
            while (rs.next()) {
                ModelLomba lomba = new ModelLomba();
                lomba.setJudul(rs.getString("judul"));
                lomba.setAlur(rs.getDouble("alur"));
                lomba.setOrisinalitas(rs.getDouble("orisinalitas"));
                lomba.setPemilihanKata(rs.getDouble("pemilihanKata"));
                lomba.setNilai(rs.getDouble("nilai"));
                list.add(lomba);
            }
        } catch (SQLException e) {
            System.out.println("Error GET: " + e.getMessage());
        }
        return list;
    }

    @Override
    public String getJudul(String judul) {
        final String getJudul = "SELECT judul FROM lomba WHERE judul=?";
        String foundJudul = "";
        try {
            PreparedStatement st = connect.prepareStatement(getJudul);
            st.setString(1, judul);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                foundJudul = rs.getString("judul");
            }
        } catch (SQLException e) {
            System.out.println("Error GET Judul: " + e.getMessage());
        }
        return foundJudul;
    }

    @Override
    public void insert(ModelLomba in) {
        final String insert = "INSERT INTO lomba (judul, alur, orisinalitas, pemilihanKata, nilai) VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement st = connect.prepareStatement(insert);
            st.setString(1, in.getJudul());
            st.setDouble(2, in.getAlur());
            st.setDouble(3, in.getOrisinalitas());
            st.setDouble(4, in.getPemilihanKata());
            st.setDouble(5, in.getNilai());
            st.execute();
        } catch (SQLException e) {
            System.out.println("Error INSERT: " + e.getMessage());
        }
    }

    @Override
    public void update(ModelLomba up) {
        final String update = "UPDATE lomba SET alur=?, orisinalitas=?, pemilihanKata=?, nilai=? WHERE judul=?;";
        try {
            PreparedStatement st = connect.prepareStatement(update);
            st.setDouble(1, up.getAlur());
            st.setDouble(2, up.getOrisinalitas());
            st.setDouble(3, up.getPemilihanKata());
            st.setDouble(4, up.getNilai());
            st.setString(5, up.getJudul());
            st.execute();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error INSERT: " + e.getMessage());
        }
    }

    @Override
    public void delete(String judul) {
        final String delete = "DELETE FROM lomba WHERE judul=?;";
        try {
            PreparedStatement st = connect.prepareStatement(delete);
            st.setString(1, judul);
            st.execute();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error DELETE: " + e.getMessage());
        }
    }

    @Override
    public List<ModelLomba> search(String keyword) {
        final String search = "SELECT * FROM lomba WHERE judul LIKE ?;";
        List<ModelLomba> list = null;

        try {
            list = new ArrayList<>();
            PreparedStatement st = connect.prepareStatement(search);
            st.setString(1, keyword);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ModelLomba lomba = new ModelLomba();
                lomba.setJudul(rs.getString("judul"));
                lomba.setAlur(rs.getDouble("alur"));
                lomba.setOrisinalitas(rs.getDouble("orisinalitas"));
                lomba.setPemilihanKata(rs.getDouble("pemilihanKata"));
                lomba.setNilai(rs.getDouble("nilai"));
                list.add(lomba);
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error GET: " + e.getMessage());
        }
        return list;
    }

}
