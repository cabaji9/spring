package com.hson.core.introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Hyun Woo Son on 6/1/18
 **/
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.hson.core.bean.Performance+",defaultImpl = DefaultEncoreable.class)
    public static EncoreableInterface encoreableInterface;

}
