package defpackage;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 implements q44 {
    public final int n;
    public final ln1 o;
    public int p;

    public hn1(ln1 r1, int r2) {
        this.o = r1;
        this.n = r2;
        this.p = -1;
    }

    public final void a() {
        if (this.p != (-1)) goto L5;
        boolean r0 = true;
    L6:
        rr2.l(r0);
        ln1 r1 = this.o;
        r1.v();
        r1.X.getClass();
        int[] r3 = r1.X;
        int r4 = this.n;
        int r5 = r3[r4];
        if (r5 == (-1)) goto L9;
        boolean[] r2 = r1.a0;
        if (r2[r5] == true) goto L11;
        r2[r5] = true;
    L16:
        this.p = r5;
        return;
    L11:
        r5 = -2;
        goto L16
    L9:
        if (r1.W.contains(r1.V.a(r4)) == false) goto L11;
        r5 = -3;
        goto L16
    L5:
        r0 = false;
        goto L6
    }

    public final boolean b() {
        int r1 = this.p;
        if (r1 != (-1)) goto L5;
        return false;
    L5:
        if (r1 != (-3)) goto L7;
        return false;
    L7:
        if (r1 == (-2)) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // defpackage.q44
    public final boolean c() {
        if (this.p != (-3)) goto L5;
        return true;
    L5:
        if (b() == false) goto L11;
        int r0 = this.p;
        ln1 r2 = this.o;
        if (r2.E() == false) goto L9;
        return false;
    L9:
        if (r2.I[r0].s(r2.g0) == true) goto L17;
        return false;
    L17:
        return true;
    L11:
        return false;
    }

    @Override // defpackage.q44
    public final void s() {
        int r0 = this.p;
        ln1 r2 = this.o;
        if (r0 != (-2)) goto L5;
        r2.v();
        throw new SampleQueueMappingException(xa3.h("Unable to bind a sample queue to TrackGroup with MIME type ", r2.V.a(this.n).d[0].n, "."));
    L5:
        if (r0 != (-1)) goto L9;
        r2.G();
        return;
    L9:
        if (r0 == (-3)) goto L17;
        r2.G();
        kn1 r3 = r2.I[r0];
        pw0 r1 = r3.h;
        if (r1 != null) goto L13;
        return;
    L13:
        if (r1.getState() != 1) goto L21;
        DrmSession$DrmSessionException r4 = r3.h.g();
        r4.getClass();
        throw r4;
    L21:
        return;
    }

    @Override // defpackage.q44
    public final int t(gp3 r19, cj0 r20, int r21) {
        if (this.p != (-3)) goto L7;
        r20.a(4);
        return -4;
    L7:
        if (b() == false) goto L51;
        int r3 = this.p;
        ln1 r0 = this.o;
        ArrayList r5 = r0.A;
        if (r0.E() == true) goto L51;
        int r7 = 0;
        if (r5.isEmpty() == true) goto L30;
        int r6 = 0;
    L15:
        if (r6 >= (r5.size() - 1)) goto L25;
        int r8 = ((nm1) r5.get(r6)).k;
        int r9 = r0.I.length;
        int r10 = 0;
    L17:
        if (r10 >= r9) goto L24;
        if (r0.a0[r10] == false) goto L23;
        if (r0.I[r10].v() == r8) goto L25;
    L23:
        r10 = r10 + 1;
        goto L17
    L24:
        r6 = r6 + 1;
    L25:
        f35.X(r5, 0, r6);
        nm1 r11 = (nm1) r5.get(0);
        tb1 r12 = r11.d;
        if (r12.equals(r0.T) == true) goto L28;
        ue1 r13 = r0.x;
        r13.i(new bt2(r13, new un2(1, r0.o, r12, r11.e, r11.f, f35.i0(r11.g), -9223372036854775807L)));
    L28:
        r0.T = r12;
    L30:
        if (r5.isEmpty() == false) goto L32;
    L34:
        int r2 = r0.I[r3].w(r19, r20, r21, r0.g0);
        if (r2 != (-5)) goto L50;
        tb1 r4 = (tb1) r19.p;
        r4.getClass();
        if (r3 != r0.O) goto L49;
        int r14 = jz4.m(r0.I[r3].v());
    L40:
        if (r7 >= r5.size()) goto L45;
        if (((nm1) r5.get(r7)).k == r14) goto L45;
        r7 = r7 + 1;
    L45:
        if (r7 >= r5.size()) goto L47;
        tb1 r1 = ((nm1) r5.get(r7)).d;
    L48:
        r4 = r4.d(r1);
        goto L49
    L47:
        r1 = r0.S;
        r1.getClass();
    L49:
        r19.p = r4;
    L50:
        return r2;
    L32:
        if (((nm1) r5.get(0)).f() == true) goto L34;
    L51:
        return -3;
    }

    @Override // defpackage.q44
    public final int u(long r4) {
        if (b() == false) goto L26;
        int r0 = this.p;
        ln1 r3 = this.o;
        if (r3.E() == true) goto L30;
        kn1 r1 = r3.I[r0];
        int r5 = r1.q(r3.g0, r4);
        ArrayList r6 = r3.A;
        if (r6 != null) goto L10;
        Iterator r7 = r6.iterator();
        if (r7.hasNext() == false) goto L18;
    L15:
        Object r8 = r7.next();
        if (r7.hasNext() == true) goto L15;
        Object r9 = r8;
    L19:
        nm1 r10 = (nm1) r9;
        if (r10 != null) goto L22;
    L24:
        r1.A(r5);
        return r5;
    L22:
        if (r10.f() == true) goto L24;
        r5 = Math.min(r5, r10.e(r0) - r1.o());
    L18:
        r9 = null;
        goto L19
    L10:
        if (r6.isEmpty() == true) goto L18;
        r9 = r6.get(r6.size() - 1);
        goto L19
    L30:
        return 0;
    L26:
        return 0;
    }
}
