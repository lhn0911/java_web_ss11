package com.rikkei.ss11.repository;

import com.rikkei.ss11.model.Category;
import com.rikkei.ss11.utils.ConnectionDB;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class CategoryRepositoryImp implements  CategoryRepository {
    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategoryName(rs.getString("category_name"));
                category.setStatus(rs.getBoolean("status"));
                list.add(category);
            }
        } catch (SQLException e) {
            e.fillInStackTrace();
        } catch(Exception e){
            e.fillInStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return list;
    }
    @Override
    public void save(Category category) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insert_category(?, ?)}");
            callSt.setString(1, category.getCategoryName());
            callSt.setBoolean(2, category.isStatus());
            callSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
    }

    @Override
    public boolean existsByCategoryName(String name) {
        Connection conn = null;
        CallableStatement callSt = null;
        ResultSet rs = null;
        boolean exists = false;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call check_category_name(?)}");
            callSt.setString(1, name);
            rs = callSt.executeQuery();
            exists = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return exists;
    }
}
