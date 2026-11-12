package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class md2 implements a83 {
    public final h95 a;
    public boolean b = false;

    public md2(og5 og5Var, h95 h95Var) {
        this.a = h95Var;
    }

    @Override // defpackage.a83
    public final void b(Object obj) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.a.n;
        signInHubActivity.setResult(signInHubActivity.P, signInHubActivity.Q);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
