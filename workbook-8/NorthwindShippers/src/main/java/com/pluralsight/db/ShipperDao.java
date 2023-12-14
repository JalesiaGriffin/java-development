package com.pluralsight.db;

import com.pluralsight.model.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class ShipperDao {
    DataSource dataSource;

    public ShipperDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void addShipper(String name, String phoneNum){
        String query = "insert into shippers (CompanyName, Phone) values (?, ?);";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)){

            statement.setString(1, name);
            statement.setString(2, phoneNum);

            int rows = statement.executeUpdate();

            System.out.println("Rows updated: " + rows);

            try(ResultSet keys = statement.getGeneratedKeys()){
                while (keys.next()) {
                    System.out.println("Generated Key: " + keys.getInt(1));
                }
            }

            Shipper shipper = new Shipper(name, phoneNum);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void updateShipper(int id, String phoneNum){
        String query = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?;";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)){

            statement.setString(1, phoneNum);
            statement.setInt(2, id);

            int rows = statement.executeUpdate();
            System.out.println("Rows updated: " + rows);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteShipper(String name){
        String query = "DELETE FROM shippers WHERE CompanyName LIKE ?";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)){

            statement.setString(1, name);
            int rows = statement.executeUpdate();
            System.out.println("Rows updated: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
