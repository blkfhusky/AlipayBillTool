package com.zxc.entity;

import javax.persistence.*;

@Table(name = "my_user")
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean sex;

    private Integer age;

    @Column(name = "home_addr")
    private String homeAddr;

    @Column(name = "company_addr")
    private String companyAddr;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return home_addr
     */
    public String getHomeAddr() {
        return homeAddr;
    }

    /**
     * @param homeAddr
     */
    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    /**
     * @return company_addr
     */
    public String getCompanyAddr() {
        return companyAddr;
    }

    /**
     * @param companyAddr
     */
    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }
}