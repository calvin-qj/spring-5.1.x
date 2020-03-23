package org.springframework.transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void saveUser(String name,Integer age){
		String sql = "insert into tbl_user (name , age ) values ("+name+ " , "+age+" )";
		jdbcTemplate.execute(sql);
	}

	public void saveErrorUser(){
		String sql = "insert into tbl_user (name , age ) values ('wuxq' , 'err')";
		jdbcTemplate.execute(sql);
	}


	public void updateAccount(Integer id){
		String sql = "update t_account set account = 900 where id = "+id;
		jdbcTemplate.execute(sql);
	}
}
