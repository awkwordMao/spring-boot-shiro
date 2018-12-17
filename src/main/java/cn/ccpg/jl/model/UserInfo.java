package cn.ccpg.jl.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class UserInfo implements Serializable {
    @Id
//    @GeneratedValue
    private Integer uid;
    @Column(unique = true)
    private String userName;
    private String name;
    private String password;
    private String salt;
    private byte statu;
    @ManyToMany
    @JoinTable(name = "SysUserRole", joinColumns = {@JoinColumn(name = "uid")}, inverseJoinColumns = @JoinColumn(name = "roleId"))
    private List<SysRole> roleList;

    public UserInfo() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte getStatu() {
        return statu;
    }

    public void setStatu(byte statu) {
        this.statu = statu;
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
}
