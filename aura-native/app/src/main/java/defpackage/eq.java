package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class eq extends zw2 {
    public eq(android.os.Looper a0, int a1) {
        super(a0, a1);
    }

    @Override // defpackage.zw2, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", f34.f(i, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.u);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            kf2.k();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            zc zcVar = BasePendingResult.j;
            throw e;
        }
    }
}
