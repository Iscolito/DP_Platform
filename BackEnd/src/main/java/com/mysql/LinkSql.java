package com.mysql;
import java.sql.*;
import java.util.ArrayList;


public class LinkSql {
	Connection connection;
	Statement order;
	ResultSet result;
	public LinkSql(String ip) {
		getConnection(ip);
	}
	public LinkSql(String ip, String database) {
		getConnection(ip);
		try {
			this.order.execute("use "+database);
			showTables();
		} catch (SQLException e) {
			System.out.println("没有这个数据库");
			e.printStackTrace();
		}
	}
	public Connection getConnection(String ip) {
		String url="jdbc:mysql://"+ip;
		String unicode="/?characterEncoding=UTF-8";
		try {
			this.connection=DriverManager.getConnection(url+unicode,"root","123456");
			this.order=this.connection.createStatement();
			System.out.println("连接成功");
		}catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
		return connection;
	}
	public void showBases() {
		try {
			this.result=this.order.executeQuery("show databases");
			System.out.println(this.readResult(1));
		} catch (SQLException e) {
			System.out.println("数据库查询失败");
			e.printStackTrace();
		}
	}
	public void showTables() {
		try {
			this.result=this.order.executeQuery("show tables");
			System.out.println(this.readResult(1));
		} catch (SQLException e) {
			System.out.println("数据表查询失败");
			e.printStackTrace();
		}
	}
	public ArrayList<ArrayList<String>> search(String table) {
		ArrayList<ArrayList<String>> res =new ArrayList<>();
		try {
			this.result=this.order.executeQuery("select * from "+table);
			ResultSetMetaData metadata=this.result.getMetaData();
			int row = result.getRow();
			int col = metadata.getColumnCount();
			System.out.println("共"+row+"行"+col+"列");
			for(int i=1;i<=col;i++) {
				this.result=this.order.executeQuery("select * from "+table);
				res.add(this.readResult(i));
			}
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("查询目标表失败");
			e.printStackTrace();
		}
		return res;
	}
	public ArrayList<String> showIndex(String target) {
		ArrayList<String> res=new ArrayList<>();
		try {
			this.result=this.order.executeQuery("desc "+target);
			res=this.readResult(1);
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("没有目标子表");
			e.printStackTrace();
		}
		return res;
	}
	public String toTuple(ArrayList<String> text) {
		StringBuilder index=new StringBuilder("(");
		index.append(text.get(0));
		for(int i=1;i<text.size();i++) {
			index.append(", ");
			index.append(text.get(i));
		}
		index.append(")");
		return index.toString();
	}
	public void addrow(String table, ArrayList<String> index, ArrayList<String> values ) {
		if(index.size()!=values.size()) {System.out.println("长度不匹配");return;}
		String str1 = "INSERT INTO "+table+" "+toTuple(index)+" "+"VALUES"+" "+toTuple(values);
		System.out.println(str1);
		try {
			this.order.execute(str1);
		} catch (SQLException e) {
			System.out.println("插入失败");
			e.printStackTrace();
		}
	}
	public void deleterow(String table, String key, String id ) {
		String str1="DELETE FROM "+table+" WHERE "+key+'='+id;
		try {
			this.order.execute(str1);
		} catch (SQLException e) {
			System.out.println("删除失败");
			e.printStackTrace();
		}
	}
	
	public ArrayList<ArrayList<String>> findId(String table, String key, String id){
		ArrayList<ArrayList<String>> res=new ArrayList<>();
		String str1="select * from "+table+" where "+key+"="+id;
		try {
			this.result=this.order.executeQuery(str1);
			ResultSetMetaData metadata=this.result.getMetaData();
			int col = metadata.getColumnCount();
			for(int i=1;i<=col;i++) {
				this.result=this.order.executeQuery(str1);
				res.add(this.readResult(i));
			}
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("查询失败");
			e.printStackTrace();
		}

		return res;
	}
	
	public int findNum(String table){
		String str1="select * from "+table;
		int res=0;
		try {
			this.result=this.order.executeQuery(str1);
			res=Integer.valueOf(this.readResult(1).get(0));
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("查询失败");
			e.printStackTrace();
		}
		return res;
	}
	
	public void addNum(String table, int num){
		String str1="UPDATE "+table+" SET num="+Integer.toString(num);
		try {
			this.order.execute(str1);
			findNum(table);
		} catch (SQLException e) {
			System.out.println("修改失败");
			e.printStackTrace();
		}
	}
	
	public void addtable(String table, String cols){
		String str1="create table "+table+" "+cols;
		try {
			this.order.execute(str1);
			this.showIndex(table);
		} catch (SQLException e) {
			System.out.println("创建失败");
			e.printStackTrace();
		}
	}
	
	public void deltable(String table){
		String str1="DROP TABLE "+table;
		try {
			this.order.execute(str1);
			this.showIndex(table);
		} catch (SQLException e) {
			System.out.println("删除失败");
			e.printStackTrace();
		}
	}
	
	

	public ArrayList<String> readResult(int column) throws SQLException {
		ArrayList<String> res=new ArrayList<>();
		while(this.result.next()) {
			String col = this.result.getString(column);
			res.add(col);
		}
		return res;
	}
	public static void main(String[] args) {
		LinkSql a=new LinkSql("192.168.0.100","students_data");
		a.search("basic");
		a.showIndex("basic");
		ArrayList<String> b = new ArrayList<>();
		b.add("\"2216113151\"");
		b.add("\"吴玘华\"");
		b.add("\"男\"");
		b.add("\"2101\"");
		b.add("\"电信学部\"");
		a.findId("basic", "id", "2216113150");
		//a.addrow("basic", a.showIndex("basic"), b);
		//a.deleterow("basic", "id", "2216113151");
		a.search("basic");
		a=new LinkSql("192.168.0.100","yysy");
		a.findNum("num");
		a.addNum("num", 20220001);
	}
}
