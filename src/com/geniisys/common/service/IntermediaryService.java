package com.geniisys.common.service;

import java.util.List;

import com.geniisys.common.entity.Branch;
import com.geniisys.common.entity.Intermediary;

public interface IntermediaryService {
	List<Intermediary> getAllActiveIntermediary();
	List<Intermediary> getAllIntmType();
	List<Intermediary> getAllDealersIntm();
}
