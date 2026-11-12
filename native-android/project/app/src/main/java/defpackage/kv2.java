package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kv2 implements kg0 {
    public static final h90 b = null;
    public final ArrayList a;

    static {
        x13 r0 = x13.o;
        kw r2 = new kw(new zr2(23), r0);
        x13 r1 = x13.p;
        b = new h90(r2, new kw(new zr2(24), r1));
    }

    public kv2() {
        this.a = new ArrayList();
    }

    @Override // defpackage.kg0
    public final long a(long r11) {
        int r2 = 0;
        long r3 = -9223372036854775807L;
    L3:
        ArrayList r5 = this.a;
        if (r2 >= r5.size()) goto L19;
        long r6 = ((lg0) r5.get(r2)).b;
        long r8 = ((lg0) r5.get(r2)).d;
        if (r11 < r6) goto L8;
        if (r11 >= r8) goto L17;
        if (r3 != (-9223372036854775807L)) goto L16;
        r3 = r8;
        goto L17
    L16:
        r3 = Math.min(r3, r8);
    L17:
        r2 = r2 + 1;
        goto L3
    L8:
        if (r3 != (-9223372036854775807L)) goto L10;
        r3 = r6;
        goto L19
    L10:
        r3 = Math.min(r3, r6);
    L19:
        if (r3 == (-9223372036854775807L)) goto L21;
        return r3;
    L21:
        return Long.MIN_VALUE;
    }

    @Override // defpackage.kg0
    public final boolean b(lg0 r10, long r11) {
        long r0 = r10.b;
        if (r0 == (-9223372036854775807L)) goto L5;
        boolean r4 = true;
    L6:
        rr2.l(r4);
        if (r10.c == (-9223372036854775807L)) goto L9;
        boolean r2 = true;
    L10:
        rr2.l(r2);
        if (r0 <= r11) goto L13;
    L15:
        boolean r12 = false;
    L16:
        ArrayList r9 = this.a;
        int r13 = r9.size() - 1;
    L17:
        if (r13 < 0) goto L23;
        if (r0 >= ((lg0) r9.get(r13)).b) goto L20;
        r13 = r13 - 1;
        goto L17
    L20:
        r9.add(r13 + 1, r10);
        return r12;
    L23:
        r9.add(0, r10);
        return r12;
    L13:
        if (r11 >= r10.d) goto L15;
        r12 = true;
        goto L16
    L9:
        r2 = false;
        goto L10
    L5:
        r4 = false;
        goto L6
    }

    @Override // defpackage.kg0
    public final yw1 c(long r7) {
        ArrayList r6 = this.a;
        if (r6.isEmpty() == true) goto L25;
        int r0 = 0;
        if (r7 < ((lg0) r6.get(0)).b) goto L25;
        ArrayList r1 = new ArrayList();
        int r2 = 0;
    L9:
        if (r2 >= r6.size()) goto L19;
        lg0 r3 = (lg0) r6.get(r2);
        if (r7 < r3.b) goto L16;
        if (r7 >= r3.d) goto L16;
        r1.add(r3);
    L16:
        if (r7 < r3.b) goto L19;
        r2 = r2 + 1;
    L19:
        gy3 r8 = yw1.q(b, r1);
        uw1 r9 = yw1.j();
    L21:
        if (r0 >= r8.q) goto L24;
        r9.d(((lg0) r8.get(r0)).a);
        r0 = r0 + 1;
        goto L21
    L24:
        return r9.f();
    L25:
        vw1 r10 = yw1.o;
        return gy3.r;
    }

    @Override // defpackage.kg0
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.kg0
    public final long d(long r9) {
        ArrayList r8 = this.a;
        if (r8.isEmpty() == true) goto L18;
        int r0 = 0;
        if (r9 < ((lg0) r8.get(0)).b) goto L24;
        long r1 = ((lg0) r8.get(0)).b;
    L9:
        if (r0 >= r8.size()) goto L17;
        long r3 = ((lg0) r8.get(r0)).b;
        long r5 = ((lg0) r8.get(r0)).d;
        if (r5 > r9) goto L14;
        r1 = Math.max(r1, r5);
    L16:
        r0 = r0 + 1;
        goto L9
    L14:
        if (r3 > r9) goto L17;
        r1 = Math.max(r1, r3);
    L17:
        return r1;
    L24:
        return -9223372036854775807L;
    L18:
        return -9223372036854775807L;
    }

    @Override // defpackage.kg0
    public final void e(long r6) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.a;
        if (r0 >= r1.size()) goto L13;
        long r2 = ((lg0) r1.get(r0)).b;
        if (r6 > r2) goto L8;
    L10:
        if (r6 >= r2) goto L12;
        return;
    L12:
        r0 = r0 + 1;
        goto L3
    L8:
        if (r6 <= ((lg0) r1.get(r0)).d) goto L10;
        r1.remove(r0);
        r0 = r0 - 1;
        goto L12
    }
}
