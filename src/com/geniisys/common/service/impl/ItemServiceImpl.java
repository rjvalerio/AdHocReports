package com.geniisys.common.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.dao.ItemDAO;
import com.geniisys.common.dao.impl.ItemDAOImpl;
import com.geniisys.common.entity.Item;
import com.geniisys.common.service.ItemService;

public class ItemServiceImpl implements ItemService{
	
	private ItemDAO itemDAO = new ItemDAOImpl();
	
	

	public ItemDAO getItemDAO() {
		return itemDAO;
	}



	public void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}



	@Override
	public List<Item> getItem(Integer extractId,String lineCd) throws SQLException {
		return this.getItemDAO().getItem(extractId,lineCd);
	}



	@Override
	public List<Item> getGipiItem(Integer policyId, String lineCd) throws SQLException {
		return this.getItemDAO().getGipiItem(policyId, lineCd);
	}

}
