package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class o90 {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
