package retrofit2;

import defpackage.j15;
import defpackage.n14;
import defpackage.tz3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.http.Streaming;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class BuiltInConverters extends Converter.Factory {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class BufferingResponseBodyConverter implements Converter<n14, n14> {
        static final BufferingResponseBodyConverter INSTANCE = null;

        static {
            INSTANCE = new BufferingResponseBodyConverter();
        }

        public BufferingResponseBodyConverter() {
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public n14 convert2(n14 r1) {
            n14 r0 = Utils.buffer(r1);     // Catch: Throwable -> L5
            r1.close();
            return r0;
        L5:
            th = move-exception;
            r1.close();
            throw th;
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ n14 convert(n14 r1) {
            return convert2(r1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class RequestBodyConverter implements Converter<tz3, tz3> {
        static final RequestBodyConverter INSTANCE = null;

        static {
            INSTANCE = new RequestBodyConverter();
        }

        public RequestBodyConverter() {
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ tz3 convert(tz3 r1) {
            return convert2(r1);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public tz3 convert2(tz3 r1) {
            return r1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class StreamingResponseBodyConverter implements Converter<n14, n14> {
        static final StreamingResponseBodyConverter INSTANCE = null;

        static {
            INSTANCE = new StreamingResponseBodyConverter();
        }

        public StreamingResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ n14 convert(n14 r1) {
            return convert2(r1);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public n14 convert2(n14 r1) {
            return r1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class ToStringConverter implements Converter<Object, String> {
        static final ToStringConverter INSTANCE = null;

        static {
            INSTANCE = new ToStringConverter();
        }

        public ToStringConverter() {
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ String convert(Object r1) {
            return convert2(r1);
        }

        @Override // retrofit2.Converter
        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public String convert2(Object r1) {
            return r1.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class UnitResponseBodyConverter implements Converter<n14, j15> {
        static final UnitResponseBodyConverter INSTANCE = null;

        static {
            INSTANCE = new UnitResponseBodyConverter();
        }

        public UnitResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ j15 convert(n14 r1) {
            return convert2(r1);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public j15 convert2(n14 r1) {
            r1.close();
            return j15.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class VoidResponseBodyConverter implements Converter<n14, Void> {
        static final VoidResponseBodyConverter INSTANCE = null;

        static {
            INSTANCE = new VoidResponseBodyConverter();
        }

        public VoidResponseBodyConverter() {
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ Void convert(n14 r1) {
            return convert2(r1);
        }

        /* JADX INFO: renamed from: convert, reason: avoid collision after fix types in other method */
        public Void convert2(n14 r1) {
            r1.close();
            return null;
        }
    }

    public BuiltInConverters() {
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<?, tz3> requestBodyConverter(Type r1, Annotation[] r2, Annotation[] r3, Retrofit r4) {
        if (tz3.class.isAssignableFrom(Utils.getRawType(r1)) == true) goto L5;
        return null;
    L5:
        return RequestBodyConverter.INSTANCE;
    }

    @Override // retrofit2.Converter.Factory
    @Nullable
    public Converter<n14, ?> responseBodyConverter(Type r1, Annotation[] r2, Retrofit r3) {
        if (r1 != n14.class) goto L11;
        if (Utils.isAnnotationPresent(r2, Streaming.class) == false) goto L9;
        return StreamingResponseBodyConverter.INSTANCE;
    L9:
        return BufferingResponseBodyConverter.INSTANCE;
    L11:
        if (r1 != Void.class) goto L15;
        return VoidResponseBodyConverter.INSTANCE;
    L15:
        if (Utils.isUnit(r1) == true) goto L17;
        return null;
    L17:
        return UnitResponseBodyConverter.INSTANCE;
    }
}
