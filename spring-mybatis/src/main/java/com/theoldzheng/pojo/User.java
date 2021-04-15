package com.theoldzheng.pojo;

/**
 * Description:
 *
 * @author theoldzheng@163.com  @ZYD
 * @create 2021.4.15 11:04
 */
public class User {
    private Integer id;
    private String name;
    private String password;
    private String tx_password;

    public User(Integer id, String name, String password, String tx_password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.tx_password = tx_password;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "UserMapper{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", tx_password='" + tx_password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTx_password() {
        return tx_password;
    }

    public void setTx_password(String tx_password) {
        this.tx_password = tx_password;
    }
}
