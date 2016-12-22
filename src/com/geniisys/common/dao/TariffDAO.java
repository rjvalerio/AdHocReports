package com.geniisys.common.dao;

import java.util.List;

import com.geniisys.common.entity.Tariff;

public interface TariffDAO {
	List<Tariff> getAllTariff();
	String getAllTariffForDataGrid();
}
