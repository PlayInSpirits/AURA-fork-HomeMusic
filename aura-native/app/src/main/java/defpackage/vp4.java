package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vp4 {
    public vp4() {
        super();
    }

    public static final vp4 a = new vp4();

    public final yp4 a(Looper looper, Handler.Callback callback) {
        return new yp4(new Handler(looper, callback));
    }
}
