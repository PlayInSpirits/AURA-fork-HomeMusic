package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qy4 implements k51 {
    public final int a;
    public final int b;
    public final List c;
    public final be3 d;
    public final SparseIntArray e;
    public final qn0 f;
    public final xn4 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final sr3 k;
    public r71 l;
    public m51 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ty4 r;
    public int s;
    public int t;

    static {
    }

    public qy4(int r3, int r4, xn4 r5, iu4 r6, qn0 r7) {
        this.f = r7;
        this.a = r3;
        this.b = r4;
        this.g = r5;
        if (r3 != 1) goto L5;
    L8:
        this.c = Collections.singletonList(r6);
    L9:
        this.d = new be3(0, new byte[9400]);
        SparseBooleanArray r8 = new SparseBooleanArray();
        this.i = r8;
        this.j = new SparseBooleanArray();
        SparseArray r9 = new SparseArray();
        this.h = r9;
        this.e = new SparseIntArray();
        this.k = new sr3(1);
        this.m = m51.i;
        this.t = -1;
        r8.clear();
        r9.clear();
        SparseArray r10 = new SparseArray();
        int r11 = r10.size();
        int r12 = 0;
    L10:
        if (r12 >= r11) goto L12;
        r9.put(r10.keyAt(r12), (ty4) r10.valueAt(r12));
        r12 = r12 + 1;
        goto L10
    L12:
        r9.put(0, new h84(new xc5(this)));
        this.r = null;
        return;
    L5:
        if (r3 == 2) goto L8;
        ArrayList r13 = new ArrayList();
        this.c = r13;
        r13.add(r6);
        goto L9
    }

    @Override // defpackage.k51
    public final void a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [ty4] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.k51
    public final int b(l51 r29, t71 r30) {
        long r12 = r29.getLength();
        int r5 = this.a;
        if (r5 != 2) goto L5;
        boolean r17 = true;
    L7:
        if (this.o == false) goto L92;
        long r9 = -9223372036854775807L;
        sr3 r11 = this.k;
        if (r12 == (-1)) goto L73;
        if (r17 == true) goto L73;
        if (r11.d == true) goto L73;
        int r0 = this.t;
        iu4 r6 = r11.b;
        be3 r7 = r11.c;
        if (r0 > 0) goto L18;
        r11.a(r29);
        return 0;
    L18:
        if (r11.f == true) goto L45;
        long r14 = r29.getLength();
        int r8 = (int) Math.min(112800, r14);
        long r15 = r14 - ((long) r8);
        if (r29.getPosition() == r15) goto L23;
        r30.a = r15;
        return 1;
    L23:
        r7.K(r8);
        r29.k();
        r29.n(r7.a, 0, r8);
        int r1 = r7.b;
        int r2 = r7.c;
        int r10 = r2 - 188;
    L24:
        if (r10 < r1) goto L42;
        byte[] r13 = r7.a;
        int r16 = -4;
        int r18 = 0;
    L27:
        if (r16 > 4) goto L41;
        int r19 = (r16 * 188) + r10;
        if (r19 < r1) goto L39;
        if (r19 >= r2) goto L39;
        if (r13[r19] != 71) goto L39;
        r18 = r18 + 1;
        if (r18 != 5) goto L40;
        long r110 = au0.P(r7, r10, r0);
        if (r110 == (-9223372036854775807L)) goto L41;
        r9 = r110;
    L40:
        r16 = r16 + 1;
    L39:
        r18 = 0;
    L41:
        r10 = r10 - 1;
    L42:
        r11.h = r9;
        r11.f = true;
        return 0;
    L45:
        if (r11.h != (-9223372036854775807L)) goto L49;
        r11.a(r29);
        return 0;
    L49:
        if (r11.e == true) goto L66;
        int r20 = (int) Math.min(112800, r29.getLength());
        if (r29.getPosition() == 0) goto L54;
        r30.a = 0;
        return 1;
    L54:
        r7.K(r20);
        r29.k();
        r29.n(r7.a, 0, r20);
        int r3 = r7.b;
        int r4 = r7.c;
    L55:
        if (r3 >= r4) goto L63;
        if (r7.a[r3] != 71) goto L62;
        long r21 = au0.P(r7, r3, r0);
        if (r21 == (-9223372036854775807L)) goto L62;
    L64:
        r11.g = r21;
        r11.e = true;
        return 0;
    L62:
        r3 = r3 + 1;
        goto L55
    L63:
        r21 = -9223372036854775807L;
        goto L64
    L66:
        long r22 = r11.g;
        if (r22 != (-9223372036854775807L)) goto L70;
        r11.a(r29);
        return 0;
    L70:
        r11.i = r6.c(r11.h) - r6.b(r22);
        r11.a(r29);
        return 0;
    L73:
        if (this.p == true) goto L78;
        this.p = true;
        long r23 = r11.i;
        if (r23 == (-9223372036854775807L)) goto L77;
        iu4 r111 = r11.b;
        int r26 = 1;
        boolean r24 = false;
        int r27 = r5;
        r71 r25 = new r71(new pa(18), new ue1(this.t, r111), r23, r23 + 1, 0, r12, 188, 940);
        this.l = r25;
        this.m.w(r25.a);
    L80:
        if (this.q == false) goto L85;
        this.q = r24;
        d(0, 0);
        if (r29.getPosition() == 0) goto L85;
        r30.a = 0;
        return r26;
    L85:
        r71 r28 = this.l;
        if (r28 != null) goto L88;
    L91:
        l51 r31 = r29;
        ?? r32 = r24;
    L93:
        be3 r33 = this.d;
        byte[] r34 = r33.a;
        if ((9400 - r33.b) >= 188) goto L99;
        int r35 = r33.a();
        if (r35 <= 0) goto L98;
        System.arraycopy(r34, r33.b, r34, r32, r35);
    L98:
        r33.L(r35, r34);
    L99:
        int r36 = r33.a();
        ?? r37 = this.h;
        if (r36 >= 188) goto L127;
        int r38 = r33.c;
        int r39 = r31.read(r34, r38, 9400 - r38);
        if (r39 == (-1)) goto L103;
        r33.M(r38 + r39);
        r26 = 1;
        goto L99
    L103:
        ?? r40 = r32;
    L105:
        if (r40 >= r37.size()) goto L125;
        ty4 r41 = (ty4) r37.valueAt(r40);
        if ((r41 instanceof ag3) == false) goto L124;
        ag3 r42 = (ag3) r41;
        if (r17 == true) goto L111;
    L114:
        ?? r43 = r26;
    L116:
        if (r42.c != 3) goto L124;
        if (r42.j != (-1)) goto L124;
        if (r17 == true) goto L121;
    L122:
        if (r43 == 0) goto L124;
        r42.a(r26, new be3());
        goto L124
    L121:
        if ((r42.a instanceof vk1) == true) goto L124;
    L111:
        if (r42.e() == true) goto L114;
        r43 = r32;
    L124:
        r26 = 1;
        r40 = r40 + 1;
        goto L105
    L125:
        return -1;
    L127:
        int r44 = r33.b;
        int r45 = r33.c;
        byte[] r46 = r33.a;
        int r47 = r44;
    L128:
        if (r47 >= r45) goto L132;
        if (r46[r47] == 71) goto L132;
        r47 = r47 + 1;
    L132:
        r33.N(r47);
        int r48 = r47 + 188;
        ?? r49 = 0;
        if (r48 <= r45) goto L141;
        int r50 = (r47 - r44) + this.s;
        this.s = r50;
        int r51 = r27;
        int r52 = 2;
        if (r51 == 2) goto L137;
    L142:
        int r53 = r33.c;
        if (r48 <= r53) goto L145;
        return r32;
    L145:
        int r54 = r33.m();
        if ((8388608 & r54) == 0) goto L150;
        r33.N(r48);
        return r32;
    L150:
        if ((4194304 & r54) == 0) goto L152;
        ?? r112 = 1;
    L153:
        int r113 = (2096896 & r54) >> 8;
        if ((r54 & 32) == 0) goto L156;
        ?? r114 = 1;
    L158:
        if ((r54 & 16) == 0) goto L160;
        r49 = (ty4) r37.get(r113);
    L160:
        if (r49 != 0) goto L163;
        r33.N(r48);
        return r32;
    L163:
        if (r51 == r52) goto L171;
        int r55 = r54 & 15;
        SparseIntArray r115 = this.e;
        int r56 = r115.get(r113, r55 - 1);
        r115.put(r113, r55);
        if (r56 != r55) goto L169;
        r33.N(r48);
        return r32;
    L169:
        if (r55 == ((r56 + 1) & 15)) goto L171;
        r49.c();
    L171:
        if (r114 == 0) goto L177;
        int r57 = r33.A();
        if ((r33.A() & 64) == 0) goto L175;
        ?? r58 = r52;
    L176:
        r112 = (r112 == true ? 1 : 0) | r58;
        r33.O(r57 - 1);
        goto L177
    L175:
        r58 = r32;
    L177:
        boolean r59 = this.o;
        if (r51 == r52) goto L182;
        if (r59 == true) goto L182;
        if (this.j.get(r113, r32) == false) goto L182;
    L183:
        if (r51 == r52) goto L190;
        if (r59 == true) goto L190;
        if (this.o == false) goto L190;
        if (r12 == (-1)) goto L190;
        this.q = true;
    L190:
        r33.N(r48);
        return r32;
    L182:
        r33.M(r48);
        r49.a(r112, r33);
        r33.M(r53);
        goto L183
    L156:
        r114 = r32;
        goto L158
    L152:
        r112 = r32;
        goto L153
    L137:
        if (r50 <= 376) goto L142;
        throw ParserException.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
    L141:
        r51 = r27;
        r52 = 2;
        this.s = r32;
        goto L142
    L88:
        if (r28.c == null) goto L91;
        return r28.b(r29, r30);
    L77:
        r26 = 1;
        r24 = false;
        r27 = r5;
        this.m.w(new bo(r23));
        goto L80
    L78:
        r26 = 1;
        r24 = false;
        r27 = r5;
        goto L80
    L92:
        r31 = r29;
        r32 = 0;
        r26 = 1;
        r27 = r5;
        goto L93
    L5:
        r17 = false;
        goto L7
    }

    @Override // defpackage.k51
    public final boolean c(l51 r6) {
        byte[] r5 = this.d.a;
        rk0 r7 = (rk0) r6;
        r7.e(r5, 0, 940, false);
        int r1 = 0;
    L4:
        if (r1 >= 188) goto L14;
        int r2 = 0;
    L7:
        if (r2 >= 5) goto L12;
        if (r5[(r2 * 188) + r1] != 71) goto L10;
        r2 = r2 + 1;
        goto L7
    L10:
        r1 = r1 + 1;
        goto L4
    L12:
        r7.d(r1, false);
        return true;
    L14:
        return false;
    }

    @Override // defpackage.k51
    public final void d(long r12, long r14) {
        SparseArray r13 = this.h;
        List r15 = this.c;
        if (this.a == 2) goto L5;
        boolean r0 = true;
    L6:
        rr2.w(r0);
        int r1 = r15.size();
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L33;
        iu4 r6 = (iu4) r15.get(r2);
        monitor-enter(r6);
        long r7 = r6.b;     // Catch: Throwable -> L29
        monitor-exit(r6);
        if (r7 != (-9223372036854775807L)) goto L16;
        boolean r8 = true;
    L17:
        if (r8 == true) goto L26;
        long r9 = r6.d();
        if (r9 != (-9223372036854775807L)) goto L21;
    L25:
        r8 = false;
        goto L26
    L21:
        if (r9 == 0) goto L25;
        if (r9 == r14) goto L25;
        r8 = true;
    L26:
        if (r8 == false) goto L28;
        r6.f(r14);
    L28:
        r2 = r2 + 1;
        goto L8
    L16:
        r8 = false;
    L29:
        th = move-exception;
        throw th;
    L33:
        if (r14 == 0) goto L37;
        r71 r16 = this.l;
        if (r16 == null) goto L37;
        r16.d(r14);
    L37:
        this.d.K(0);
        this.e.clear();
        int r17 = 0;
    L39:
        if (r17 >= r13.size()) goto L41;
        ((ty4) r13.valueAt(r17)).c();
        r17 = r17 + 1;
        goto L39
    L41:
        this.s = 0;
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.k51
    public final void f(m51 r3) {
        if ((this.b & 1) != 0) goto L5;
        r3 = new ll(r3, this.g);
    L5:
        this.m = r3;
    }
}
