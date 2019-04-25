package com.bridgeit.App.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgeit.App.Model.Login;
import com.bridgeit.App.Model.User;


public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {
		String sql = "insert into userinfo values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getFirstname(), user.getLastname(), user.getGender(),
				user.getMobilenumber(), user.getUsername(), user.getEmailid(), user.getPass() });

	}

	public User validateUser(Login login) {
		String sql = "select * from userinfo where username='" + login.getUsername() + "'and pass='"
	                 + login.getPass()+ "'";
				
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		/*
		 * if(users.size()>0) { return users.get(0); } else { return null; }
		 */
		return users.size() > 0 ? users.get(0) : null;
	}

}

class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int arg) throws SQLException {
		User user = new User();
		user.setFristname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setGender(rs.getString("gender"));
		user.setMobilenumber(rs.getString("mobilenumber"));
		user.setUsername(rs.getString("username"));
		user.setEmailid(rs.getString("emailid"));
		user.setPass(rs.getString("pass"));
		return user;
	}

}
