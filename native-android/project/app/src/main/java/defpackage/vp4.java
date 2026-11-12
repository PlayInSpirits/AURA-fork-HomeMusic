package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vp4 {
    public static final vp4 a = null;

    static {
        a = new vp4();
    }

    public final yp4 a(Looper r2, Handler.Callback r3) {
        return new yp4(new Handler(r2, r3));
    }
}
