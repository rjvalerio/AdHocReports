package com.geniisys.claims.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.dao.OfferLetterDAO;
import com.geniisys.claims.dao.impl.OfferLetterDAOImpl;
import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.OfferLetter;
import com.geniisys.claims.service.OfferLetterService;

public class OfferLetterServiceImpl implements OfferLetterService{
	private OfferLetterDAO offerLetterDAO = new OfferLetterDAOImpl();

	public OfferLetterDAO getOfferLetterDAO() {
		return offerLetterDAO;
	}

	public void setOfferLetterDAO(OfferLetterDAO offerLetterDAO) {
		this.offerLetterDAO = offerLetterDAO;
	}

	@Override
	public List<OfferLetter> fetchOfferLetter(ClaimNo claimNo) throws SQLException {
		return this.offerLetterDAO.fetchOfferLetter(claimNo);
	}

}
