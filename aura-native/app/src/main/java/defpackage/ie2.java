package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.eddyizm.tempus.App;
import com.eddyizm.tempus.interfaces.SystemCallback;
import com.eddyizm.tempus.ui.fragment.LoginFragment;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ie2 implements SystemCallback {
    public final /* synthetic */ LoginFragment n;

    public ie2(LoginFragment loginFragment) {
        this.n = loginFragment;
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public final void onError(Exception exc) {
        ud3.H0();
        ud3.w0(null);
        ud3.v0(null);
        ud3.D0(null);
        ud3.q0(null);
        ud3.C0(null);
        ud3.u0(null);
        ud3.o0(false);
        ud3.h0(null);
        App.f(true);
        LoginFragment loginFragment = this.n;
        Context n = loginFragment.n();
        if (n == null || !loginFragment.y()) {
            return;
        }
        Toast.makeText(n, exc.getMessage(), 0).show();
    }

    @Override // com.eddyizm.tempus.interfaces.SystemCallback
    public final void onSuccess(String str, String str2, String str3) {
        new mm3().h();
        this.n.m0.v();
    }
}
