package org.example.DbConnection;

import org.example.model.Items;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection instance;

    private List<Items> customerList;
    private DBConnection(){
        customerList=new ArrayList<>();
    }

    public List<Items> getConnection(){
        return customerList;
    }
    public static DBConnection getInstance(){
        return instance==null?instance=new DBConnection():instance;
    }


}
