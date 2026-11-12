package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class md2 implements a83 {
    public final h95 a;
    public boolean b;

    public md2(og5 r1, h95 r2) {
        this.b = false;
        this.a = r2;
    }

    @Override // defpackage.a83
    public final void b(Object r3) {
        Void r4 = (Void) r3;
        SignInHubActivity r5 = (SignInHubActivity) this.a.n;
        r5.setResult(r5.P, r5.Q);
        r5.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
