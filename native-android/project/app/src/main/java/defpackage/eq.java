package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class eq extends zw2 {
    @Override // defpackage.zw2, android.os.Handler
    public final void handleMessage(Message r2) {
        int r1 = r2.what;
        if (r1 != 1) goto L5;
        Pair r3 = (Pair) r2.obj;
        if (r3.first == null) goto L14;
        kf2.k();
        return;
    L14:
        t14 r4 = (t14) r3.second;
        throw null;     // Catch: RuntimeException -> L16
    L16:
        e = move-exception;
        zc r5 = BasePendingResult.j;
        throw e;
    L5:
        if (r1 == 2) goto L8;
        Log.wtf("BasePendingResult", f34.f(r1, "Don't know how to handle message: "), new Exception());
        return;
    L8:
        ((BasePendingResult) r2.obj).c(Status.u);
    }
}
