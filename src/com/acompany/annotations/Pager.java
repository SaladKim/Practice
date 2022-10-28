package com.acompany.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Pager {

    public Object getEndArticleNumber() {
        return this;
    }

    public Object getStartArticleNumber() {
        return this;
    }

    public  PageExplorer makePageExplorer(Class<? extends PageExplorer> cls, Object searchObject) {
        PageExplorer pageExplorer = makePageExplorer(cls, searchObject);

        Field[] fields = searchObject.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType() == EndRow.class) {
                    try {
                        field.setAccessible(true);
                        field.set(searchObject, this.getEndArticleNumber());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                } else if (annotation.annotationType() == StartRow.class) {
                    try {
                        field.setAccessible(true);
                        field.set(searchObject, this.getStartArticleNumber());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return pageExplorer;
    }

}
