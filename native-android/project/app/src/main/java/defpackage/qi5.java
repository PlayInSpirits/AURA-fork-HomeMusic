package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qi5 extends gi5 {
    public static final Object[] v;
    public static final qi5 w;
    public final transient Object[] q;
    public final transient int r;
    public final transient Object[] s;
    public final transient int t;
    public final transient int u;

    static {
        Object[] objArr = new Object[0];
        v = objArr;
        w = new qi5(0, 0, 0, objArr, objArr);
    }

    public qi5(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.q = objArr;
        this.r = i;
        this.s = objArr2;
        this.t = i2;
        this.u = i3;
    }

    @Override // defpackage.wh5
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.q;
        int i = this.u;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wh5
    public final int b() {
        return this.u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.s;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i = iRotateLeft & this.t;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i + 1;
        }
    }

    @Override // defpackage.wh5
    public final int d() {
        return 0;
    }

    @Override // defpackage.wh5
    public final o15 e() {
        return i().listIterator(0);
    }

    @Override // defpackage.wh5
    public final Object[] f() {
        return this.q;
    }

    @Override // defpackage.gi5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return i().listIterator(0);
    }

    @Override // defpackage.gi5
    public final ei5 j() {
        return ei5.i(this.u, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.u;
    }
}
