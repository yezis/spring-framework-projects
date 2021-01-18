package com.yezi.spring.configuration.b_profile.selector;

import com.yezi.spring.configuration.b_profile.bean.Bar;
import com.yezi.spring.configuration.b_profile.config.BarConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
    }

}
