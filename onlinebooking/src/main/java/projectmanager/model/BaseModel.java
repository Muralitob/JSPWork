package projectmanager.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/** 映射超类，统一公共数据字段，并简化PO配置，减少编程代码量
 * @author fp
 */
@MappedSuperclass
public abstract class BaseModel {

	@Id
	@GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "system-uuid")
	@Column(unique = true, nullable = false, length = 38)
	private String guid;

	@Column(columnDefinition = "bit(1) default b'1'")
	private Byte valid = 1;

	public BaseModel() {
	    
	}
	
    public BaseModel(String guid, Byte valid) {
        super();
        this.guid = guid;
        this.valid = valid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

}