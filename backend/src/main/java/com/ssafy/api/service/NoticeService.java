package com.ssafy.api.service;

import com.ssafy.api.request.NoticeRegisterPostReq;
import com.ssafy.api.request.NoticeUpdatePostReq;
import com.ssafy.db.entity.Notice;

import java.util.List;

/**
 *	유저 관련 비즈니스 로직 처리를 위한 서비스 인터페이스 정의.
 */
public interface NoticeService {

	Notice createNotice(NoticeRegisterPostReq noticeRegisterInfo);
//	List<Hall> getHallByCompanyId(String companyId);
	void deleteNotice(int noticeNum);
	Notice getNoticeByNoticeNum(int noticeNum );

	Notice updateNotice(int noticeNum, NoticeUpdatePostReq noticeUpdateInfo);

	List<Notice> getNoticeAll();

}
