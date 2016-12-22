package com.geniisys.common.service.impl;

import java.util.List;

import com.geniisys.common.dao.TariffDAO;
import com.geniisys.common.dao.impl.TariffDAOImpl;
import com.geniisys.common.entity.Tariff;
import com.geniisys.common.service.TariffService;

public class TariffServiceImpl implements TariffService{
	
	private TariffDAO tariffDAO = new TariffDAOImpl();

	@Override
	public String getAllTariffForDataGrid() {
		return this.tariffDAO.getAllTariffForDataGrid();
	}

	@Override
	public String getAllTariff() {
		List<Tariff> tariffList = this.tariffDAO.getAllTariff();
		String tariffString = "{ rows: [";
		Integer count = 1;
		for (Tariff tariff : tariffList) {
			tariffString = tariffString + "{id:" + count + ", data: [\"" + tariff.getTarfCd() + "\",\"" + tariff.getTarfDesc() + "\"," + tariff.getPdfSw() + "]},";
			count++;
		}
		tariffString = tariffString.substring(0, tariffString.length() - 1) + "]}";
		tariffString.trim();
		return tariffString;
	}
}
