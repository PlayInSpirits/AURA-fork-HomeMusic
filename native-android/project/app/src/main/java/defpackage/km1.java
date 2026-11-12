package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {
    public final xk0 a;
    public final ci0 b;
    public final ci0 c;
    public final si1 d;
    public final Uri[] e;
    public final tb1[] f;
    public final al0 g;
    public final sv4 h;
    public final List i;
    public final zh0 j;
    public final ik3 k;
    public boolean l;
    public byte[] m;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public t41 r;
    public long s;

    public km1(xk0 r1, al0 r2, Uri[] r3, tb1[] r4, zh0 r5, rw4 r6, si1 r7, List r8, ik3 r9) {
        this.a = r1;
        this.g = r2;
        this.e = r3;
        this.f = r4;
        this.d = r7;
        this.i = r8;
        this.k = r9;
        this.j = new zh0(27);
        this.m = f35.b;
        this.s = -9223372036854775807L;
        ci0 r10 = ((bi0) r5.o).m();
        this.b = r10;
        if (r6 == null) goto L5;
        r10.c(r6);
    L5:
        this.c = ((bi0) r5.o).m();
        this.h = new sv4("", r4);
        ArrayList r11 = new ArrayList();
        int r12 = 0;
        int r13 = 0;
    L7:
        if (r13 >= r3.length) goto L12;
        if ((r4[r13].f & 16384) != 0) goto L11;
        r11.add(Integer.valueOf(r13));
    L11:
        r13 = r13 + 1;
        goto L7
    L12:
        sv4 r14 = this.h;
        int[] r15 = jz4.N(r11);
        im1 r16 = new im1(0, r14, r15);
        tb1 r17 = r14.d[r15[0]];
    L14:
        if (r12 >= r16.b) goto L19;
        if (r16.d[r12] == r17) goto L20;
        r12 = r12 + 1;
    L20:
        r16.g = r12;
        this.r = r16;
        return;
    L19:
        r12 = -1;
        goto L20
    }

    public static jm1 d(ym1 r7, long r8, int r10) {
        long r0 = r7.k;
        yw1 r2 = r7.s;
        int r1 = (int) (r8 - r0);
        yw1 r9 = r7.r;
        if (r1 != r9.size()) goto L11;
        if (r10 != (-1)) goto L8;
        r10 = 0;
    L8:
        if (r10 < r2.size()) goto L10;
        return null;
    L10:
        return new jm1((wm1) r2.get(r10), r8, r10);
    L11:
        vm1 r3 = (vm1) r9.get(r1);
        if (r10 != (-1)) goto L16;
        return new jm1(r3, r8, -1);
    L16:
        if (r10 < r3.z.size()) goto L18;
        int r4 = r1 + 1;
        if (r4 >= r9.size()) goto L24;
        return new jm1((wm1) r9.get(r4), r8 + 1, -1);
    L24:
        if (r2.isEmpty() == false) goto L26;
        return null;
    L26:
        return new jm1((wm1) r2.get(0), r8 + 1, 0);
    L18:
        return new jm1((wm1) r3.z.get(r10), r8, r10);
    }

    public final xj2[] a(nm1 r19, long r20) {
        km1 r0 = this;
        nm1 r1 = r19;
        if (r1 != null) goto L5;
        int r9 = -1;
    L6:
        int r10 = r0.r.length();
        xj2[] r11 = new xj2[r10];
        boolean r12 = false;
        int r13 = 0;
    L7:
        if (r13 >= r10) goto L43;
        int r2 = r0.r.i(r13);
        Uri r3 = r0.e[r2];
        al0 r4 = r0.g;
        if (r4.d(r3) == true) goto L11;
        r11[r13] = xj2.j;
    L42:
        r13 = r13 + 1;
        r0 = this;
        r1 = r19;
        r12 = false;
        goto L7
    L11:
        ym1 r5 = r4.a(r12, r3);
        r5.getClass();
        long r6 = r5.h - r4.A;
        if (r2 == r9) goto L15;
        boolean r7 = true;
    L16:
        Pair r8 = r0.c(r1, r7, r5, r6, r20);
        long r14 = ((Long) r8.first).longValue();
        int r15 = ((Integer) r8.second).intValue();
        long r16 = r5.k;
        yw1 r17 = r5.s;
        yw1 r18 = r5.r;
        int r21 = (int) (r14 - r16);
        if (r21 >= 0) goto L19;
    L40:
        vw1 r22 = yw1.o;
        List r23 = gy3.r;
    L41:
        r11[r13] = new hm1(r6, r23);
        goto L42
    L19:
        if (r18.size() < r21) goto L40;
        ArrayList r24 = new ArrayList();
        if (r21 >= r18.size()) goto L33;
        if (r15 == (-1)) goto L31;
        vm1 r110 = (vm1) r18.get(r21);
        if (r15 != 0) goto L28;
        r24.add(r110);
    L30:
        r21 = r21 + 1;
        goto L31
    L28:
        if (r15 >= r110.z.size()) goto L30;
        yw1 r111 = r110.z;
        r24.addAll(r111.subList(r15, r111.size()));
    L31:
        r24.addAll(r18.subList(r21, r18.size()));
        r15 = 0;
    L33:
        if (r5.n == (-9223372036854775807L)) goto L39;
        if (r15 != (-1)) goto L37;
        r15 = 0;
    L37:
        if (r15 >= r17.size()) goto L39;
        r24.addAll(r17.subList(r15, r17.size()));
    L39:
        r23 = Collections.unmodifiableList(r24);
        goto L41
    L15:
        r7 = r12;
        goto L16
    L43:
        return r11;
    L5:
        r9 = r0.h.b(r1.d);
        goto L6
    }

    public final int b(nm1 r8) {
        int r0 = r8.o;
        if (r0 == (-1)) goto L24;
        int r1 = this.h.b(r8.d);
        Uri r2 = this.e[r1];
        ym1 r7 = this.g.a(false, r2);
        r7.getClass();
        yw1 r3 = r7.r;
        int r4 = (int) (r8.j - r7.k);
        if (r4 >= 0) goto L9;
        return 1;
    L9:
        if (r4 >= r3.size()) goto L11;
        yw1 r5 = ((vm1) r3.get(r4)).z;
    L13:
        if (r0 >= r5.size()) goto L26;
        tm1 r6 = (tm1) r5.get(r0);
        if (r6.z == false) goto L19;
        return 0;
    L19:
        if (Objects.equals(Uri.parse(jz4.G(r7.a, r6.n)), r8.b.a) == false) goto L22;
        return 1;
    L22:
        return 2;
    L26:
        return 2;
    L11:
        r5 = r7.s;
        goto L13
    L24:
        return 1;
    }

    public final Pair c(nm1 r17, boolean r18, ym1 r19, long r20, long r22) {
        int r3 = -1;
        long r5 = 1;
        boolean r7 = true;
        if (r17 == null) goto L23;
        long r8 = r17.j;
        int r10 = r17.o;
        if (r18 == true) goto L23;
        if (r17.H == false) goto L22;
        if (r10 == (-1)) goto L12;
    L15:
        Long r1 = Long.valueOf(r8);
        if (r10 == (-1)) goto L20;
        r3 = r10 + 1;
    L20:
        return new Pair(r1, Integer.valueOf(r3));
    L12:
        if (r8 == (-1)) goto L14;
        r8 = r8 + 1;
        goto L15
    L14:
        r8 = -1;
        goto L15
    L22:
        return new Pair(Long.valueOf(r8), Integer.valueOf(r10));
    L23:
        long r9 = r19.u;
        long r11 = r19.k;
        yw1 r12 = r19.s;
        yw1 r13 = r19.r;
        long r14 = r20 + r9;
        if (r17 != null) goto L26;
    L29:
        long r15 = r22;
    L31:
        if (r19.o == false) goto L33;
    L36:
        long r16 = r15 - r20;
        Long r2 = Long.valueOf(r16);
        al0 r0 = this.g;
        int r21 = 0;
        if (r0.z == false) goto L41;
        if (r17 == null) goto L41;
        r7 = false;
    L41:
        int r4 = f35.d(r13, r2, r7);
        long r23 = ((long) r4) + r11;
        if (r0.z == false) goto L44;
        if (r4 >= 0) goto L47;
    L65:
        int r6 = -1;
    L67:
        return new Pair(Long.valueOf(r23), Integer.valueOf(r6));
    L47:
        if (r13.isEmpty() == true) goto L51;
        vm1 r24 = (vm1) r13.get(r4);
        if (r16 >= (r24.r + r24.p)) goto L51;
        yw1 r25 = r24.z;
    L53:
        if (r21 >= r25.size()) goto L65;
        tm1 r26 = (tm1) r25.get(r21);
        if (r16 < (r26.r + r26.p)) goto L57;
        r21 = r21 + 1;
        goto L53
    L57:
        if (r26.y == false) goto L65;
        if (r25 == r12) goto L60;
    L62:
        r5 = 0;
    L63:
        r23 = r23 + r5;
        r6 = r21;
        goto L67
    L60:
        if (r13.isEmpty() == true) goto L62;
    L51:
        r25 = r12;
        goto L53
    L44:
        return new Pair(Long.valueOf(r23), -1);
    L33:
        if (r15 < r14) goto L36;
        return new Pair(Long.valueOf(r11 + ((long) r13.size())), -1);
    L26:
        if (this.q == true) goto L29;
        r15 = r17.g;
        goto L31
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gm1 e(Uri r20, int r21, boolean r22) {
        if (r20 != null) goto L5;
        return null;
    L5:
        zh0 r3 = this.j;
        byte[] r4 = (byte[]) ((ef1) r3.o).remove(r20);
        if (r4 == null) goto L9;
        byte[] r0 = (byte[]) ((ef1) r3.o).put(r20, r4);
        return null;
    L9:
        ii0 r1 = new ii0(r20, 0, 1, null, Collections.EMPTY_MAP, 0, -1, null, 1);
        tb1 r12 = this.f[r21];
        int r13 = this.r.n();
        Object r14 = this.r.q();
        byte[] r2 = this.m;
        gm1 r8 = new gm1(this.c, r1, 3, r12, r13, r14, -9223372036854775807L, -9223372036854775807L);
        if (r2 != null) goto L12;
        r2 = f35.b;
    L12:
        r8.j = r2;
        return r8;
    }
}
