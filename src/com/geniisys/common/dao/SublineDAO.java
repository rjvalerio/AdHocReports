package com.geniisys.common.dao;

import java.util.List;

import com.geniisys.common.entity.Subline;

public interface SublineDAO {
	List<Subline> getAllSublineBonds();
	String getAllSublineForDataGrid(String lineCd);
}
