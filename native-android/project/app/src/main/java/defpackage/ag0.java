package defpackage;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ag0 implements OutcomeReceiver {
    public final /* synthetic */ wo0 a;

    public ag0(wo0 r1, bg0 r2) {
        this.a = r1;
    }

    public final void onError(Throwable r3) {
        GetCredentialException r4 = bn.l(r3);
        r4.getClass();
        Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
        String r0 = bn.s(r4);
        r0.getClass();
        androidx.credentials.exceptions.GetCredentialException r5 = rr2.T(bn.B(r4), r0);
        this.a.F(r5);
    }

    public final void onResult(Object r3) {
        GetCredentialResponse r4 = bn.o(r3);
        r4.getClass();
        Log.i("CredManProvService", "GetCredentialResponse returned from framework");
        Credential r5 = bn.f(r4);
        r5.getClass();
        String r1 = bn.r(r5);
        r1.getClass();
        Bundle r6 = bn.q(r5);
        r6.getClass();
        mh1 r0 = new mh1(gb.p(r1, r6));
        this.a.G(r0);
    }
}
