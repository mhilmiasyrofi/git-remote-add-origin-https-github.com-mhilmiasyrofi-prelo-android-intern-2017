package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hilmi on 14/04/2017.
 */
public class Datum
{
    private String _id;

    public String getId() { return this._id; }

    public void setId(String _id) { this._id = _id; }

    private String seller_id;

    public String getSellerId() { return this.seller_id; }

    public void setSellerId(String seller_id) { this.seller_id = seller_id; }

    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    private String category_id;

    public String getCategoryId() { return this.category_id; }

    public void setCategoryId(String category_id) { this.category_id = category_id; }

    private String brand_id;

    public String getBrandId() { return this.brand_id; }

    public void setBrandId(String brand_id) { this.brand_id = brand_id; }

    private String special_story;

    public String getSpecialStory() { return this.special_story; }

    public void setSpecialStory(String special_story) { this.special_story = special_story; }

    private int price;

    public int getPrice() { return this.price; }

    public void setPrice(int price) { this.price = price; }

    private int price_original;

    public int getPriceOriginal() { return this.price_original; }

    public void setPriceOriginal(int price_original) { this.price_original = price_original; }

    private int status;

    public int getStatus() { return this.status; }

    public void setStatus(int status) { this.status = status; }

    private int free_ongkir;

    public int getFreeOngkir() { return this.free_ongkir; }

    public void setFreeOngkir(int free_ongkir) { this.free_ongkir = free_ongkir; }

    private int num_lovelist;

    public int getNumLovelist() { return this.num_lovelist; }

    public void setNumLovelist(int num_lovelist) { this.num_lovelist = num_lovelist; }

    private int num_comment;

    public int getNumComment() { return this.num_comment; }

    public void setNumComment(int num_comment) { this.num_comment = num_comment; }

    private String permalink;

    public String getPermalink() { return this.permalink; }

    public void setPermalink(String permalink) { this.permalink = permalink; }

    private ArrayList<String> display_picts;

    public ArrayList<String> getDisplayPicts() { return this.display_picts; }

    public void setDisplayPicts(ArrayList<String> display_picts) { this.display_picts = display_picts; }

    private String update_time_uuid;

    public String getUpdateTimeUuid() { return this.update_time_uuid; }

    public void setUpdateTimeUuid(String update_time_uuid) { this.update_time_uuid = update_time_uuid; }

    private Date update_time;

    public Date getUpdateTime() { return this.update_time; }

    public void setUpdateTime(Date update_time) { this.update_time = update_time; }

    private String proposed_brand;

    public String getProposedBrand() { return this.proposed_brand; }

    public void setProposedBrand(String proposed_brand) { this.proposed_brand = proposed_brand; }
}