package com.hson.core;

import com.hson.core.bean.CompactDisc;
import com.hson.core.vo.SongVo;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CompactDiscTest {


    @Rule
    public TestWatcherUtilMethodName testWatcherUtilMethodName = new TestWatcherUtilMethodName();

    @Autowired
    private CompactDisc compactDisc;





    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }


    @Test
    @WithMockUser(username = "user",roles = { "ADMIN" })
    public void testPlay(){

        compactDisc.play();
    }

    @Test(expected = AccessDeniedException.class)
    @WithMockUser(username = "user",roles = { "USER" })
    public void testPlayFail(){

        compactDisc.play();
    }


    @Test
    @WithMockUser(username = "user",roles={"ADMIN"})
    public void testPlaySongPreAuthorize(){

        SongVo songVo = new SongVo();
        songVo.setTitle("AB");
        songVo.setTrack("1");
        compactDisc.playSong(songVo);
    }

    @Test(expected = AccessDeniedException.class)
    @WithMockUser(username = "user",roles={"ADMIN"})
    public void testPlaySongPreAuthorizeFail(){

        SongVo songVo = new SongVo();
        songVo.setTitle("ABBA");
        songVo.setTrack("1");
        compactDisc.playSong(songVo);
    }





}

