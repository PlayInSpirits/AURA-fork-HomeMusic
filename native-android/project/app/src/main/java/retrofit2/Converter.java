package retrofit2;

import defpackage.n14;
import defpackage.tz3;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface Converter<F, T> {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static abstract class Factory {
        public Factory() {
        }

        public static Type getParameterUpperBound(int r0, ParameterizedType r1) {
            return Utils.getParameterUpperBound(r0, r1);
        }

        public static Class<?> getRawType(Type r0) {
            return Utils.getRawType(r0);
        }

        @Nullable
        public Converter<?, tz3> requestBodyConverter(Type r1, Annotation[] r2, Annotation[] r3, Retrofit r4) {
            return null;
        }

        @Nullable
        public Converter<n14, ?> responseBodyConverter(Type r1, Annotation[] r2, Retrofit r3) {
            return null;
        }

        @Nullable
        public Converter<?, String> stringConverter(Type r1, Annotation[] r2, Retrofit r3) {
            return null;
        }
    }

    @Nullable
    T convert(F r1);
}
