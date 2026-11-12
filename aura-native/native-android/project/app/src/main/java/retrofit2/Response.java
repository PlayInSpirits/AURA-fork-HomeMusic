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

    private Response(k14 k14Var, @Nullable T t, @Nullable n14 n14Var) {
        this.rawResponse = k14Var;
        this.body = t;
        this.errorBody = n14Var;
    }

    public static <T> Response<T> error(int i, n14 n14Var) {
        Objects.requireNonNull(n14Var, "body == null");
        if (i < 400) {
            kf2.n(f34.f(i, "code < 400: "));
            return null;
        }
        byte[] bArr = xe5.a;
        gq1 gq1Var = gq1.q;
        ArrayList arrayList = new ArrayList(20);
        OkHttpCall.NoContentResponseBody noContentResponseBody = new OkHttpCall.NoContentResponseBody(n14Var.contentType(), n14Var.contentLength());
        nz3 nz3Var = new nz3();
        nz3Var.d("http://localhost/");
        oz3 oz3Var = new oz3(nz3Var);
        if (i >= 0) {
            return error(n14Var, new k14(oz3Var, pr3.q, "Response.error()", i, null, new tl1((String[]) arrayList.toArray(new String[0])), noContentResponseBody, null, null, null, 0L, 0L, null, gq1Var));
        }
        nz2.f(f34.f(i, "code < 0: "));
        return null;
    }

    public static <T> Response<T> success(int i, @Nullable T t) {
        if (i < 200 || i >= 300) {
            kf2.n(f34.f(i, "code < 200 or >= 300: "));
            return null;
        }
        fv3 fv3Var = xe5.e;
        gq1 gq1Var = gq1.q;
        ArrayList arrayList = new ArrayList(20);
        nz3 nz3Var = new nz3();
        nz3Var.d("http://localhost/");
        oz3 oz3Var = new oz3(nz3Var);
        if (i >= 0) {
            return success(t, new k14(oz3Var, pr3.q, "Response.success()", i, null, new tl1((String[]) arrayList.toArray(new String[0])), fv3Var, null, null, null, 0L, 0L, null, gq1Var));
        }
        nz2.f(f34.f(i, "code < 0: "));
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

    public static <T> Response<T> success(@Nullable T t, k14 k14Var) {
        Objects.requireNonNull(k14Var, "rawResponse == null");
        if (k14Var.C) {
            return new Response<>(k14Var, t, null);
        }
        kf2.n("rawResponse must be successful response");
        return null;
    }

    public static <T> Response<T> success(@Nullable T t, tl1 tl1Var) {
        Objects.requireNonNull(tl1Var, "headers == null");
        fv3 fv3Var = xe5.e;
        gq1 gq1Var = gq1.q;
        new ArrayList(20);
        sl1 sl1VarD = tl1Var.d();
        nz3 nz3Var = new nz3();
        nz3Var.d("http://localhost/");
        return success(t, new k14(new oz3(nz3Var), pr3.q, "OK", 200, null, sl1VarD.c(), fv3Var, null, null, null, 0L, 0L, null, gq1Var));
    }

    public static <T> Response<T> error(n14 n14Var, k14 k14Var) {
        Objects.requireNonNull(n14Var, "body == null");
        Objects.requireNonNull(k14Var, "rawResponse == null");
        if (!k14Var.C) {
            return new Response<>(k14Var, null, n14Var);
        }
        kf2.n("rawResponse should not be successful response");
        return null;
    }

    public static <T> Response<T> success(@Nullable T t) {
        fv3 fv3Var = xe5.e;
        gq1 gq1Var = gq1.q;
        ArrayList arrayList = new ArrayList(20);
        nz3 nz3Var = new nz3();
        nz3Var.d("http://localhost/");
        return success(t, new k14(new oz3(nz3Var), pr3.q, "OK", 200, null, new tl1((String[]) arrayList.toArray(new String[0])), fv3Var, null, null, null, 0L, 0L, null, gq1Var));
    }
}
