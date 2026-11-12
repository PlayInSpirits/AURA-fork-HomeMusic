package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rg5 extends a {
    public final qg5 L;

    public rg5(Context r9, Looper r10, ml3 r11, qg5 r12, gf5 r13, gf5 r14) {
        super(r9, r10, 68, r11, r13, r14, 0);
        if (r12 != null) goto L5;
        r12 = qg5.p;
    L5:
        rf2 r8 = new rf2();
        r8.n = Boolean.FALSE;
        qg5 r15 = qg5.p;
        r12.getClass();
        r8.n = Boolean.valueOf(r12.n);
        r8.o = r12.o;
        r8.o = mg5.a();
        this.L = new qg5(r8);
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if ((r0 instanceof tg5) == false) goto L10;
        return (tg5) r0;
    L10:
        return new tg5(r3, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        qg5 r3 = this.L;
        r3.getClass();
        Bundle r0 = new Bundle();
        r0.putString("consumer_package", null);
        r0.putBoolean("force_save_dialog", r3.n);
        r0.putString("log_session_id", r3.o);
        return r0;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
