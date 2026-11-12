package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.a;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e04 implements Handler.Callback {
    public static final hh3 r = null;
    public volatile c04 n;
    public final d04 o;
    public final pe1 p;
    public final rf2 q;

    static {
        r = new hh3(15);
    }

    public e04(d04 r3) {
        if (r3 != null) goto L6;
        r3 = r;
    L6:
        this.o = r3;
        rf2 r0 = new rf2();
        r0.n = new HashMap();
        r0.o = r3;
        this.q = r0;
        if (ll1.f == true) goto L9;
    L12:
        pe1 r4 = new om0(7);
    L13:
        this.p = r4;
        return;
    L9:
        if (ll1.e == false) goto L12;
        r4 = new j71();
        goto L13
    }

    public static Activity a(Context r1) {
        if ((r1 instanceof Activity) == false) goto L7;
        return (Activity) r1;
    L7:
        if ((r1 instanceof ContextWrapper) == true) goto L9;
        return null;
    L9:
        return a(((ContextWrapper) r1).getBaseContext());
    }

    public final c04 b(Context r7) {
        if (r7 != null) goto L5;
        kf2.n("You cannot start a load on a null Context");
        return null;
    L5:
        if (Looper.myLooper() != Looper.getMainLooper()) goto L40;
        if ((r7 instanceof Application) == true) goto L40;
        if ((r7 instanceof nc1) == false) goto L34;
        nc1 r8 = (nc1) r7;
        boolean r3 = false;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L13;
        boolean r1 = true;
    L14:
        if (r1 == true) goto L18;
        return b(r8.getApplicationContext());
    L18:
        if (r8.isDestroyed() == true) goto L31;
        this.p.i(r8);
        Activity r0 = a(r8);
        if (r0 != null) goto L22;
    L23:
        r3 = true;
    L24:
        a r2 = a.a(r8.getApplicationContext());
        rf2 r6 = this.q;
        ea2 r4 = r8.n;
        r8.k();
        r6.getClass();
        e35.m();
        e35.m();
        c04 r5 = (c04) ((HashMap) r6.n).get(r4);
        if (r5 != null) goto L30;
        y92 r9 = new y92(r4);
        c04 r10 = ((d04) r6.o).a(r2, r9, new tv1(), r8);
        ((HashMap) r6.n).put(r4, r10);
        r9.f(new fa2(r6, r4));
        if (r3 == false) goto L29;
        r10.n();
    L29:
        return r10;
    L30:
        return r5;
    L22:
        if (r0.isFinishing() == true) goto L24;
    L31:
        kf2.n("You cannot start a load for a destroyed activity");
        return null;
    L13:
        r1 = false;
        goto L14
    L34:
        if ((r7 instanceof ContextWrapper) == false) goto L40;
        ContextWrapper r11 = (ContextWrapper) r7;
        if (r11.getBaseContext().getApplicationContext() == null) goto L40;
        return b(r11.getBaseContext());
    L40:
        if (this.n != null) goto L52;
        monitor-enter(this);
    L45:
        th = move-exception;
        throw th;
    L43:
        if (this.n != null) goto L47;
        this.n = this.o.a(a.a(r7.getApplicationContext()), new pa(8), new om0(23), r7.getApplicationContext());     // Catch: Throwable -> L45
    L47:
        monitor-exit(this);     // Catch: Throwable -> L45
    L52:
        return this.n;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r1) {
        return false;
    }
}
