package com.ct.service.impl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.ct.pojo.LotteryWin;
import com.ct.dao.LotteryWinDAO;
import com.ct.dto.LotteryWinQuery;
import com.ct.Base.service.impl.BaseServiceImpl;
import com.ct.service.LotteryWinService;
/**
 * @author Wu shaoming(361726442@qq.com)
 * @since 2016-06-20
 */

public class LotteryWinServiceImpl extends BaseServiceImpl<LotteryWin, LotteryWinQuery, Long> implements LotteryWinService{
	
	@Autowired
	LotteryWinDAO lotteryWinDAO;
	
	private static final Log log = LogFactory.getLog(LotteryWinServiceImpl.class);
	
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(lotteryWinDAO);
	}
}
