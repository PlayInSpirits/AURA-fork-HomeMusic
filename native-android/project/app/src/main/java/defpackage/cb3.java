package defpackage;

import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class cb3 extends a1 implements RandomAccess {
    public final yw[] n;
    public final int[] o;

    public cb3(yw[] ywVarArr, int[] iArr) {
        this.n = ywVarArr;
        this.o = iArr;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof yw) {
            return super.contains((yw) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.n[i];
    }

    @Override // defpackage.a1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof yw) {
            return super.indexOf((yw) obj);
        }
        return -1;
    }

    @Override // defpackage.a1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof yw) {
            return super.lastIndexOf((yw) obj);
        }
        return -1;
    }
}
