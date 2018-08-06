package com.hson.core.vo;

/**
 * Created by Hyun Woo Son on 8/6/18.
 */
public class SongVo {

    private String title;

    private String track;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "SongVo{" +
                "title='" + title + '\'' +
                ", track='" + track + '\'' +
                '}';
    }
}
