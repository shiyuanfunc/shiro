/*
 * File Name: User.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description:
 * Author: Pi Chen
 * Create Date: 2016年5月24日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月24日
 * Bugzilla Id:
 * Modify Content:
 */
package cn.edu.hdu.ssd.model;

/**
 *
 * @author Pi Chen
 * @version ssd V1.0.0, 2016年5月24日
 * @see
 * @since ssd V1.0.0
 */

public class User
{

    private long id;
    private String name;
    private String address;
    private String password;


    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return the password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password)
    {
        this.password = password;
    }

}
