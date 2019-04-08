package com.bigoat.demo.databindinglivedataviewmode;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class UserViewMode extends ViewModel {
    private MutableLiveData<User> user;

    public MutableLiveData<User> getUser() {
        if (user == null) {
            user = new MutableLiveData<>();
            loadUser();
        }
        return user;
    }

    private void loadUser() {
        User u = new User();
        u.name = "bigoat";

        user.setValue(u);
    }
}
