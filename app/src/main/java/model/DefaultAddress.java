package model;

import java.util.Date;

/**
 * Created by hilmi on 13/04/2017.
 */

public class DefaultAddress {
    private String _id;

    public String getId() { return this._id; }

    public void setId(String _id) { this._id = _id; }

    private boolean is_default;

    public boolean getIsDefault() { return this.is_default; }

    public void setIsDefault(boolean is_default) { this.is_default = is_default; }

    private Date create_time;

    public Date getCreateTime() { return this.create_time; }

    public void setCreateTime(Date create_time) { this.create_time = create_time; }

    private String postal_code;

    public String getPostalCode() { return this.postal_code; }

    public void setPostalCode(String postal_code) { this.postal_code = postal_code; }

    private String address;

    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = address; }

    private String subdistrict_name;

    public String getSubdistrictName() { return this.subdistrict_name; }

    public void setSubdistrictName(String subdistrict_name) { this.subdistrict_name = subdistrict_name; }

    private String subdistrict_id;

    public String getSubdistrictId() { return this.subdistrict_id; }

    public void setSubdistrictId(String subdistrict_id) { this.subdistrict_id = subdistrict_id; }

    private String region_name;

    public String getRegionName() { return this.region_name; }

    public void setRegionName(String region_name) { this.region_name = region_name; }

    private String region_id;

    public String getRegionId() { return this.region_id; }

    public void setRegionId(String region_id) { this.region_id = region_id; }

    private String province_name;

    public String getProvinceName() { return this.province_name; }

    public void setProvinceName(String province_name) { this.province_name = province_name; }

    private String province_id;

    public String getProvinceId() { return this.province_id; }

    public void setProvinceId(String province_id) { this.province_id = province_id; }

    private String phone;

    public String getPhone() { return this.phone; }

    public void setPhone(String phone) { this.phone = phone; }

    private String owner_name;

    public String getOwnerName() { return this.owner_name; }

    public void setOwnerName(String owner_name) { this.owner_name = owner_name; }

    private String address_name;

    public String getAddressName() { return this.address_name; }

    public void setAddressName(String address_name) { this.address_name = address_name; }
}

