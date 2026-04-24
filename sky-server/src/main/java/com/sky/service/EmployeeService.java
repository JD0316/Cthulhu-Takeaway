package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

  /**
   * add employee
   * @param employeeDTO
   */
  void save(EmployeeDTO employeeDTO);

  /**
   * employee page query
   * @param employeePageQueryDTO
   * @return
   */
  PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

  /**
   * enable or disable employee account status
   * @param status
   * @param id
   */
  void startOrStop(Integer status, Long id);
}
