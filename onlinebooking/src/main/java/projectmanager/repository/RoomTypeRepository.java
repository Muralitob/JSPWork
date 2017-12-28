package projectmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import projectmanager.model.RoomType;

/** 
* @author fp E-mail: 
* @version 创建时间：2017年12月27日 下午11:55:17 
* 类说明 
*/
public interface RoomTypeRepository extends JpaRepository<RoomType, String> {
    
    List<RoomType> findByPriceLessThan(Integer price);
    
    List<RoomType> findByPriceGreaterThan(Integer price);
}
 