package defpackage;

import android.content.Context;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements yf0 {
    public final CredentialManager a;

    public bg0(nc1 r2) {
        this.a = bn.g(r2.getSystemService("credential"));
    }

    @Override // defpackage.yf0
    public final boolean isAvailableOnDevice() {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return false;
    L5:
        if (this.a == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.yf0
    public final void onGetCredential(Context r9, kh1 r10, CancellationSignal r11, Executor r12, vf0 r13) {
        wo0 r14 = (wo0) r13;
        zf0 r0 = new zf0(0, r14);
        CredentialManager r2 = this.a;
        if (r2 != null) goto L6;
        r0.invoke();
        return;
    L6:
        ag0 r7 = new ag0(r14, this);
        bn.t();
        Bundle r8 = new Bundle();
        r8.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        r8.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        r8.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder r15 = bn.m(r8);
        Iterator r16 = r10.a.iterator();
    L8:
        if (r16.hasNext() == false) goto L10;
        xf0 r17 = (xf0) r16.next();
        bn.C();
        r17.getClass();
        bn.w(r15, bn.k(bn.i(bn.h(bn.j(r17.a, r17.b)), r17.c)));
        goto L8
    L10:
        GetCredentialRequest r4 = bn.n(r15);
        r4.getClass();
        bn.v(r2, (nc1) r9, r4, r11, r12, r7);
    }
}
