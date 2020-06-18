package com.wanghuadi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wanghuadi.beans.Category;
import com.wanghuadi.beans.Goods;
import com.wanghuadi.service.GoodsService;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;

	/**
	 * 商品列表--------66666----------
	 * @param pageNum
	 * @param model
	 * @return
	 */
	@RequestMapping("findAll")
	public String findAll(@RequestParam(defaultValue="1")Integer pageNum,Model model,
			String gname,String startTime,String endTime,Integer cid
			){
		Map<String, Object> map = new HashMap<>();
		map.put("gname", gname);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		map.put("cid", cid);
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = goodsService.queryGoodsAll(map );
		PageInfo<Goods> page = new PageInfo<>(list);
		model.addAttribute("page", page);
		model.addAttribute("map", map);
		
		return "index";
	}
	
	
	/**
	 * 分类下拉
	 * @return
	 */
	@RequestMapping("queryCategory")
	@ResponseBody
	public List<Category> queryCategory(){
		List<Category> list = goodsService.queryCategory();
		return list;
	}
	
	/**
	 * 添加商品信息
	 * @param goods
	 * @return
	 */
	@RequestMapping("addGoods")
	@ResponseBody
	public boolean addGoods(Goods goods){
		try {
			goodsService.addGoods(goods);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	/**
	 * 修改商品信息
	 * @param goods
	 * @return
	 */
	@RequestMapping("updateGoods")
	@ResponseBody
	public boolean updateGoods(Goods goods){
		try {
			goodsService.updateGoods(goods);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Integer gid,Model model){
		Goods goods = goodsService.queryGoodsById(gid);
		model.addAttribute("goods", goods);
		return "update";
	}
	
}
