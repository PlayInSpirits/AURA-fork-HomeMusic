package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ov2 extends p80 {
    public static final gn2 s = null;
    public final bq[] k;
    public final ArrayList l;
    public final cu4[] m;
    public final ArrayList n;
    public final i80 o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        um2 r0 = new um2();
        vw1 r1 = yw1.o;
        gy3 r2 = gy3.r;
        List r3 = Collections.EMPTY_LIST;
        gy3 r4 = gy3.r;
        zm2 r5 = new zm2();
        cn2 r8 = cn2.d;
        s = new gn2("MergingMediaSource", new wm2(r0), null, new an2(r5), do2.K, r8);
    }

    public ov2(bq... r5) {
        i80 r0 = new i80(24);
        this.k = r5;
        this.o = r0;
        this.n = new ArrayList(Arrays.asList(r5));
        this.p = -1;
        this.l = new ArrayList(r5.length);
        int r1 = 0;
    L4:
        if (r1 >= r5.length) goto L6;
        this.l.add(new ArrayList());
        r1 = r1 + 1;
        goto L4
    L6:
        this.m = new cu4[r5.length];
        this.q = new long[0][];
        new HashMap();
        uc5.f(8, "expectedKeys");
        uc5.f(2, "expectedValuesPerKey");
        new sz2(p60.b(8)).t = new rz2();
    }

    @Override // defpackage.bq
    public final boolean a(gn2 r3) {
        bq[] r2 = this.k;
        if (r2.length > 0) goto L5;
    L8:
        return false;
    L5:
        if (r2[0].a(r3) == false) goto L8;
        return true;
    }

    @Override // defpackage.bq
    public final no2 b(mt2 r12, n9 r13, long r14) {
        bq[] r0 = this.k;
        int r1 = r0.length;
        no2[] r2 = new no2[r1];
        cu4[] r3 = this.m;
        int r4 = 0;
        int r5 = r3[0].b(r12.a);
    L3:
        if (r4 >= r1) goto L5;
        mt2 r6 = r12.a(r3[r4].l(r5));
        r2[r4] = r0[r4].b(r6, r13, r14 - this.q[r5][r4]);
        ((List) this.l.get(r4)).add(new nv2(r6, r2[r4]));
        r4 = r4 + 1;
        goto L3
    L5:
        long[] r15 = this.q[r5];
        return new mv2(this.o, r15, r2);
    }

    @Override // defpackage.bq
    public final gn2 h() {
        bq[] r1 = this.k;
        if (r1.length <= 0) goto L7;
        return r1[0].h();
    L7:
        return s;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void j() {
        MergingMediaSource$IllegalMergeException r0 = this.r;
        if (r0 != null) goto L6;
        super.j();
        return;
    L6:
        throw r0;
    }

    @Override // defpackage.bq
    public final void l(rw4 r3) {
        this.j = r3;
        this.i = f35.p(null);
        int r4 = 0;
    L3:
        bq[] r0 = this.k;
        if (r4 >= r0.length) goto L6;
        x(Integer.valueOf(r4), r0[r4]);
        r4 = r4 + 1;
        goto L3
    }

    @Override // defpackage.bq
    public final void n(no2 r9) {
        mv2 r10 = (mv2) r9;
        int r1 = 0;
    L3:
        bq[] r2 = this.k;
        if (r1 >= r2.length) goto L21;
        List r3 = (List) this.l.get(r1);
        boolean[] r4 = r10.o;
        no2[] r5 = r10.n;
        if (r4[r1] == false) goto L8;
        no2 r6 = ((wt4) r5[r1]).n;
    L9:
        int r7 = 0;
    L11:
        if (r7 >= r3.size()) goto L16;
        if (((nv2) r3.get(r7)).b.equals(r6) == true) goto L14;
        r7 = r7 + 1;
        goto L11
    L14:
        r3.remove(r7);
    L16:
        bq r8 = r2[r1];
        if (r10.o[r1] == false) goto L19;
        no2 r11 = ((wt4) r5[r1]).n;
    L20:
        r8.n(r11);
        r1 = r1 + 1;
        goto L3
    L19:
        r11 = r5[r1];
        goto L20
    L8:
        r6 = r5[r1];
        goto L9
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        Arrays.fill(this.m, null);
        this.p = -1;
        this.r = null;
        ArrayList r0 = this.n;
        r0.clear();
        Collections.addAll(r0, this.k);
    }

    @Override // defpackage.bq
    public final void s(gn2 r2) {
        this.k[0].s(r2);
    }

    @Override // defpackage.p80
    public final mt2 t(Object r4, mt2 r5) {
        int r6 = ((Integer) r4).intValue();
        ArrayList r3 = this.l;
        List r7 = (List) r3.get(r6);
        int r1 = 0;
    L4:
        if (r1 >= r7.size()) goto L10;
        if (((nv2) r7.get(r1)).a.equals(r5) == true) goto L8;
        r1 = r1 + 1;
        goto L4
    L8:
        return ((nv2) ((List) r3.get(0)).get(r1)).a;
    L10:
        return null;
    }

    @Override // defpackage.p80
    public final void w(Object r7, bq r8, cu4 r9) {
        Integer r10 = (Integer) r7;
        if (this.r == null) goto L6;
        return;
    L6:
        if (this.p != (-1)) goto L9;
        this.p = r9.h();
    L12:
        int r0 = this.q.length;
        cu4[] r2 = this.m;
        if (r0 != 0) goto L15;
        this.q = (long[][]) Array.newInstance(Long.TYPE, new int[]{this.p, r2.length});
    L15:
        ArrayList r1 = this.n;
        r1.remove(r8);
        r2[r10.intValue()] = r9;
        if (r1.isEmpty() == false) goto L19;
        m(r2[0]);
        return;
    L19:
        return;
    L9:
        if (r9.h() == this.p) goto L12;
        this.r = new MergingMediaSource$IllegalMergeException();
    }
}
