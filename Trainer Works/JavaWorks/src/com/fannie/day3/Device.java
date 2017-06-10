package com.fannie.day3;

public class Device implements Comparable<Device>{
	private int dId;
	private String dName;
	private double price;
	
	/*
	 
	public boolean equals(Object arg0) {
		Device device = (Device) arg0;
		
		return 
			this.dId== device.dId && 
			this.dName.equals(device.dName) && 
			this.price == device.price;
	}

	@Override
	public int hashCode() {
		return this.dName.charAt(0);
	}
	
	*/
	
	

	public Device(){}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dId;
		result = prime * result + ((dName == null) ? 0 : dName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Device other = (Device) obj;
		if (dId != other.dId)
			return false;
		if (dName == null) {
			if (other.dName != null)
				return false;
		} else if (!dName.equals(other.dName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	public Device(int dId, String dName, double price) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [dId=" + dId + ", dName=" + dName + ", price=" + price + "]" + this.hashCode();
	}
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Device o) {
		return this.dId - o.dId;
	}
	
	
}
