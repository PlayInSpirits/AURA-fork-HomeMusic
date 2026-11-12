package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yq2 {
    public static ui1 c;
    public final Context a;
    public final ArrayList b;

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public yq2(Context r2) {
        this.b = new ArrayList();
        this.a = r2;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        return;
    L5:
        kf2.o("The media router service must only be accessed on the application's main thread.");
    }

    public static ui1 c() {
        ui1 r0 = c;
        if (r0 == null) goto L5;
        return r0;
    L5:
        kf2.o("getGlobalRouter cannot be called when sGlobal is null");
        return null;
    }

    public static yq2 d(Context r4) {
        if (r4 == null) goto L17;
        b();
        if (c != null) goto L6;
        c = new ui1(r4.getApplicationContext());
    L6:
        ArrayList r0 = c.g;
        int r1 = r0.size();
    L7:
        r1 = r1 - 1;
        if (r1 < 0) goto L15;
        yq2 r2 = (yq2) ((WeakReference) r0.get(r1)).get();
        if (r2 == null) goto L11;
        if (r2.a != r4) goto L7;
        return r2;
    L11:
        r0.remove(r1);
        goto L7
    L15:
        yq2 r3 = new yq2(r4);
        r0.add(new WeakReference(r3));
        return r3;
    L17:
        kf2.n("context must not be null");
        return null;
    }

    public static void f(int r3) {
        if (r3 >= 0) goto L4;
    L9:
        kf2.n("Unsupported reason to unselect route");
        return;
    L4:
        if (r3 > 3) goto L9;
        b();
        ui1 r0 = c();
        wq2 r1 = r0.c();
        if (r0.g() == r1) goto L11;
        r0.i(r1, r3, true);
        return;
    }

    public final void a(rq2 r7, uo r8, int r9) {
        if (r7 == null) goto L37;
        if (r8 == null) goto L35;
        b();
        ArrayList r1 = this.b;
        int r2 = r1.size();
        boolean r3 = false;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L11;
        if (((sq2) r1.get(r4)).b == r8) goto L12;
        r4 = r4 + 1;
    L12:
        if (r4 >= 0) goto L14;
        sq2 r5 = new sq2(this, r8);
        r1.add(r5);
    L15:
        boolean r10 = true;
        if (r9 == r5.d) goto L18;
        r5.d = r9;
        r3 = true;
    L18:
        long r6 = SystemClock.elapsedRealtime();
        if ((r9 & 1) == 0) goto L21;
        r3 = true;
    L21:
        r5.e = r6;
        rq2 r11 = r5.c;
        r11.a();
        r7.a();
        if (r11.b.containsAll(r7.b) == true) goto L31;
        rq2 r12 = r5.c;
        c52 r13 = new c52();
        if (r12 == null) goto L29;
        r12.a();
        if (r12.b.isEmpty() == true) goto L28;
        r13.a = new ArrayList(r12.b);
    L28:
        r13.a(r7.b());
        r5.c = r13.d();
    L32:
        if (r10 == false) goto L41;
        c().k();
        return;
    L41:
        return;
    L29:
        kf2.n("selector must not be null");
        return;
    L31:
        r10 = r3;
        goto L32
    L14:
        r5 = (sq2) r1.get(r4);
        goto L15
    L11:
        r4 = -1;
        goto L12
    L35:
        kf2.n("callback must not be null");
        return;
    L37:
        kf2.n("selector must not be null");
    }

    public final void e(uo r4) {
        if (r4 == null) goto L13;
        b();
        ArrayList r3 = this.b;
        int r0 = r3.size();
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L9;
        if (((sq2) r3.get(r1)).b == r4) goto L10;
        r1 = r1 + 1;
    L10:
        if (r1 < 0) goto L17;
        r3.remove(r1);
        c().k();
        return;
    L17:
        return;
    L9:
        r1 = -1;
        goto L10
    L13:
        kf2.n("callback must not be null");
    }
}
