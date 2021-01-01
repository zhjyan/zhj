package com.hp.service;

import com.hp.bean.Admin;
import com.hp.bean.AdminExample;
import com.hp.dao.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
	@Autowired(required = false)
	private AdminDAO adminDAO;
	public long countByExample(AdminExample example){
    	return adminDAO.countByExample(example);
    }

	public int deleteByExample(AdminExample example){
    	return adminDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return adminDAO.deleteByPrimaryKey(id);
    }

	public int insert(Admin record){
    	return adminDAO.insert(record);
    }

	public int insertSelective(Admin record){
    	return adminDAO.insertSelective(record);
    }

	public List<Admin> selectByExample(AdminExample example){
    	return adminDAO.selectByExample(example);
    }

	public Admin selectByPrimaryKey(Integer id){
    	return adminDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Admin record, AdminExample example){
    	return adminDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Admin record, AdminExample example){
    	return adminDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Admin record){
    	return adminDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Admin record){
    	return adminDAO.updateByPrimaryKey(record);
    }

	// 1对多
}
