package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import useit.ErrorHandler;

public class CommonDAO extends Dao {

    public int getLastInsertID() {
        int id = 0;
        try {
            String query = "select last_insert_id()";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception ex) {
            error_message = ex.toString();
            ErrorHandler.showErrorStack(ex);

        }
        return id;
    }
}
