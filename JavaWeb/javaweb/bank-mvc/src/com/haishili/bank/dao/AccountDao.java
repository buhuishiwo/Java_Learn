package com.haishili.bank.dao;

import com.haishili.bank.entity.Account;
import com.haishili.bank.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO(Data Access Object)数据访问对象
 * 就是只继续对数据表的CRUD，没有业务逻辑
 * Account的CRUD
 * @author haishili
 * @version 1.0
 * @since 1.0
 */
public class AccountDao {
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public int insert(Account account) {
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement("insert into t_acc values(?,?,?)");
            pstmt.setInt(1, account.getId());
            pstmt.setString(2, account.getAcount());
            pstmt.setDouble(3,account.getMoney());
            rs = pstmt.executeQuery();
            return rs.getConcurrency();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            JDBCUtil.close(conn, pstmt, rs);
        }
    }

    public Account searchByAccount(String account) {
        Account account1 = new Account();
        try {
            conn = JDBCUtil.getConnection();
            pstmt = conn.prepareStatement("select * from t_acc where account=?");
            pstmt.setString(1, account);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                String accountName = rs.getString("account");
                double money = rs.getDouble("money");
                int id = rs.getInt("id");
                account1.setId(id);
                account1.setAcount(accountName);
                account1.setMoney(money);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return account1;
    }
}
