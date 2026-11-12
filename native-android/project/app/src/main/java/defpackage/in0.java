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

    public in0(jn0 r7) {
        e(r7);
        this.J = r7.w0;
        this.K = r7.x0;
        this.L = r7.y0;
        this.M = r7.z0;
        this.N = r7.A0;
        this.O = r7.B0;
        this.P = r7.C0;
        SparseArray r0 = r7.D0;
        SparseArray r1 = new SparseArray();
        int r2 = 0;
    L4:
        if (r2 >= r0.size()) goto L6;
        r1.put(r0.keyAt(r2), new HashMap((Map) r0.valueAt(r2)));
        r2 = r2 + 1;
        goto L4
    L6:
        this.Q = r1;
        this.R = r7.E0.clone();
    }

    @Override // defpackage.bw4
    public final void a(yv4 r2) {
        this.H.put(r2.a, r2);
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
    public final bw4 d(int r1) {
        super.d(r1);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 g() {
        this.C = -3;
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 h(yv4 r1) {
        super.h(r1);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 i() {
        super.i();
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 j(String[] r1) {
        super.j(r1);
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 k() {
        super.k();
        return this;
    }

    @Override // defpackage.bw4
    public final bw4 l(int r1, boolean r2) {
        super.l(r1, r2);
        return this;
    }

    public final void m(Set r2) {
        this.I.clear();
        this.I.addAll(r2);
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
