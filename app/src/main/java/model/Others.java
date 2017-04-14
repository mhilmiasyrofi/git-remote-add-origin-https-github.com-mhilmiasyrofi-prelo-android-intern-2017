package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by hilmi on 13/04/2017.
 */

public class Others {
    private Date register_time;

    public Date getRegisterTime() { return this.register_time; }

    public void setRegisterTime(Date register_time) { this.register_time = register_time; }

    private String platform_register_from;

    public String getPlatformRegisterFrom() { return this.platform_register_from; }

    public void setPlatformRegisterFrom(String platform_register_from) { this.platform_register_from = platform_register_from; }

    private Date last_login;

    public Date getLastLogin() { return this.last_login; }

    public void setLastLogin(Date last_login) { this.last_login = last_login; }

    private boolean register_by_fb;

    public boolean getRegisterByFb() { return this.register_by_fb; }

    public void setRegisterByFb(boolean register_by_fb) { this.register_by_fb = register_by_fb; }

    private boolean register_by_path;

    public boolean getRegisterByPath() { return this.register_by_path; }

    public void setRegisterByPath(boolean register_by_path) { this.register_by_path = register_by_path; }

    private boolean register_by_twitter;

    public boolean getRegisterByTwitter() { return this.register_by_twitter; }

    public void setRegisterByTwitter(boolean register_by_twitter) { this.register_by_twitter = register_by_twitter; }

    private Date last_update_ga_id;

    public Date getLastUpdateGaId() { return this.last_update_ga_id; }

    public void setLastUpdateGaId(Date last_update_ga_id) { this.last_update_ga_id = last_update_ga_id; }

    private String device_registration_id;

    public String getDeviceRegistrationId() { return this.device_registration_id; }

    public void setDeviceRegistrationId(String device_registration_id) { this.device_registration_id = device_registration_id; }

    private String device_type;

    public String getDeviceType() { return this.device_type; }

    public void setDeviceType(String device_type) { this.device_type = device_type; }

    private Date last_sent_sms;

    public Date getLastSentSms() { return this.last_sent_sms; }

    public void setLastSentSms(Date last_sent_sms) { this.last_sent_sms = last_sent_sms; }

    private boolean is_phone_verified;

    public boolean getIsPhoneVerified() { return this.is_phone_verified; }

    public void setIsPhoneVerified(boolean is_phone_verified) { this.is_phone_verified = is_phone_verified; }

    private int total_sent_sms;

    public int getTotalSentSms() { return this.total_sent_sms; }

    public void setTotalSentSms(int total_sent_sms) { this.total_sent_sms = total_sent_sms; }

    private String email_code;

    public String getEmailCode() { return this.email_code; }

    public void setEmailCode(String email_code) { this.email_code = email_code; }

    private boolean is_email_verified;

    public boolean getIsEmailVerified() { return this.is_email_verified; }

    public void setIsEmailVerified(boolean is_email_verified) { this.is_email_verified = is_email_verified; }

    private int num_reviewer;

    public int getNumReviewer() { return this.num_reviewer; }

    public void setNumReviewer(int num_reviewer) { this.num_reviewer = num_reviewer; }

    private int total_star;

    public int getTotalStar() { return this.total_star; }

    public void setTotalStar(int total_star) { this.total_star = total_star; }

    private boolean sms_verification_not_sent;

    public boolean getSmsVerificationNotSent() { return this.sms_verification_not_sent; }

    public void setSmsVerificationNotSent(boolean sms_verification_not_sent) { this.sms_verification_not_sent = sms_verification_not_sent; }

    private Date last_seen;

    public Date getLastSeen() { return this.last_seen; }

    public void setLastSeen(Date last_seen) { this.last_seen = last_seen; }

    private int total_views;

    public int getTotalViews() { return this.total_views; }

    public void setTotalViews(int total_views) { this.total_views = total_views; }

    private Date last_open_notification;

    public Date getLastOpenNotification() { return this.last_open_notification; }

    public void setLastOpenNotification(Date last_open_notification) { this.last_open_notification = last_open_notification; }

    private int max_push_in_period;

    public int getMaxPushInPeriod() { return this.max_push_in_period; }

    public void setMaxPushInPeriod(int max_push_in_period) { this.max_push_in_period = max_push_in_period; }

    private int push_product_period;

    public int getPushProductPeriod() { return this.push_product_period; }

    public void setPushProductPeriod(int push_product_period) { this.push_product_period = push_product_period; }

    private ArrayList<String> category_preferences_ids;

    public ArrayList<String> getCategoryPreferencesIds() { return this.category_preferences_ids; }

    public void setCategoryPreferencesIds(ArrayList<String> category_preferences_ids) { this.category_preferences_ids = category_preferences_ids; }

    private ArrayList<String> fa_id;

    public ArrayList<String> getFaId() { return this.fa_id; }

    public void setFaId(ArrayList<String> fa_id) { this.fa_id = fa_id; }

    private ArrayList<String> ga_id;

    public ArrayList<String> getGaId() { return this.ga_id; }

    public void setGaId(ArrayList<String> ga_id) { this.ga_id = ga_id; }
}