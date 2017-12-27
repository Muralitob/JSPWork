package projectmanager.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name="orders")
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order extends projectmanager.model.BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="end_date")
	private Date endDate;

	private BigDecimal price;

	@Column(name="room_code")
	private String roomCode;

	@Column(name="room_guid")
	private String roomGuid;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="start_date")
	private Date startDate;

	@Column(name="user_guid")
	private String userGuid;

	@Column(name="user_name")
	private String userName;


	public Order() {
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getRoomCode() {
		return this.roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomGuid() {
		return this.roomGuid;
	}

	public void setRoomGuid(String roomGuid) {
		this.roomGuid = roomGuid;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getUserGuid() {
		return this.userGuid;
	}

	public void setUserGuid(String userGuid) {
		this.userGuid = userGuid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

    public Order(Date endDate, BigDecimal price, String roomCode, String roomGuid, Date startDate, String userGuid,
            String userName) {
        super();
        this.endDate = endDate;
        this.price = price;
        this.roomCode = roomCode;
        this.roomGuid = roomGuid;
        this.startDate = startDate;
        this.userGuid = userGuid;
        this.userName = userName;
    }
}