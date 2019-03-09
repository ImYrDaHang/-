package com.imyrdahangBlogger.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imyrdahang.dao.EnshrinesMapper;
import com.imyrdahang.pojo.Enshrines;
import com.imyrdahang.pojo.EnshrinesExample;
import com.imyrdahangBlogger.service.interfaces.MbfxService;
@Service
public class MbfxServiceImpl implements MbfxService {
	@Autowired
	private EnshrinesMapper enshrinesMapper;
	/* 
	 * @method selectArticlesBySortField
	 * @see 根据分页，排序条件和排序规则进行查询
	 * @param pages 	页码
	 * @param rows		每页条数
	 * @param SortField	排序条件
	 * @param Sort		排序规则，desc升序
	 * @return			多个文章的集合
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Enshrines> selectEnshrinesByPageAndSortField(int pages,int rows,String SortFieldAndSort) throws Exception {
		@SuppressWarnings("rawtypes")
		Map map=new HashMap();
		map.put("pages", (pages-1)*rows);
		map.put("rows",rows);
		//排序字段，根据那个字段是升还是倒序
		map.put("fieldAndSort", SortFieldAndSort);
		return enshrinesMapper.selectByPagesAndRows(map);
	}
	//查询链接总条数
	@Override
	public int selectEnshrineCount() throws Exception {
		return enshrinesMapper.countByExample(new EnshrinesExample());
	}

}
