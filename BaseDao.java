package com.classesdao.javaweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public void executeSql(String sql,Object...objects) {
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=null;
		try {
			ps=conn.prepareStatement(sql);
			for(int i=0;i<objects.length;i++) {
				ps.setObject(i+1, objects[i]);
			}
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { 
			JdbcUtil.close(ps, conn);
		}	
	}
	
	public void executeSelect(String sql,String className) {
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			ps.setObject(1, className);
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getObject(1)+" "+rs.getObject(2)+" "+rs.getObject(3)
				+" "+rs.getObject(4)+" "+rs.getObject(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs, ps, conn);
		}
	}
	
	public int getClassID(String className) {
		Connection conn=JdbcUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		int i=0;
		try {
			ps=conn.prepareStatement("select classID from classinfo where className=?");
			ps.setString(1,className);
			rs=ps.executeQuery();
			if(rs.next())
				i=rs.getInt(1);
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}finally {
			JdbcUtil.close(rs, ps, conn);
		}
		
	}
}
