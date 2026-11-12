package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.eddyizm.tempus.homemusic.SmartSession;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gf4 implements no2, hd2 {
    public int A;
    public final ii0 n;
    public final bi0 o;
    public final rw4 p;
    public final i80 q;
    public final ue1 r;
    public final tv4 s;
    public final ArrayList t;
    public final long u;
    public final i61 v;
    public final tb1 w;
    public final boolean x;
    public boolean y;
    public byte[] z;

    public gf4(ii0 r1, bi0 r2, rw4 r3, tb1 r4, long r5, i80 r7, ue1 r8, boolean r9, ty3 r10) {
        this.n = r1;
        this.o = r2;
        this.p = r3;
        this.w = r4;
        this.u = r5;
        this.q = r7;
        this.r = r8;
        this.x = r9;
        this.s = new tv4(new sv4[]{new sv4("", new tb1[]{r4})});
        this.t = new ArrayList();
        if (r10 == null) goto L5;
        i61 r6 = new i61(r10);
    L6:
        this.v = r6;
        return;
    L5:
        r6 = new i61("SingleSampleMediaPeriod");
        goto L6
    }

    @Override // defpackage.hd2
    public final void b(jd2 r13, long r14, long r16, boolean r18) {
        ff4 r15 = (ff4) r13;
        yl4 r0 = r15.b;
        ed2 r1 = new ed2(r15.a, r0.p, r0.q, r14, r16, r0.o);
        this.q.getClass();
        long r10 = this.u;
        this.r.q(r1, 1, -1, null, 0, null, 0, r10);
    }

    @Override // defpackage.no2
    public final long c(t41[] r5, boolean[] r6, q44[] r7, boolean[] r8, long r9) {
        int r0 = 0;
    L4:
        if (r0 >= r5.length) goto L18;
        q44 r1 = r7[r0];
        ArrayList r2 = this.t;
        if (r1 == null) goto L13;
        if (r5[r0] != null) goto L10;
    L11:
        r2.remove(r1);
        r7[r0] = null;
        goto L13
    L10:
        if (r6[r0] == false) goto L11;
    L13:
        if (r7[r0] != null) goto L17;
        if (r5[r0] == null) goto L17;
        ef4 r3 = new ef4(this);
        r2.add(r3);
        r7[r0] = r3;
        r8[r0] = true;
    L17:
        r0 = r0 + 1;
        goto L4
    L18:
        return r9;
    }

    @Override // defpackage.da4
    public final long d() {
        if (this.y == false) goto L5;
        return Long.MIN_VALUE;
    L5:
        if (this.v.l() == true) goto L11;
        return 0;
    L11:
        return Long.MIN_VALUE;
    }

    @Override // defpackage.no2
    public final long e(long r1, n84 r3) {
        return r1;
    }

    @Override // defpackage.da4
    public final boolean f() {
        return this.v.l();
    }

    @Override // defpackage.hd2
    public final void g(jd2 r13, long r14, long r16) {
        ff4 r15 = (ff4) r13;
        this.A = (int) r15.b.o;
        byte[] r0 = r15.c;
        r0.getClass();
        this.z = r0;
        this.y = true;
        yl4 r1 = r15.b;
        ed2 r2 = new ed2(r15.a, r1.p, r1.q, r14, r16, this.A);
        this.q.getClass();
        this.r.r(r2, 1, -1, this.w, 0, null, 0, this.u);
    }

    @Override // defpackage.no2
    public final void h() {
    }

    @Override // defpackage.no2
    public final long i(long r5) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.t;
        if (r0 >= r1.size()) goto L9;
        ef4 r2 = (ef4) r1.get(r0);
        if (r2.n != 2) goto L8;
        r2.n = 1;
    L8:
        r0 = r0 + 1;
        goto L3
    L9:
        return r5;
    }

    @Override // defpackage.hd2
    public final void j(jd2 r17, long r18, long r20, int r22) {
        ff4 r1 = (ff4) r17;
        yl4 r2 = r1.b;
        if (r22 != 0) goto L5;
        ed2 r5 = new ed2(r18, r1.a);
    L6:
        long r13 = this.u;
        this.r.u(r5, 1, -1, this.w, 0, null, 0, r13, r22);
        return;
    L5:
        r5 = new ed2(r1.a, r2.p, r2.q, r18, r20, r2.o);
        goto L6
    }

    @Override // defpackage.no2
    public final void k(boolean r1, long r2) {
    }

    @Override // defpackage.no2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.no2
    public final void m(mo2 r1, long r2) {
        r1.b(this);
    }

    @Override // defpackage.no2
    public final tv4 n() {
        return this.s;
    }

    @Override // defpackage.da4
    public final boolean o(pd2 r4) {
        if (this.y == true) goto L14;
        i61 r5 = this.v;
        if (r5.l() == false) goto L7;
        return false;
    L7:
        if (((IOException) r5.q) != null) goto L17;
        ci0 r0 = this.o.m();
        rw4 r1 = this.p;
        if (r1 == null) goto L12;
        r0.c(r1);
    L12:
        ff4 r2 = new ff4(r0, this.n);
        this.q.getClass();
        r5.u(r2, this, 3);
        return true;
    L17:
        return false;
    L14:
        return false;
    }

    @Override // defpackage.da4
    public final long q() {
        if (this.y == false) goto L6;
        return Long.MIN_VALUE;
    L6:
        return 0;
    }

    @Override // defpackage.hd2
    public final dd2 s(jd2 r18, long r19, long r21, IOException r23, int r24) {
        ff4 r2 = (ff4) r18;
        yl4 r3 = r2.b;
        ed2 r4 = new ed2(r2.a, r3.p, r3.q, r19, r21, r3.o);
        String r5 = f35.a;
        this.q.getClass();
        Throwable r6 = r23;
    L4:
        if (r6 == null) goto L20;
        if ((r6 instanceof ParserException) == true) goto L19;
        if ((r6 instanceof FileNotFoundException) == true) goto L19;
        if ((r6 instanceof HttpDataSource$CleartextNotPermittedException) == true) goto L19;
        if ((r6 instanceof Loader$UnexpectedLoaderException) == true) goto L19;
        if ((r6 instanceof DataSourceException) == false) goto L18;
        if (((DataSourceException) r6).n == 2008) goto L19;
    L18:
        r6 = r6.getCause();
    L19:
        long r7 = -9223372036854775807L;
    L21:
        boolean r8 = false;
        if (r7 != (-9223372036854775807L)) goto L24;
    L27:
        boolean r1 = true;
    L29:
        if (this.x == false) goto L32;
        if (r1 == false) goto L32;
        IOException r15 = r23;
        l93.r0("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", r15);
        this.y = true;
        dd2 r9 = i61.s;
    L36:
        int r10 = r9.a;
        if (r10 == 0) goto L39;
        if (r10 == 1) goto L39;
    L40:
        long r13 = this.u;
        this.r.s(r4, 1, -1, this.w, 0, null, 0, r13, r15, !r8);
        return r9;
    L39:
        r8 = true;
    L32:
        r15 = r23;
        if (r7 == (-9223372036854775807L)) goto L35;
        r9 = new dd2(0, r7, false);
        goto L36
    L35:
        r9 = i61.t;
        goto L36
    L24:
        if (r24 >= 3) goto L27;
        r1 = false;
        goto L29
    L20:
        r7 = Math.min((r24 - 1) * 1000, SmartSession.MAX_SONGS);
        goto L21
    }

    @Override // defpackage.da4
    public final void u(long r1) {
    }
}
