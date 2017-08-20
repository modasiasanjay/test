package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vo.RegiVo;

public class Dao {

	
	public void insert(RegiVo regis) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springdata","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("Insert into regi (fn,ln,un,Pass) values('"+regis.getFn()+"','"+regis.getLn()+"','"+regis.getUn()+"','"+regis.getPass()+"')");	
			
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}

	public List Search() throws SQLException {
		// TODO Auto-generated method stub
			List ls=new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springdata","root","root");
			Statement st=con.createStatement();
			String sql = "SELECT * FROM regi";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				int S1=rs.getInt("id");	
				String S2=rs.getString("fn");
				String S3=rs.getString("ln");
				String S4=rs.getString("un");
				String S5=rs.getString("Pass");
				
				RegiVo vo=new RegiVo();
				vo.setId(S1);
				vo.setFn(S2);
				vo.setLn(S3);
				vo.setUn(S4);
				vo.setPass(S5);

				ls.add(vo);
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ls;
	}

	public List Edit(RegiVo vo) throws SQLException {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/springdata", "root", "root");
			Statement st=con.createStatement();
			String sql = "SELECT * FROM regi where id='"+vo.getId()+"'";
			ResultSet rs = st.executeQuery(sql);
		
			while(rs.next())
			{
				int S1=rs.getInt("id");	
				String S2=rs.getString("fn");
				String S3=rs.getString("ln");
				String S4=rs.getString("un");
				String S5=rs.getString("pass");
				
				
				RegiVo vo1 =new RegiVo();
				vo1.setId(S1);
				vo1.setFn(S2);
				vo1.setLn(S3);
				vo1.setUn(S4);
				vo1.setPass(S5);

				ls.add(vo1);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

		public List Delete(RegiVo vo) throws SQLException {
		// TODO Auto-generated method stub
			List ls=new ArrayList();
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springdata","root","root");
				Statement st = con.createStatement();
				st.executeUpdate("DELETE from regi where id='"+vo.getId()+"'");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		return ls;
	}
		
			
		public void update(RegiVo regis) throws SQLException {
			// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springdata","root","root");
				Statement st = con.createStatement();
				String sql="UPDATE regi SET fn='"+regis.getFn()+"',ln='"+regis.getLn()+"',un='"+regis.getUn()+"',pass='"+regis.getPass()+"' WHERE id='"+regis.getId()+"'";

				st.executeUpdate(sql);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}



}
