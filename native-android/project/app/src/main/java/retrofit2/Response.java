package retrofit2;

import defpackage.f34;
import defpackage.fv3;
import defpackage.gq1;
import defpackage.k14;
import defpackage.kf2;
import defpackage.n14;
import defpackage.nz2;
import defpackage.nz3;
import defpackage.oz3;
import defpackage.pr3;
import defpackage.sl1;
import defpackage.tl1;
import defpackage.xe5;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Response<T> {

    @Nullable
    private final T body;

    @Nullable
    private final n14 errorBody;
    private final k14 rawResponse;

    private Response(k14 r1, @Nullable T r2, @Nullable n14 r3) {
        this.rawResponse = r1;
        this.body = r2;
        this.errorBody = r3;
    }

    public static <T> Response<T> error(int r17, n14 r18) {
        Objects.requireNonNull(r18, "body == null");
        if (r17 < 400) goto L10;
        byte[] r1 = xe5.a;
        gq1 r16 = gq1.q;
        ArrayList r2 = new ArrayList(20);
        OkHttpCall.NoContentResponseBody r7 = new OkHttpCall.NoContentResponseBody(r18.contentType(), r18.contentLength());
        nz3 r3 = new nz3();
        r3.d("http://localhost/");
        oz3 r5 = new oz3(r3);
        if (r17 < 0) goto L8;
        tl1 r6 = new tl1((String[]) r2.toArray(new String[0]));
        return error(r18, new k14(r5, pr3.q, "Response.error()", r17, null, r6, r7, null, null, null, 0, 0, null, r16));
    L8:
        nz2.f(f34.f(r17, "code < 0: "));
        return null;
    L10:
        kf2.n(f34.f(r17, "code < 400: "));
        return null;
    }

    public static <T> Response<T> success(int r17, @Nullable T r18) {
        if (r17 >= 200) goto L5;
    L12:
        kf2.n(f34.f(r17, "code < 200 or >= 300: "));
        return null;
    L5:
        if (r17 >= 300) goto L12;
        fv3 r7 = xe5.e;
        gq1 r16 = gq1.q;
        ArrayList r0 = new ArrayList(20);
        nz3 r2 = new nz3();
        r2.d("http://localhost/");
        oz3 r1 = new oz3(r2);
        if (r17 < 0) goto L10;
        tl1 r6 = new tl1((String[]) r0.toArray(new String[0]));
        return success(r18, new k14(r1, pr3.q, "Response.success()", r17, null, r6, r7, null, null, null, 0, 0, null, r16));
    L10:
        nz2.f(f34.f(r17, "code < 0: "));
        return null;
    }

    @Nullable
    public T body() {
        return this.body;
    }

    public int code() {
        return this.rawResponse.q;
    }

    @Nullable
    public n14 errorBody() {
        return this.errorBody;
    }

    public tl1 headers() {
        return this.rawResponse.s;
    }

    public boolean isSuccessful() {
        return this.rawResponse.C;
    }

    public String message() {
        return this.rawResponse.p;
    }

    public k14 raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    public static <T> Response<T> success(@Nullable T r2, k14 r3) {
        Objects.requireNonNull(r3, "rawResponse == null");
        if (r3.C == true) goto L5;
        kf2.n("rawResponse must be successful response");
        return null;
    L5:
        return new Response(r3, r2, null);
    }

    public static <T> Response<T> success(@Nullable T r18, tl1 r19) {
        Objects.requireNonNull(r19, "headers == null");
        fv3 r8 = xe5.e;
        gq1 r17 = gq1.q;
        new ArrayList(20);
        sl1 r0 = r19.d();
        nz3 r1 = new nz3();
        r1.d("http://localhost/");
        oz3 r2 = new oz3(r1);
        tl1 r7 = r0.c();
        return success(r18, new k14(r2, pr3.q, "OK", 200, null, r7, r8, null, null, null, 0, 0, null, r17));
    }

    public static <T> Response<T> error(n14 r2, k14 r3) {
        Objects.requireNonNull(r2, "body == null");
        Objects.requireNonNull(r3, "rawResponse == null");
        if (r3.C == false) goto L5;
        kf2.n("rawResponse should not be successful response");
        return null;
    L5:
        return new Response(r3, null, r2);
    }

    public static <T> Response<T> success(@Nullable T r17) {
        fv3 r7 = xe5.e;
        gq1 r16 = gq1.q;
        ArrayList r0 = new ArrayList(20);
        nz3 r1 = new nz3();
        r1.d("http://localhost/");
        oz3 r2 = new oz3(r1);
        tl1 r6 = new tl1((String[]) r0.toArray(new String[0]));
        return success(r17, new k14(r2, pr3.q, "OK", 200, null, r6, r7, null, null, null, 0, 0, null, r16));
    }
}
