package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface CallAdapter<R, T> {

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
        public abstract CallAdapter<?, ?> get(Type r1, Annotation[] r2, Retrofit r3);
    }

    T adapt(Call<R> r1);

    Type responseType();
}
