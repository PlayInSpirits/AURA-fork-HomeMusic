package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cf4 implements pz3 {
    public static final boolean C = false;
    public final RuntimeException A;
    public int B;
    public final String a;
    public final ul4 b;
    public final Object c;
    public final zz3 d;
    public final wz3 e;
    public final ii1 f;
    public final Object g;
    public final Class h;
    public final lq i;
    public final int j;
    public final int k;
    public final eq3 l;
    public final wq4 m;
    public final List n;
    public final ex4 o;
    public final Executor p;
    public q04 q;
    public z05 r;
    public long s;
    public volatile i11 t;
    public Drawable u;
    public Drawable v;
    public Drawable w;
    public int x;
    public int y;
    public boolean z;

    static {
        C = Log.isLoggable("GlideRequest", 2);
    }

    public cf4(Context r1, ii1 r2, Object r3, Object r4, Class r5, lq r6, int r7, int r8, eq3 r9, wq4 r10, zz3 r11, ArrayList r12, wz3 r13, i11 r14, ex4 r15, Executor r16) {
        if (C == false) goto L5;
        String r17 = String.valueOf(hashCode());
    L6:
        this.a = r17;
        this.b = new ul4();
        this.c = r3;
        this.f = r2;
        this.g = r4;
        this.h = r5;
        this.i = r6;
        this.j = r7;
        this.k = r8;
        this.l = r9;
        this.m = r10;
        this.d = r11;
        this.n = r12;
        this.e = r13;
        this.t = r14;
        this.o = r15;
        this.p = r16;
        this.B = 1;
        if (this.A == null) goto L9;
        return;
    L9:
        if (((Map) r2.h.o).containsKey(gi1.class) == false) goto L13;
        this.A = new RuntimeException("Glide request origin trace");
        return;
    L13:
        return;
    L5:
        r17 = null;
        goto L6
    }

    @Override // defpackage.pz3
    public final boolean a() {
        Object r0 = this.c;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.B != 4) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    public final void b() {
        if (this.z == true) goto L16;
        this.b.a();
        this.m.b(this);
        z05 r0 = this.r;
        if (r0 == null) goto L15;
        i11 r1 = (i11) r0.q;
        monitor-enter(r1);
        ((m11) r0.o).g((cf4) r0.p);     // Catch: Throwable -> L12
        monitor-exit(r1);     // Catch: Throwable -> L12
        this.r = null;
        return;
    L12:
        th = move-exception;
        throw th;
    L15:
        return;
    L16:
        kf2.o("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // defpackage.pz3
    public final void c() {
        Object r0 = this.c;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (isRunning() == false) goto L9;
        clear();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    @Override // defpackage.pz3
    public final void clear() {
        Object r0 = this.c;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.z == true) goto L27;
        this.b.a();     // Catch: Throwable -> L10
        if (this.B != 6) goto L12;
        monitor-exit(r0);     // Catch: Throwable -> L10
        return;
    L12:
        b();     // Catch: Throwable -> L10
        q04 r1 = this.q;     // Catch: Throwable -> L10
        if (r1 == null) goto L15;
        this.q = null;     // Catch: Throwable -> L10
    L16:
        wz3 r3 = this.e;     // Catch: Throwable -> L10
        if (r3 != null) goto L19;
    L20:
        this.m.m(f());     // Catch: Throwable -> L10
    L21:
        this.B = 6;     // Catch: Throwable -> L10
        monitor-exit(r0);     // Catch: Throwable -> L10
        if (r1 == null) goto L31;
        this.t.getClass();
        i11.f(r1);
        return;
    L31:
        return;
    L19:
        if (r3.g(this) == false) goto L21;
    L15:
        r1 = null;
        goto L16
    L27:
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");     // Catch: Throwable -> L10
    }

    @Override // defpackage.pz3
    public final boolean d() {
        Object r0 = this.c;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.B != 4) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    @Override // defpackage.pz3
    public final boolean e(pz3 r15) {
        if ((r15 instanceof cf4) == true) goto L5;
        return false;
    L5:
        Object r0 = this.c;
        monitor-enter(r0);
        int r2 = this.j;     // Catch: Throwable -> L10
        int r3 = this.k;     // Catch: Throwable -> L10
        Object r4 = this.g;     // Catch: Throwable -> L10
        Class r5 = this.h;     // Catch: Throwable -> L10
        lq r6 = this.i;     // Catch: Throwable -> L10
        eq3 r7 = this.l;     // Catch: Throwable -> L10
        List r14 = this.n;     // Catch: Throwable -> L10
        if (r14 == null) goto L12;
        int r16 = r14.size();     // Catch: Throwable -> L10
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L10
        cf4 r17 = (cf4) r15;
        Object r8 = r17.c;
        monitor-enter(r8);
        int r1 = r17.j;     // Catch: Throwable -> L19
        int r9 = r17.k;     // Catch: Throwable -> L19
        Object r10 = r17.g;     // Catch: Throwable -> L19
        Class r11 = r17.h;     // Catch: Throwable -> L19
        lq r12 = r17.i;     // Catch: Throwable -> L19
        eq3 r13 = r17.l;     // Catch: Throwable -> L19
        List r18 = r17.n;     // Catch: Throwable -> L19
        if (r18 == null) goto L21;
        int r19 = r18.size();     // Catch: Throwable -> L19
    L22:
        monitor-exit(r8);     // Catch: Throwable -> L19
        if (r2 != r1) goto L43;
        if (r3 != r9) goto L43;
        if (r4 != null) goto L30;
        if (r10 != null) goto L29;
        boolean r20 = true;
    L31:
        if (r20 == false) goto L43;
        if (r5.equals(r11) == false) goto L43;
        if (r6 != null) goto L38;
        if (r12 != null) goto L37;
        boolean r21 = true;
    L39:
        if (r21 == false) goto L43;
        if (r7 != r13) goto L43;
        if (r16 != r19) goto L43;
        return true;
    L37:
        r21 = false;
        goto L39
    L38:
        r21 = r6.i(r12);
        goto L39
    L29:
        r20 = false;
        goto L31
    L30:
        r20 = r4.equals(r10);
    L43:
        return false;
    L21:
        r19 = 0;
    L19:
        th = move-exception;
        throw th;
    L12:
        r16 = 0;
    L10:
        th = move-exception;
        throw th;
    }

    public final Drawable f() {
        if (this.v != null) goto L6;
        this.v = this.i.s;
    L6:
        return this.v;
    }

    public final void g(String r2) {
        StringBuilder r3 = b11.s(r2, " this: ");
        r3.append(this.a);
        Log.v("GlideRequest", r3.toString());
    }

    public final void h(GlideException r8, int r9) {
        this.b.a();
        Object r1 = this.c;
        monitor-enter(r1);
        r8.getClass();     // Catch: Throwable -> L9
        int r2 = this.f.i;     // Catch: Throwable -> L9
        if (r2 > r9) goto L11;
        Log.w("Glide", "Load failed for [" + this.g + "] with dimensions [" + this.x + "x" + this.y + "]", r8);     // Catch: Throwable -> L9
        if (r2 > 4) goto L11;
        r8.d();     // Catch: Throwable -> L9
    L11:
        Drawable r10 = null;
        this.r = null;     // Catch: Throwable -> L9
        this.B = 5;     // Catch: Throwable -> L9
        wz3 r0 = this.e;     // Catch: Throwable -> L9
        if (r0 == null) goto L14;
        r0.b(this);     // Catch: Throwable -> L9
    L14:
        boolean r3 = true;
        this.z = true;     // Catch: Throwable -> L9
        List r4 = this.n;     // Catch: Throwable -> L25
        if (r4 == null) goto L27;
        Iterator r5 = r4.iterator();     // Catch: Throwable -> L25
        boolean r6 = false;
    L20:
        if (r5.hasNext() == false) goto L28;
        zz3 r7 = (zz3) r5.next();     // Catch: Throwable -> L25
        wz3 r11 = this.e;     // Catch: Throwable -> L25
        if (r11 == null) goto L24;
        r11.getRoot().a();     // Catch: Throwable -> L25
    L24:
        r6 = r6 | r7.a(r8);     // Catch: Throwable -> L25
    L28:
        zz3 r12 = this.d;     // Catch: Throwable -> L25
        if (r12 == null) goto L36;
        wz3 r13 = this.e;     // Catch: Throwable -> L25
        if (r13 == null) goto L34;
        r13.getRoot().a();     // Catch: Throwable -> L25
    L34:
        if (r12.a(r8) == false) goto L36;
        boolean r14 = true;
    L38:
        if ((r14 | r6) == true) goto L61;
        wz3 r15 = this.e;     // Catch: Throwable -> L25
        if (r15 != null) goto L42;
    L45:
        if (r3 == false) goto L61;
        if (this.g == null) goto L50;
    L53:
        if (r10 == null) goto L55;
    L58:
        if (r10 != null) goto L60;
        r10 = f();     // Catch: Throwable -> L25
    L60:
        this.m.i(r10);     // Catch: Throwable -> L25
    L55:
        if (this.u != null) goto L57;
        this.u = this.i.r;     // Catch: Throwable -> L25
    L57:
        r10 = this.u;     // Catch: Throwable -> L25
        goto L58
    L50:
        if (this.w != null) goto L52;
        this.w = this.i.y;     // Catch: Throwable -> L25
    L52:
        r10 = this.w;     // Catch: Throwable -> L25
        goto L53
    L42:
        if (r15.h(this) == true) goto L45;
        r3 = false;
    L61:
        this.z = false;     // Catch: Throwable -> L9
        monitor-exit(r1);     // Catch: Throwable -> L9
        return;
    L36:
        r14 = false;
        goto L38
    L27:
        r6 = false;
    L25:
        th = move-exception;
        this.z = false;     // Catch: Throwable -> L9
        throw th;     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final void i(q04 r8, int r9) {
        this.b.a();
        q04 r2 = null;
        Object r3 = this.c;     // Catch: Throwable -> L44
        monitor-enter(r3);     // Catch: Throwable -> L44
        this.r = null;     // Catch: Throwable -> L10
        if (r8 != null) goto L12;
        h(new GlideException("Expected to receive a Resource<R> with an object of " + this.h + " inside, but instead got null."), 5);     // Catch: Throwable -> L10
        monitor-exit(r3);     // Catch: Throwable -> L10
        return;
    L12:
        Object r1 = r8.get();     // Catch: Throwable -> L10
        if (r1 != null) goto L15;
    L31:
        this.q = null;     // Catch: Throwable -> L26
        StringBuilder r4 = new StringBuilder("Expected to receive an object of ");     // Catch: Throwable -> L26
        r4.append(this.h);     // Catch: Throwable -> L26
        r4.append(" but instead got ");     // Catch: Throwable -> L26
        if (r1 == null) goto L34;
        Object r0 = r1.getClass();     // Catch: Throwable -> L26
    L35:
        r4.append(r0);     // Catch: Throwable -> L26
        r4.append("{");     // Catch: Throwable -> L26
        r4.append(r1);     // Catch: Throwable -> L26
        r4.append("} inside Resource{");     // Catch: Throwable -> L26
        r4.append(r8);     // Catch: Throwable -> L26
        r4.append("}.");     // Catch: Throwable -> L26
        if (r1 == null) goto L38;
        String r5 = "";
    L39:
        r4.append(r5);     // Catch: Throwable -> L26
        h(new GlideException(r4.toString()), 5);     // Catch: Throwable -> L26
        monitor-exit(r3);     // Catch: Throwable -> L26
    L24:
        this.t.getClass();
        i11.f(r8);
        return;
    L38:
        r5 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
        goto L39
    L34:
        r0 = "";
        goto L35
    L15:
        if (this.h.isAssignableFrom(r1.getClass()) == false) goto L31;
        wz3 r6 = this.e;     // Catch: Throwable -> L10
        if (r6 != null) goto L20;
    L28:
        l(r8, r1, r9);     // Catch: Throwable -> L10
        monitor-exit(r3);     // Catch: Throwable -> L10
        return;
    L20:
        if (r6.i(this) == true) goto L28;
        this.q = null;     // Catch: Throwable -> L26
        this.B = 4;     // Catch: Throwable -> L26
        monitor-exit(r3);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        r2 = r8;
        th = th;
    L42:
        monitor-exit(r3);     // Catch: Throwable -> L10
        throw th;     // Catch: Throwable -> L44
    L10:
        th = th;
    L44:
        th = move-exception;
        if (r2 == null) goto L47;
        this.t.getClass();
        i11.f(r2);
    L47:
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean isRunning() {
        Object r0 = this.c;
        monitor-enter(r0);
        int r2 = this.B;     // Catch: Throwable -> L13
        if (r2 != 2) goto L7;
    L10:
        boolean r3 = true;
    L11:
        monitor-exit(r0);     // Catch: Throwable -> L13
        return r3;
    L7:
        if (r2 == 3) goto L10;
        r3 = false;
    L13:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.pz3
    public final boolean j() {
        Object r0 = this.c;
        monitor-enter(r0);
    L10:
        th = move-exception;
        throw th;
    L5:
        if (this.B != 6) goto L7;
        boolean r2 = true;
    L8:
        monitor-exit(r0);     // Catch: Throwable -> L10
        return r2;
    L7:
        r2 = false;
        goto L8
    }

    @Override // defpackage.pz3
    public final void k() {
        Object r0 = this.c;
        monitor-enter(r0);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (this.z == true) goto L60;
        this.b.a();     // Catch: Throwable -> L11
        int r1 = ee2.b;     // Catch: Throwable -> L11
        this.s = SystemClock.elapsedRealtimeNanos();     // Catch: Throwable -> L11
        int r2 = 3;
        if (this.g == null) goto L9;
        int r3 = this.B;     // Catch: Throwable -> L11
        if (r3 == 2) goto L58;
        if (r3 != 4) goto L29;
        i(this.q, 5);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L29:
        List r4 = this.n;     // Catch: Throwable -> L11
        if (r4 == null) goto L36;
        Iterator r5 = r4.iterator();     // Catch: Throwable -> L11
    L34:
        if (r5.hasNext() == false) goto L36;
        zz3 r6 = (zz3) r5.next();     // Catch: Throwable -> L11
    L36:
        this.B = 3;     // Catch: Throwable -> L11
        if (e35.I(this.j, this.k) == false) goto L39;
        m(this.j, this.k);     // Catch: Throwable -> L11
    L40:
        int r7 = this.B;     // Catch: Throwable -> L11
        if (r7 == 2) goto L43;
        if (r7 == 3) goto L43;
    L53:
        if (C == false) goto L55;
        g("finished run method in " + ee2.a(this.s));     // Catch: Throwable -> L11
    L55:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L43:
        wz3 r8 = this.e;     // Catch: Throwable -> L11
        if (r8 != null) goto L46;
    L49:
        boolean r9 = true;
    L50:
        if (r9 == false) goto L53;
        this.m.k(f());     // Catch: Throwable -> L11
        goto L53
    L46:
        if (r8.h(this) == true) goto L49;
        r9 = false;
        goto L50
    L39:
        this.m.d(this);     // Catch: Throwable -> L11
        goto L40
    L58:
        throw new IllegalArgumentException("Cannot restart a running request");     // Catch: Throwable -> L11
    L9:
        if (e35.I(this.j, this.k) == false) goto L14;
        this.x = this.j;     // Catch: Throwable -> L11
        this.y = this.k;     // Catch: Throwable -> L11
    L14:
        if (this.w != null) goto L17;
        this.w = this.i.y;     // Catch: Throwable -> L11
    L17:
        if (this.w != null) goto L19;
        r2 = 5;
    L19:
        h(new GlideException("Received null model"), r2);     // Catch: Throwable -> L11
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L60:
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");     // Catch: Throwable -> L11
    }

    public final void l(q04 r4, Object r5, int r6) {
        wz3 r0 = this.e;
        if (r0 == null) goto L5;
        r0.getRoot().a();
    L5:
        this.B = 4;
        this.q = r4;
        if (this.f.i > 3) goto L8;
        Log.d("Glide", "Finished loading " + r5.getClass().getSimpleName() + " from " + xa3.x(r6) + " for " + this.g + " with size [" + this.x + "x" + this.y + "] in " + ee2.a(this.s) + " ms");
    L8:
        if (r0 == null) goto L10;
        r0.f(this);
    L10:
        this.z = true;
        List r1 = this.n;     // Catch: Throwable -> L17
        if (r1 == null) goto L19;
        Iterator r2 = r1.iterator();     // Catch: Throwable -> L17
    L15:
        if (r2.hasNext() == false) goto L19;
        ((zz3) r2.next()).g(r5);     // Catch: Throwable -> L17
    L19:
        zz3 r3 = this.d;     // Catch: Throwable -> L17
        if (r3 == null) goto L22;
        r3.g(r5);     // Catch: Throwable -> L17
    L22:
        this.m.c(r5, this.o.s(r6));     // Catch: Throwable -> L17
        this.z = false;
        return;
    L17:
        th = move-exception;
        this.z = false;
        throw th;
    }

    public final void m(int r24, int r25) {
        int r1 = r24;
        this.b.a();
        Object r6 = this.c;
        monitor-enter(r6);
        boolean r21 = C;     // Catch: Throwable -> L7
        if (r21 == false) goto L10;
        g("Got onSizeReady in " + ee2.a(this.s));     // Catch: Throwable -> L7
    L10:
        if (this.B == 3) goto L13;
        monitor-exit(r6);     // Catch: Throwable -> L7
        return;
    L13:
        this.B = 2;     // Catch: Throwable -> L7
        float r7 = this.i.o;     // Catch: Throwable -> L7
        if (r1 == Integer.MIN_VALUE) goto L17;
        r1 = Math.round(r1 * r7);     // Catch: Throwable -> L7
    L17:
        this.x = r1;     // Catch: Throwable -> L7
        if (r25 != Integer.MIN_VALUE) goto L20;
        int r2 = r25;
    L21:
        this.y = r2;     // Catch: Throwable -> L7
        if (r21 == false) goto L24;
        g("finished setup for calling load in " + ee2.a(this.s));     // Catch: Throwable -> L7
    L24:
        i11 r3 = this.t;     // Catch: Throwable -> L7
        ii1 r4 = this.f;     // Catch: Throwable -> L7
        Object r5 = this.g;     // Catch: Throwable -> L7
        lq r8 = this.i;     // Catch: Throwable -> L7
        this.r = r3.a(r4, r5, r8.w, this.x, this.y, r8.B, this.h, this.l, r8.p, r8.A, r8.x, r8.G, r8.z, r8.t, r8.H, r8.F, this, this.p);     // Catch: Throwable -> L37
        if (this.B == 2) goto L39;
        this.r = null;     // Catch: Throwable -> L37
    L39:
        if (r21 == false) goto L41;
        g("finished onSizeReady in " + ee2.a(this.s));     // Catch: Throwable -> L37
    L41:
        monitor-exit(r6);     // Catch: Throwable -> L37
        return;
    L43:
        th = th;
        Object r22 = r6;
    L51:
        monitor-exit(r22);     // Catch: Throwable -> L37
        throw th;
    L45:
        th = th;
        r22 = r6;
    L47:
        th = th;
        r22 = r6;
    L49:
        th = th;
        r22 = r6;
        goto L51
    L20:
        r2 = Math.round(r7 * r25);     // Catch: Throwable -> L7
    L37:
        th = th;
    L7:
        th = th;
        r22 = r6;
        goto L51
    }

    public final String toString() {
        Object r0 = this.c;
        monitor-enter(r0);
        Object r1 = this.g;     // Catch: Throwable -> L8
        Class r2 = this.h;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return super.toString() + "[model=" + r1 + ", transcodeClass=" + r2 + "]";
    L8:
        th = move-exception;
        throw th;
    }
}
