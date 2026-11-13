package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ym1 extends dn1 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final ow0 q;
    public final yw1 r;
    public final yw1 s;
    public final bx1 t;
    public final long u;
    public final xm1 v;
    public final yw1 w;

    public ym1(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, ow0 ow0Var, List list2, List list3, xm1 xm1Var, Map map, List list4) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = ow0Var;
        this.r = yw1.k(list2);
        this.s = yw1.k(list3);
        this.t = bx1.b(map);
        this.w = yw1.k(list4);
        if (!list3.isEmpty()) {
            tm1 tm1Var = (tm1) te5.w(list3);
            this.u = tm1Var.r + tm1Var.p;
        } else if (list2.isEmpty()) {
            this.u = 0L;
        } else {
            vm1 vm1Var = (vm1) te5.w(list2);
            this.u = vm1Var.r + vm1Var.p;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            long j7 = this.u;
            j6 = j >= 0 ? Math.min(j7, j) : Math.max(0L, j7 + j);
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = xm1Var;
    }

    @Override // defpackage.dn1
    public final Object a(List list) {
        return this;
    }
}
