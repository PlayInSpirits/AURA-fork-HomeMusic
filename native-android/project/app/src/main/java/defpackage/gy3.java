package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gy3 extends yw1 {
    public static final gy3 r = new gy3(0, new Object[0]);
    public final transient Object[] p;
    public final transient int q;

    public gy3(int i, Object[] objArr) {
        this.p = objArr;
        this.q = i;
    }

    @Override // defpackage.yw1, defpackage.rw1
    public final int b(int i, Object[] objArr) {
        Object[] objArr2 = this.p;
        int i2 = this.q;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.rw1
    public final Object[] d() {
        return this.p;
    }

    @Override // defpackage.rw1
    public final int e() {
        return this.q;
    }

    @Override // defpackage.rw1
    public final int f() {
        return 0;
    }

    @Override // defpackage.rw1
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rr2.q(i, this.q);
        Object obj = this.p[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.q;
    }
}
