package com.geniisys.common.dao;

import java.util.List;

import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Intermediary;

public interface IntermediaryDAO {
	List<Intermediary> getAllActiveIntermediary();
	List<Intermediary> getAllIntmType();
	List<Intermediary> getAllDealersIntm();
}
