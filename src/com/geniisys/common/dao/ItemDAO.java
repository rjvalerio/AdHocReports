package com.geniisys.common.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.common.entity.Item;

public interface ItemDAO {
	List<Item> getItem(Integer extractId,String lineCd) throws SQLException;
	List<Item> getGipiItem(Integer policyId,String lineCd) throws SQLException;
}
