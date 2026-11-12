package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fg5 extends a {
    public final lr4 L;

    public fg5(Context r9, Looper r10, ml3 r11, lr4 r12, gf5 r13, gf5 r14) {
        super(r9, r10, 270, r11, r13, r14, 0);
        this.L = r12;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        IInterface r0 = r3.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if ((r0 instanceof bg5) == false) goto L10;
        return (bg5) r0;
    L10:
        return new bg5(r3, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final p61[] c() {
        return hw.f;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle d() {
        this.L.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String f() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.me
    public final int f0() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String g() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean h() {
        return true;
    }
}
