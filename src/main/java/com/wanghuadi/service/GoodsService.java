package com.wanghuadi.service;

import java.util.List;
import java.util.Map;

import com.wanghuadi.beans.Category;
import com.wanghuadi.beans.Goods;

public interface GoodsService {
	public List<Goods> queryGoodsAll(Map<String,Object> map);
	public List<Category> queryCategory();
	public void addGoods(Goods goods);
	public Goods queryGoodsById(Integer id);
	public void updateGoods(Goods goods);
}
