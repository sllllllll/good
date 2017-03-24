package com.dao;

import org.apache.ibatis.annotations.Param;

import com.entity.Book;
public interface BookMapper {
	/**
	 * 查询总条数
	 * @param param
	 * @return
	 */
	int countByParam(@Param("book")Book param);
}
