package com.yezi.spring.configuration.c_conditional.conditional;

import com.yezi.spring.configuration.c_conditional.bean.Boss;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBossCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        boolean countain = conditionContext.getBeanFactory().containsBeanDefinition(Boss.class.getName());
        return countain;
    }
}
