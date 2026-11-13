package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class b45 extends d45 implements Iterable, x32 {
    public final String n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final float t;
    public final float u;
    public final List v;
    public final List w;

    public b45(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.n = str;
        this.o = f;
        this.p = f2;
        this.q = f3;
        this.r = f4;
        this.s = f5;
        this.t = f6;
        this.u = f7;
        this.v = list;
        this.w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof b45)) {
            b45 b45Var = (b45) obj;
            return h12.c(this.n, b45Var.n) && this.o == b45Var.o && this.p == b45Var.p && this.q == b45Var.q && this.r == b45Var.r && this.s == b45Var.s && this.t == b45Var.t && this.u == b45Var.u && h12.c(this.v, b45Var.v) && h12.c(this.w, b45Var.w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode() + ((this.v.hashCode() + b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(b11.d(this.n.hashCode() * 31, this.o, 31), this.p, 31), this.q, 31), this.r, 31), this.s, 31), this.t, 31), this.u, 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rf3(this);
    }
}
