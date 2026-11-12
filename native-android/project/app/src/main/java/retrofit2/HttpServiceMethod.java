package retrofit2;

import defpackage.fy;
import defpackage.k14;
import defpackage.n14;
import defpackage.vd0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {
    private final fy callFactory;
    private final RequestFactory requestFactory;
    private final Converter<n14, ResponseT> responseConverter;

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {
        private final CallAdapter<ResponseT, ReturnT> callAdapter;

        public CallAdapted(RequestFactory r1, fy r2, Converter<n14, ResponseT> r3, CallAdapter<ResponseT, ReturnT> r4) {
            super(r1, r2, r3);
            this.callAdapter = r4;
        }

        @Override // retrofit2.HttpServiceMethod
        public ReturnT adapt(Call<ResponseT> r1, Object[] r2) {
            return this.callAdapter.adapt(r1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;
        private final boolean isNullable;
        private final boolean isUnit;

        public SuspendForBody(RequestFactory r1, fy r2, Converter<n14, ResponseT> r3, CallAdapter<ResponseT, Call<ResponseT>> r4, boolean r5, boolean r6) {
            super(r1, r2, r3);
            this.callAdapter = r4;
            this.isNullable = r5;
            this.isUnit = r6;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> r2, Object[] r3) {
            Call<ResponseT> r4 = this.callAdapter.adapt(r2);
            vd0 r5 = (vd0) r3[r3.length - 1];
        L17:
            e = move-exception;
            throw e;
        L7:
            th = move-exception;
            return KotlinExtensions.suspendAndThrow(th, r5);
        L4:
            if (this.isUnit == false) goto L10;
            return KotlinExtensions.awaitUnit(r4, r5);
        L10:
            if (this.isNullable == false) goto L14;
            return KotlinExtensions.awaitNullable(r4, r5);
        L14:
            return KotlinExtensions.await(r4, r5);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {
        private final CallAdapter<ResponseT, Call<ResponseT>> callAdapter;

        public SuspendForResponse(RequestFactory r1, fy r2, Converter<n14, ResponseT> r3, CallAdapter<ResponseT, Call<ResponseT>> r4) {
            super(r1, r2, r3);
            this.callAdapter = r4;
        }

        @Override // retrofit2.HttpServiceMethod
        public Object adapt(Call<ResponseT> r1, Object[] r2) {
            Call<ResponseT> r0 = this.callAdapter.adapt(r1);
            vd0 r3 = (vd0) r2[r2.length - 1];
            return KotlinExtensions.awaitResponse(r0, r3);
        L5:
            e = move-exception;
            return KotlinExtensions.suspendAndThrow(e, r3);
        }
    }

    public HttpServiceMethod(RequestFactory r1, fy r2, Converter<n14, ResponseT> r3) {
        this.requestFactory = r1;
        this.callFactory = r2;
        this.responseConverter = r3;
    }

    private static <ResponseT, ReturnT> CallAdapter<ResponseT, ReturnT> createCallAdapter(Retrofit r0, Method r1, Type r2, Annotation[] r3) {
        return (CallAdapter<ResponseT, ReturnT>) r0.callAdapter(r2, r3);
    L4:
        e = move-exception;
        throw Utils.methodError(r1, e, "Unable to create call adapter for %s", new Object[]{r2});
    }

    private static <ResponseT> Converter<n14, ResponseT> createResponseConverter(Retrofit r1, Method r2, Type r3) {
        return r1.responseBodyConverter(r3, r2.getAnnotations());
    L5:
        e = move-exception;
        throw Utils.methodError(r2, e, "Unable to create converter for %s", new Object[]{r3});
    }

    public static <ResponseT, ReturnT> HttpServiceMethod<ResponseT, ReturnT> parseAnnotations(Retrofit r11, Method r12, RequestFactory r13) {
        boolean r0 = r13.isKotlinSuspendFunction;
        Annotation[] r1 = r12.getAnnotations();
        if (r0 == false) goto L15;
        Type[] r4 = r12.getGenericParameterTypes();
        Type r5 = Utils.getParameterLowerBound(0, (ParameterizedType) r4[r4.length - 1]);
        if (Utils.getRawType(r5) != Response.class) goto L10;
        if ((r5 instanceof ParameterizedType) == false) goto L10;
        r5 = Utils.getParameterUpperBound(0, (ParameterizedType) r5);
        boolean r6 = false;
        boolean r8 = true;
    L12:
        Type r9 = new Utils.ParameterizedTypeImpl(null, Call.class, new Type[]{r5});
        r1 = SkipCallbackExecutorImpl.ensurePresent(r1);
        boolean r10 = r6;
    L16:
        CallAdapter r2 = createCallAdapter(r11, r12, r9, r1);
        Type r7 = r2.responseType();
        if (r7 == k14.class) goto L40;
        if (r7 == Response.class) goto L38;
        if (r13.httpMethod.equals("HEAD") == true) goto L22;
    L28:
        Converter r14 = createResponseConverter(r11, r12, r7);
        fy r15 = r11.callFactory;
        if (r0 == false) goto L31;
        if (r8 == false) goto L36;
        return new SuspendForResponse(r13, r15, r14, r2);
    L36:
        return new SuspendForBody(r13, r15, r14, r2, false, r10);
    L31:
        return new CallAdapted(r13, r15, r14, r2);
    L22:
        if (Void.class.equals(r7) == true) goto L28;
        if (Utils.isUnit(r7) == true) goto L28;
        throw Utils.methodError(r12, "HEAD method must use Void or Unit as response type.", new Object[0]);
    L38:
        throw Utils.methodError(r12, "Response must include generic type (e.g., Response<String>)", new Object[0]);
    L40:
        throw Utils.methodError(r12, "'" + Utils.getRawType(r7).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
    L10:
        if (Utils.getRawType(r5) == Call.class) goto L14;
        r6 = Utils.isUnit(r5);
        r8 = false;
        goto L12
    L14:
        throw Utils.methodError(r12, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", new Object[]{Utils.getParameterUpperBound(0, (ParameterizedType) r5)});
    L15:
        r9 = r12.getGenericReturnType();
        r8 = false;
        r10 = false;
        goto L16
    }

    @Nullable
    public abstract ReturnT adapt(Call<ResponseT> r1, Object[] r2);

    @Override // retrofit2.ServiceMethod
    @Nullable
    public final ReturnT invoke(Object r7, Object[] r8) {
        return adapt(new OkHttpCall(this.requestFactory, r7, r8, this.callFactory, this.responseConverter), r8);
    }
}
