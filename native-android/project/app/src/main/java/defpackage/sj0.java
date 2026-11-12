package defpackage;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class sj0 {
    public long a;
    public long b;
    public Serializable c;

    public sj0(long r5) {
        this.c = new LinkedHashMap(100, 0.75f, true);
        this.a = r5;
    }

    public synchronized Object a(Object r2) {
        monitor-enter(this);
        of2 r3 = (of2) ((LinkedHashMap) this.c).get(r2);     // Catch: Throwable -> L7
        if (r3 == null) goto L9;
        Object r4 = r3.a;     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r4;
    L9:
        r4 = null;
    L7:
        th = move-exception;
        throw th;
    }

    public int b(Object r1) {
        return 1;
    }

    public void c(Object r1, Object r2) {
    }

    public synchronized Object d(Object r8, Object r9) {
        monitor-enter(this);
        int r0 = b(r9);     // Catch: Throwable -> L8
        long r1 = r0;
        Object r4 = null;
        if (r1 < this.a) goto L10;
        c(r8, r9);     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L10:
        if (r9 == null) goto L12;
        this.b += r1;     // Catch: Throwable -> L8
    L12:
        LinkedHashMap r2 = (LinkedHashMap) this.c;     // Catch: Throwable -> L8
        if (r9 != null) goto L15;
        of2 r3 = null;
    L16:
        of2 r5 = (of2) r2.put(r8, r3);     // Catch: Throwable -> L8
        if (r5 == null) goto L21;
        this.b -= (long) r5.b;     // Catch: Throwable -> L8
        if (r5.a.equals(r9) == true) goto L21;
        c(r8, r5.a);     // Catch: Throwable -> L8
    L21:
        f(this.a);     // Catch: Throwable -> L8
        if (r5 == null) goto L24;
        r4 = r5.a;     // Catch: Throwable -> L8
    L24:
        monitor-exit(this);
        return r4;
    L15:
        r3 = new of2(r0, r9);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public void e(Exception r8) {
        long r0 = SystemClock.elapsedRealtime();
        if (((Exception) this.c) != null) goto L6;
        this.c = r8;
    L6:
        if (this.a == (-9223372036854775807L)) goto L8;
    L11:
        long r2 = this.a;
        if (r2 != (-9223372036854775807L)) goto L14;
    L20:
        this.b = r0 + 50;
        return;
    L14:
        if (r0 < r2) goto L20;
        Exception r1 = (Exception) this.c;
        if (r1 == r8) goto L18;
        r1.addSuppressed(r8);
    L18:
        Exception r9 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw r9;
    L8:
        if (tj0.c0.get() > 0) goto L11;
        this.a = 200 + r0;
        goto L11
    }

    public synchronized void f(long r8) {
        monitor-enter(this);
    L13:
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.b <= r8) goto L9;
        Iterator r0 = ((LinkedHashMap) this.c).entrySet().iterator();     // Catch: Throwable -> L7
        Map.Entry r1 = (Map.Entry) r0.next();     // Catch: Throwable -> L7
        of2 r2 = (of2) r1.getValue();     // Catch: Throwable -> L7
        this.b -= (long) r2.b;     // Catch: Throwable -> L7
        Object r3 = r1.getKey();     // Catch: Throwable -> L7
        r0.remove();     // Catch: Throwable -> L7
        c(r3, r2.a);     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
    }

    public sj0() {
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }
}
