package com.hson.core.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Hyun Woo Son on 5/15/18
 **/
public class MagicNoExistsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return !conditionContext.getEnvironment().containsProperty("magic");
    }
}
