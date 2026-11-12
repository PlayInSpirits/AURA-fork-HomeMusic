package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ig4 implements w80, Iterable, x32 {
    public int o;
    public int q;
    public int r;
    public boolean t;
    public int u;
    public HashMap w;
    public i03 x;
    public int[] n = new int[0];
    public Object[] p = new Object[0];
    public final Object s = new Object();
    public ArrayList v = new ArrayList();

    public final int a(mg1 mg1Var) {
        if (this.t) {
            l80.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!mg1Var.a()) {
            oo3.a("Anchor refers to a group that was removed");
        }
        return mg1Var.a;
    }

    public final void b() {
        this.w = new HashMap();
    }

    public final hg4 d() {
        if (this.t) {
            kf2.o("Cannot read while a writer is pending");
            return null;
        }
        this.r++;
        return new hg4(this);
    }

    public final lg4 e() {
        if (this.t) {
            l80.a("Cannot start a writer when another writer is pending");
        }
        if (this.r > 0) {
            l80.a("Cannot start a writer when a reader is pending");
        }
        this.t = true;
        this.u++;
        return new lg4(this);
    }

    public final boolean f(mg1 mg1Var) {
        int iE;
        return mg1Var.a() && (iE = kg4.e(this.v, mg1Var.a, this.o)) >= 0 && h12.c(this.v.get(iE), mg1Var);
    }

    public final tg1 g(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.w;
        if (map != null) {
            if (this.t) {
                l80.a("use active SlotWriter to crate an anchor for location instead");
            }
            mg1 mg1Var = (i < 0 || i >= (i2 = this.o) || (iE = kg4.e((arrayList = this.v), i, i2)) < 0) ? null : (mg1) arrayList.get(iE);
            if (mg1Var != null) {
                return (tg1) map.get(mg1Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ik1(this, 0, this.o);
    }
}
