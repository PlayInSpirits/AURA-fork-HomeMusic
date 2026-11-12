package retrofit2;

import defpackage.n14;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class OptionalConverterFactory extends Converter.Factory {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class OptionalConverter<T> implements Converter<n14, Optional<T>> {
        private final Converter<n14, T> delegate;

        public OptionalConverter(Converter<n14, T> converter) {
            this.delegate = converter;
        }

        @Override // retrofit2.Converter
        public Optional<T> convert(n14 n14Var) {
            return Optional.ofNullable(this.delegate.convert(n14Var));
        }
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<n14, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (Converter.Factory.getRawType(type) != Optional.class) {
            return null;
        }
        return new OptionalConverter(retrofit.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
