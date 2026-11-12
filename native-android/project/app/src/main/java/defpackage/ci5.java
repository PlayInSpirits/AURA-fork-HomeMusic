package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ci5 extends ei5 {
    public final transient ei5 p;

    public ci5(ei5 r1) {
        this.p = r1;
    }

    @Override // defpackage.ei5, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        return this.p.contains(r1);
    }

    @Override // defpackage.ei5
    public final ei5 g() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int r2) {
        ei5 r1 = this.p;
        fu.Q(r2, r1.size());
        return r1.get((r1.size() - 1) - r2);
    }

    @Override // defpackage.ei5
    public final ei5 h(int r2, int r3) {
        ei5 r1 = this.p;
        fu.R(r2, r3, r1.size());
        return r1.h(r1.size() - r3, r1.size() - r2).g();
    }

    @Override // defpackage.ei5, java.util.List
    public final int indexOf(Object r2) {
        ei5 r1 = this.p;
        int r3 = r1.lastIndexOf(r2);
        if (r3 >= 0) goto L5;
        return -1;
    L5:
        return (r1.size() - 1) - r3;
    }

    @Override // defpackage.ei5, java.util.List
    public final int lastIndexOf(Object r2) {
        ei5 r1 = this.p;
        int r3 = r1.indexOf(r2);
        if (r3 >= 0) goto L5;
        return -1;
    L5:
        return (r1.size() - 1) - r3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }

    @Override // defpackage.ei5, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return h(r1, r2);
    }
}
