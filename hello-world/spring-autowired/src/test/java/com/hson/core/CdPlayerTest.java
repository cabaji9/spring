package com.hson.core;

import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CompactDiscConfig.class)
public class CdPlayerTest {

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer mediaPlayer;




    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
        assertNotNull(mediaPlayer);
    }


    @Test
    public void testPlay(){
        mediaPlayer.play();
    }

}

