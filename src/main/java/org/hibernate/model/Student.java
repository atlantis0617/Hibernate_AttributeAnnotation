package org.hibernate.model;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="t_student")
/**
 * 　@Id：必须，定义了映射到数据库表的主键属性，一个实体可以有一个或多个属性被映射为主键（如果有多个属性定义为主键属性，则必须实现Serializable接口）
　　@EmbeddableId：可选，使用嵌入式主键类实现复合主键（嵌入式主键类必须实现Serializable接口、必须有默认的无参构造器、必须覆盖equals和hashCode方法）
 * 
 * */



public class Student {
	@EmbeddedId
    public StudentPK id;// 主键
     
    public String name;// 姓名
     
    public String sex;// 性别
     
    public Date birthday;// 出生日期
     
    @Embedded
    public Address address;// 地址
     
    /**
     * @Transient：可选，表示该属性并非一个数据库表的字段的映射，ORM框架将忽略该属性
     * */
    @Transient
    public String gf;// 女朋友
    
    public Student(StudentPK id, String name, String sex, Date birthday, Address address, String gf) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.gf = gf;
    }

	public StudentPK getId() {
		return id;
	}

	public void setId(StudentPK id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGf() {
		return gf;
	}

	public void setGf(String gf) {
		this.gf = gf;
	}
    
}
