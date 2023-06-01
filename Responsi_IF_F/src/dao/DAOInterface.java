/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.ModelLomba;

/**
 *
 * @author Lab Informatika
 */
public interface DAOInterface {

    public List<ModelLomba> getAll();
    
    public String getJudul(String judul);

    public void insert(ModelLomba in);

    public void update(ModelLomba up);

    public void delete(String judul);

    public List<ModelLomba> search(String keyword);
}
