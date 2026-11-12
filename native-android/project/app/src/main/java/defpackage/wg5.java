package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wg5 extends BasePendingResult {
    public final /* synthetic */ int k;

    public wg5(if5 r1, int r2) {
        this.k = r2;
        ji2.n(r1, "GoogleApiClient must not be null");
        super(r1);
        ji2.n(fn.a, "Api must not be null");
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t14 b(Status r1) {
        int r0 = this.k;
        return r1;
    }

    public final void f(me r4) {
        switch(this.k) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        sg5 r5 = (sg5) r4;
        bh5 r0 = (bh5) r5.e();
        ug5 r1 = new ug5(this, 1);
        GoogleSignInOptions r3 = r5.L;
        Parcel r6 = r0.m();
        int r2 = pg5.a;
        r6.writeStrongBinder(r1);
        pg5.c(r6, r3);
        r0.U(r6, 103);
        return;
    L6:
        sg5 r7 = (sg5) r4;
        bh5 r8 = (bh5) r7.e();
        ug5 r9 = new ug5(this, 0);
        GoogleSignInOptions r10 = r7.L;
        Parcel r11 = r8.m();
        int r12 = pg5.a;
        r11.writeStrongBinder(r9);
        pg5.c(r11, r10);
        r8.U(r11, 102);
    }

    public final void g(Status r3) {
        if (r3.n > 0) goto L5;
        boolean r0 = true;
    L6:
        ji2.h("Failed result must not be success", !r0);
        e(b(r3));
        return;
    L5:
        r0 = false;
        goto L6
    }
}
