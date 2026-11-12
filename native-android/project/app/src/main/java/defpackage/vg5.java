package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vg5 extends a {
    public final Bundle L;

    public vg5(Context r9, Looper r10, ml3 r11, gf5 r12, gf5 r13) {
        super(r9, r10, 223, r11, r12, r13, 0);
        this.L = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r3.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if ((r0 instanceof ah5) == false) goto L10;
        return (ah5) r0;
    L10:
        return new ah5(r3, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 1);
    }

    @Override // com.google.android.gms.common.internal.a
    public final p61[] c() {
        return fh0.l;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        return this.L;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean i() {
        return true;
    }
}
