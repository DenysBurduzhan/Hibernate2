package org.example.dao;

import org.example.domain.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends MovieDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {

        super(Staff.class, sessionFactory);
    }


}