package ru.androidacademy.spb.gallerylist;

import android.support.annotation.NonNull;

/**
 * Created by User on 21.04.2018.
 */

public class Parrot {
    @NonNull
    private final String url;

    public  Parrot(@NonNull String url){this.url = url;}

    @NonNull
    public String getUrl() {
        return url;
    }
}
