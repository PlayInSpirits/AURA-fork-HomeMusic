package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pi5 extends ei5 {
    public static final pi5 r = new pi5(0, new Object[0]);
    public final transient Object[] p;
    public final transient int q;

    public pi5(int i, Object[] objArr) {
        this.p = objArr;
        this.q = i;
    }

    @Override // defpackage.ei5, defpackage.wh5
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.p;
        int i = this.q;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.q;
    }

    @Override // defpackage.wh5
    public final int d() {
        return 0;
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        fu.Q(i, this.q);
        Object obj = this.p[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
