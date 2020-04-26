package top.dao;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.frame.Dao;
import top.mapper.OrderDetailMapper;
import top.vo.OrderDetailVO;
import top.vo.OrderVO;
@Repository("orderdetaildao")
public class OrderDetailDao implements Dao<String, OrderDetailVO> {
	@Autowired
	OrderDetailMapper orderdetailmapper;
	@Override
	public OrderDetailVO select(String orderDetailID) {
		return orderdetailmapper.select(orderDetailID);
	}
	@Override
	public ArrayList<OrderDetailVO> selectall() {
		return orderdetailmapper.selectall();
	}
	@Override
	public void insert(OrderDetailVO m) throws Exception {
		orderdetailmapper.insert(m);
	}
	@Override
	public void update(OrderDetailVO orderDetail) throws Exception {
		orderdetailmapper.update(orderDetail);
	}
}