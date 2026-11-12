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

        public OptionalConverter(Converter<n14, T> r1) {
            this.delegate = r1;
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public Optional<T> convert2(n14 r1) {
            return Optional.ofNullable(this.delegate.convert(r1));
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ Object convert(n14 r1) {
            return convert2(r1);
        }
    }

    public OptionalConverterFactory() {
    }

    public static OptionalConverterFactory create() {
        return new OptionalConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<n14, ?> responseBodyConverter(Type r2, Annotation[] r3, Retrofit r4) {
        if (Converter.Factory.getRawType(r2) == Optional.class) goto L7;
        return null;
    L7:
        return new OptionalConverter(r4.responseBodyConverter(Converter.Factory.getParameterUpperBound(0, (ParameterizedType) r2), r3));
    }
}
