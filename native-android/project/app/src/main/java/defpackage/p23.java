package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p23 implements Comparable {
    public final r23 n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final int s;

    public p23(r23 r23Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
        this.n = r23Var;
        this.o = bundle;
        this.p = z;
        this.q = i;
        this.r = z2;
        this.s = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p23 p23Var) {
        p23Var.getClass();
        boolean z = p23Var.r;
        boolean z2 = p23Var.p;
        Bundle bundle = p23Var.o;
        boolean z3 = this.p;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.q - p23Var.q;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.o;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.r;
        if (z4 && !z) {
            return 1;
        }
        if (z4 || !z) {
            return this.s - p23Var.s;
        }
        return -1;
    }
}
