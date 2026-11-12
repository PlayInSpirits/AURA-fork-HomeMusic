package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k52 implements if1 {
    public final /* synthetic */ int n;

    public /* synthetic */ k52(int r1) {
        this.n = r1;
    }

    @Override // defpackage.if1
    public final Object invoke(Object r17) {
        int r0 = this.n;
        x03 r7 = null;
        int r8 = 0;
        j15 r9 = j15.a;
        switch(r0) {
            case 0: goto L146;
            case 1: goto L144;
            case 2: goto L142;
            case 3: goto L138;
            case 4: goto L134;
            case 5: goto L132;
            case 6: goto L130;
            case 7: goto L128;
            case 8: goto L126;
            case 9: goto L114;
            case 10: goto L101;
            case 11: goto L99;
            case 12: goto L95;
            case 13: goto L85;
            case 14: goto L81;
            case 15: goto L79;
            case 16: goto L75;
            case 17: goto L70;
            case 18: goto L66;
            case 19: goto L62;
            case 20: goto L58;
            case 21: goto L54;
            case 22: goto L50;
            case 23: goto L46;
            case 24: goto L42;
            case 25: goto L40;
            case 26: goto L24;
            case 27: goto L22;
            case 28: goto L11;
            default: goto L4;
        };
    L4:
        z34 r1 = ((x34) r17).U("DELETE FROM queue");
        r1.O();     // Catch: Throwable -> L8
        r1.close();
        return null;
    L8:
        th = move-exception;
        r1.close();
        throw th;
    L11:
        z34 r2 = ((x34) r17).U("SELECT COUNT(*) FROM queue");
    L15:
        th = move-exception;
        r2.close();
        throw th;
    L13:
        if (r2.O() == false) goto L17;
        r8 = (int) r2.getLong(0);     // Catch: Throwable -> L15
    L17:
        Integer r3 = Integer.valueOf(r8);     // Catch: Throwable -> L15
        r2.close();
        return r3;
    L22:
        b24 r4 = (b24) r17;
        k52 r5 = kg3.a;
        return r9;
    L24:
        z34 r6 = ((x34) r17).U("SELECT playlistId FROM pinned_playlist");
        ArrayList r10 = new ArrayList();     // Catch: Throwable -> L34
    L26:
        if (r6.O() == false) goto L36;
        if (r6.isNull(0) == false) goto L31;
        String r11 = null;
    L32:
        r10.add(new gg3(r11));     // Catch: Throwable -> L34
        goto L26
    L31:
        r11 = r6.D(0);     // Catch: Throwable -> L34
        goto L32
    L36:
        r6.close();
        return r10;
    L34:
        th = move-exception;
        r6.close();
        throw th;
    L40:
        r17.getClass();
        return Boolean.valueOf(!((vb3) r17).j());
    L42:
        c72 r12 = (c72) r17;
        if (r12.G() == false) goto L45;
        r12.T(false);
    L45:
        return r9;
    L46:
        c72 r13 = (c72) r17;
        if (r13.G() == false) goto L49;
        r13.T(false);
    L49:
        return r9;
    L50:
        c72 r14 = (c72) r17;
        if (r14.G() == false) goto L53;
        r14.V(false);
    L53:
        return r9;
    L54:
        c72 r15 = (c72) r17;
        if (r15.G() == false) goto L57;
        r15.V(false);
    L57:
        return r9;
    L58:
        c72 r16 = (c72) r17;
        if (r16.G() == false) goto L61;
        r16.E();
    L61:
        return r9;
    L62:
        c72 r18 = (c72) r17;
        if (r18.G() == false) goto L65;
        c72.W(r18, false, 7);
    L65:
        return r9;
    L66:
        c72 r19 = (c72) r17;
        if (r19.G() == false) goto L69;
        c72.U(r19, false, 7);
    L69:
        return r9;
    L70:
        mf3 r20 = (mf3) r17;
        int r21 = fc.a;
        wl4 r22 = hb.b;
        r20.getClass();
        Context r23 = (Context) vr1.C(r20, r22);
        oo0 r110 = (oo0) vr1.C(r20, g90.h);
        qb3 r24 = (qb3) vr1.C(r20, rb3.a);
        if (r24 != null) goto L74;
        return null;
    L74:
        return new ub(r23, r110, r24.a, r24.b);
    L75:
        c83 r25 = (c83) r17;
        if (r25.j() == false) goto L78;
        r25.n.Q();
    L78:
        return r9;
    L79:
        ((Long) r17).getClass();
        return r9;
    L81:
        tb3 r26 = ((f63) r17).g0;
        if (r26 == null) goto L84;
        ((vj1) r26).c();
    L84:
        return r9;
    L85:
        f63 r27 = (f63) r17;
        c72 r28 = r27.H;
    L90:
        th = move-exception;
        r28.Z(th);
        throw null;
    L87:
        if (r27.j() == false) goto L92;
        r27.Z0(true);     // Catch: Throwable -> L90
    L92:
        return r9;
    L95:
        wc r29 = ((w53) r17).a;
        if (r29 == null) goto L98;
        r29.invoke();
    L98:
        return r9;
    L99:
        od3 r30 = (od3) r17;
        return b11.n("[", ", ", r30.b, r30.c, ")");
    L101:
        lg3 r31 = (lg3) r17;
        if (r31.j() == false) goto L113;
        rp1 r32 = r31.p;
        if (r32 == null) goto L113;
        cf2 r33 = r31.o;
        w03 r34 = r33.E;
        if (r34 == null) goto L108;
        r7 = (x03) r34.g(r32);
    L108:
        if (r7 == null) goto L113;
        c6 r35 = r33.D;
        if (r35 == null) goto L112;
        r35.u(r32);
    L112:
        r33.m0(r7);
        r7.b();
    L113:
        return r9;
    L114:
        lg3 r111 = (lg3) r17;
        if (r111.j() == false) goto L125;
        cf2 r112 = r111.o;
        if (r112.B == true) goto L125;
        if1 r36 = r111.n.g();
        if (r111.n.f() == null) goto L122;
        r112.o0();
        goto L125
    L122:
        if (r36 != null) goto L124;
        r112.u = null;
        r112.v = null;
        r112.t = null;
        r112.o0();
        goto L125
    L124:
        r112.u = null;
        r112.v = null;
        r112.Z(r111, 9223372034707292159L, 0);
        r112.t = r36;
    L125:
        return r9;
    L126:
        kd3 r37 = (kd3) r17;
        r37.getClass();
        return r37.n + ":" + r37.o;
    L128:
        h52 r38 = (h52) r17;
        r38.getClass();
        return r38.a + ":" + r38.d;
    L130:
        ((JSONObject) r17).getClass();
        return r9;
    L132:
        ((JSONObject) r17).getClass();
        return r9;
    L134:
        JSONObject r39 = (JSONObject) r17;
        r39.getClass();
        v52 r40 = v52.a(u52.c(), r39.optInt("deviceVolume"), r39.optInt("deviceVolumeMax"), 0, 536858623);
        u52.b.k(r40);
        Context r41 = u52.f;
        if (r41 == null) goto L137;
        z52.c(r41, r40);
    L137:
        return r9;
    L138:
        JSONObject r42 = (JSONObject) r17;
        r42.getClass();
        v52 r43 = v52.a(u52.c(), r42.optInt("deviceVolume"), r42.optInt("deviceVolumeMax"), 0, 536858623);
        u52.b.k(r43);
        Context r44 = u52.f;
        if (r44 == null) goto L141;
        z52.c(r44, r43);
    L141:
        return r9;
    L142:
        ((JSONObject) r17).getClass();
        u52.d = null;
        Handler r45 = u52.a;
        u52.m();
        return r9;
    L144:
        ((JSONObject) r17).getClass();
        return r9;
    L146:
        ((JSONObject) r17).getClass();
        u52.d = null;
        Handler r46 = u52.a;
        u52.m();
        return r9;
    }
}
