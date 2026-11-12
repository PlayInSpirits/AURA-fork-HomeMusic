package retrofit2;

import defpackage.b11;
import defpackage.h12;
import defpackage.tl1;
import defpackage.tz3;
import defpackage.vz2;
import defpackage.xa3;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
abstract class ParameterHandler<T> {

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, tz3> converter;
        private final Method method;
        private final int p;

        public Body(Method r1, int r2, Converter<T, tz3> r3) {
            this.method = r1;
            this.p = r2;
            this.converter = r3;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r5, @Nullable T r6) {
            if (r6 == null) goto L11;
            r5.setBody(this.converter.convert(r6));
            return;
        L7:
            e = move-exception;
            throw Utils.parameterError(this.method, e, this.p, "Unable to convert " + r6 + " to RequestBody", new Object[0]);
        L11:
            throw Utils.parameterError(this.method, this.p, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Field(String r2, Converter<T, String> r3, boolean r4) {
            Objects.requireNonNull(r2, "name == null");
            this.name = r2;
            this.valueConverter = r3;
            this.encoded = r4;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r2, @Nullable T r3) {
            if (r3 == null) goto L9;
            String r4 = this.valueConverter.convert(r3);
            if (r4 != null) goto L7;
            return;
        L7:
            r2.addFormField(this.name, r4, this.encoded);
            return;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public FieldMap(Method r1, int r2, Converter<T, String> r3, boolean r4) {
            this.method = r1;
            this.p = r2;
            this.valueConverter = r3;
            this.encoded = r4;
        }

        public void apply(RequestBuilder r7, @Nullable Map<String, T> r8) {
            if (r8 == null) goto L22;
            Iterator<Map.Entry<String, T>> r9 = r8.entrySet().iterator();
        L6:
            if (r9.hasNext() == false) goto L20;
            Map.Entry<String, T> r1 = r9.next();
            String r2 = r1.getKey();
            if (r2 == null) goto L19;
            T r3 = r1.getValue();
            if (r3 == null) goto L17;
            String r4 = this.valueConverter.convert(r3);
            if (r4 == null) goto L15;
            r7.addFormField(r2, r4, this.encoded);
            goto L6
        L15:
            throw Utils.parameterError(this.method, this.p, "Field map value '" + r3 + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + r2 + "'.", new Object[0]);
        L17:
            throw Utils.parameterError(this.method, this.p, xa3.h("Field map contained null value for key '", r2, "'."), new Object[0]);
        L19:
            throw Utils.parameterError(this.method, this.p, "Field map contained null key.", new Object[0]);
        L20:
            return;
        L22:
            throw Utils.parameterError(this.method, this.p, "Field map was null.", new Object[0]);
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable Object r2) {
            apply(r1, (Map) r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Header<T> extends ParameterHandler<T> {
        private final boolean allowUnsafeNonAsciiValues;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Header(String r2, Converter<T, String> r3, boolean r4) {
            Objects.requireNonNull(r2, "name == null");
            this.name = r2;
            this.valueConverter = r3;
            this.allowUnsafeNonAsciiValues = r4;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r2, @Nullable T r3) {
            if (r3 == null) goto L9;
            String r4 = this.valueConverter.convert(r3);
            if (r4 != null) goto L7;
            return;
        L7:
            r2.addHeader(this.name, r4, this.allowUnsafeNonAsciiValues);
            return;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean allowUnsafeNonAsciiValues;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public HeaderMap(Method r1, int r2, Converter<T, String> r3, boolean r4) {
            this.method = r1;
            this.p = r2;
            this.valueConverter = r3;
            this.allowUnsafeNonAsciiValues = r4;
        }

        public void apply(RequestBuilder r5, @Nullable Map<String, T> r6) {
            if (r6 == null) goto L18;
            Iterator<Map.Entry<String, T>> r7 = r6.entrySet().iterator();
        L6:
            if (r7.hasNext() == false) goto L16;
            Map.Entry<String, T> r1 = r7.next();
            String r2 = r1.getKey();
            if (r2 == null) goto L15;
            T r3 = r1.getValue();
            if (r3 == null) goto L13;
            r5.addHeader(r2, this.valueConverter.convert(r3), this.allowUnsafeNonAsciiValues);
            goto L6
        L13:
            throw Utils.parameterError(this.method, this.p, xa3.h("Header map contained null value for key '", r2, "'."), new Object[0]);
        L15:
            throw Utils.parameterError(this.method, this.p, "Header map contained null key.", new Object[0]);
        L16:
            return;
        L18:
            throw Utils.parameterError(this.method, this.p, "Header map was null.", new Object[0]);
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable Object r2) {
            apply(r1, (Map) r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Headers extends ParameterHandler<tl1> {
        private final Method method;
        private final int p;

        public Headers(Method r1, int r2) {
            this.method = r1;
            this.p = r2;
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public void apply2(RequestBuilder r2, @Nullable tl1 r3) {
            if (r3 == null) goto L6;
            r2.addHeaders(r3);
            return;
        L6:
            throw Utils.parameterError(this.method, this.p, "Headers parameter must not be null.", new Object[0]);
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable tl1 r2) {
            apply2(r1, r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, tz3> converter;
        private final tl1 headers;
        private final Method method;
        private final int p;

        public Part(Method r1, int r2, tl1 r3, Converter<T, tz3> r4) {
            this.method = r1;
            this.p = r2;
            this.headers = r3;
            this.converter = r4;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r4, @Nullable T r5) {
            if (r5 != null) goto L10;
            return;
        L10:
            r4.addPart(this.headers, this.converter.convert(r5));
            return;
        L7:
            e = move-exception;
            throw Utils.parameterError(this.method, this.p, "Unable to convert " + r5 + " to RequestBody", new Object[]{e});
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, tz3> valueConverter;

        public PartMap(Method r1, int r2, Converter<T, tz3> r3, String r4) {
            this.method = r1;
            this.p = r2;
            this.valueConverter = r3;
            this.transferEncoding = r4;
        }

        public void apply(RequestBuilder r7, @Nullable Map<String, T> r8) {
            if (r8 == null) goto L18;
            Iterator<Map.Entry<String, T>> r9 = r8.entrySet().iterator();
        L6:
            if (r9.hasNext() == false) goto L16;
            Map.Entry<String, T> r1 = r9.next();
            String r2 = r1.getKey();
            if (r2 == null) goto L15;
            T r3 = r1.getValue();
            if (r3 == null) goto L13;
            r7.addPart(h12.G(new String[]{"Content-Disposition", xa3.h("form-data; name=\"", r2, "\""), "Content-Transfer-Encoding", this.transferEncoding}), this.valueConverter.convert(r3));
            goto L6
        L13:
            throw Utils.parameterError(this.method, this.p, xa3.h("Part map contained null value for key '", r2, "'."), new Object[0]);
        L15:
            throw Utils.parameterError(this.method, this.p, "Part map contained null key.", new Object[0]);
        L16:
            return;
        L18:
            throw Utils.parameterError(this.method, this.p, "Part map was null.", new Object[0]);
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable Object r2) {
            apply(r1, (Map) r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        public Path(Method r1, int r2, String r3, Converter<T, String> r4, boolean r5) {
            this.method = r1;
            this.p = r2;
            Objects.requireNonNull(r3, "name == null");
            this.name = r3;
            this.valueConverter = r4;
            this.encoded = r5;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r3, @Nullable T r4) {
            if (r4 == null) goto L6;
            r3.addPathParam(this.name, this.valueConverter.convert(r4), this.encoded);
            return;
        L6:
            throw Utils.parameterError(this.method, this.p, b11.q(new StringBuilder("Path parameter \""), this.name, "\" value must not be null."), new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Query(String r2, Converter<T, String> r3, boolean r4) {
            Objects.requireNonNull(r2, "name == null");
            this.name = r2;
            this.valueConverter = r3;
            this.encoded = r4;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r2, @Nullable T r3) {
            if (r3 == null) goto L9;
            String r4 = this.valueConverter.convert(r3);
            if (r4 != null) goto L7;
            return;
        L7:
            r2.addQueryParam(this.name, r4, this.encoded);
            return;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        public QueryMap(Method r1, int r2, Converter<T, String> r3, boolean r4) {
            this.method = r1;
            this.p = r2;
            this.valueConverter = r3;
            this.encoded = r4;
        }

        public void apply(RequestBuilder r7, @Nullable Map<String, T> r8) {
            if (r8 == null) goto L22;
            Iterator<Map.Entry<String, T>> r9 = r8.entrySet().iterator();
        L6:
            if (r9.hasNext() == false) goto L20;
            Map.Entry<String, T> r1 = r9.next();
            String r2 = r1.getKey();
            if (r2 == null) goto L19;
            T r3 = r1.getValue();
            if (r3 == null) goto L17;
            String r4 = this.valueConverter.convert(r3);
            if (r4 == null) goto L15;
            r7.addQueryParam(r2, r4, this.encoded);
            goto L6
        L15:
            throw Utils.parameterError(this.method, this.p, "Query map value '" + r3 + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + r2 + "'.", new Object[0]);
        L17:
            throw Utils.parameterError(this.method, this.p, xa3.h("Query map contained null value for key '", r2, "'."), new Object[0]);
        L19:
            throw Utils.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
        L20:
            return;
        L22:
            throw Utils.parameterError(this.method, this.p, "Query map was null", new Object[0]);
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable Object r2) {
            apply(r1, (Map) r2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> r1, boolean r2) {
            this.nameConverter = r1;
            this.encoded = r2;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r2, @Nullable T r3) {
            if (r3 != null) goto L4;
            return;
        L4:
            r2.addQueryParam(this.nameConverter.convert(r3), null, this.encoded);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class RawPart extends ParameterHandler<vz2> {
        static final RawPart INSTANCE = null;

        static {
            INSTANCE = new RawPart();
        }

        private RawPart() {
        }

        @Override // retrofit2.ParameterHandler
        public /* bridge */ /* synthetic */ void apply(RequestBuilder r1, @Nullable vz2 r2) {
            apply2(r1, r2);
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public void apply2(RequestBuilder r1, @Nullable vz2 r2) {
            if (r2 == null) goto L5;
            r1.addPart(r2);
            return;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        public RelativeUrl(Method r1, int r2) {
            this.method = r1;
            this.p = r2;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r2, @Nullable Object r3) {
            if (r3 == null) goto L6;
            r2.setRelativeUrl(r3);
            return;
        L6:
            throw Utils.parameterError(this.method, this.p, "@Url parameter is null.", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        public Tag(Class<T> r1) {
            this.cls = r1;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder r1, @Nullable T r2) {
            r1.addTag(this.cls, r2);
        }
    }

    public ParameterHandler() {
    }

    public abstract void apply(RequestBuilder r1, @Nullable T r2);

    public final ParameterHandler<Object> array() {
        return new AnonymousClass2(this);
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new AnonymousClass1(this);
    }
}
