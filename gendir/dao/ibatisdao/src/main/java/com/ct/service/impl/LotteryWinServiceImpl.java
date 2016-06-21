package com.ct.service.impl;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import com.ct.pojo.LotteryWin;
import com.ct.dto.LotteryWinQuery;
import com.ct.Base.service.impl.BaseServiceImpl;
import com.ct.service.LotteryWinService;
/**
 * @author Wu shaoming(361726442@qq.com)
 * @since 2016-06-21
 */
@Component
public class LotteryWinServiceImpl extends BaseServiceImpl<LotteryWin, LotteryWinQuery, Long> implements LotteryWinService{
	
private static final Log log = LogFactory.getLog(LotteryWinServiceImpl.class);
}
