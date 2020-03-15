package com.helloweenvsfei.util.ip;

/*
* LumaQQ - Java QQ Client
*
* Copyright (C) 2004 luma <stubma@163.com>
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
*/



/**
 * <pre>
 * 一條IP範圍記錄，不僅包括國家和區域，也包括起始IP和結束IP
 * </pre>
 * 
 * @author 馬若劼
 */
public class IPEntry {
    public String beginIp;
    public String endIp;
    public String country;
    public String area;
    
    /**
     * 建構函數
     */
    public IPEntry() {
        beginIp = endIp = country = area = "";
    }
    
    public String toString(){
    	return this.area+"  "+this.country+"  IP範圍:"+this.beginIp+"-"+this.endIp;
    }
} 


 
