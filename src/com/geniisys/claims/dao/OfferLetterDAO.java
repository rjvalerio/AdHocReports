package com.geniisys.claims.dao;

import java.sql.SQLException;
import java.util.List;

import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.OfferLetter;

public interface OfferLetterDAO {
	List<OfferLetter> fetchOfferLetter(ClaimNo claimNo) throws SQLException;
}
