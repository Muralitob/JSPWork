package projectmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projectmanager.model.Order;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月27日 下午11:55:17 
* 类说明 
*/
public interface OrderRepository extends JpaRepository<Order, String> {

}
 