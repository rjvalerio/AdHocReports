package com.geniisys.common.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.common.entity.Subline;

public interface SublineService {
	List<Subline> getAllSublineBonds();
	String getAllSublineForDataGrid(HttpServletRequest request);
}
