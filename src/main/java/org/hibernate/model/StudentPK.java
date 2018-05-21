package org.hibernate.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author atlantis0617
 *学生主键类
 */
public class StudentPK implements Serializable{

	private static final long serialVersionUID = -5971853268866295022L;
	
	/**
	 * @GeneratedValue：可选，用于定义主键生成策略（@GeneratedValue(strategy=GenerationType.*, generator="")）
　　　　strategy：定义主键生成策略
　　　　　　- GenerationType.AUTO：根据底层数据库自动选择（默认）
　　　　　　- GenerationType.IDENTITY：根据数据库的Identity字段生成
　　　　　　- GenerationType.SEQUENCE：根据Sequence来决定主键的取值
　　　　　　- GenerationType.TABLE：使用指定表来决定主键取值，结合@TableGenerator使用
　　　　generator：引用@GenericGenerator指定的主键生成策略
	 * 
	 * **/
	
	 @GeneratedValue
	 private long sid;// 学号
	 
	@GeneratedValue(generator="custom")
    @GenericGenerator(name="custom", strategy="assigned")
    @Column(length = 18)
    private String id; // 身份证号
	
	
	public StudentPK() {
    
	}
    public StudentPK(long sid, String id) {
        this.sid = sid;
        this.id = id;
    }
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
	@Override
    public int hashCode() {
        return super.hashCode();
    }
	
	@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
	
	

}
