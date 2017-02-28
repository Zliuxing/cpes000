package com.atguigu.cpes.bean;


public class Cert {
    private Integer id;
    private String name,address;

    public void setAddress(String address){
            this.address = address;
	        }
		    public String getAddress(){
		            return this.address;
			        }


    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
