package org.hibernate.model;

import javax.persistence.Embeddable;

/**
 * @author atlantis0617
 *地址类
 */
@Embeddable
public class Address {
	private String postCode;// 邮编
    
    private String address;// 地址
     
    private String telephone;// 电话
     
    public Address() {
 
    }
 
    public Address(String postCode, String address, String telephone) {
        this.postCode = postCode;
        this.address = address;
        this.telephone = telephone;
    }

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
    
}
