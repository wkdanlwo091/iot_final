package top.frame;

import java.util.ArrayList;
import org.springframework.transaction.annotation.Transactional;

import top.vo.OrderVO;

public interface Biz<Id, Model> {
	//예전 프로젝트의 서비스 라고 하면 된다. 
	@Transactional 
	default public void register(Model m) throws Exception{
	}
	@Transactional 
	default public void update(Model id) throws Exception{
	}
	public Model get(Id id);
	public ArrayList<Model> get();

}
