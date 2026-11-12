package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ia1 implements ha1 {
    public final pa a;
    public final zb b;
    public final wo0 c;
    public final ma1 d;
    public final rm2 e;

    public ia1(pa r6, zb r7) {
        wo0 r0 = ja1.a;
        ma1 r1 = new ma1();
        la1 r2 = ma1.a;
        fl1 r3 = qr0.a;
        r2.getClass();
        te5.a(ya4.F(r2, r3).J(q01.n).J(new fo4(null)));
        rm2 r4 = new rm2(6);
        this.a = r6;
        this.b = r7;
        this.c = r0;
        this.d = r1;
        this.e = r4;
        new x(12, this);
    }

    public final n05 a(m05 r7) {
        wo0 r0 = this.c;
        xi4 r1 = (xi4) r0.n;
        monitor-enter(r1);
        n05 r2 = (n05) ((fg4) r0.o).g(r7);     // Catch: Throwable -> L20
        if (r2 != null) goto L7;
    L24:
        monitor-exit(r1);
        this.d.getClass();     // Catch: Exception -> L50
        rm2 r6 = this.e;     // Catch: Exception -> L50
        r6.getClass();     // Catch: Exception -> L50
        vk0 r3 = r7.a;     // Catch: Exception -> L50
        if (r3 != null) goto L29;
    L32:
        n05 r4 = new n05(((gh3) r6.o).b(r7.b, r7.c));     // Catch: Exception -> L50
    L33:
        if (r4 == null) goto L49;
        xi4 r8 = (xi4) r0.n;
        monitor-enter(r8);
    L42:
        th = move-exception;
        throw th;
    L37:
        if (((fg4) r0.o).g(r7) == null) goto L39;
    L44:
        monitor-exit(r8);
        return r4;
    L39:
        if (r4.o == false) goto L44;
        ((fg4) r0.o).l(r7, r4);     // Catch: Throwable -> L42
        goto L44
    L49:
        throw new IllegalStateException("Could not load font");     // Catch: Exception -> L50
    L29:
        if ((r3 instanceof vk0) == true) goto L32;
        r4 = null;
    L50:
        e = move-exception;
        mj0.j("Could not load font", e);
        return null;
    L7:
        if (r2.o == false) goto L10;
        monitor-exit(r1);
        return r2;
    L10:
        fg4 r5 = (fg4) r0.o;     // Catch: Throwable -> L20
        tv1 r9 = (tv1) r5.g;     // Catch: Throwable -> L20
        monitor-enter(r9);     // Catch: Throwable -> L20
        si1 r10 = (si1) r5.f;     // Catch: Throwable -> L16
        r10.getClass();     // Catch: Throwable -> L16
        Object r11 = ((LinkedHashMap) r10.o).remove(r7);     // Catch: Throwable -> L16
        if (r11 == null) goto L18;
        r5.c--;     // Catch: Throwable -> L16
    L18:
        monitor-exit(r9);     // Catch: Throwable -> L20
        n05 r12 = (n05) r11;     // Catch: Throwable -> L20
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L20
    L20:
        th = move-exception;
        throw th;
    }

    public final n05 b(vk0 r7, gb1 r8, int r9, int r10) {
        zb r1 = this.b;
        r1.getClass();
        int r2 = r1.n;
        if (r2 != 0) goto L5;
    L8:
        gb1 r3 = r8;
    L9:
        this.a.getClass();
        return a(new m05(r7, r3, r9, r10, null));
    L5:
        if (r2 == Integer.MAX_VALUE) goto L8;
        r3 = new gb1(gb.m(r8.n + r2, 1, 1000));
        goto L9
    }
}
