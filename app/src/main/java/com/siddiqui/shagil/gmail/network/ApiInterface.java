package com.siddiqui.shagil.gmail.network;

import com.siddiqui.shagil.gmail.model.Message;

import java.util.List;

import retrofit2.Call;

/**
 * Created by shagil on 25/4/17.
 */

public interface ApiInterface {
    Call<List<Message>> getInbox();
}
