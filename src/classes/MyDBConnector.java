package classes;

import java.sql.*;

public class MyDBConnector {

    private Connection con;

    public MyDBConnector() {
        try {
            con = DriverManager.getConnection(Constants.DB, Constants.USER, Constants.PASSWORD);
        } catch (SQLException e) {  throw new RuntimeException(e); }
    }

    public ResultSet doQuery(String query) {
        ResultSet result = null;

        try {
            Statement stm = con.createStatement();
            result = stm.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public ResultSet doQuery(String query, int params) {
        ResultSet result = null;

        try {
            PreparedStatement stm = con.prepareStatement(query);
            // PreparedStatement stm = con.prepareStatement("SELECT * FROM Persona WHERE ID = 1;");

            stm.setInt(1, params);
            result = stm.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


}
