package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qj0 {
    public final int a;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qj0(int r3) {
        this.c = new hd5(10);
        this.d = new mf2(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = r3;
    }

    public static boolean a(qj0 r1) {
        return Objects.equals(((tb1) r1.c).n, "audio/raw");
    }

    public void b(int r3, Class r4) {
        NavigableMap r5 = g(r4);
        Integer r0 = (Integer) r5.get(Integer.valueOf(r3));
        if (r0 == null) goto L11;
        if (r0.intValue() != 1) goto L8;
        r5.remove(Integer.valueOf(r3));
        return;
    L8:
        r5.put(Integer.valueOf(r3), Integer.valueOf(r0.intValue() - 1));
        return;
    L11:
        throw new NullPointerException("Tried to decrement empty size, size: " + r3 + ", this: " + this);
    }

    public void c(int r6) {
    L3:
        if (this.b <= r6) goto L7;
        Object r0 = ((hd5) this.c).l();
        h12.e(r0);
        lw r1 = e(r0.getClass());
        this.b = this.b - (r1.b() * r1.a(r0));
        b(r1.a(r0), r0.getClass());
        if (Log.isLoggable(r1.c(), 2) == false) goto L3;
        Log.v(r1.c(), "evicted: " + r1.a(r0));
        goto L3
    }

    public synchronized Object d(int r4, Class r5) {
        monitor-enter(this);
        Integer r0 = (Integer) g(r5).ceilingKey(Integer.valueOf(r4));     // Catch: Throwable -> L21
        if (r0 == null) goto L14;
        int r1 = this.b;     // Catch: Throwable -> L21
        if (r1 != 0) goto L8;
    L13:
        boolean r2 = true;
    L15:
        mf2 r3 = (mf2) this.d;
        if (r2 == false) goto L23;
        int r6 = r0.intValue();     // Catch: Throwable -> L21
        xn3 r7 = (xn3) ((ArrayDeque) r3.a).poll();     // Catch: Throwable -> L21
        if (r7 != null) goto L20;
        r7 = r3.u();     // Catch: Throwable -> L21
    L20:
        lf2 r8 = (lf2) r7;     // Catch: Throwable -> L21
        r8.b = r6;     // Catch: Throwable -> L21
        r8.c = r5;     // Catch: Throwable -> L21
    L27:
        Object r9 = f(r8, r5);     // Catch: Throwable -> L21
        monitor-exit(this);
        return r9;
    L23:
        xn3 r10 = (xn3) ((ArrayDeque) r3.a).poll();     // Catch: Throwable -> L21
        if (r10 != null) goto L26;
        r10 = r3.u();     // Catch: Throwable -> L21
    L26:
        r8 = (lf2) r10;     // Catch: Throwable -> L21
        r8.b = r4;     // Catch: Throwable -> L21
        r8.c = r5;     // Catch: Throwable -> L21
        goto L27
    L8:
        if ((this.a / r1) >= 2) goto L13;
        if (r0.intValue() <= (r4 * 8)) goto L13;
    L14:
        r2 = false;
    L21:
        th = move-exception;
        throw th;
    }

    public lw e(Class r3) {
        HashMap r2 = (HashMap) this.f;
        lw r0 = (lw) r2.get(r3);
        if (r0 == null) goto L5;
        return r0;
    L5:
        if (r3.equals(int[].class) == false) goto L8;
        lw r1 = new lw(1);
    L10:
        r2.put(r3, r1);
        return r1;
    L8:
        if (r3.equals(byte[].class) == false) goto L12;
        r1 = new lw(0);
        goto L10
    L12:
        kf2.n("No array pool found for: ".concat(r3.getSimpleName()));
        return null;
    }

    public Object f(lf2 r6, Class r7) {
        lw r0 = e(r7);
        Object r1 = ((hd5) this.c).h(r6);
        if (r1 == null) goto L5;
        this.b = this.b - (r0.b() * r0.a(r1));
        b(r0.a(r1), r7);
    L5:
        if (r1 == null) goto L7;
        return r1;
    L7:
        if (Log.isLoggable(r0.c(), 2) == false) goto L9;
        Log.v(r0.c(), "Allocated " + r6.b + " bytes");
    L9:
        int r5 = r6.b;
        switch(r0.a) {
            case 0: goto L13;
            default: goto L15;
        };
    L15:
        return new int[r5];
    L13:
        return new byte[r5];
    }

    public NavigableMap g(Class r2) {
        HashMap r1 = (HashMap) this.e;
        NavigableMap r0 = (NavigableMap) r1.get(r2);
        if (r0 != null) goto L6;
        TreeMap r3 = new TreeMap();
        r1.put(r2, r3);
        return r3;
    L6:
        return r0;
    }

    public synchronized void h(Object r6) {
        monitor-enter(this);
        Class<?> r0 = r6.getClass();     // Catch: Throwable -> L15
        lw r1 = e(r0);     // Catch: Throwable -> L15
        int r2 = r1.a(r6);     // Catch: Throwable -> L15
        int r3 = r1.b() * r2;     // Catch: Throwable -> L15
        if (r3 > (this.a / 2)) goto L17;
        mf2 r4 = (mf2) this.d;     // Catch: Throwable -> L15
        xn3 r5 = (xn3) ((ArrayDeque) r4.a).poll();     // Catch: Throwable -> L15
        if (r5 != null) goto L8;
        r5 = r4.u();     // Catch: Throwable -> L15
    L8:
        lf2 r7 = (lf2) r5;     // Catch: Throwable -> L15
        r7.b = r2;     // Catch: Throwable -> L15
        r7.c = r0;     // Catch: Throwable -> L15
        ((hd5) this.c).k(r7, r6);     // Catch: Throwable -> L15
        NavigableMap r8 = g(r0);     // Catch: Throwable -> L15
        Integer r9 = (Integer) r8.get(Integer.valueOf(r7.b));     // Catch: Throwable -> L15
        Integer r10 = Integer.valueOf(r7.b);     // Catch: Throwable -> L15
        int r11 = 1;
        if (r9 == null) goto L12;
        r11 = 1 + r9.intValue();     // Catch: Throwable -> L15
    L12:
        r8.put(r10, Integer.valueOf(r11));     // Catch: Throwable -> L15
        this.b += r3;     // Catch: Throwable -> L15
        c(this.a);     // Catch: Throwable -> L15
        monitor-exit(this);
        return;
    L17:
        monitor-exit(this);
        return;
    L15:
        th = move-exception;
        throw th;
    }

    public qj0(tb1 r1, tb1 r2, int r3, int r4, em r5, fm r6) {
        this.c = r1;
        this.d = r2;
        this.a = r3;
        this.b = r4;
        this.e = r5;
        this.f = r6;
    }
}
