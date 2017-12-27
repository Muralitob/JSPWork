package projectmanager.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import projectmanager.model.User;

/** 
* @author 作者 E-mail: 
* @version 创建时间：2017年12月27日 下午11:55:17 
* 类说明 
*/
public interface UserRespository extends JpaRepository<User, String> {

}
 