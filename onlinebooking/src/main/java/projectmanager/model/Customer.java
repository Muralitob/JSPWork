package projectmanager.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer extends projectmanager.model.BaseModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String address;

	private String code;

	private String fax;

	@Column(name="full_name")
	private String fullName;

	private String name;

	private String phone;

	public Customer() {
	}

	public Customer(String address, String code, String fax, String fullName, String name, String phone) {
        super();
        this.address = address;
        this.code = code;
        this.fax = fax;
        this.fullName = fullName;
        this.name = name;
        this.phone = phone;
    }

    public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}