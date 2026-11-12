package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ci5 extends ei5 {
    public final transient ei5 p;

    public ci5(ei5 ei5Var) {
        this.p = ei5Var;
    }

    @Override // defpackage.ei5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.p.contains(obj);
    }

    @Override // defpackage.ei5
    public final ei5 g() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ei5 ei5Var = this.p;
        fu.Q(i, ei5Var.size());
        return ei5Var.get((ei5Var.size() - 1) - i);
    }

    @Override // defpackage.ei5, java.util.List
    /* JADX INFO: renamed from: h */
    public final ei5 subList(int i, int i2) {
        ei5 ei5Var = this.p;
        fu.R(i, i2, ei5Var.size());
        return ei5Var.subList(ei5Var.size() - i2, ei5Var.size() - i).g();
    }

    @Override // defpackage.ei5, java.util.List
    public final int indexOf(Object obj) {
        ei5 ei5Var = this.p;
        int iLastIndexOf = ei5Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (ei5Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.ei5, java.util.List
    public final int lastIndexOf(Object obj) {
        ei5 ei5Var = this.p;
        int iIndexOf = ei5Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (ei5Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }
}
