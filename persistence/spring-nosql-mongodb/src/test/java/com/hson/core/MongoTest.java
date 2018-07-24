package com.hson.core;

import com.hson.core.bean.MongoBean;
import com.hson.core.db.EmbeddedMongoDb;
import com.hson.core.model.Usuario;
import com.hson.core.repository.UsuarioRepository;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Hyun Woo Son on 7/23/18.
 */
@ContextConfiguration(classes=AppConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoTest {

    private static Logger logger = LoggerFactory.getLogger(MongoTest.class);


    private static EmbeddedMongoDb embeddedMongoDb;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MongoBean mongoBean;

    @BeforeClass
    public static void setupBefore() throws Exception{
        embeddedMongoDb = new EmbeddedMongoDb();
        embeddedMongoDb.start();
    }

    @Before
    public void setup() throws Exception{


        usuarioRepository.deleteAll();
    }

    @Test
    public void testRepository(){

        assertEquals(0, usuarioRepository.count());

        Usuario usuario = crearUsuario();
        usuario =usuarioRepository.save(usuario);
        assertEquals(1, usuarioRepository.count());


        Usuario usuarioEncontrado = usuarioRepository.findOne(usuario.getId());


        logger.info("usuario encontrado {}",usuarioEncontrado.getName());


        Usuario usuarioPablo =usuarioRepository.findUsuarioByName("Pablo");

        logger.info("usuario encontrado {}",usuarioPablo.getName());


    }

    @Test
    public void testBean(){
        Usuario usuario =new Usuario("Juan",33);
        mongoBean.save(usuario);

        assertEquals(1, usuarioRepository.count());




    }


    private Usuario crearUsuario(){
        Usuario usuario = new Usuario();
        usuario.setName("Pablo");
        usuario.setAge(22);
        return usuario;
    }


    @AfterClass
    public static void stop(){
        embeddedMongoDb.stop();
    }

}
