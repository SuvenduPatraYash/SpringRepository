package com.yash.StudentCrud;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemp;

	public int insert(Student stu) {

		String q = "insert into student(id,name) values(?,?)";
		int msg = this.jdbctemp.update(q, stu.getId(), stu.getName());
		return msg;
	}

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

}