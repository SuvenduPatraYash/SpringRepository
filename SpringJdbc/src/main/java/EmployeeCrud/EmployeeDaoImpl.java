package EmployeeCrud;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbctemp;

	public int insert(Employee emp) {

		String q = "insert into employee(id,empname,emailid,dob,contactno,salary) values(?,?,?,?,?,?)";
		int msg = this.jdbctemp.update(q, emp.getId(), emp.getEmpname(), emp.getEmailid(), emp.getDob(), emp.getContactno(), emp.getSalary());
		return msg;
	}

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}

}