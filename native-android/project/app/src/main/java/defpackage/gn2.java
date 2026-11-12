package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gn2 {
    public static final gn2 g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public final String a;
    public final bn2 b;
    public final an2 c;
    public final do2 d;
    public final wm2 e;
    public final cn2 f;

    static {
        um2 r0 = new um2();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        List r3 = Collections.EMPTY_LIST;
        gy3 r4 = gy3.r;
        zm2 r5 = new zm2();
        cn2 r8 = cn2.d;
        g = new gn2("", new wm2(r0), null, new an2(r5), do2.K, r8);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public gn2(String r1, wm2 r2, bn2 r3, an2 r4, do2 r5, cn2 r6) {
        this.a = r1;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.e = r2;
        this.f = r6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v59 */
    public static gn2 b(Bundle r20) {
        String r4 = r20.getString(h, "");
        r4.getClass();
        Bundle r1 = r20.getBundle(i);
        if (r1 != null) goto L6;
        an2 r2 = an2.f;
    L5:
        an2 r7 = r2;
        Bundle r3 = r20.getBundle(j);
        if (r3 != null) goto L11;
        do2 r5 = do2.K;
    L10:
        do2 r8 = r5;
        Bundle r6 = r20.getBundle(k);
        int r9 = 0;
        boolean r10 = false;
        if (r6 != null) goto L16;
        wm2 r11 = wm2.r;
    L15:
        wm2 r12 = r11;
        Bundle r13 = r20.getBundle(l);
        if (r13 != null) goto L48;
        cn2 r14 = cn2.d;
    L47:
        cn2 r15 = r14;
        Bundle r0 = r20.getBundle(m);
        if (r0 != null) goto L52;
        bn2 r16 = null;
    L99:
        return new gn2(r4, r12, r16, r7, r8, r15);
    L52:
        Bundle r17 = r0.getBundle(bn2.k);
        if (r17 != null) goto L55;
        ym2 r18 = null;
    L79:
        Bundle r19 = r0.getBundle(bn2.l);
        if (r19 != null) goto L82;
        sm2 r110 = null;
    L83:
        ArrayList r21 = r0.getParcelableArrayList(bn2.m);
        if (r21 != null) goto L87;
        vw1 r22 = yw1.o;
        gy3 r23 = gy3.r;
    L86:
        gy3 r111 = r23;
        ArrayList r24 = r0.getParcelableArrayList(bn2.o);
        if (r24 != null) goto L96;
        vw1 r25 = yw1.o;
        gy3 r26 = gy3.r;
    L95:
        gy3 r112 = r26;
        long r113 = r0.getLong(bn2.p, -9223372036854775807L);
        Uri r114 = (Uri) r0.getParcelable(bn2.i);
        r114.getClass();
        r16 = new bn2(r114, r0.getString(bn2.j), r18, r110, r111, r0.getString(bn2.n), r112, r113);
        goto L99
    L96:
        r26 = hw.f(new er1(26), r24);
        goto L95
    L87:
        uw1 r27 = yw1.j();
        int r28 = 0;
    L89:
        if (r28 >= r21.size()) goto L91;
        Bundle r115 = (Bundle) r21.get(r28);
        r115.getClass();
        r27.c(new fm4(r115.getInt(fm4.q, 0), r115.getInt(fm4.r, 0), r115.getInt(fm4.s, 0)));
        r28 = r28 + 1;
        r21 = r21;
        goto L89
    L91:
        r23 = r27.f();
        goto L86
    L82:
        Uri r29 = (Uri) r19.getParcelable(sm2.b);
        r29.getClass();
        rm2 r30 = new rm2(r9, r10 ? 1 : 0);
        r30.o = r29;
        r110 = new sm2(r30);
        goto L83
    L55:
        String r31 = r17.getString(ym2.i);
        r31.getClass();
        UUID r32 = UUID.fromString(r31);
        Uri r116 = (Uri) r17.getParcelable(ym2.j);
        String r117 = ym2.k;
        Bundle r118 = Bundle.EMPTY;
        Bundle r119 = r17.getBundle(r117);
        if (r119 != null) goto L59;
        r119 = r118;
    L59:
        if (r119 != r118) goto L61;
        Map r120 = ly3.t;
    L71:
        boolean r121 = r17.getBoolean(ym2.l, false);
        boolean r122 = r17.getBoolean(ym2.m, false);
        boolean r123 = r17.getBoolean(ym2.n, false);
        String r124 = ym2.o;
        ArrayList<Integer> r125 = new ArrayList();
        ArrayList<Integer> r126 = r17.getIntegerArrayList(r124);
        if (r126 == null) goto L74;
        r125 = r126;
    L74:
        yw1 r127 = yw1.k(r125);
        byte[] r33 = r17.getByteArray(ym2.p);
        xm2 r34 = new xm2();
        r34.d = r32;
        r34.e = r116;
        r34.f = bx1.b(r120);
        r34.a = r121;
        r34.c = r123;
        r34.b = r122;
        r34.g = yw1.k(r127);
        if (r33 == null) goto L77;
        ?? r35 = Arrays.copyOf(r33, r33.length);
    L78:
        r34.h = r35;
        r18 = new ym2(r34);
        goto L79
    L77:
        r35 = 0;
        goto L78
    L61:
        HashMap r128 = new HashMap();
        if (r119 == r118) goto L70;
        Iterator<String> r129 = r119.keySet().iterator();
    L66:
        if (r129.hasNext() == false) goto L70;
        String r130 = r129.next();
        String r131 = r119.getString(r130);
        if (r131 == null) goto L66;
        r128.put(r130, r131);
    L70:
        r120 = bx1.b(r128);
        goto L71
    L48:
        yc5 r36 = new yc5();
        r36.n = (Uri) r13.getParcelable(cn2.e);
        r36.o = r13.getString(cn2.f);
        r36.p = f35.n(r13.getBundle(cn2.g));
        r14 = new cn2(r36);
        goto L47
    L16:
        um2 r37 = new um2();
        String r38 = vm2.j;
        vm2 r39 = vm2.i;
        long r40 = r39.a;
        long r132 = r39.d;
        long r133 = r39.b;
        long r41 = f35.Q(r6.getLong(r38, r40));
        boolean r134 = true;
        if (r41 < 0) goto L19;
        boolean r42 = true;
    L20:
        rr2.l(r42);
        r37.a = r41;
        long r43 = f35.Q(r6.getLong(vm2.k, r39.c));
        if (r43 != Long.MIN_VALUE) goto L23;
    L26:
        boolean r44 = true;
    L27:
        rr2.l(r44);
        r37.b = r43;
        r37.c = r6.getBoolean(vm2.l, r39.e);
        r37.d = r6.getBoolean(vm2.m, r39.f);
        r37.e = r6.getBoolean(vm2.n, r39.g);
        r37.f = r6.getBoolean(vm2.q, r39.h);
        long r45 = r6.getLong(vm2.o, r133);
        if (r45 != r133) goto L30;
    L34:
        long r46 = r6.getLong(vm2.p, r132);
        if (r46 != r132) goto L37;
    L43:
        r11 = new wm2(r37);
        goto L15
    L37:
        if (r46 != Long.MIN_VALUE) goto L39;
    L42:
        rr2.l(r134);
        r37.b = r46;
        goto L43
    L39:
        if (r46 >= 0) goto L42;
        r134 = false;
        goto L42
    L30:
        if (r45 < 0) goto L32;
        boolean r47 = true;
    L33:
        rr2.l(r47);
        r37.a = r45;
        goto L34
    L32:
        r47 = false;
        goto L33
    L23:
        if (r43 >= 0) goto L26;
        r44 = false;
        goto L27
    L19:
        r42 = false;
        goto L20
    L11:
        r5 = do2.b(r3);
        goto L10
    L6:
        r2 = an2.b(r1);
        goto L5
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [byte[], java.lang.Cloneable] */
    public final tm2 a() {
        tm2 r0 = new tm2();
        r0.d = new um2();
        r0.e = new xm2();
        r0.f = Collections.EMPTY_LIST;
        r0.h = gy3.r;
        r0.l = new zm2();
        r0.m = cn2.d;
        r0.j = -9223372036854775807L;
        um2 r1 = new um2();
        wm2 r2 = this.e;
        r1.a = r2.b;
        r1.b = r2.d;
        r1.c = r2.e;
        r1.d = r2.f;
        r1.e = r2.g;
        r1.f = r2.h;
        r0.d = r1;
        r0.a = this.a;
        r0.k = this.d;
        r0.l = this.c.a();
        r0.m = this.f;
        bn2 r5 = this.b;
        if (r5 == null) goto L9;
        r0.g = r5.f;
        r0.c = r5.b;
        r0.b = r5.a;
        r0.f = r5.e;
        r0.h = r5.g;
        ym2 r3 = r5.c;
        if (r3 == null) goto L7;
        xm2 r4 = new xm2();
        r4.d = r3.a;
        r4.e = r3.b;
        r4.f = r3.c;
        r4.a = r3.d;
        r4.b = r3.e;
        r4.c = r3.f;
        r4.g = r3.g;
        r4.h = r3.h;
    L8:
        r0.e = r4;
        r0.i = r5.d;
        r0.j = r5.h;
        goto L9
    L7:
        r4 = new xm2();
    L9:
        return r0;
    }

    public final Bundle c(boolean r13) {
        Bundle r0 = new Bundle();
        String r2 = this.a;
        if (r2.equals("") == true) goto L5;
        r0.putString(h, r2);
    L5:
        an2 r1 = an2.f;
        an2 r3 = this.c;
        if (r3.equals(r1) == true) goto L8;
        r0.putBundle(i, r3.c());
    L8:
        do2 r4 = do2.K;
        do2 r5 = this.d;
        if (r5.equals(r4) == true) goto L11;
        r0.putBundle(j, r5.c());
    L11:
        vm2 r6 = vm2.i;
        wm2 r7 = this.e;
        if (r7.equals(r6) == true) goto L38;
        Bundle r8 = new Bundle();
        long r9 = r7.a;
        if (r9 == r6.a) goto L16;
        r8.putLong(vm2.j, r9);
    L16:
        long r10 = r7.c;
        if (r10 == r6.c) goto L19;
        r8.putLong(vm2.k, r10);
    L19:
        long r11 = r7.b;
        if (r11 == r6.b) goto L22;
        r8.putLong(vm2.o, r11);
    L22:
        long r12 = r7.d;
        if (r12 == r6.d) goto L25;
        r8.putLong(vm2.p, r12);
    L25:
        boolean r14 = r7.e;
        if (r14 == r6.e) goto L28;
        r8.putBoolean(vm2.l, r14);
    L28:
        boolean r15 = r7.f;
        if (r15 == r6.f) goto L31;
        r8.putBoolean(vm2.m, r15);
    L31:
        boolean r16 = r7.g;
        if (r16 == r6.g) goto L34;
        r8.putBoolean(vm2.n, r16);
    L34:
        boolean r17 = r7.h;
        if (r17 == r6.h) goto L37;
        r8.putBoolean(vm2.q, r17);
    L37:
        r0.putBundle(k, r8);
    L38:
        cn2 r18 = cn2.d;
        cn2 r19 = this.f;
        if (r19.equals(r18) == true) goto L50;
        Bundle r20 = new Bundle();
        Uri r21 = r19.a;
        if (r21 == null) goto L43;
        r20.putParcelable(cn2.e, r21);
    L43:
        String r22 = r19.b;
        if (r22 == null) goto L46;
        r20.putString(cn2.f, r22);
    L46:
        Bundle r23 = r19.c;
        if (r23 == null) goto L49;
        r20.putBundle(cn2.g, r23);
    L49:
        r0.putBundle(l, r20);
    L50:
        if (r13 == false) goto L100;
        bn2 r110 = this.b;
        if (r110 == null) goto L100;
        yw1 r111 = r110.g;
        List r24 = r110.e;
        Bundle r25 = new Bundle();
        r25.putParcelable(bn2.i, r110.a);
        String r26 = r110.b;
        if (r26 == null) goto L56;
        r25.putString(bn2.j, r26);
    L56:
        ym2 r27 = r110.c;
        if (r27 == null) goto L84;
        String r28 = bn2.k;
        yw1 r29 = r27.g;
        bx1 r30 = r27.c;
        Bundle r31 = new Bundle();
        r31.putString(ym2.i, r27.a.toString());
        Uri r32 = r27.b;
        if (r32 == null) goto L62;
        r31.putParcelable(ym2.j, r32);
    L62:
        if (r30.isEmpty() == true) goto L68;
        String r33 = ym2.k;
        Bundle r34 = new Bundle();
        Iterator r35 = r30.entrySet().iterator();
    L65:
        if (r35.hasNext() == false) goto L67;
        Map.Entry r112 = (Map.Entry) r35.next();
        r34.putString((String) r112.getKey(), (String) r112.getValue());
        goto L65
    L67:
        r31.putBundle(r33, r34);
    L68:
        boolean r36 = r27.d;
        if (r36 == false) goto L71;
        r31.putBoolean(ym2.l, r36);
    L71:
        boolean r37 = r27.e;
        if (r37 == false) goto L74;
        r31.putBoolean(ym2.m, r37);
    L74:
        boolean r38 = r27.f;
        if (r38 == false) goto L78;
        r31.putBoolean(ym2.n, r38);
    L78:
        if (r29.isEmpty() == true) goto L80;
        r31.putIntegerArrayList(ym2.o, new ArrayList(r29));
    L80:
        byte[] r39 = r27.h;
        if (r39 == null) goto L83;
        r31.putByteArray(ym2.p, r39);
    L83:
        r25.putBundle(r28, r31);
    L84:
        sm2 r40 = r110.d;
        if (r40 == null) goto L88;
        String r41 = bn2.l;
        Bundle r42 = new Bundle();
        r42.putParcelable(sm2.b, r40.a);
        r25.putBundle(r41, r42);
    L88:
        if (r24.isEmpty() == true) goto L90;
        r25.putParcelableArrayList(bn2.m, hw.N(r24, new er1(24)));
    L90:
        String r43 = r110.f;
        if (r43 == null) goto L94;
        r25.putString(bn2.n, r43);
    L94:
        if (r111.isEmpty() == true) goto L96;
        r25.putParcelableArrayList(bn2.o, hw.N(r111, new er1(25)));
    L96:
        long r113 = r110.h;
        if (r113 == (-9223372036854775807L)) goto L99;
        r25.putLong(bn2.p, r113);
    L99:
        r0.putBundle(m, r25);
    L100:
        return r0;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if ((r3 instanceof gn2) == false) goto L29;
        gn2 r4 = (gn2) r3;
        if (Objects.equals(this.a, r4.a) == true) goto L10;
        return false;
    L10:
        if (this.e.equals(r4.e) == true) goto L12;
        return false;
    L12:
        if (Objects.equals(this.b, r4.b) == true) goto L14;
        return false;
    L14:
        if (Objects.equals(this.c, r4.c) == true) goto L16;
        return false;
    L16:
        if (Objects.equals(this.d, r4.d) == true) goto L18;
        return false;
    L18:
        if (Objects.equals(this.f, r4.f) == false) goto L28;
        return true;
    L28:
        return false;
    L29:
        return false;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        bn2 r1 = this.b;
        if (r1 == null) goto L5;
        int r2 = r1.hashCode();
    L6:
        int r3 = (r0 + r2) * 31;
        int r4 = (this.c.hashCode() + r3) * 31;
        int r5 = (this.e.hashCode() + r4) * 31;
        int r6 = (this.d.hashCode() + r5) * 31;
        return this.f.hashCode() + r6;
    L5:
        r2 = 0;
        goto L6
    }
}
