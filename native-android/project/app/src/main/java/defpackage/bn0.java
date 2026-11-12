package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 extends wr1 {
    public final Object j;
    public final ExecutorService k;
    public volatile Handler l;

    public bn0() {
        this.j = new Object();
        this.k = Executors.newFixedThreadPool(4, new an0(0));
    }

    public static Handler m(Looper r7) {
        if (Build.VERSION.SDK_INT >= 28) goto L5;
        return (Handler) Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{r7, null, Boolean.TRUE});
    L11:
        return new Handler(r7);
    L9:
        return new Handler(r7);
    L5:
        return ne.a(r7);
    }
}
