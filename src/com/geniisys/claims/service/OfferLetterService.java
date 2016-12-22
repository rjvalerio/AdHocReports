package com.geniisys.claims.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.geniisys.claims.entity.ClaimNo;
import com.geniisys.claims.entity.OfferLetter;

public interface OfferLetterService {
	List<OfferLetter> fetchOfferLetter(ClaimNo claimNo) throws SQLException;
}
