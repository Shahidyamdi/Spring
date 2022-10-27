package com.spring.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository("custdao")
	public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public CustomerDaoImpl() {}

	public void save(final Customer c) {
		hibernateTemplate.save(c);
	}

	public void delete(int eno) {
	}
	public Customer get(int eno) {
	return null;
	}
	public void update(Customer e) {
	}
	}
