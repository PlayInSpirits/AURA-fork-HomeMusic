package defpackage;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cr4 {
    public final jw a;

    public cr4() {
        jw jwVar = new jw();
        jwVar.o = new Object();
        jwVar.p = new mf4(7);
        this.a = jwVar;
    }

    public final void a(ApiException apiException) {
        jw jwVar = this.a;
        jwVar.getClass();
        synchronized (jwVar.o) {
            jwVar.u();
            jwVar.n = true;
            jwVar.r = apiException;
        }
        ((mf4) jwVar.p).j(jwVar);
    }

    public final void b(Object obj) {
        jw jwVar = this.a;
        synchronized (jwVar.o) {
            jwVar.u();
            jwVar.n = true;
            jwVar.q = obj;
        }
        ((mf4) jwVar.p).j(jwVar);
    }

    public final void c(Exception exc) {
        jw jwVar = this.a;
        jwVar.getClass();
        ji2.n(exc, "Exception must not be null");
        synchronized (jwVar.o) {
            try {
                if (jwVar.n) {
                    return;
                }
                jwVar.n = true;
                jwVar.r = exc;
                ((mf4) jwVar.p).j(jwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
