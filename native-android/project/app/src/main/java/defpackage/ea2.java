package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 {
    public final boolean a;
    public c12 b;
    public final h95 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public r92 h;
    public final nl4 i;

    public ea2(ba2 r3, boolean r4) {
        new AtomicReference(null);
        this.a = r4;
        this.b = new c12();
        this.c = new h95(r3);
        this.g = new ArrayList();
        r92 r5 = r92.o;
        this.h = r5;
        this.i = ya4.a(r5);
    }

    public final void a(aa2 r10) {
        r10.getClass();
        c("addObserver");
        r92 r0 = this.h;
        r92 r1 = r92.n;
        if (r0 == r1) goto L6;
        r1 = r92.o;
    L6:
        da2 r2 = new da2();
        r2.a = r1;
        HashMap r3 = ka2.a;
        boolean r4 = r10 instanceof w92;
        boolean r5 = r10 instanceof rl0;
        int r6 = 2;
        boolean r7 = false;
        if (r4 == false) goto L10;
        if (r5 == false) goto L10;
        w92 r8 = new tl0((rl0) r10, (w92) r10);
    L26:
        r2.b = r8;
        c12 r9 = this.b;
        r9.getClass();
        w03 r11 = (w03) r9.o;
        b61 r12 = (b61) r11.g(r10);
        if (r12 == null) goto L29;
        da2 r13 = r12.o;
    L34:
        if (r13 != null) goto L69;
        ba2 r14 = (ba2) ((WeakReference) this.c.n).get();
        if (r14 != null) goto L40;
        return;
    L40:
        if (this.d == 0) goto L42;
    L43:
        r7 = true;
    L44:
        r92 r15 = b(r10);
        this.d++;
    L46:
        if (r2.a.compareTo(r15) >= 0) goto L62;
        c12 r16 = this.b;
        r16.getClass();
        if (((w03) r16.o).c(r10) == false) goto L62;
        r92 r17 = r2.a;
        ArrayList r18 = this.g;
        r18.add(r17);
        o92 r19 = q92.Companion;
        r92 r20 = r2.a;
        r19.getClass();
        r20.getClass();
        int r21 = r20.ordinal();
        if (r21 == 1) goto L57;
        if (r21 != 2) goto L53;
        q92 r22 = q92.ON_START;
    L58:
        if (r22 == null) goto L60;
        r2.a(r14, r22);
        v40.r0(r18);
        r15 = b(r10);
        goto L46
    L60:
        nz2.x(r2.a, "no event up from ");
        return;
    L53:
        if (r21 == 3) goto L55;
        r22 = null;
        goto L58
    L55:
        r22 = q92.ON_RESUME;
        goto L58
    L57:
        r22 = q92.ON_CREATE;
    L62:
        if (r7 == true) goto L64;
        h();
    L64:
        this.d--;
        return;
    L42:
        if (this.e == false) goto L44;
    L69:
        return;
    L29:
        b61 r23 = new b61(r10, r2);
        r11.l(r10, r23);
        b61 r24 = (b61) r9.q;
        if (r24 != null) goto L32;
        r9.p = r23;
        r9.q = r23;
    L33:
        r13 = null;
        goto L34
    L32:
        r24.p = r23;
        r23.q = r24;
        r9.q = r23;
    L10:
        if (r5 == false) goto L12;
        r8 = new tl0((rl0) r10, null);
        goto L26
    L12:
        if (r4 == false) goto L14;
        r8 = (w92) r10;
        goto L26
    L14:
        Class<?> r25 = r10.getClass();
        if (ka2.b(r25) != 2) goto L25;
        Object r26 = ka2.b.get(r25);
        r26.getClass();
        List r27 = (List) r26;
        if (r27.size() == 1) goto L23;
        int r28 = r27.size();
        ah1[] r29 = new ah1[r28];
        if (r28 > 0) goto L21;
        r8 = new vv3(r6, r29);
        goto L26
    L21:
        ka2.a((Constructor) r27.get(0), r10);
        throw null;
    L23:
        ka2.a((Constructor) r27.get(0), r10);
        throw null;
    L25:
        r8 = new tl0(r10);
        goto L26
    }

    public final r92 b(aa2 r4) {
        c12 r0 = this.b;
        r0.getClass();
        r4.getClass();
        b61 r5 = (b61) ((w03) r0.o).g(r4);
        r92 r1 = null;
        if (r5 == null) goto L5;
        b61 r6 = r5.q;
    L6:
        if (r6 == null) goto L8;
        r92 r7 = r6.o.a;
    L9:
        ArrayList r2 = this.g;
        if (r2.isEmpty() == true) goto L12;
        r1 = (r92) r2.get(r2.size() - 1);
    L12:
        r92 r3 = this.h;
        if (r7 != null) goto L15;
    L17:
        r7 = r3;
    L18:
        if (r1 != null) goto L20;
    L22:
        return r7;
    L20:
        if (r1.compareTo(r7) >= 0) goto L22;
        return r1;
    L15:
        if (r7.compareTo(r3) >= 0) goto L17;
    L8:
        r7 = null;
        goto L9
    L5:
        r6 = null;
        goto L6
    }

    public final void c(String r2) {
        if (this.a == false) goto L9;
        ei.V().j.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L7;
        return;
    L7:
        nz2.f(xa3.h("Method ", r2, " must be called on the main thread"));
        return;
    }

    public final void d(q92 r2) {
        r2.getClass();
        c("handleLifecycleEvent");
        e(r2.a());
    }

    public final void e(r92 r5) {
        if (this.h == r5) goto L28;
        ba2 r0 = (ba2) ((WeakReference) this.c.n).get();
        r92 r1 = this.h;
        r92 r2 = r92.o;
        r92 r3 = r92.n;
        if (r1 != r2) goto L11;
        if (r5 != r3) goto L11;
        throw new IllegalStateException(("State must be at least '" + r92.p + "' to be moved to '" + r5 + "' in component " + r0).toString());
    L11:
        if (r1 != r3) goto L16;
        if (r1 == r5) goto L16;
        throw new IllegalStateException(("State is '" + r3 + "' and cannot be moved to `" + r5 + "` in component " + r0).toString());
    L16:
        this.h = r5;
        if (this.e == false) goto L19;
    L25:
        this.f = true;
        return;
    L19:
        if (this.d != 0) goto L25;
        this.e = true;
        h();
        this.e = false;
        if (this.h != r3) goto L27;
        this.b = new c12();
        return;
    L27:
        return;
    }

    public final void f(aa2 r3) {
        r3.getClass();
        c("removeObserver");
        c12 r2 = this.b;
        r2.getClass();
        b61 r4 = (b61) ((w03) r2.o).j(r3);
        if (r4 != null) goto L5;
        return;
    L5:
        b61 r0 = r4.q;
        b61 r1 = r4.p;
        if (r0 != null) goto L8;
        r2.p = r1;
    L9:
        b61 r5 = r4.p;
        if (r5 != null) goto L12;
        r2.q = r0;
    L13:
        r4.r = true;
        return;
    L12:
        r5.q = r0;
        goto L13
    L8:
        r0.p = r1;
        goto L9
    }

    public final void g(r92 r2) {
        r2.getClass();
        c("setCurrentState");
        e(r2);
    }

    public final void h() {
        Object r0 = ((WeakReference) this.c.n).get();
        if (r0 == null) goto L45;
        final ba2 r1 = (ba2) r0;
    L5:
        c12 r2 = this.b;
        final int r3 = 0;
        if (((w03) r2.o).e == 0) goto L16;
        b61 r4 = (b61) r2.p;
        if (r4 == null) goto L43;
        r92 r5 = r4.o.a;
        b61 r6 = (b61) r2.q;
        if (r6 == null) goto L41;
        r92 r7 = r6.o.a;
        if (r5 == r7) goto L15;
    L18:
        this.f = false;
        r92 r8 = this.h;
        if (r4 == null) goto L39;
        if (r8.compareTo(r5) >= 0) goto L28;
        c12 r9 = this.b;
        if1 r10 = new ca2(this, r1, r3);
        r9.getClass();
        b61 r11 = (b61) r9.q;
    L23:
        if (r11 == null) goto L28;
        if (r11.r == true) goto L27;
        r10.invoke(r11);
    L27:
        r11 = r11.q;
    L28:
        b61 r12 = (b61) this.b.q;
        if (this.f == true) goto L5;
        if (r12 == null) goto L5;
        if (this.h.compareTo(r12.o.a) <= 0) goto L5;
        c12 r13 = this.b;
        final int r14 = 1;
        if1 r15 = new ca2(this, r1, r14);
        r13.getClass();
        b61 r16 = (b61) r13.p;
    L34:
        if (r16 == null) goto L5;
        if (r16.r == true) goto L38;
        r15.invoke(r16);
    L38:
        r16 = r16.p;
        goto L34
    L39:
        kf2.m("Collection is empty.");
        return;
    L15:
        if (this.h != r7) goto L18;
    L41:
        kf2.m("Collection is empty.");
        return;
    L43:
        kf2.m("Collection is empty.");
        return;
    L16:
        this.f = false;
        this.i.i(this.h);
        return;
    L45:
        kf2.o("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
