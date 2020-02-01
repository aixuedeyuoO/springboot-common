package com.stream.bean;

/**
*
*  @author Jun Mowen
*/
public class TestTable {

    private Integer id;

    private String name;

    private String testMessage;

    private java.time.LocalDateTime updatedTime;

    private java.time.LocalDateTime createdTime;

    public void setId(Integer id){this.id = id;}

    public Integer getId(){return this.id;}

    public void setName(String name){this.name = name;}

    public String getName(){return this.name;}

    public void setTestMessage(String testMessage){this.testMessage = testMessage;}

    public String getTestMessage(){return this.testMessage;}

    public void setUpdatedTime(java.time.LocalDateTime updatedTime){this.updatedTime = updatedTime;}

    public java.time.LocalDateTime getUpdatedTime(){return this.updatedTime;}

    public void setCreatedTime(java.time.LocalDateTime createdTime){this.createdTime = createdTime;}

    public java.time.LocalDateTime getCreatedTime(){return this.createdTime;}

}
