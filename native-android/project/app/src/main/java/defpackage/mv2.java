package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mv2 implements no2, mo2 {
    public final no2[] n;
    public final boolean[] o;
    public final IdentityHashMap p;
    public final i80 q;
    public final ArrayList r;
    public final HashMap s;
    public mo2 t;
    public tv4 u;
    public no2[] v;
    public s80 w;

    public mv2(i80 r6, long[] r7, no2... r8) {
        this.q = r6;
        this.n = r8;
        this.r = new ArrayList();
        this.s = new HashMap();
        r6.getClass();
        vw1 r0 = yw1.o;
        gy3 r1 = gy3.r;
        this.w = new s80(r1, r1);
        this.p = new IdentityHashMap();
        int r9 = 0;
        this.v = new no2[0];
        this.o = new boolean[r8.length];
    L4:
        if (r9 >= r8.length) goto L9;
        long r2 = r7[r9];
        if (r2 == 0) goto L8;
        this.o[r9] = true;
        this.n[r9] = new wt4(r8[r9], r2);
    L8:
        r9 = r9 + 1;
        goto L4
    }

    @Override // defpackage.mo2
    public final void b(no2 r17) {
        ArrayList r1 = this.r;
        r1.remove(r17);
        if (r1.isEmpty() == true) goto L5;
        return;
    L5:
        no2[] r2 = this.n;
        int r3 = r2.length;
        int r4 = 0;
        int r5 = 0;
    L6:
        if (r4 >= r3) goto L8;
        r5 = r5 + r2[r4].n().a;
        r4 = r4 + 1;
        goto L6
    L8:
        sv4[] r6 = new sv4[r5];
        int r7 = 0;
        int r8 = 0;
    L10:
        if (r7 >= r2.length) goto L22;
        tv4 r9 = r2[r7].n();
        int r10 = r9.a;
        int r11 = 0;
    L12:
        if (r11 >= r10) goto L21;
        sv4 r12 = r9.a(r11);
        int r13 = r12.a;
        tb1[] r14 = new tb1[r13];
        int r15 = 0;
    L15:
        if (r15 >= r13) goto L20;
        tb1 r16 = r12.d[r15];
        sb1 r18 = r16.a();
        StringBuilder r19 = new StringBuilder();
        r19.append(r7);
        r19.append(":");
        String r110 = r16.a;
        if (r110 != null) goto L19;
        r110 = "";
    L19:
        r19.append(r110);
        r18.a = r19.toString();
        r14[r15] = new tb1(r18);
        r15 = r15 + 1;
        goto L15
    L20:
        sv4 r20 = new sv4(r7 + ":" + r12.b, r14);
        this.s.put(r20, r12);
        r6[r8] = r20;
        r11 = r11 + 1;
        r8 = r8 + 1;
        goto L12
    L21:
        r7 = r7 + 1;
        goto L10
    L22:
        this.u = new tv4(r6);
        mo2 r21 = this.t;
        r21.getClass();
        r21.b(this);
    }

    @Override // defpackage.no2
    public final long c(t41[] r23, boolean[] r24, q44[] r25, boolean[] r26, long r27) {
        int[] r3 = new int[r23.length];
        int[] r4 = new int[r23.length];
        int r5 = 0;
        int r6 = 0;
    L3:
        int r7 = r23.length;
        IdentityHashMap r8 = this.p;
        if (r6 >= r7) goto L18;
        q44 r9 = r25[r6];
        if (r9 != null) goto L8;
        Integer r10 = null;
    L10:
        if (r10 != null) goto L12;
        int r11 = -1;
    L13:
        r3[r6] = r11;
        t41 r12 = r23[r6];
        if (r12 == null) goto L16;
        String r13 = r12.c().b;
        r4[r6] = Integer.parseInt(r13.substring(0, r13.indexOf(":")));
    L17:
        r6 = r6 + 1;
        goto L3
    L16:
        r4[r6] = -1;
        goto L17
    L12:
        r11 = r10.intValue();
        goto L13
    L8:
        r10 = (Integer) r8.get(r9);
        goto L10
    L18:
        r8.clear();
        int r14 = r23.length;
        q44[] r15 = new q44[r14];
        q44[] r16 = new q44[r23.length];
        t41[] r17 = new t41[r23.length];
        no2[] r18 = this.n;
        ArrayList r19 = new ArrayList(r18.length);
        long r110 = r27;
        int r111 = 0;
    L20:
        if (r111 >= r18.length) goto L57;
        int r112 = r5;
    L23:
        if (r112 >= r23.length) goto L33;
        if (r3[r112] != r111) goto L27;
        q44 r20 = r25[r112];
    L28:
        r16[r112] = r20;
        if (r4[r112] != r111) goto L31;
        t41 r21 = r23[r112];
        r21.getClass();
        sv4 r22 = (sv4) this.s.get(r21.c());
        r22.getClass();
        r17[r112] = new lv2(r21, r22);
    L32:
        r112 = r112 + 1;
        r3 = r3;
        goto L23
    L31:
        r17[r112] = null;
        goto L32
    L27:
        r20 = null;
        goto L28
    L33:
        int[] r113 = r3;
        no2[] r28 = r18;
        int r29 = r111;
        long r210 = r28[r111].c(r17, r24, r16, r26, r110);
        if (r29 != 0) goto L37;
        r110 = r210;
    L38:
        int r30 = 0;
        boolean r114 = false;
    L40:
        if (r30 >= r23.length) goto L52;
        boolean r115 = true;
        if (r4[r30] != r29) goto L45;
        q44 r116 = r16[r30];
        r116.getClass();
        r15[r30] = r16[r30];
        r8.put(r116, Integer.valueOf(r29));
        r114 = true;
    L51:
        r30 = r30 + 1;
        goto L40
    L45:
        if (r113[r30] != r29) goto L51;
        if (r16[r30] == null) goto L50;
        r115 = false;
    L50:
        rr2.w(r115);
        goto L51
    L52:
        if (r114 == false) goto L54;
        r19.add(r28[r29]);
    L54:
        r111 = r29 + 1;
        r18 = r28;
        r3 = r113;
        r5 = 0;
        goto L20
    L37:
        if (r210 == r110) goto L38;
        kf2.o("Children enabled at different positions.");
        return 0;
    L57:
        int r1 = r5;
        System.arraycopy(r15, r1, r25, r1, r14);
        this.v = (no2[]) r19.toArray(new no2[r1]);
        AbstractList r2 = hw.P(new zr2(25), r19);
        this.q.getClass();
        this.w = new s80(r19, r2);
        return r110;
    }

    @Override // defpackage.da4
    public final long d() {
        return this.w.d();
    }

    @Override // defpackage.no2
    public final long e(long r4, n84 r6) {
        no2[] r0 = this.v;
        if (r0.length <= 0) goto L5;
        no2 r3 = r0[0];
    L7:
        return r3.e(r4, r6);
    L5:
        r3 = this.n[0];
        goto L7
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.w.f();
    }

    @Override // defpackage.no2
    public final void h() {
        no2[] r3 = this.n;
        int r0 = r3.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r3[r1].h();
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.no2
    public final long i(long r4) {
        long r5 = this.v[0].i(r4);
        int r0 = 1;
    L3:
        no2[] r1 = this.v;
        if (r0 >= r1.length) goto L10;
        if (r1[r0].i(r5) != r5) goto L8;
        r0 = r0 + 1;
        goto L3
    L8:
        kf2.o("Unexpected child seekToUs result.");
        return 0;
    L10:
        return r5;
    }

    @Override // defpackage.ca4
    public final void j(da4 r1) {
        no2 r2 = (no2) r1;
        mo2 r3 = this.t;
        r3.getClass();
        r3.j(this);
    }

    @Override // defpackage.no2
    public final void k(boolean r4, long r5) {
        no2[] r3 = this.v;
        int r0 = r3.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r3[r1].k(r4, r5);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.no2
    public final long l() {
        no2[] r1 = this.v;
        int r2 = r1.length;
        long r3 = -9223372036854775807L;
        long r7 = -9223372036854775807L;
        int r6 = 0;
    L3:
        if (r6 >= r2) goto L33;
        no2 r9 = r1[r6];
        long r10 = r9.l();
        if (r10 != r3) goto L7;
        long r16 = r3;
        if (r7 == r16) goto L32;
        if (r9.i(r7) == r7) goto L32;
        kf2.o("Unexpected child seekToUs result.");
        return 0;
    L32:
        r6 = r6 + 1;
        r3 = r16;
        goto L3
    L7:
        if (r7 != r3) goto L20;
        no2[] r8 = this.v;
        int r11 = r8.length;
        int r12 = 0;
    L9:
        r16 = r3;
        if (r12 >= r11) goto L19;
        no2 r4 = r8[r12];
        if (r4 == r9) goto L19;
        if (r4.i(r10) != r10) goto L17;
        r12 = r12 + 1;
        r3 = r16;
        goto L9
    L17:
        kf2.o("Unexpected child seekToUs result.");
        return 0;
    L19:
        r7 = r10;
        goto L32
    L20:
        r16 = r3;
        if (r10 == r7) goto L32;
        kf2.o("Conflicting discontinuities.");
        return 0;
    L33:
        return r7;
    }

    @Override // defpackage.no2
    public final void m(mo2 r4, long r5) {
        this.t = r4;
        ArrayList r6 = this.r;
        no2[] r0 = this.n;
        Collections.addAll(r6, r0);
        int r7 = r0.length;
        int r1 = 0;
    L3:
        if (r1 >= r7) goto L5;
        r0[r1].m(this, r5);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.no2
    public final tv4 n() {
        tv4 r0 = this.u;
        r0.getClass();
        return r0;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r5) {
        ArrayList r0 = this.r;
        if (r0.isEmpty() == true) goto L9;
        int r4 = r0.size();
        int r2 = 0;
    L5:
        if (r2 >= r4) goto L7;
        ((no2) r0.get(r2)).o(r5);
        r2 = r2 + 1;
        goto L5
    L7:
        return false;
    L9:
        return this.w.o(r5);
    }

    @Override // defpackage.da4
    public final long q() {
        return this.w.q();
    }

    @Override // defpackage.da4
    public final void u(long r1) {
        this.w.u(r1);
    }
}
