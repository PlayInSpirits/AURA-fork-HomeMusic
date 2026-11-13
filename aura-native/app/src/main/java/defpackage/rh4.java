package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class rh4 implements Parcelable, rl4, List, RandomAccess, y32 {
    public static final Parcelable.Creator<rh4> CREATOR = new qh4(0);
    public ql4 n;

    public rh4(y1 y1Var) {
        ch4 j = jh4.j();
        ql4 ql4Var = new ql4(j.g(), y1Var);
        if (!(j instanceof yi1)) {
            ql4Var.b = new ql4(1L, y1Var);
        }
        this.n = ql4Var;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.n;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 d = y1Var.d(obj);
            if (d.equals(y1Var)) {
                return false;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i, d, true);
            }
            jh4.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 e2 = y1Var.e(collection);
            if (h12.c(e2, y1Var)) {
                return false;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i, e2, true);
            }
            jh4.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ch4 j;
        ql4 ql4Var = this.n;
        ql4Var.getClass();
        synchronized (jh4.c) {
            j = jh4.j();
            ql4 ql4Var2 = (ql4) jh4.w(ql4Var, this, j);
            synchronized (rr2.b) {
                ql4Var2.c = og4.o;
                ql4Var2.d++;
                ql4Var2.e++;
            }
        }
        jh4.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return rr2.F(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return rr2.F(this).c.containsAll(collection);
    }

    @Override // defpackage.rl4
    public final void d(tl4 tl4Var) {
        tl4Var.b = this.n;
        this.n = (ql4) tl4Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i3 = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            xf3 f = y1Var.f();
            f.subList(i, i2).clear();
            y1 d = f.d();
            if (h12.c(d, y1Var)) {
                return;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i3, d, true);
            }
            jh4.n(j, this);
        } while (!e);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return rr2.F(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return rr2.F(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return rr2.F(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return rr2.F(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new dm1(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            int indexOf = y1Var.indexOf(obj);
            y1 h = indexOf != -1 ? y1Var.h(indexOf) : y1Var;
            if (h.equals(y1Var)) {
                return false;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i, h, true);
            }
            jh4.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 g = y1Var.g(new x1(0, collection));
            if (h12.c(g, y1Var)) {
                return false;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i, g, true);
            }
            jh4.n(j, this);
        } while (!e);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return rr2.N(this, new x1(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        y1 y1Var;
        ch4 j;
        boolean e;
        Object obj2 = get(i);
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i2 = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 i3 = y1Var.i(i, obj);
            if (i3.equals(y1Var)) {
                break;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i2, i3, false);
            }
            jh4.n(j, this);
        } while (!e);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return rr2.F(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            oo3.a("fromIndex or toIndex are out of bounds");
        }
        return new dn4(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    public final String toString() {
        ql4 ql4Var = this.n;
        ql4Var.getClass();
        return "SnapshotStateList(value=" + ((ql4) jh4.h(ql4Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        y1 y1Var = rr2.F(this).c;
        int a = y1Var.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(y1Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zz1.J(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new dm1(this, i);
    }

    public rh4() {
        this(og4.o);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        y1 y1Var;
        ch4 j;
        boolean e;
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i2 = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 b = y1Var.b(i, obj);
            if (b.equals(y1Var)) {
                return;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i2, b, true);
            }
            jh4.n(j, this);
        } while (!e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return rr2.N(this, new v91(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        y1 y1Var;
        ch4 j;
        boolean e;
        Object obj = get(i);
        do {
            synchronized (rr2.b) {
                ql4 ql4Var = this.n;
                ql4Var.getClass();
                ql4 ql4Var2 = (ql4) jh4.h(ql4Var);
                i2 = ql4Var2.d;
                y1Var = ql4Var2.c;
            }
            y1Var.getClass();
            y1 h = y1Var.h(i);
            if (h.equals(y1Var)) {
                break;
            }
            ql4 ql4Var3 = this.n;
            ql4Var3.getClass();
            synchronized (jh4.c) {
                j = jh4.j();
                e = rr2.e((ql4) jh4.w(ql4Var3, this, j), i2, h, true);
            }
            jh4.n(j, this);
        } while (!e);
        return obj;
    }
}
