package com.atguigu.test;

import com.atguigu.bean.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ContextConfiguration(locations="classpath:jdbc.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class JdbcTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Test
    public void test1(){
        try {
            System.out.println(jdbcTemplate.getDataSource().getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){

            String sql = "update employee set salary = ? where emp_id = ?";
            int update = jdbcTemplate.update(sql,1300.00,5);
            System.out.println("更新完成" + update);
    }

    @Test
    public void test3(){
        String sql = "insert into employee(emp_name,salary) values (?,?)";
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"张三",1000});
        args.add(new Object[]{"李四",1000});
        args.add(new Object[]{"王二小",1000});
        args.add(new Object[]{"孙平",1000});
        int[] lines = jdbcTemplate.batchUpdate(sql,args);
        for(int i: lines){
            System.out.println("添加成功" + i);
        }
    }

    @Test
    public void test4(){
        String sql = "select emp_id epmId,emp_name empName,salary from employee where emp_id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Employee.class),3);
        System.out.println(employee.getEmpName() + employee.getSalary());
    }

    @Test
    public void test5(){
        String sql = "select emp_id epmId,emp_name empName,salary from employee where salary > ?";
        List<Employee> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Employee.class),3000);
        System.out.println(list.size());
    }

    @Test
    public void test6(){
        String sql = "select max(salary) from employee";
        Double salary = jdbcTemplate.queryForObject(sql,Double.class);
        System.out.println(salary);
    }

    @Test
    public void test7(){
        String sql = "insert into employee(emp_name,salary) values (:empName,salary)";
        Map<String,Object> params = new HashMap<>();
        params.put("empName","tianqi");
        params.put("salary",5200);
        namedParameterJdbcTemplate.update(sql,params);

    }

    @Test
    public void test8(){
        String sql = "insert into employee(emp_name,salary) values (:empName,salary)";
        Employee employee = new Employee();
        employee.setEmpName("wangjiu");
        employee.setSalary(2130);
        namedParameterJdbcTemplate.update(sql,new BeanPropertySqlParameterSource(employee));

    }
}
