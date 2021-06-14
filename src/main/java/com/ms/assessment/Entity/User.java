package com.ms.assessment.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;

    @Column
    private String userName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private Date createdOn;
    
    @Column
    private Long score;
    
    
//    @ManyToMany(mappedBy="particpants")
//    private List<MCQ> mcqList;
    
    @JsonIgnore
    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<User_Mcq> userMcqList;
	
	@JsonIgnore
    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<User_Project> userProjectList;

    public List<User_Mcq> getUserMcqList() {
		return userMcqList;
	}

	public void setUserMcqList(List<User_Mcq> userMcqList) {
		this.userMcqList = userMcqList;
	}

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
