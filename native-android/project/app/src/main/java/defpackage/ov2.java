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
    public static final gn2 s;
    public final bq[] k;
    public final ArrayList l;
    public final cu4[] m;
    public final ArrayList n;
    public final i80 o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        um2 um2Var = new um2();
        vw1 vw1Var = yw1.o;
        gy3 gy3Var = gy3.r;
        List list = Collections.EMPTY_LIST;
        gy3 gy3Var2 = gy3.r;
        zm2 zm2Var = new zm2();
        s = new gn2("MergingMediaSource", new wm2(um2Var), null, new an2(zm2Var), do2.K, cn2.d);
    }

    public ov2(bq... bqVarArr) {
        i80 i80Var = new i80(24);
        this.k = bqVarArr;
        this.o = i80Var;
        this.n = new ArrayList(Arrays.asList(bqVarArr));
        this.p = -1;
        this.l = new ArrayList(bqVarArr.length);
        for (int i = 0; i < bqVarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new cu4[bqVarArr.length];
        this.q = new long[0][];
        new HashMap();
        uc5.f(8, "expectedKeys");
        uc5.f(2, "expectedValuesPerKey");
        new sz2(p60.b(8)).t = new rz2();
    }

    @Override // defpackage.bq
    public final boolean a(gn2 gn2Var) {
        bq[] bqVarArr = this.k;
        return bqVarArr.length > 0 && bqVarArr[0].a(gn2Var);
    }

    @Override // defpackage.bq
    public final no2 b(mt2 mt2Var, n9 n9Var, long j) {
        bq[] bqVarArr = this.k;
        int length = bqVarArr.length;
        no2[] no2VarArr = new no2[length];
        cu4[] cu4VarArr = this.m;
        int iB = cu4VarArr[0].b(mt2Var.a);
        for (int i = 0; i < length; i++) {
            mt2 mt2VarA = mt2Var.a(cu4VarArr[i].l(iB));
            no2VarArr[i] = bqVarArr[i].b(mt2VarA, n9Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new nv2(mt2VarA, no2VarArr[i]));
        }
        return new mv2(this.o, this.q[iB], no2VarArr);
    }

    @Override // defpackage.bq
    public final gn2 h() {
        bq[] bqVarArr = this.k;
        return bqVarArr.length > 0 ? bqVarArr[0].h() : s;
    }

    @Override // defpackage.p80, defpackage.bq
    public final void j() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.j();
    }

    @Override // defpackage.bq
    public final void l(rw4 rw4Var) {
        this.j = rw4Var;
        this.i = f35.p(null);
        int i = 0;
        while (true) {
            bq[] bqVarArr = this.k;
            if (i >= bqVarArr.length) {
                return;
            }
            x(Integer.valueOf(i), bqVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.bq
    public final void n(no2 no2Var) {
        mv2 mv2Var = (mv2) no2Var;
        int i = 0;
        while (true) {
            bq[] bqVarArr = this.k;
            if (i >= bqVarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = mv2Var.o;
            no2[] no2VarArr = mv2Var.n;
            no2 no2Var2 = zArr[i] ? ((wt4) no2VarArr[i]).n : no2VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((nv2) list.get(i2)).b.equals(no2Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            bqVarArr[i].n(mv2Var.o[i] ? ((wt4) no2VarArr[i]).n : no2VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.p80, defpackage.bq
    public final void p() {
        super.p();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.bq
    public final void s(gn2 gn2Var) {
        this.k[0].s(gn2Var);
    }

    @Override // defpackage.p80
    public final mt2 t(Object obj, mt2 mt2Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((nv2) list.get(i)).a.equals(mt2Var)) {
                return ((nv2) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.p80
    public final void w(Object obj, bq bqVar, cu4 cu4Var) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = cu4Var.h();
        } else if (cu4Var.h() != this.p) {
            this.r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.q.length;
        cu4[] cu4VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, cu4VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(bqVar);
        cu4VarArr[num.intValue()] = cu4Var;
        if (arrayList.isEmpty()) {
            m(cu4VarArr[0]);
        }
    }
}
