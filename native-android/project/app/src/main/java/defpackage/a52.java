package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a52 extends qe4 {
    @Override // defpackage.qe4
    public final pe4 i1() {
        v52 r0 = u52.c();
        boolean r1 = r0.k;
        boolean r2 = r0.b;
        if (u52.k() == false) goto L5;
        List r3 = u52.l();
    L7:
        if (r3.isEmpty() == true) goto L9;
    L11:
        List r4 = r3;
    L13:
        if (r4.isEmpty() == false) goto L16;
        int r5 = -1;
    L24:
        ArrayList r7 = new ArrayList(r40.k0(r4, 10));
        Iterator r9 = r4.iterator();
        int r10 = 0;
    L25:
        int r12 = 1;
        boolean r13 = true;
        if (r9.hasNext() == false) goto L48;
        Object r11 = r9.next();
        int r14 = r10 + 1;
        if (r10 < 0) goto L46;
        Child r15 = (Child) r11;
        Iterator r17 = r9;
        if (r10 != r5) goto L32;
        long r8 = r0.i;
    L37:
        ge4 r16 = new ge4(r0.s + ":" + r10);
        um2 r6 = new um2();
        vw1 r18 = yw1.o;
        gy3 r19 = gy3.r;
        List r110 = Collections.EMPTY_LIST;
        gy3 r111 = gy3.r;
        zm2 r112 = new zm2();
        cn2 r26 = cn2.d;
        String r21 = r15.getId();
        r21.getClass();
        r16.c = new gn2(r21, new wm2(r6), null, new an2(r112), si0.E(r15), r26);
        if (r8 > 0) goto L41;
        r13 = false;
    L41:
        r16.j = r13;
        if (r8 <= 0) goto L44;
        long r20 = r8 * 1000;
    L45:
        r16.a(r20);
        r7.add(new he4(r16));
        r10 = r14;
        r9 = r17;
        goto L25
    L44:
        r20 = -9223372036854775807L;
        goto L45
    L32:
        Integer r22 = r15.getDuration();
        if (r22 == null) goto L35;
        int r23 = r22.intValue();
    L36:
        r8 = ((long) r23) * 1000;
        goto L37
    L35:
        r23 = 0;
        goto L36
    L46:
        gb.c0();
        throw null;
    L48:
        int r24 = 2;
        xk0 r25 = new xk0(2);
        r25.d(new int[]{17, 18, 16, 22});
        if (r2 == false) goto L51;
        r25.d(new int[]{1, 15, 14, 24, 13});
    L51:
        if (r2 == true) goto L53;
    L60:
        mi3 r27 = new mi3(r25.f());
        oe4 r28 = new oe4();
        r28.a = r27;
        r28.b(r7);
        r28.B = r5;
        r28.b = r1;
        r28.c = 1;
        if (r4.isEmpty() == false) goto L63;
        r24 = 1;
    L66:
        r28.d = r24;
        if (r1 == true) goto L69;
    L71:
        r12 = 0;
    L72:
        r28.e = r12;
        r28.g = r0.u;
        r28.h = r0.t;
        r28.c(r0.l);
        r28.l = new qh3(r0.y, r0.z);
        cn r29 = new cn(19, r0);
        r28.E = null;
        r28.F = r29;
        return new pe4(r28);
    L69:
        if (r0.j == true) goto L71;
    L63:
        if (r2 == false) goto L66;
        r24 = 3;
        goto L66
    L53:
        if (r3.isEmpty() == true) goto L60;
        r25.d(new int[]{5, 10});
        r25.b(7);
        if (r0.v == false) goto L58;
        r25.d(new int[]{8, 9});
    L58:
        if (r0.w == false) goto L60;
        r25.b(6);
        goto L60
    L16:
        if (r3.isEmpty() == false) goto L18;
    L17:
        r5 = 0;
        goto L24
    L18:
        r5 = r0.o;
        j02 r30 = gb.C(r4);
        int r31 = r30.o;
        if (r30.isEmpty() == true) goto L75;
        if (r5 < 0) goto L17;
        if (r5 <= r31) goto L24;
        r5 = r31;
        goto L24
    L75:
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + r30 + '.');
    L9:
        if (r0.p <= 0) goto L11;
        r4 = gb.O(u52.d());
        goto L13
    L5:
        r3 = u01.n;
        goto L7
    }

    @Override // defpackage.qe4
    public final ic2 r1(int r3, int r4, long r5) {
        switch(r4) {
            case 6: goto L12;
            case 7: goto L12;
            case 8: goto L11;
            case 9: goto L11;
            default: goto L5;
        };
    L11:
        u52.a("next", 0);
    L14:
        return mw1.o;
    L12:
        u52.a("previous", 0);
        goto L14
    L5:
        if (r3 == u52.c().o) goto L8;
        u52.q("select", r3, r3);
        goto L14
    L8:
        if (r5 != (-9223372036854775807L)) goto L10;
        r5 = 0;
    L10:
        u52.a("seek", r5);
        goto L14
    }

    @Override // defpackage.qe4
    public final ic2 t1(boolean r3) {
        if (r3 == false) goto L4;
        String r2 = "play";
    L5:
        u52.a(r2, 0);
        return mw1.o;
    L4:
        r2 = "pause";
        goto L5
    }

    @Override // defpackage.qe4
    public final ic2 u1(qh3 r1) {
        u52.j(r1.a, r1.b);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 v1(int r3) {
        u52.a("repeat", r3);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 w1(boolean r2) {
        if (r2 == false) goto L4;
        long r1 = 1;
    L5:
        u52.a("shuffle", r1);
        return mw1.o;
    L4:
        r1 = 0;
        goto L5
    }

    @Override // defpackage.qe4
    public final ic2 x1(float r2) {
        u52.a("volume", (long) (r2 * 100.0f));
        return mw1.o;
    }
}
