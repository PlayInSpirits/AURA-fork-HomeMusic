package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e00 extends l00 {
    public static final int[] A = null;
    public static final int[] B = null;
    public static final int[] C = null;
    public static final int[] D = null;
    public static final int[] E = null;
    public static final int[] F = null;
    public static final boolean[] G = null;
    public static final int[] z = null;
    public final be3 h;
    public final int i;
    public final int j;
    public final int k;
    public final long l;
    public final ArrayList m;
    public d00 n;
    public List o;
    public List p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public int w;
    public boolean x;
    public long y;

    static {
        z = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        B = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        C = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        D = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
        E = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        F = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
        G = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    }

    public e00(int r6, String r7) {
        this.h = new be3();
        this.m = new ArrayList();
        this.n = new d00(0, 4);
        this.w = 0;
        this.l = 16000000;
        if ("application/x-mp4-cea-608".equals(r7) == false) goto L5;
        int r8 = 2;
    L6:
        this.i = r8;
        if (r6 == 1) goto L15;
        if (r6 == 2) goto L14;
        if (r6 == 3) goto L13;
        if (r6 == 4) goto L12;
        l93.q0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
        this.k = 0;
        this.j = 0;
    L16:
        m(0);
        l();
        this.x = true;
        this.y = -9223372036854775807L;
        return;
    L12:
        this.k = 1;
        this.j = 1;
        goto L16
    L13:
        this.k = 0;
        this.j = 1;
        goto L16
    L14:
        this.k = 1;
        this.j = 0;
        goto L16
    L15:
        this.k = 0;
        this.j = 0;
        goto L16
    L5:
        r8 = 3;
        goto L6
    }

    @Override // defpackage.l00, defpackage.zi0
    public final void a() {
    }

    @Override // defpackage.l00, defpackage.zi0
    public final /* bridge */ /* synthetic */ Object d() {
        return i();
    }

    @Override // defpackage.l00, defpackage.zi0
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        m(0);
        this.r = 4;
        this.n.h = 4;
        l();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.l00
    public final zh0 g() {
        List r0 = this.o;
        this.p = r0;
        r0.getClass();
        return new zh0(12, r0);
    }

    @Override // defpackage.l00
    public final void h(j00 r15) {
        ByteBuffer r16 = r15.r;
        r16.getClass();
        byte[] r0 = r16.array();
        int r17 = r16.limit();
        be3 r1 = this.h;
        r1.L(r17, r0);
        boolean r2 = false;
    L3:
        int r3 = r1.a();
        int r5 = this.i;
        if (r3 < r5) goto L162;
        if (r5 != 2) goto L8;
        int r6 = -4;
    L9:
        int r7 = r1.A();
        int r8 = r1.A();
        if ((r6 & 2) != 0) goto L3;
        if ((r6 & 1) != this.j) goto L3;
        byte r9 = (byte) (r7 & 127);
        byte r10 = (byte) (r8 & 127);
        if (r9 != 0) goto L19;
        if (r10 == 0) goto L3;
    L19:
        boolean r11 = this.s;
        if ((r6 & 4) != 4) goto L26;
        boolean[] r12 = G;
        if (r12[r7] == false) goto L26;
        if (r12[r8] == false) goto L26;
        boolean r13 = true;
    L27:
        this.s = r13;
        if (r13 == false) goto L39;
        if ((r9 & 240) != 16) goto L39;
        if (this.t == false) goto L38;
        if (this.u != r9) goto L38;
        if (this.v != r10) goto L38;
        this.t = false;
    L38:
        this.t = true;
        this.u = r9;
        this.v = r10;
    L40:
        if (r13 == false) goto L41;
        if (1 > r9) goto L50;
        if (r9 > 15) goto L50;
        this.x = false;
    L60:
        if (this.x == false) goto L3;
        int r14 = r9 & 224;
        if (r14 != 0) goto L66;
        this.w = (r9 >> 3) & 1;
    L66:
        if (this.w != this.k) goto L3;
        if (r14 != 0) goto L159;
        int r4 = r9 & 247;
        if (r4 == 17) goto L71;
    L73:
        int r18 = r9 & 246;
        if (r18 == 18) goto L76;
    L83:
        if (r4 != 17) goto L92;
        if ((r10 & 240) != 32) goto L92;
        this.n.a(' ');
        if ((r10 & 1) != 1) goto L89;
        boolean r19 = true;
    L90:
        d00 r20 = this.n;
        r20.a.add(new c00((r10 >> 1) & 7, r20.c.length(), r19));
    L43:
        r2 = true;
        goto L3
    L89:
        r19 = false;
    L92:
        if ((r9 & 240) != 16) goto L122;
        if ((r10 & 192) != 64) goto L122;
        int r21 = z[r9 & 7];
        if ((r10 & 32) == 0) goto L98;
        r21 = r21 + 1;
    L98:
        d00 r22 = this.n;
        if (r21 == r22.d) goto L107;
        if (this.q != 1) goto L103;
    L105:
        this.n.d = r21;
        goto L107
    L103:
        if (r22.e() == true) goto L105;
        d00 r23 = new d00(this.q, this.r);
        this.n = r23;
        this.m.add(r23);
    L107:
        if ((r10 & 16) != 16) goto L109;
        boolean r24 = true;
    L111:
        if ((r10 & 1) != 1) goto L113;
        boolean r25 = true;
    L114:
        int r26 = (r10 >> 1) & 7;
        d00 r27 = this.n;
        if (r24 == false) goto L117;
        int r28 = 8;
    L118:
        r27.a.add(new c00(r28, r27.c.length(), r25));
        if (r24 == false) goto L43;
        this.n.e = A[r26];
        goto L43
    L117:
        r28 = r26;
        goto L118
    L113:
        r25 = false;
        goto L114
    L109:
        r24 = false;
    L122:
        if (r4 != 23) goto L127;
        if (r10 < 33) goto L127;
        if (r10 > 35) goto L127;
        this.n.f = r10 - 32;
    L127:
        if (r18 != 20) goto L43;
        if ((r10 & 240) != 32) goto L43;
        if (r10 != 32) goto L132;
        m(2);
        goto L43
    L132:
        if (r10 == 41) goto L157;
        switch(r10) {
            case 37: goto L156;
            case 38: goto L155;
            case 39: goto L154;
            default: goto L134;
        };
    L134:
        int r29 = this.q;
        if (r29 == 0) goto L43;
        if (r10 == 33) goto L153;
        switch(r10) {
            case 44: goto L149;
            case 45: goto L142;
            case 46: goto L141;
            case 47: goto L140;
            default: goto L43;
        };
    L140:
        this.o = k();
        l();
        goto L43
    L141:
        l();
        goto L43
    L142:
        if (r29 != 1) goto L43;
        if (this.n.e() == true) goto L43;
        d00 r30 = this.n;
        ArrayList r31 = r30.b;
        r31.add(r30.d());
        r30.c.setLength(0);
        r30.a.clear();
        int r32 = Math.min(r30.h, r30.d);
    L147:
        if (r31.size() < r32) goto L43;
        r31.remove(0);
        goto L147
    L149:
        this.o = Collections.EMPTY_LIST;
        if (r29 == 1) goto L152;
        if (r29 != 3) goto L43;
    L152:
        l();
        goto L43
    L153:
        this.n.b();
        goto L43
    L154:
        m(1);
        this.r = 4;
        this.n.h = 4;
        goto L43
    L155:
        m(1);
        this.r = 3;
        this.n.h = 3;
        goto L43
    L156:
        m(1);
        this.r = 2;
        this.n.h = 2;
        goto L43
    L157:
        m(3);
        goto L43
    L76:
        if ((r10 & 224) != 32) goto L83;
        this.n.b();
        d00 r33 = this.n;
        if ((r9 & 1) != 0) goto L81;
        int r34 = E[r10 & 31];
    L82:
        r33.a((char) r34);
        goto L43
    L81:
        r34 = F[r10 & 31];
        goto L82
    L71:
        if ((r10 & 240) != 48) goto L73;
        this.n.a((char) D[r10 & 15]);
        goto L43
    L159:
        d00 r35 = this.n;
        int[] r36 = C;
        r35.a((char) r36[(r9 & 127) - 32]);
        if ((r10 & 224) == 0) goto L43;
        this.n.a((char) r36[(r10 & 127) - 32]);
    L50:
        if ((r9 & 246) != 20) goto L60;
        if (r10 != 32) goto L53;
    L58:
        this.x = true;
        goto L60
    L53:
        if (r10 == 47) goto L58;
        switch(r10) {
            case 37: goto L58;
            case 38: goto L58;
            case 39: goto L58;
            default: goto L55;
        };
    L55:
        switch(r10) {
            case 41: goto L58;
            case 42: goto L57;
            case 43: goto L57;
            default: goto L60;
        };
    L57:
        this.x = false;
        goto L60
    L41:
        if (r11 == false) goto L3;
        l();
    L39:
        this.t = false;
    L26:
        r13 = false;
        goto L27
    L8:
        r6 = r1.A();
        goto L9
    L162:
        if (r2 == false) goto L194;
        int r110 = this.q;
        if (r110 == 1) goto L166;
        if (r110 == 3) goto L166;
        return;
    L166:
        this.o = k();
        this.y = this.e;
        return;
    }

    @Override // defpackage.l00
    public final wn4 i() {
        wn4 r0 = super.i();
        if (r0 == null) goto L5;
        return r0;
    L5:
        long r1 = this.l;
        if (r1 == (-9223372036854775807L)) goto L16;
        long r4 = this.y;
        if (r4 != (-9223372036854775807L)) goto L11;
        return null;
    L11:
        if ((this.e - r4) < r1) goto L18;
        wn4 r2 = (wn4) this.b.pollFirst();
        if (r2 == null) goto L19;
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        zh0 r3 = g();
        long r5 = this.e;
        r2.p = r5;
        r2.s = r3;
        r2.t = r5;
        return r2;
    L19:
        return null;
    L18:
        return null;
    L16:
        return null;
    }

    @Override // defpackage.l00
    public final boolean j() {
        if (this.o == this.p) goto L6;
        return true;
    L6:
        return false;
    }

    public final ArrayList k() {
        ArrayList r7 = this.m;
        int r0 = r7.size();
        ArrayList r1 = new ArrayList(r0);
        int r2 = 2;
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r0) goto L8;
        ig0 r5 = ((d00) r7.get(r4)).c(Integer.MIN_VALUE);
        r1.add(r5);
        if (r5 == null) goto L7;
        r2 = Math.min(r2, r5.i);
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        ArrayList r6 = new ArrayList(r0);
    L9:
        if (r3 >= r0) goto L17;
        ig0 r8 = (ig0) r1.get(r3);
        if (r8 == null) goto L16;
        if (r8.i == r2) goto L15;
        r8 = ((d00) r7.get(r3)).c(r2);
        r8.getClass();
    L15:
        r6.add(r8);
    L16:
        r3 = r3 + 1;
        goto L9
    L17:
        return r6;
    }

    public final void l() {
        d00 r0 = this.n;
        r0.g = this.q;
        r0.a.clear();
        r0.b.clear();
        r0.c.setLength(0);
        r0.d = 15;
        r0.e = 0;
        r0.f = 0;
        ArrayList r1 = this.m;
        r1.clear();
        r1.add(this.n);
    }

    public final void m(int r4) {
        int r0 = this.q;
        if (r0 == r4) goto L21;
        this.q = r4;
        if (r4 != 3) goto L11;
        int r1 = 0;
    L8:
        ArrayList r2 = this.m;
        if (r1 >= r2.size()) goto L22;
        ((d00) r2.get(r1)).g = r4;
        r1 = r1 + 1;
        goto L8
    L22:
        return;
    L11:
        l();
        if (r0 != 3) goto L14;
    L18:
        this.o = Collections.EMPTY_LIST;
        return;
    L14:
        if (r4 == 1) goto L18;
        if (r4 == 0) goto L18;
        return;
    }
}
