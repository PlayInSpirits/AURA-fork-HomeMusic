package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gr0 extends ar4 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public gr0(String r2, gf1 r3) {
        this.e = 2;
        this.f = r3;
        super(r2);
    }

    @Override // defpackage.ar4
    public final long a() {
        int r3 = 0;
        long r4 = -1;
        switch(this.e) {
            case 0: goto L76;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((gf1) this.f).invoke();
        return -1;
    L6:
        dv3 r0 = (dv3) this.f;
        long r6 = System.nanoTime();
        Map r1 = r0.c;
        Iterator r8 = r1.values().iterator();
        if (r8.hasNext() == true) goto L75;
        Iterator r9 = r0.f.iterator();
    L10:
        if (r9.hasNext() == false) goto L16;
        if (r1.get(((cv3) r9.next()).d.a) == null) goto L10;
        kf2.k();
    L15:
        return 0;
    L16:
        long r10 = (r6 - r0.b) + 1;
        Iterator r12 = r0.f.iterator();
        cv3 r13 = null;
        cv3 r18 = null;
        long r16 = Long.MAX_VALUE;
        long r14 = r10;
        cv3 r11 = null;
        int r15 = 0;
    L18:
        if (r12.hasNext() == false) goto L39;
        long r20 = r4;
        cv3 r5 = (cv3) r12.next();
        r5.getClass();
        monitor-enter(r5);
    L36:
        th = move-exception;
        throw th;
    L22:
        if (r0.a(r5, r6) <= 0) goto L24;
        r15 = r15 + 1;     // Catch: Throwable -> L36
    L32:
        monitor-exit(r5);
        r4 = r20;
        goto L18
    L24:
        long r17 = r5.t;     // Catch: Throwable -> L36
        if (r17 >= r14) goto L28;
        r11 = r5;
        r14 = r17;
    L28:
        if (r1.get(r5.d.a) != null) goto L35;
        r3 = r3 + 1;
        if (r17 >= r16) goto L32;
        r18 = r5;
        r16 = r17;
        goto L32
    L35:
        throw new ClassCastException();     // Catch: Throwable -> L36
    L39:
        long r21 = r4;
        if (r11 == null) goto L43;
        r13 = r11;
    L46:
        if (r13 == null) goto L68;
        monitor-enter(r13);
    L65:
        th = move-exception;
        throw th;
    L49:
        if (r13.s.isEmpty() == true) goto L54;
        monitor-exit(r13);
        goto L15
    L54:
        if (r13.t == r14) goto L57;
        monitor-exit(r13);
        goto L15
    L57:
        r13.m = true;     // Catch: Throwable -> L65
        r0.f.remove(r13);     // Catch: Throwable -> L65
        monitor-exit(r13);
        if (r1.get(r13.d.a) != null) goto L64;
        Socket r2 = r13.f;
        r2.getClass();
        ze5.c(r2);
        if (r0.f.isEmpty() == false) goto L15;
        r0.d.a();
        goto L15
    L64:
        kf2.k();
        goto L15
    L68:
        if (r18 != null) goto L117;
        if (r15 <= 0) goto L73;
        return r0.b;
    L73:
        return r21;
    L117:
        return (r16 + r0.b) - r6;
    L43:
        if (r3 <= 5) goto L45;
        r14 = r16;
        r13 = r18;
        goto L46
    L45:
        r14 = r21;
        goto L46
    L75:
        throw xa3.d(r8);
    L76:
        jr0 r7 = (jr0) this.f;
        monitor-enter(r7);
    L85:
        th = move-exception;
        throw th;
    L79:
        if (r7.z == true) goto L81;
    L98:
        monitor-exit(r7);
    L99:
        return -1;
    L81:
        if (r7.A == true) goto L98;
        r7.M();     // Catch: Throwable -> L85 IOException -> L87
    L107:
    L92:
        r7.C = true;     // Catch: Throwable -> L85
        wu3 r19 = r7.u;     // Catch: Throwable -> L85
        if (r19 == null) goto L95;
        xe5.b(r19);     // Catch: Throwable -> L85
    L95:
        r7.u = new wu3(new ct());     // Catch: Throwable -> L85
    L96:
        monitor-exit(r7);
        goto L99
    L89:
        if (r7.s() == false) goto L96;
        r7.J();     // Catch: Throwable -> L85 IOException -> L92
        r7.w = 0;     // Catch: Throwable -> L85 IOException -> L92
    L87:
        r7.B = true;     // Catch: Throwable -> L85
        goto L107
    }

    public /* synthetic */ gr0(Object r1, String r2, int r3) {
        this.e = r3;
        this.f = r1;
        super(r2);
    }
}
