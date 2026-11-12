package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class in0 extends bw4 {
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public final boolean P;
    public final SparseArray Q;
    public final SparseBooleanArray R;

    public in0(jn0 jn0Var) {
        e(jn0Var);
        this.J = jn0Var.w0;
        this.K = jn0Var.x0;
        this.L = jn0Var.y0;
        this.M = jn0Var.z0;
        this.N = jn0Var.A0;
        this.O = jn0Var.B0;
        this.P = jn0Var.C0;
        SparseArray sparseArray = jn0Var.D0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.Q = sparseArray2;
        this.R = jn0Var.E0.clone();
    }

    @Override // defpackage.bw4
    public final void a(yv4 yv4Var) {
        this.H.put(yv4Var.a, yv4Var);
    }

    @Override // defpackage.bw4
    public final cw4 b() {
        return new jn0(this);
    }

    @Override // defpackage.bw4
    public final bw4 c() {
        super.c();
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 d(int i) {
        super.d(i);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 g() {
        this.C = -3;
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 h(yv4 yv4Var) {
        super.h(yv4Var);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 i() {
        super.i();
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 j(String[] strArr) {
        super.j(strArr);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 k() {
        super.k();
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 l(int i, boolean z) {
        super.l(i, z);
        return this;
    }

    public final void m(Set set) {
        this.I.clear();
        this.I.addAll(set);
    }

    public in0() {
        this.Q = new SparseArray();
        this.R = new SparseBooleanArray();
        this.J = true;
        this.K = true;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
    }
}
