package hilmi.profile_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import hilmi.login_activity.LoginActivity;
import hilmi.login_activity.R;
import model.Data;
import model.DefaultAddress;
import model.LoginResponse;
import model.LoveListResponse;


public class ProfileActivity extends AppCompatActivity {

    Toolbar mProfileToolbar;

    public static final String LOVE_LIST_URL = "https://dev.prelo.id/api/me/lovelist"; //get?Authorization="+ LoginActivity.loginResponse.getData().getToken() ;

    private String auth;
    private String token;

    public static LoveListResponse loveListResponse;
    private Gson gson;

    //Creating Views
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mProfileToolbar = (Toolbar) findViewById(R.id.profile_toolbar);
        setSupportActionBar(mProfileToolbar);
        try {
            getSupportActionBar().setTitle(LoginActivity.loginResponse.getData().getUsername());
        } catch (Exception e){
            getSupportActionBar().setTitle("Profile Title");
        }

        LoginResponse loginResponse = LoginActivity.loginResponse;
        Data userData = loginResponse.getData();
        DefaultAddress address = userData.getDefaultAddress();

        ImageView imageView = (ImageView) findViewById(R.id.profile_image);
        TextView fullnameView = (TextView) findViewById(R.id.fullname);
        TextView usernameView = (TextView) findViewById(R.id.username);
        TextView emailView = (TextView) findViewById(R.id.email);
        TextView addressView = (TextView) findViewById(R.id.address);

        fullnameView.setText(userData.getFullname());
        usernameView.setText(userData.getUsername());
        emailView.setText(userData.getEmail());
        addressView.setText(address.getSubdistrictName() + ", " + address.getRegionName() + ", " + address.getProvinceName());
        Glide.with(this).load(userData.getProfile().getPict()).into(imageView);

        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").create();

        userLoveList();

        //Initializing Views
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


    }

    private void userLoveList() {

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, LOVE_LIST_URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        loveListResponse = gson.fromJson(response.toString(), LoveListResponse.class);

                        //Finally initializing our adapter
                        adapter = new CardAdapter(loveListResponse, getApplicationContext());

                        //Adding adapter to recyclerview
                        recyclerView.setAdapter(adapter);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        String json = null;

                        displayMessage(error.toString());

                        NetworkResponse response = error.networkResponse;
                        if(response != null && response.data != null){
                            switch(response.statusCode){
                                case 400:
                                    json = new String(response.data);
                                    json = trimMessage(json, "_data");
                                    if(json != null) displayMessage(json);
                                    break;
                            }
                        }
                    }
                }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("Authorization", "Token " + LoginActivity.loginResponse.getData().getToken().trim());

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(jsonObjectRequest);
    }

    public String trimMessage(String json, String key){
        String trimmedString = null;

        try{
            JSONObject obj = new JSONObject(json);
            trimmedString = obj.getString(key);
        } catch(JSONException e){
            e.printStackTrace();
            return null;
        }

        return trimmedString;
    }

    public void displayMessage(String toastString){
        Toast.makeText(ProfileActivity.this, toastString, Toast.LENGTH_LONG).show();
    }
}
