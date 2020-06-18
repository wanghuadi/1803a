package com.wanghuadi.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wanghuadi.beans.Goods;
import com.wanghuadi.service.GoodsService;

/**
 * 调用service 方法   测试   列表、添加 、修改
 * @author wanghd
 *
 */
public class TestGoods {
	
	@Test
	public void testList(){
		//获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		GoodsService service = ac.getBean(GoodsService.class);
		
		
		/*Map<String, Object> map = new HashMap<String, Object>();
		List<Goods> list = service.queryGoodsAll(map );
		for (Goods goods : list) {
			System.out.println(goods);
		}*/
		//--------------------------------
		
//		Goods goods = new Goods(gid, gname, cid, gtime, cname);
//		service.addGoods(goods);
		
		
	}
	
}
