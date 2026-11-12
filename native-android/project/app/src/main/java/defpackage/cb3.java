package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb3 extends a1 implements RandomAccess {
    public final yw[] n;
    public final int[] o;

    public cb3(yw[] r1, int[] r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof yw) == true) goto L7;
        return false;
    L7:
        return super.contains((yw) r2);
    }

    @Override // java.util.List
    public final Object get(int r1) {
        return this.n[r1];
    }

    @Override // defpackage.a1, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof yw) == true) goto L7;
        return -1;
    L7:
        return super.indexOf((yw) r2);
    }

    @Override // defpackage.a1, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof yw) == true) goto L7;
        return -1;
    L7:
        return super.lastIndexOf((yw) r2);
    }
}
