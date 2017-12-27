package projectmanager.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the room database table.
 * 
 */
@Entity
@NamedQuery(name="Room.findAll", query="SELECT r FROM Room r")
public class Room extends projectmanager.model.BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;

	@Column(name="is_active")
	private Byte isActive;

	@Column(name="owner_guid")
	private String ownerGuid;

	@Column(name="owner_name")
	private String ownerName;

	@Column(name="owner_phone")
	private String ownerPhone;

	@Column(name="room_type")
	private Integer roomType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="stay_date_end")
	private Date stayDateEnd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="stay_date_start")
	private Date stayDateStart;

	public Room() {
	}

    public Room(String code, Byte isActive, String ownerGuid, String ownerName, String ownerPhone, Integer roomType,
            Date stayDateEnd, Date stayDateStart) {
        super();
        this.code = code;
        this.isActive = isActive;
        this.ownerGuid = ownerGuid;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.roomType = roomType;
        this.stayDateEnd = stayDateEnd;
        this.stayDateStart = stayDateStart;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public String getOwnerGuid() {
        return ownerGuid;
    }

    public void setOwnerGuid(String ownerGuid) {
        this.ownerGuid = ownerGuid;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Date getStayDateEnd() {
        return stayDateEnd;
    }

    public void setStayDateEnd(Date stayDateEnd) {
        this.stayDateEnd = stayDateEnd;
    }

    public Date getStayDateStart() {
        return stayDateStart;
    }

    public void setStayDateStart(Date stayDateStart) {
        this.stayDateStart = stayDateStart;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}