package com.wanghuadi.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.wanghuadi.beans.Category;
import com.wanghuadi.beans.Goods;

public interface GoodsMapper {
	public List<Goods> queryGoodsAll(Map<String,Object> map);
	
	public List<Category> queryCategory();
	
	
	public void addGoods(Goods goods);
	
	public Goods queryGoodsById(Integer id);

	public void updateGoods(Goods goods);
}
