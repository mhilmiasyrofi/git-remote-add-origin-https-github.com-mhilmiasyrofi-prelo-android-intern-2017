package model;

import java.util.ArrayList;

/**
 * Created by hilmi on 13/04/2017.
 */

public class Data {
    private ArrayList<String> shipping_preferences_ids;

    public ArrayList<String> getShippingPreferencesIds() { return this.shipping_preferences_ids; }

    public void setShippingPreferencesIds(ArrayList<String> shipping_preferences_ids) { this.shipping_preferences_ids = shipping_preferences_ids; }

    private String _id;

    public String getId() { return this._id; }

    public void setId(String _id) { this._id = _id; }

    private Profile profile;

    public Profile getProfile() { return this.profile; }

    public void setProfile(Profile profile) { this.profile = profile; }

    private String username;

    public String getUsername() { return this.username; }

    public void setUsername(String username) { this.username = username; }

    private String email;

    public String getEmail() { return this.email; }

    public void setEmail(String email) { this.email = email; }

    private String fullname;

    public String getFullname() { return this.fullname; }

    public void setFullname(String fullname) { this.fullname = fullname; }

    private Others others;

    public Others getOthers() { return this.others; }

    public void setOthers(Others others) { this.others = others; }

    private DefaultAddress default_address;

    public DefaultAddress getDefaultAddress() { return this.default_address; }

    public void setDefaultAddress(DefaultAddress default_address) { this.default_address = default_address; }

    private String token;

    public String getToken() { return this.token; }

    public void setToken(String token) { this.token = token; }
}


