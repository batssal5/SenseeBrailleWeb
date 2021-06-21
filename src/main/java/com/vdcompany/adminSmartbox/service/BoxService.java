package com.vdcompany.adminSmartbox.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vdcompany.adminSmartbox.bean.AdminVO;
import com.vdcompany.adminSmartbox.bean.agency.AgencySearchVO;
import com.vdcompany.adminSmartbox.bean.agency.AgencyStoreVO;
import com.vdcompany.adminSmartbox.bean.agency.AgencyVO;
import com.vdcompany.adminSmartbox.bean.box.BoxUpdateLogVO;
import com.vdcompany.adminSmartbox.bean.box.BoxVO;
import com.vdcompany.adminSmartbox.bean.box.InventoryVO;
import com.vdcompany.adminSmartbox.bean.goods.GoodsVO;
import com.vdcompany.adminSmartbox.bean.web.paging.PagingVO;

public interface BoxService {
	
	BoxVO getBoxDetail(int idx);
	
	List<BoxVO> getBoxList(PagingVO pagingVO);
	int putBox(BoxVO boxVO);
	int postBox(Map<String, Object> map);
	int deleteBox(Map<String, Object> map);


	List<InventoryVO> getInventoryInfo(PagingVO pagingVO);
	List<InventoryVO> putInventoryInfo(InventoryVO inventoryVO);
	List<InventoryVO> postInventoryInfo(InventoryVO inventoryVO);
	int delInventoryInfo(InventoryVO inventoryVO);
	List<InventoryVO> getInventoryDetailInfo(PagingVO pagingVO);


	List<BoxVO> getBoxSearchList(BoxVO search);		// 박스 리스트
	List<BoxUpdateLogVO> getBoxUpdateLogList(int box_idx);	// 박스 idx에 해당하는 로그데이터 가져오기
	
	int insertBox(BoxVO box);	// 추가하기
	int updateBox(BoxVO box);	// 수정하기
	
	
}
