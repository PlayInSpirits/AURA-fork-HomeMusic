package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yp4 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public yp4(Handler handler) {
        this.a = handler;
    }

    public static xp4 c() {
        xp4 xp4Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                xp4Var = arrayList.isEmpty() ? new xp4() : (xp4) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return xp4Var;
    }

    public final xp4 a(int i) {
        xp4 c = c();
        c.a = this.a.obtainMessage(i);
        return c;
    }

    public final xp4 b(int i, Object obj) {
        xp4 c = c();
        c.a = this.a.obtainMessage(i, obj);
        return c;
    }

    public final void d(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void e() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void f(int i) {
        rr2.l(i != 0);
        this.a.removeMessages(i);
    }

    public final void g(int i) {
        this.a.sendEmptyMessage(i);
    }

    public final void h(int i, int i2) {
        this.a.sendEmptyMessageDelayed(i, i2);
    }
}
