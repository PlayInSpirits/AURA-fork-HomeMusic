package retrofit2;

import defpackage.b11;
import defpackage.e35;
import defpackage.f34;
import defpackage.gr1;
import defpackage.h12;
import defpackage.hu2;
import defpackage.kf2;
import defpackage.nz3;
import defpackage.oz3;
import defpackage.sl1;
import defpackage.tl1;
import defpackage.vd0;
import defpackage.ve5;
import defpackage.vz2;
import defpackage.xa3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class RequestFactory {
    private final gr1 baseUrl;

    @Nullable
    private final hu2 contentType;
    private final boolean hasBody;

    @Nullable
    private final tl1 headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;

    @Nullable
    private final String relativeUrl;
    private final Class<?> service;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class Builder {
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = null;
        private static final Pattern PARAM_URL_REGEX = null;

        @Nullable
        hu2 contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;

        @Nullable
        tl1 headers;

        @Nullable
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;

        @Nullable
        ParameterHandler<?>[] parameterHandlers;
        final Type[] parameterTypes;

        @Nullable
        String relativeUrl;

        @Nullable
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;
        final Class<?> service;

        static {
            PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
            PARAM_NAME_REGEX = Pattern.compile(PARAM);
        }

        public Builder(Retrofit r1, Class<?> r2, Method r3) {
            this.retrofit = r1;
            this.service = r2;
            this.method = r3;
            this.methodAnnotations = r3.getAnnotations();
            this.parameterTypes = r3.getGenericParameterTypes();
            this.parameterAnnotationsArray = r3.getParameterAnnotations();
        }

        private static Class<?> boxIfPrimitive(Class<?> r1) {
            if (Boolean.TYPE != r1) goto L7;
            return Boolean.class;
        L7:
            if (Byte.TYPE != r1) goto L11;
            return Byte.class;
        L11:
            if (Character.TYPE != r1) goto L15;
            return Character.class;
        L15:
            if (Double.TYPE != r1) goto L19;
            return Double.class;
        L19:
            if (Float.TYPE != r1) goto L23;
            return Float.class;
        L23:
            if (Integer.TYPE != r1) goto L27;
            return Integer.class;
        L27:
            if (Long.TYPE != r1) goto L31;
            return Long.class;
        L31:
            if (Short.TYPE != r1) goto L34;
            return Short.class;
        L34:
            return r1;
        }

        private tl1 parseHeaders(String[] r8, boolean r9) {
            sl1 r0 = new sl1();
            int r1 = r8.length;
            int r3 = 0;
        L3:
            if (r3 >= r1) goto L23;
            String r4 = r8[r3];
            int r5 = r4.indexOf(58);
            if (r5 == (-1)) goto L21;
            if (r5 == 0) goto L21;
            if (r5 == (r4.length() - 1)) goto L21;
            String r6 = r4.substring(0, r5);
            String r7 = r4.substring(r5 + 1).trim();
            if ("Content-Type".equalsIgnoreCase(r6) == true) goto L24;
            if (r9 == false) goto L18;
            r7.getClass();
            e35.G(r6);
            e35.p(r0, r6, r7);
        L19:
            r3 = r3 + 1;
            goto L3
        L18:
            r0.a(r6, r7);
            goto L19
        L24:
            r7.getClass();     // Catch: IllegalArgumentException -> L13
            this.contentType = ve5.a(r7);     // Catch: IllegalArgumentException -> L13
        L13:
            e = move-exception;
            throw Utils.methodError(this.method, e, "Malformed content type: %s", new Object[]{r7});
        L21:
            throw Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", new Object[]{r4});
        L23:
            return r0.c();
        }

        private void parseHttpMethodAndPath(String r2, String r3, boolean r4) {
            String r0 = this.httpMethod;
            if (r0 != null) goto L19;
            this.httpMethod = r2;
            this.hasBody = r4;
            if (r3.isEmpty() == false) goto L7;
            return;
        L7:
            int r5 = r3.indexOf(63);
            if (r5 != (-1)) goto L10;
        L16:
            this.relativeUrl = r3;
            this.relativeUrlParamNames = parsePathParameters(r3);
            return;
        L10:
            if (r5 >= (r3.length() - 1)) goto L16;
            String r6 = r3.substring(r5 + 1);
            if (PARAM_URL_REGEX.matcher(r6).find() == false) goto L16;
            throw Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", new Object[]{r6});
        L19:
            throw Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", new Object[]{r0, r2});
        }

        private void parseMethodAnnotation(Annotation r5) {
            if ((r5 instanceof DELETE) == false) goto L7;
            parseHttpMethodAndPath("DELETE", ((DELETE) r5).value(), false);
            return;
        L7:
            if ((r5 instanceof GET) == false) goto L11;
            parseHttpMethodAndPath("GET", ((GET) r5).value(), false);
            return;
        L11:
            if ((r5 instanceof HEAD) == false) goto L15;
            parseHttpMethodAndPath("HEAD", ((HEAD) r5).value(), false);
            return;
        L15:
            if ((r5 instanceof PATCH) == false) goto L19;
            parseHttpMethodAndPath("PATCH", ((PATCH) r5).value(), true);
            return;
        L19:
            if ((r5 instanceof POST) == false) goto L23;
            parseHttpMethodAndPath("POST", ((POST) r5).value(), true);
            return;
        L23:
            if ((r5 instanceof PUT) == false) goto L27;
            parseHttpMethodAndPath("PUT", ((PUT) r5).value(), true);
            return;
        L27:
            if ((r5 instanceof OPTIONS) == false) goto L31;
            parseHttpMethodAndPath("OPTIONS", ((OPTIONS) r5).value(), false);
            return;
        L31:
            if ((r5 instanceof HTTP) == false) goto L35;
            HTTP r6 = (HTTP) r5;
            parseHttpMethodAndPath(r6.method(), r6.path(), r6.hasBody());
            return;
        L35:
            if ((r5 instanceof Headers) == false) goto L43;
            Headers r7 = (Headers) r5;
            String[] r0 = r7.value();
            if (r0.length == 0) goto L41;
            this.headers = parseHeaders(r0, r7.allowUnsafeNonAsciiValues());
            return;
        L41:
            throw Utils.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
        L43:
            if ((r5 instanceof Multipart) == false) goto L51;
            if (this.isFormEncoded == true) goto L49;
            this.isMultipart = true;
            return;
        L49:
            throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
        L51:
            if ((r5 instanceof FormUrlEncoded) == true) goto L53;
            return;
        L53:
            if (this.isMultipart == true) goto L57;
            this.isFormEncoded = true;
            return;
        L57:
            throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
        }

        @Nullable
        private ParameterHandler<?> parseParameter(int r7, Type r8, @Nullable Annotation[] r9, boolean r10) {
            if (r9 == null) goto L14;
            int r2 = r9.length;
            int r3 = 0;
            ParameterHandler<?> r4 = null;
        L5:
            if (r3 >= r2) goto L15;
            ParameterHandler<?> r5 = parseParameterAnnotation(r7, r8, r9, r9[r3]);
            if (r5 == null) goto L11;
            if (r4 != null) goto L13;
            r4 = r5;
            goto L11
        L13:
            throw Utils.parameterError(this.method, r7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
        L11:
            r3 = r3 + 1;
        L15:
            if (r4 != null) goto L23;
            if (r10 == false) goto L22;
            if (Utils.getRawType(r8) != vd0.class) goto L22;
            this.isKotlinSuspendFunction = true;     // Catch: NoClassDefFoundError -> L24
            return null;
        L22:
            throw Utils.parameterError(this.method, r7, "No Retrofit annotation found.", new Object[0]);
        L23:
            return r4;
        L14:
            r4 = null;
            goto L15
        }

        @Nullable
        private ParameterHandler<?> parseParameterAnnotation(int r11, Type r12, Annotation[] r13, Annotation r14) {
            if ((r14 instanceof Url) == false) goto L43;
            validateResolvableType(r11, r12);
            if (this.gotUrl == true) goto L41;
            if (this.gotPath == true) goto L39;
            if (this.gotQuery == true) goto L37;
            if (this.gotQueryName == true) goto L35;
            if (this.gotQueryMap == true) goto L33;
            if (this.relativeUrl != null) goto L31;
            this.gotUrl = true;
            if (r12 == gr1.class) goto L29;
            if (r12 == String.class) goto L29;
            if (r12 == URI.class) goto L29;
            if ((r12 instanceof Class) == false) goto L27;
            if ("android.net.Uri".equals(((Class) r12).getName()) == true) goto L29;
        L27:
            throw Utils.parameterError(this.method, r11, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
        L29:
            return new ParameterHandler.RelativeUrl(this.method, r11);
        L31:
            throw Utils.parameterError(this.method, r11, "@Url cannot be used with @%s URL", new Object[]{this.httpMethod});
        L33:
            throw Utils.parameterError(this.method, r11, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
        L35:
            throw Utils.parameterError(this.method, r11, "A @Url parameter must not come after a @QueryName.", new Object[0]);
        L37:
            throw Utils.parameterError(this.method, r11, "A @Url parameter must not come after a @Query.", new Object[0]);
        L39:
            throw Utils.parameterError(this.method, r11, "@Path parameters may not be used with @Url.", new Object[0]);
        L41:
            throw Utils.parameterError(this.method, r11, "Multiple @Url method annotations found.", new Object[0]);
        L43:
            if ((r14 instanceof Path) == false) goto L67;
            validateResolvableType(r11, r12);
            if (this.gotQuery == true) goto L65;
            if (this.gotQueryName == true) goto L63;
            if (this.gotQueryMap == true) goto L61;
            if (this.gotUrl == true) goto L59;
            if (this.relativeUrl == null) goto L57;
            this.gotPath = true;
            Path r15 = (Path) r14;
            String r3 = r15.value();
            validatePathName(r11, r3);
            return new ParameterHandler.Path(this.method, r11, r3, this.retrofit.stringConverter(r12, r13), r15.encoded());
        L57:
            throw Utils.parameterError(this.method, r11, "@Path can only be used with relative url on @%s", new Object[]{this.httpMethod});
        L59:
            throw Utils.parameterError(this.method, r11, "@Path parameters may not be used with @Url.", new Object[0]);
        L61:
            throw Utils.parameterError(this.method, r11, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
        L63:
            throw Utils.parameterError(this.method, r11, "A @Path parameter must not come after a @QueryName.", new Object[0]);
        L65:
            throw Utils.parameterError(this.method, r11, "A @Path parameter must not come after a @Query.", new Object[0]);
        L67:
            if ((r14 instanceof Query) == false) goto L83;
            validateResolvableType(r11, r12);
            Query r16 = (Query) r14;
            String r0 = r16.value();
            boolean r17 = r16.encoded();
            Class<?> r2 = Utils.getRawType(r12);
            this.gotQuery = true;
            if (Iterable.class.isAssignableFrom(r2) == false) goto L77;
            if ((r12 instanceof ParameterizedType) == false) goto L75;
            return new ParameterHandler.Query(r0, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) r12), r13), r17).iterable();
        L75:
            throw Utils.parameterError(this.method, r11, r2.getSimpleName() + " must include generic type (e.g., " + r2.getSimpleName() + "<String>)", new Object[0]);
        L77:
            if (r2.isArray() == false) goto L81;
            return new ParameterHandler.Query(r0, this.retrofit.stringConverter(boxIfPrimitive(r2.getComponentType()), r13), r17).array();
        L81:
            return new ParameterHandler.Query(r0, this.retrofit.stringConverter(r12, r13), r17);
        L83:
            if ((r14 instanceof QueryName) == false) goto L99;
            validateResolvableType(r11, r12);
            boolean r18 = ((QueryName) r14).encoded();
            Class<?> r1 = Utils.getRawType(r12);
            this.gotQueryName = true;
            if (Iterable.class.isAssignableFrom(r1) == false) goto L93;
            if ((r12 instanceof ParameterizedType) == false) goto L91;
            return new ParameterHandler.QueryName(this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) r12), r13), r18).iterable();
        L91:
            throw Utils.parameterError(this.method, r11, r1.getSimpleName() + " must include generic type (e.g., " + r1.getSimpleName() + "<String>)", new Object[0]);
        L93:
            if (r1.isArray() == false) goto L97;
            return new ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(r1.getComponentType()), r13), r18).array();
        L97:
            return new ParameterHandler.QueryName(this.retrofit.stringConverter(r12, r13), r18);
        L99:
            if ((r14 instanceof QueryMap) == false) goto L115;
            validateResolvableType(r11, r12);
            Class<?> r4 = Utils.getRawType(r12);
            this.gotQueryMap = true;
            if (Map.class.isAssignableFrom(r4) == false) goto L113;
            Type r19 = Utils.getSupertype(r12, r4, Map.class);
            if ((r19 instanceof ParameterizedType) == false) goto L111;
            ParameterizedType r110 = (ParameterizedType) r19;
            Type r5 = Utils.getParameterUpperBound(0, r110);
            if (String.class != r5) goto L109;
            return new ParameterHandler.QueryMap(this.method, r11, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, r110), r13), ((QueryMap) r14).encoded());
        L109:
            throw Utils.parameterError(this.method, r11, "@QueryMap keys must be of type String: " + r5, new Object[0]);
        L111:
            throw Utils.parameterError(this.method, r11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
        L113:
            throw Utils.parameterError(this.method, r11, "@QueryMap parameter type must be Map.", new Object[0]);
        L115:
            if ((r14 instanceof Header) == false) goto L131;
            validateResolvableType(r11, r12);
            Header r111 = (Header) r14;
            String r6 = r111.value();
            Class<?> r7 = Utils.getRawType(r12);
            if (Iterable.class.isAssignableFrom(r7) == false) goto L125;
            if ((r12 instanceof ParameterizedType) == false) goto L123;
            return new ParameterHandler.Header(r6, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) r12), r13), r111.allowUnsafeNonAsciiValues()).iterable();
        L123:
            throw Utils.parameterError(this.method, r11, r7.getSimpleName() + " must include generic type (e.g., " + r7.getSimpleName() + "<String>)", new Object[0]);
        L125:
            if (r7.isArray() == false) goto L129;
            return new ParameterHandler.Header(r6, this.retrofit.stringConverter(boxIfPrimitive(r7.getComponentType()), r13), r111.allowUnsafeNonAsciiValues()).array();
        L129:
            return new ParameterHandler.Header(r6, this.retrofit.stringConverter(r12, r13), r111.allowUnsafeNonAsciiValues());
        L131:
            if ((r14 instanceof HeaderMap) == false) goto L151;
            if (r12 == tl1.class) goto L135;
            validateResolvableType(r11, r12);
            Class<?> r8 = Utils.getRawType(r12);
            if (Map.class.isAssignableFrom(r8) == false) goto L149;
            Type r112 = Utils.getSupertype(r12, r8, Map.class);
            if ((r112 instanceof ParameterizedType) == false) goto L147;
            ParameterizedType r113 = (ParameterizedType) r112;
            Type r9 = Utils.getParameterUpperBound(0, r113);
            if (String.class != r9) goto L145;
            return new ParameterHandler.HeaderMap(this.method, r11, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, r113), r13), ((HeaderMap) r14).allowUnsafeNonAsciiValues());
        L145:
            throw Utils.parameterError(this.method, r11, "@HeaderMap keys must be of type String: " + r9, new Object[0]);
        L147:
            throw Utils.parameterError(this.method, r11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
        L149:
            throw Utils.parameterError(this.method, r11, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
        L135:
            return new ParameterHandler.Headers(this.method, r11);
        L151:
            if ((r14 instanceof Field) == false) goto L171;
            validateResolvableType(r11, r12);
            if (this.isFormEncoded == false) goto L169;
            Field r114 = (Field) r14;
            String r10 = r114.value();
            boolean r115 = r114.encoded();
            this.gotField = true;
            Class<?> r20 = Utils.getRawType(r12);
            if (Iterable.class.isAssignableFrom(r20) == false) goto L163;
            if ((r12 instanceof ParameterizedType) == false) goto L161;
            return new ParameterHandler.Field(r10, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) r12), r13), r115).iterable();
        L161:
            throw Utils.parameterError(this.method, r11, r20.getSimpleName() + " must include generic type (e.g., " + r20.getSimpleName() + "<String>)", new Object[0]);
        L163:
            if (r20.isArray() == false) goto L167;
            return new ParameterHandler.Field(r10, this.retrofit.stringConverter(boxIfPrimitive(r20.getComponentType()), r13), r115).array();
        L167:
            return new ParameterHandler.Field(r10, this.retrofit.stringConverter(r12, r13), r115);
        L169:
            throw Utils.parameterError(this.method, r11, "@Field parameters can only be used with form encoding.", new Object[0]);
        L171:
            if ((r14 instanceof FieldMap) == false) goto L191;
            validateResolvableType(r11, r12);
            if (this.isFormEncoded == false) goto L189;
            Class<?> r21 = Utils.getRawType(r12);
            if (Map.class.isAssignableFrom(r21) == false) goto L187;
            Type r116 = Utils.getSupertype(r12, r21, Map.class);
            if ((r116 instanceof ParameterizedType) == false) goto L185;
            ParameterizedType r117 = (ParameterizedType) r116;
            Type r22 = Utils.getParameterUpperBound(0, r117);
            if (String.class != r22) goto L183;
            Converter r118 = this.retrofit.stringConverter(Utils.getParameterUpperBound(1, r117), r13);
            this.gotField = true;
            return new ParameterHandler.FieldMap(this.method, r11, r118, ((FieldMap) r14).encoded());
        L183:
            throw Utils.parameterError(this.method, r11, "@FieldMap keys must be of type String: " + r22, new Object[0]);
        L185:
            throw Utils.parameterError(this.method, r11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
        L187:
            throw Utils.parameterError(this.method, r11, "@FieldMap parameter type must be Map.", new Object[0]);
        L189:
            throw Utils.parameterError(this.method, r11, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
        L191:
            if ((r14 instanceof Part) == false) goto L251;
            validateResolvableType(r11, r12);
            if (this.isMultipart == false) goto L249;
            Part r119 = (Part) r14;
            this.gotPart = true;
            String r23 = r119.value();
            Class<?> r24 = Utils.getRawType(r12);
            if (r23.isEmpty() == true) goto L197;
            tl1 r120 = h12.G(new String[]{"Content-Disposition", xa3.h("form-data; name=\"", r23, "\""), "Content-Transfer-Encoding", r119.encoding()});
            if (Iterable.class.isAssignableFrom(r24) == false) goto L235;
            if ((r12 instanceof ParameterizedType) == false) goto L233;
            Type r121 = Utils.getParameterUpperBound(0, (ParameterizedType) r12);
            if (vz2.class.isAssignableFrom(Utils.getRawType(r121)) == true) goto L231;
            return new ParameterHandler.Part(this.method, r11, r120, this.retrofit.requestBodyConverter(r121, r13, this.methodAnnotations)).iterable();
        L231:
            throw Utils.parameterError(this.method, r11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
        L233:
            throw Utils.parameterError(this.method, r11, r24.getSimpleName() + " must include generic type (e.g., " + r24.getSimpleName() + "<String>)", new Object[0]);
        L235:
            if (r24.isArray() == false) goto L243;
            Class<?> r122 = boxIfPrimitive(r24.getComponentType());
            if (vz2.class.isAssignableFrom(r122) == true) goto L241;
            return new ParameterHandler.Part(this.method, r11, r120, this.retrofit.requestBodyConverter(r122, r13, this.methodAnnotations)).array();
        L241:
            throw Utils.parameterError(this.method, r11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
        L243:
            if (vz2.class.isAssignableFrom(r24) == true) goto L247;
            return new ParameterHandler.Part(this.method, r11, r120, this.retrofit.requestBodyConverter(r12, r13, this.methodAnnotations));
        L247:
            throw Utils.parameterError(this.method, r11, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
        L197:
            if (Iterable.class.isAssignableFrom(r24) == false) goto L209;
            if ((r12 instanceof ParameterizedType) == false) goto L207;
            if (vz2.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) r12))) == false) goto L205;
            return ParameterHandler.RawPart.INSTANCE.iterable();
        L205:
            throw Utils.parameterError(this.method, r11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
        L207:
            throw Utils.parameterError(this.method, r11, r24.getSimpleName() + " must include generic type (e.g., " + r24.getSimpleName() + "<String>)", new Object[0]);
        L209:
            if (r24.isArray() == false) goto L217;
            if (vz2.class.isAssignableFrom(r24.getComponentType()) == false) goto L215;
            return ParameterHandler.RawPart.INSTANCE.array();
        L215:
            throw Utils.parameterError(this.method, r11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
        L217:
            if (vz2.class.isAssignableFrom(r24) == false) goto L221;
            return ParameterHandler.RawPart.INSTANCE;
        L221:
            throw Utils.parameterError(this.method, r11, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
        L249:
            throw Utils.parameterError(this.method, r11, "@Part parameters can only be used with multipart encoding.", new Object[0]);
        L251:
            if ((r14 instanceof PartMap) == false) goto L275;
            validateResolvableType(r11, r12);
            if (this.isMultipart == false) goto L273;
            this.gotPart = true;
            Class<?> r25 = Utils.getRawType(r12);
            if (Map.class.isAssignableFrom(r25) == false) goto L271;
            Type r123 = Utils.getSupertype(r12, r25, Map.class);
            if ((r123 instanceof ParameterizedType) == false) goto L269;
            ParameterizedType r124 = (ParameterizedType) r123;
            Type r26 = Utils.getParameterUpperBound(0, r124);
            if (String.class != r26) goto L267;
            Type r125 = Utils.getParameterUpperBound(1, r124);
            if (vz2.class.isAssignableFrom(Utils.getRawType(r125)) == true) goto L265;
            return new ParameterHandler.PartMap(this.method, r11, this.retrofit.requestBodyConverter(r125, r13, this.methodAnnotations), ((PartMap) r14).encoding());
        L265:
            throw Utils.parameterError(this.method, r11, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
        L267:
            throw Utils.parameterError(this.method, r11, "@PartMap keys must be of type String: " + r26, new Object[0]);
        L269:
            throw Utils.parameterError(this.method, r11, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
        L271:
            throw Utils.parameterError(this.method, r11, "@PartMap parameter type must be Map.", new Object[0]);
        L273:
            throw Utils.parameterError(this.method, r11, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
        L275:
            if ((r14 instanceof Body) == false) goto L293;
            validateResolvableType(r11, r12);
            if (this.isFormEncoded == true) goto L291;
            if (this.isMultipart == true) goto L291;
            if (this.gotBody == true) goto L289;
            Converter r126 = this.retrofit.requestBodyConverter(r12, r13, this.methodAnnotations);     // Catch: RuntimeException -> L285
            this.gotBody = true;
            return new ParameterHandler.Body(this.method, r11, r126);
        L285:
            e = move-exception;
            throw Utils.parameterError(this.method, e, r11, "Unable to create @Body converter for %s", new Object[]{r12});
        L289:
            throw Utils.parameterError(this.method, r11, "Multiple @Body method annotations found.", new Object[0]);
        L291:
            throw Utils.parameterError(this.method, r11, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
        L293:
            if ((r14 instanceof Tag) == false) goto L306;
            validateResolvableType(r11, r12);
            Class<?> r127 = Utils.getRawType(r12);
            int r128 = r11 - 1;
        L295:
            if (r128 < 0) goto L305;
            ParameterHandler<?> r129 = this.parameterHandlers[r128];
            if ((r129 instanceof ParameterHandler.Tag) == false) goto L303;
            if (((ParameterHandler.Tag) r129).cls.equals(r127) == false) goto L303;
            Method r130 = this.method;
            StringBuilder r27 = new StringBuilder("@Tag type ");
            r27.append(r127.getName());
            r27.append(" is duplicate of ");
            throw Utils.parameterError(r130, r11, b11.q(r27, Platform.reflection.describeMethodParameter(this.method, r128), " and would always overwrite its value."), new Object[0]);
        L303:
            r128 = r128 - 1;
            goto L295
        L305:
            return new ParameterHandler.Tag(r127);
        L306:
            return null;
        }

        public static Set<String> parsePathParameters(String r2) {
            Matcher r3 = PARAM_URL_REGEX.matcher(r2);
            LinkedHashSet r0 = new LinkedHashSet();
        L4:
            if (r3.find() == false) goto L6;
            r0.add(r3.group(1));
            goto L4
        L6:
            return r0;
        }

        private void validatePathName(int r2, String r3) {
            if (PARAM_NAME_REGEX.matcher(r3).matches() == false) goto L10;
            if (this.relativeUrlParamNames.contains(r3) == false) goto L8;
            return;
        L8:
            throw Utils.parameterError(this.method, r2, "URL \"%s\" does not contain \"{%s}\".", new Object[]{this.relativeUrl, r3});
        L10:
            throw Utils.parameterError(this.method, r2, "@Path parameter name must match %s. Found: %s", new Object[]{PARAM_URL_REGEX.pattern(), r3});
        }

        private void validateResolvableType(int r2, Type r3) {
            if (Utils.hasUnresolvableType(r3) == true) goto L6;
            return;
        L6:
            throw Utils.parameterError(this.method, r2, "Parameter type must not include a type variable or wildcard: %s", new Object[]{r3});
        }

        public RequestFactory build() {
            Annotation[] r0 = this.methodAnnotations;
            int r1 = r0.length;
            int r3 = 0;
        L3:
            if (r3 >= r1) goto L6;
            parseMethodAnnotation(r0[r3]);
            r3 = r3 + 1;
            goto L3
        L6:
            if (this.httpMethod == null) goto L59;
            if (this.hasBody == false) goto L10;
        L18:
            int r2 = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new ParameterHandler[r2];
            int r4 = r2 - 1;
            int r5 = 0;
        L19:
            if (r5 >= r2) goto L26;
            ParameterHandler<?>[] r6 = this.parameterHandlers;
            Type r7 = this.parameterTypes[r5];
            Annotation[] r8 = this.parameterAnnotationsArray[r5];
            if (r5 != r4) goto L23;
            boolean r9 = true;
        L24:
            r6[r5] = parseParameter(r5, r7, r8, r9);
            r5 = r5 + 1;
            goto L19
        L23:
            r9 = false;
            goto L24
        L26:
            if (this.relativeUrl == null) goto L28;
        L32:
            boolean r10 = this.isFormEncoded;
            if (r10 == false) goto L35;
        L43:
            if (r10 == false) goto L50;
            if (this.gotField == true) goto L50;
            throw Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
        L50:
            if (this.isMultipart == false) goto L57;
            if (this.gotPart == true) goto L57;
            throw Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
        L57:
            return new RequestFactory(this);
        L35:
            if (this.isMultipart == true) goto L43;
            if (this.hasBody == true) goto L43;
            if (this.gotBody == false) goto L43;
            throw Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
        L28:
            if (this.gotUrl == true) goto L32;
            throw Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", new Object[]{this.httpMethod});
        L10:
            if (this.isMultipart == true) goto L17;
            if (this.isFormEncoded == false) goto L18;
            throw Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        L17:
            throw Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        L59:
            throw Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    public RequestFactory(Builder r2) {
        this.service = r2.service;
        this.method = r2.method;
        this.baseUrl = r2.retrofit.baseUrl;
        this.httpMethod = r2.httpMethod;
        this.relativeUrl = r2.relativeUrl;
        this.headers = r2.headers;
        this.contentType = r2.contentType;
        this.hasBody = r2.hasBody;
        this.isFormEncoded = r2.isFormEncoded;
        this.isMultipart = r2.isMultipart;
        this.parameterHandlers = r2.parameterHandlers;
        this.isKotlinSuspendFunction = r2.isKotlinSuspendFunction;
    }

    public static RequestFactory parseAnnotations(Retrofit r1, Class<?> r2, Method r3) {
        return new Builder(r1, r2, r3).build();
    }

    public oz3 create(@Nullable Object r13, Object[] r14) {
        ParameterHandler<?>[] r0 = this.parameterHandlers;
        int r1 = r14.length;
        if (r1 != r0.length) goto L12;
        RequestBuilder r3 = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        if (this.isKotlinSuspendFunction == false) goto L7;
        r1 = r1 - 1;
    L7:
        ArrayList r2 = new ArrayList(r1);
        int r4 = 0;
    L8:
        if (r4 >= r1) goto L10;
        r2.add(r14[r4]);
        r0[r4].apply(r3, r14[r4]);
        r4 = r4 + 1;
        goto L8
    L10:
        nz3 r15 = r3.get();
        r15.c(Invocation.class, new Invocation(this.service, r13, this.method, r2));
        return new oz3(r15);
    L12:
        kf2.n(f34.i(f34.j(r1, "Argument count (", ") doesn't match expected count ("), r0.length, ")"));
        return null;
    }
}
