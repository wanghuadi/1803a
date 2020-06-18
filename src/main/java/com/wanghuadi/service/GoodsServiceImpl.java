package com.wanghuadi.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wanghuadi.beans.Category;
import com.wanghuadi.beans.Goods;
import com.wanghuadi.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> queryGoodsAll(Map<String, Object> map) {
		return goodsMapper.queryGoodsAll(map);
	}

	@Override
	public List<Category> queryCategory() {
		return goodsMapper.queryCategory();
	}

	@Override
	public void addGoods(Goods goods) {
		goodsMapper.addGoods(goods);
	}

	@Override
	public Goods queryGoodsById(Integer id) {
		return goodsMapper.queryGoodsById(id);
	}

	@Override
	public void updateGoods(Goods goods) {
		goodsMapper.updateGoods(goods);
	}

}
