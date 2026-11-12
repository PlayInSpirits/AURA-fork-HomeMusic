package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;
import androidx.preference.Preference;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb4 implements bp3, gz0, gs4, ky0, eg1 {
    public final /* synthetic */ int n;

    public /* synthetic */ tb4(int r1) {
        this.n = r1;
    }

    public static /* synthetic */ void a() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void b(long r3, Object r5) {
        throw new zzhf("Integer value " + r3 + r5);
    }

    public static /* synthetic */ void c(Object r2, Object r3, Object r4) {
        StringBuilder r1 = new StringBuilder();
        r1.append(r2);
        r1.append(r3);
        r1.append(r4);
        throw new IllegalArgumentException(r1.toString());
    }

    public static /* synthetic */ void d(Object r2, String r3) {
        throw new IOException(r3 + r2);
    }

    public static /* synthetic */ void e(String r1) {
        throw new RuntimeException(r1);
    }

    public static /* synthetic */ void f(String r2, float r3) {
        throw new IllegalArgumentException(r2 + r3);
    }

    public static /* synthetic */ void h(String r2, Object r3, Object r4, Object r5) {
        throw new IllegalArgumentException(r2 + r3 + r4 + r5);
    }

    public static /* synthetic */ void j(String r1, Object r2, Object r3, Object r4, Object r5) {
        throw new IllegalStateException(r1 + r2 + r3 + r4 + r5);
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    @Override // defpackage.ky0
    public void G(df r1) {
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r54) {
        int r6 = 0;
        switch(this.n) {
            case 7: goto L132;
            case 8: goto L62;
            case 9: goto L18;
            case 10: goto L17;
            case 11: goto L14;
            default: goto L4;
        };
    L4:
        Bundle r0 = (Bundle) r54;
        Bundle r1 = r0.getBundle(iw4.f);
        r1.getClass();
        sv4 r2 = sv4.a(r1);
        int[] r3 = r0.getIntArray(iw4.g);
        int r4 = r2.a;
        int[] r5 = new int[r4];
        if (r3 != null) goto L8;
        r3 = r5;
    L8:
        boolean[] r7 = r0.getBooleanArray(iw4.h);
        boolean[] r8 = new boolean[r4];
        if (r7 != null) goto L13;
        r7 = r8;
    L13:
        return new iw4(r2, r0.getBoolean(iw4.i, false), r3, r7);
    L14:
        iw4 r9 = (iw4) r54;
        r9.getClass();
        Bundle r10 = new Bundle();
        r10.putBundle(iw4.f, r9.b.d());
        r10.putIntArray(iw4.g, r9.d);
        r10.putBooleanArray(iw4.h, r9.e);
        r10.putBoolean(iw4.i, r9.c);
        return r10;
    L18:
        Bundle r11 = (Bundle) r54;
        tb1 r12 = tb1.Q;
        sb1 r13 = new sb1();
        if (r11 == null) goto L21;
        ClassLoader r14 = hw.class.getClassLoader();
        String r15 = f35.a;
        r11.setClassLoader(r14);
    L21:
        String r16 = r11.getString(tb1.R);
        String r17 = r12.a;
        if (r16 != null) goto L25;
        r16 = r17;
    L25:
        r13.a = r16;
        String r18 = r11.getString(tb1.S);
        String r19 = r12.b;
        if (r18 != null) goto L29;
        r18 = r19;
    L29:
        r13.b = r18;
        ArrayList r20 = r11.getParcelableArrayList(tb1.w0);
        if (r20 != null) goto L32;
        gy3 r21 = gy3.r;
    L37:
        r13.c = yw1.k(r21);
        String r22 = r11.getString(tb1.T);
        String r23 = r12.d;
        if (r22 != null) goto L41;
        r22 = r23;
    L41:
        r13.d = r22;
        r13.e = r11.getInt(tb1.U, r12.e);
        r13.f = r11.getInt(tb1.V, r12.f);
        r13.g = r11.getInt(tb1.x0, r12.g);
        r13.h = r11.getInt(tb1.W, r12.h);
        r13.i = r11.getInt(tb1.X, r12.i);
        String r24 = r11.getString(tb1.Y);
        String r25 = r12.k;
        if (r24 != null) goto L45;
        r24 = r25;
    L45:
        r13.j = r24;
        String r26 = r11.getString(tb1.Z);
        String r27 = r12.m;
        if (r26 != null) goto L49;
        r26 = r27;
    L49:
        r13.l = lw2.m(r26);
        String r28 = r11.getString(tb1.a0);
        String r29 = r12.n;
        if (r28 != null) goto L53;
        r28 = r29;
    L53:
        r13.m = lw2.m(r28);
        r13.n = r11.getInt(tb1.b0, r12.o);
        ArrayList r30 = new ArrayList();
    L54:
        byte[] r31 = r11.getByteArray(tb1.c0 + "_" + Integer.toString(r6, 36));
        if (r31 == null) goto L56;
        r30.add(r31);
        r6 = r6 + 1;
        goto L54
    L56:
        r13.p = r30;
        r13.q = (ow0) r11.getParcelable(tb1.d0);
        r13.r = r11.getLong(tb1.e0, r12.s);
        r13.t = r11.getInt(tb1.f0, r12.u);
        r13.u = r11.getInt(tb1.g0, r12.v);
        r13.v = r11.getInt(tb1.z0, r12.w);
        r13.w = r11.getInt(tb1.A0, r12.x);
        r13.x = r11.getFloat(tb1.h0, r12.y);
        r13.y = r11.getInt(tb1.i0, r12.z);
        r13.z = r11.getFloat(tb1.j0, r12.A);
        r13.A = r11.getByteArray(tb1.k0);
        r13.B = r11.getInt(tb1.l0, r12.C);
        r13.D = r11.getInt(tb1.y0, r12.E);
        Bundle r32 = r11.getBundle(tb1.m0);
        if (r32 == null) goto L59;
        r13.C = new c50(r32.getInt(c50.i, -1), r32.getInt(c50.j, -1), r32.getInt(c50.k, -1), r32.getByteArray(c50.l), r32.getInt(c50.m, -1), r32.getInt(c50.n, -1));
    L59:
        r13.E = r11.getInt(tb1.n0, r12.F);
        r13.F = r11.getInt(tb1.o0, r12.G);
        r13.G = r11.getInt(tb1.p0, r12.H);
        r13.H = r11.getInt(tb1.q0, r12.I);
        r13.I = r11.getInt(tb1.r0, r12.J);
        r13.J = r11.getInt(tb1.s0, r12.K);
        r13.L = r11.getInt(tb1.u0, r12.M);
        r13.M = r11.getInt(tb1.v0, r12.N);
        r13.N = r11.getInt(tb1.t0, r12.O);
        return new tb1(r13);
    L32:
        uw1 r33 = yw1.j();
        int r34 = 0;
    L34:
        if (r34 >= r20.size()) goto L36;
        Bundle r35 = (Bundle) r20.get(r34);
        r35.getClass();
        String r36 = r35.getString(o42.c);
        String r37 = r35.getString(o42.d);
        r37.getClass();
        r33.c(new o42(r36, r37));
        r34 = r34 + 1;
        goto L34
    L36:
        r21 = r33.f();
        goto L37
    L62:
        Bundle r38 = (Bundle) r54;
        int r110 = r38.getInt(zt4.h, 0);
        long r111 = r38.getLong(zt4.i, -9223372036854775807L);
        long r112 = r38.getLong(zt4.j, 0);
        boolean r113 = r38.getBoolean(zt4.k, false);
        Bundle r39 = r38.getBundle(zt4.l);
        if (r39 == null) goto L129;
        ArrayList r40 = r39.getParcelableArrayList(z5.h);
        if (r40 != null) goto L67;
        x5[] r114 = new x5[0];
    L127:
        z5 r115 = new z5(r114, r39.getLong(z5.i, 0), r39.getLong(z5.j, -9223372036854775807L), r39.getInt(z5.k, 0));
    L128:
        z5 r116 = r115;
        zt4 r41 = new zt4();
        r41.i(null, null, r110, r111, r112, r116, r113);
        return r41;
    L67:
        x5[] r42 = new x5[r40.size()];
        int r43 = 0;
    L69:
        if (r43 >= r40.size()) goto L126;
        Bundle r117 = (Bundle) r40.get(r43);
        long r118 = r117.getLong(x5.m);
        int r210 = r117.getInt(x5.n);
        int r211 = r117.getInt(x5.t);
        ArrayList r44 = r117.getParcelableArrayList(x5.o);
        ArrayList r45 = r117.getParcelableArrayList(x5.u);
        int[] r46 = r117.getIntArray(x5.p);
        long[] r47 = r117.getLongArray(x5.q);
        long r212 = r117.getLong(x5.r);
        boolean r213 = r117.getBoolean(x5.s);
        ArrayList<String> r48 = r117.getStringArrayList(x5.v);
        ArrayList r49 = r117.getParcelableArrayList(x5.x);
        boolean r310 = r117.getBoolean(x5.w);
        if (r46 != null) goto L73;
        r46 = new int[0];
    L73:
        int[] r214 = r46;
        if (r45 == null) goto L85;
        gn2[] r50 = new gn2[r45.size()];
        int r51 = 0;
    L77:
        if (r51 >= r45.size()) goto L83;
        Bundle r52 = (Bundle) r45.get(r51);
        if (r52 != null) goto L81;
        gn2 r53 = null;
    L82:
        r50[r51] = r53;
        r51 = r51 + 1;
        goto L77
    L81:
        r53 = gn2.b(r52);
        goto L82
    L83:
        gn2[] r215 = r50;
    L84:
        int r55 = 0;
    L107:
        if (r47 != null) goto L109;
        long[] r216 = new long[r55];
    L110:
        String[] r56 = new String[r55];
        if (r48 != null) goto L113;
    L112:
        String[] r217 = r56;
        if (r49 != null) goto L117;
        y5[] r57 = new y5[r55];
    L125:
        r42[r43] = new x5(r118, r210, r211, r214, r215, r216, r212, r213, r217, r57, r310);
        r43 = r43 + 1;
        goto L69
    L117:
        r57 = new y5[r49.size()];
        int r58 = 0;
    L119:
        if (r58 >= r49.size()) goto L125;
        Bundle r59 = (Bundle) r49.get(r58);
        if (r59 != null) goto L123;
        y5 r311 = null;
    L124:
        r57[r58] = r311;
        r58 = r58 + 1;
        goto L119
    L123:
        r311 = new y5(r59.getLong(y5.d), r59.getLong(y5.e), r59.getString(y5.f));
        goto L124
    L113:
        r56 = (String[]) r48.toArray(r56);
        goto L112
    L109:
        r216 = r47;
        goto L110
    L85:
        if (r44 == null) goto L106;
        gn2[] r60 = new gn2[r44.size()];
        int r61 = 0;
    L88:
        if (r61 >= r44.size()) goto L105;
        Uri r312 = (Uri) r44.get(r61);
        if (r312 != null) goto L92;
        gn2 r410 = null;
    L104:
        r60[r61] = r410;
        r61 = r61 + 1;
        r44 = r44;
        r60 = r60;
        goto L88
    L92:
        gn2 r62 = gn2.g;
        um2 r63 = new um2();
        xm2 r119 = new xm2();
        List r313 = Collections.EMPTY_LIST;
        gy3 r314 = gy3.r;
        zm2 r64 = new zm2();
        cn2 r411 = cn2.d;
        if (((Uri) r119.e) != null) goto L95;
    L98:
        boolean r65 = true;
    L99:
        rr2.w(r65);
        if (((UUID) r119.d) == null) goto L102;
        ym2 r315 = new ym2(r119);
    L103:
        r410 = new gn2("", new wm2(r63), new bn2(r312, null, r315, null, r313, null, r314, -9223372036854775807L), new an2(r64), do2.K, r411);
        goto L104
    L102:
        r315 = null;
        goto L103
    L95:
        if (((UUID) r119.d) != null) goto L98;
        r65 = false;
        goto L99
    L105:
        r215 = r60;
        goto L84
    L106:
        r55 = 0;
        r215 = new gn2[0];
        goto L107
    L126:
        r114 = r42;
        goto L127
    L129:
        r115 = z5.f;
        goto L128
    L132:
        Bundle r66 = (Bundle) r54;
        Bundle r67 = r66.getBundle(bu4.s);
        if (r67 == null) goto L136;
        gn2 r68 = gn2.b(r67);
    L135:
        gn2 r316 = r68;
        long r317 = r66.getLong(bu4.t, -9223372036854775807L);
        long r318 = r66.getLong(bu4.u, -9223372036854775807L);
        long r412 = r66.getLong(bu4.v, -9223372036854775807L);
        boolean r413 = r66.getBoolean(bu4.w, false);
        boolean r414 = r66.getBoolean(bu4.x, false);
        Bundle r69 = r66.getBundle(bu4.y);
        if (r69 == null) goto L140;
        an2 r415 = an2.b(r69);
    L141:
        boolean r70 = r66.getBoolean(bu4.z, false);
        long r416 = r66.getLong(bu4.A, 0);
        long r417 = r66.getLong(bu4.B, -9223372036854775807L);
        int r418 = r66.getInt(bu4.C, 0);
        int r510 = r66.getInt(bu4.D, 0);
        long r511 = r66.getLong(bu4.E, 0);
        bu4 r319 = new bu4();
        r319.b(bu4.q, r316, null, r317, r318, r412, r413, r414, r415, r416, r417, r418, r510, r511);
        r319.j = r70;
        return r319;
    L140:
        r415 = null;
        goto L141
    L136:
        r68 = gn2.g;
        goto L135
    L17:
        return Integer.valueOf(((sv4) r54).c);
    }

    @Override // defpackage.bp3
    public boolean g(Preference r1, Object r2) {
        switch(this.n) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        String r3 = (String) r2;
        if (r3 != null) goto L7;
    L9:
        return false;
    L7:
        if (r3.isEmpty() == true) goto L9;
        return true;
    L12:
        if ((r2 instanceof Boolean) == false) goto L14;
        xa3.t("mini_shuffle_button_visibility", ((Boolean) r2).booleanValue());
    L14:
        return true;
    }

    @Override // defpackage.gz0
    public void i(EditText r3) {
        r3.setInputType(2);
        r3.setFilters(new InputFilter[]{new sb4()});
    }
}
