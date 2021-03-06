package com.example.demo.dao.impl;

import com.example.demo.dao.AbstractHibernateDAO;
import com.example.demo.dao.OnBoardApp_EmployeeDAO;
import com.example.demo.pojo.OnBoardApp_Employee;
import com.example.demo.pojo.OnBoardApp_Person;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("OnBoardApp_EmployeeImpl")
public class OnBoardApp_EmployeeImpl extends AbstractHibernateDAO<OnBoardApp_Employee> implements OnBoardApp_EmployeeDAO {
    public OnBoardApp_EmployeeImpl()
    {
        setClazz(OnBoardApp_Employee.class);
    }

    @Override
    public void addEmployee(int ID, int personID, String car, int visaID, String visaStartDate, String visaEndDate, String driverLisence, String driver_exp) {
            OnBoardApp_Employee person = new OnBoardApp_Employee(ID,personID, visaID, visaStartDate,
                    visaEndDate, driverLisence,driver_exp );
            getCurrentSession().save(person);
    }

    @Override
    public void updateEmployee(int ID, int personID, String title, int managerID, String startDate, String endDate, String avartar, String car, int visaID, String visaStartDate,
                               String visaEndDate, String driverLisence, String driver_exp) {
        OnBoardApp_Employee empl = getEmployeeByID(ID);
        empl.setPersonID(ID);
        empl.setTitle(title);
        empl.setManagerID(managerID);
        empl.setStartDate(startDate);
        empl.setEndDate(endDate);
        empl.setAvartar(avartar);
        empl.setCar(car);
        empl.setVisaID(visaID);
        empl.setStartDate(visaStartDate);
        empl.setVisaEndDate(visaEndDate);
        empl.setDriver_exp(driver_exp);
        empl.setDriver_exp(driver_exp);
        getCurrentSession().update(empl);
    }

    @Override
    public OnBoardApp_Employee getEmployeeByID(Integer ID) {
        return getCurrentSession().get(OnBoardApp_Employee.class, ID);
    }

    @Override
    public List<OnBoardApp_Employee> getAllEmployees() {
        String sql = "from OnBoardApp_Employee";
        List result = getCurrentSession().createQuery(sql).list();
        return result;
    }

//    @Override
//    public List<OnBoardApp_Employee> getEmployeesByFirstName(String firstName, String lastName) {
//        Query query = getCurrentSession().createQuery("from OnBoardApp_Person where firstname = :firstname or lastname = :lastname");
//        query.setParameter("firstname", firstName);
//        query.setParameter("lastname", lastName);
//        return query.list();
//    }
//
//    @Override
//    public List<OnBoardApp_Employee> getEmployeesByEmpID(Integer ID) {
//        Query query = getCurrentSession().createQuery("from OnBoardApp_Address where personID = :id ");
//        query.setParameter("id", ID);
//        return query.list();
//    }
    @Override
    public List<OnBoardApp_Employee> getEmployeeByHouseID(Integer id)
    {
        String sql = "from OnBoardApp_Employee where houseID = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);
        return query.list();
    }
}
