package projectmanager.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User extends projectmanager.model.BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private Integer level;

	private String phone;

	private String realName;

	private String status;

	private String userName;

	private String userPassword;

	public User() {
	}

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public User(Date createDate, Integer level, String phone, String realName, String status, String userName,
            String userPassword) {
        super();
        this.createDate = createDate;
        this.level = level;
        this.phone = phone;
        this.realName = realName;
        this.status = status;
        this.userName = userName;
        this.userPassword = userPassword;
    }
}