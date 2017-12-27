package projectmanager.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the room_type database table.
 * 
 */
@Entity
@Table(name="room_type")
@NamedQuery(name="RoomType.findAll", query="SELECT r FROM RoomType r")
public class RoomType extends projectmanager.model.BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer area;

	@Column(name="bed_type")
	private String bedType;

	private String desc;

	private String floor;

	private String image;

	private Integer price;

	@Column(name="room_type")
	private Integer roomType;

	private Byte smoke;

	public RoomType() {
	}

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public Byte getSmoke() {
        return smoke;
    }

    public void setSmoke(Byte smoke) {
        this.smoke = smoke;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public RoomType(Integer area, String bedType, String desc, String floor, String image, Integer price,
            Integer roomType, Byte smoke) {
        super();
        this.area = area;
        this.bedType = bedType;
        this.desc = desc;
        this.floor = floor;
        this.image = image;
        this.price = price;
        this.roomType = roomType;
        this.smoke = smoke;
    }
}