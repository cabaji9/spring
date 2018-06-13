package com.hson.core;

import com.hson.core.bean.CDPlayerMethodWire;
import com.hson.core.bean.CompactDisc;
import com.hson.core.bean.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Hyun Woo Son on 11/20/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:springbeans.xml"})
public class CdPlayerTest {

    //autowiring with different implementations
    @Autowired
    @Qualifier("compactDisc")
    private CompactDisc compactDisc;

    @Autowired
    @Qualifier("cdPlayer")
    private MediaPlayer mediaPlayer;

    @Autowired
    @Qualifier("cdPlayerOld")
    private MediaPlayer mediaPlayerOld;

    @Autowired
    @Qualifier("cdPlayeBlankr")
    private MediaPlayer mediaPlayerBlank;



    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc blankDisk;

    @Autowired
    @Qualifier("cdPlayerMethodWire")
    private CDPlayerMethodWire cdPlayerMethodWire;

    @Autowired
    @Qualifier("cdPlayerMethodWireNameSpace")
    private CDPlayerMethodWire cdPlayerMethodWireNameSpace;


    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
        assertNotNull(mediaPlayer);
        assertNotNull(mediaPlayerBlank);
        assertNotNull(blankDisk);
        assertNotNull(cdPlayerMethodWire);
        assertNotNull(mediaPlayerOld);

    }


    @Test
    public void testPlay(){
        mediaPlayer.play();
    }


    @Test
    public void testPlayBlank(){
        mediaPlayerBlank.play();
    }


    @Test
    public void testPlayWiredMethod(){
        cdPlayerMethodWire.play();
    }


    @Test
    public void testPlayWiredMethodNamespace(){
        cdPlayerMethodWireNameSpace.play();
    }

    @Test
    public void testMediaPlayerOld(){
        mediaPlayerOld.play();
    }

}

