package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.to.StockTo;
import useit.ErrorHandler;

public class StockDao extends Dao {

    public boolean insertrecord(StockTo record) {
        try {
            String query = "insert into stock";
            query += "(medicine_code,supplier_code,batch_no,mfd_date,exp_date,price,qty,updated_by,stock_date,stock_type,last_updated) ";
            query += "values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, record.getMedicine_code());
            stmt.setString(2, record.getSupplier_code());
            stmt.setString(3, record.getBatch_no());
            stmt.setDate(4, record.getMfd_date());
            stmt.setDate(5, record.getExp_date());
            stmt.setFloat(6, record.getPrice());
            stmt.setInt(7, record.getQty());
            stmt.setString(8, record.getUpdated_by());
            stmt.setDate(9, record.getStock_date());
            stmt.setString(10, record.getStock_type());
            stmt.setTimestamp(11, record.getLast_updated());
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;
        }
    }

    public List<StockTo> getAllRecord() {
        try {
            String query = "select sr_no,medicineinfo.medicine_name,supplier.pharm_name,batch_no,\n"
                    + "mfd_date,exp_date,price,updated_by,last_updated,stock_type,\n"
                    + "stock.qty,stock_date from stock,logininfo,medicineinfo,supplier where medicineinfo.medicine_code=stock.medicine_code and\n"
                    + "supplier.supplier_code=stock.supplier_code and logininfo.user_name=stock.updated_by;";

            PreparedStatement stmt = DataConnection.preparestatement(query);
            List<StockTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();

                do {
                    StockTo res = new StockTo();
                    res.setSr_no(rs.getInt("sr_no"));
                    res.setMedicine_name(rs.getString("medicine_name"));
                    res.setPharm_name(rs.getString("pharm_name"));
                    res.setBatch_no(rs.getString("batch_no"));
                    res.setMfd_date(rs.getDate("mfd_date"));
                    res.setExp_date(rs.getDate("exp_date"));
                    res.setPrice(rs.getFloat("price"));
                    res.setUpdated_by(rs.getString("updated_by"));
                    res.setLast_updated(rs.getTimestamp("last_updated"));
                    res.setStock_type(rs.getString("stock_type"));
                    res.setQty(rs.getInt("qty"));
                    res.setStock_date(rs.getDate("stock_date"));
                    result.add(res);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return null;
        }

    }

    public List<StockTo> getAllRecord(String medicine_code) {
        try {
            String in = "in";
            String query = "select sr_no,medicineinfo.medicine_name,batch_no,\n"
                    + "mfd_date,exp_date,price,stock_type,\n"
                    + "stock.qty,stock_date from stock,medicineinfo where\n"
                    + " medicineinfo.medicine_code=stock.medicine_code and\n"
                    + " medicineInfo.medicine_code=? and stock_type='in'";

            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, medicine_code);
            List<StockTo> result = null;
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new ArrayList<>();
                do {
                    StockTo res = new StockTo();
                    res.setSr_no(rs.getInt("sr_no"));
                    res.setMedicine_name(rs.getString("medicine_name"));
                    res.setMedicine_code(medicine_code);
                    res.setBatch_no(rs.getString("batch_no"));
                    res.setMfd_date(rs.getDate("mfd_date"));
                    res.setExp_date(rs.getDate("exp_date"));
                    res.setPrice(rs.getFloat("price"));
                    res.setStock_type(rs.getString("stock_type"));
                    res.setQty(rs.getInt("qty"));
                    result.add(res);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return null;
        }
    }

    public boolean deleterecord(int sr_no) {
        try {
            String query = "delete from stock where ";
            query += "sr_no=?";
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setInt(1, sr_no);
            boolean result = stmt.executeUpdate() > 0;
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;
        }

    }

    public boolean updaterecord(StockTo record) {
        try {
            String query = "update stock set ";
            query += "medicine_code=?,supplier_code=?,batch_no=?,mfd_date=?,exp_date=?,price=?,qty=?,updated_by=?,stock_date=?,stock_type=? ";
            query += " where sr_no=?";
            PreparedStatement stmt = DataConnection.preparestatement(query);

            stmt.setString(1, record.getMedicine_code());
            stmt.setString(2, record.getSupplier_code());
            stmt.setString(3, record.getBatch_no());
            stmt.setDate(4, record.getMfd_date());
            stmt.setDate(5, record.getExp_date());
            stmt.setFloat(6, record.getPrice());
            stmt.setInt(7, record.getQty());
            stmt.setString(8, record.getUpdated_by());
            stmt.setDate(9, record.getStock_date());
            stmt.setString(10, record.getStock_type());
            stmt.setInt(11, record.getSr_no());
            boolean result = stmt.executeUpdate() > 0;
            return result;

        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return false;

        }
    }

    public int getQty(String batch_no, String medicine_code) {
        try {
            String query = "select sum(qty) from stock\n"
                    + "where medicine_code = ? and stock_type = 'IN' and batch_no=?";
            System.out.println(batch_no + "\t" + medicine_code);
            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, medicine_code);
            stmt.setString(2, batch_no);
            ResultSet rs = stmt.executeQuery();
            int result = 0;
            if (rs.next()) {
                do {
                    result = rs.getInt(1);
                    System.out.println("inside loop " + result);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return 0;

        }
    }

    public int getQty1(String batch_no, String medicine_code) {
        try {
            String query = "select sum(qty) from medicine.stock\n"
                    + "where medicine_code = ? and stock_type = 'out' and batch_no=?";

            PreparedStatement stmt = DataConnection.preparestatement(query);
            stmt.setString(1, medicine_code);
            stmt.setString(2, batch_no);
            ResultSet rs = stmt.executeQuery();
            int result = 0;
            if (rs.next()) {
                do {
                    result = rs.getInt("sum(qty)");
                    System.out.println(result);
                } while (rs.next());
            }
            stmt.close();
            return result;
        } catch (Exception ex) {
            error_message = ex.getMessage();
            ErrorHandler.showErrorStack(ex);
            return 0;

        }
    }
}
