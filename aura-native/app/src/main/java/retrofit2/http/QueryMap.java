package retrofit2.http;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface QueryMap {
    boolean encoded() default false;
}
