package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fg5 extends a {
    public final lr4 L;

    public fg5(Context context, Looper looper, ml3 ml3Var, lr4 lr4Var, gf5 gf5Var, gf5 gf5Var2) {
        super(context, looper, 270, ml3Var, gf5Var, gf5Var2, 0);
        this.L = lr4Var;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof bg5 ? (bg5) queryLocalInterface : new bg5(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
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
