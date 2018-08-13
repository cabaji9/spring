package com.hson.core.bean;

import com.hson.core.vo.SongVo;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
public interface CompactDisc {


    void play();

    void playSong(SongVo songVo);

    SongVo obtainSongVo(String title,String track);
}
