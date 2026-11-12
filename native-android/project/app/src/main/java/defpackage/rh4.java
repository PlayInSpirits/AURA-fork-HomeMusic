package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rh4 implements Parcelable, rl4, List, RandomAccess, y32 {
    public static final Parcelable.Creator<rh4> CREATOR = null;
    public ql4 n;

    static {
        CREATOR = new qh4(0);
    }

    public rh4(y1 r5) {
        ch4 r0 = jh4.j();
        ql4 r1 = new ql4(r0.g(), r5);
        if ((r0 instanceof yi1) == true) goto L5;
        r1.b = new ql4(1, r5);
    L5:
        this.n = r1;
    }

    @Override // defpackage.rl4
    public final tl4 a() {
        return this.n;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object r7) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L20
        r1.getClass();     // Catch: Throwable -> L20
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L20
        int r3 = r2.d;     // Catch: Throwable -> L20
        y1 r4 = r2.c;     // Catch: Throwable -> L20
        monitor-exit(r0);
        r4.getClass();
        y1 r5 = r4.d(r7);
        if (r5.equals(r4) == true) goto L8;
        ql4 r6 = this.n;
        r6.getClass();
        Object r8 = jh4.c;
        monitor-enter(r8);
        ch4 r9 = jh4.j();     // Catch: Throwable -> L17
        boolean r10 = rr2.e((ql4) jh4.w(r6, this, r9), r3, r5, true);     // Catch: Throwable -> L17
        monitor-exit(r8);
        jh4.n(r9, this);
        if (r10 == false) goto L2;
        return true;
    L17:
        th = move-exception;
        throw th;
    L8:
        return false;
    L20:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection r7) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L20
        r1.getClass();     // Catch: Throwable -> L20
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L20
        int r3 = r2.d;     // Catch: Throwable -> L20
        y1 r4 = r2.c;     // Catch: Throwable -> L20
        monitor-exit(r0);
        r4.getClass();
        y1 r5 = r4.e(r7);
        if (h12.c(r5, r4) == true) goto L8;
        ql4 r6 = this.n;
        r6.getClass();
        Object r8 = jh4.c;
        monitor-enter(r8);
        ch4 r9 = jh4.j();     // Catch: Throwable -> L17
        boolean r10 = rr2.e((ql4) jh4.w(r6, this, r9), r3, r5, true);     // Catch: Throwable -> L17
        monitor-exit(r8);
        jh4.n(r9, this);
        if (r10 == false) goto L2;
        return true;
    L17:
        th = move-exception;
        throw th;
    L8:
        return false;
    L20:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ql4 r0 = this.n;
        r0.getClass();
        Object r1 = jh4.c;
        monitor-enter(r1);
        ch4 r2 = jh4.j();     // Catch: Throwable -> L11
        ql4 r3 = (ql4) jh4.w(r0, this, r2);     // Catch: Throwable -> L11
        Object r4 = rr2.b;     // Catch: Throwable -> L11
        monitor-enter(r4);     // Catch: Throwable -> L11
        r3.c = og4.o;     // Catch: Throwable -> L13
        r3.d++;     // Catch: Throwable -> L13
        r3.e++;     // Catch: Throwable -> L13
        monitor-exit(r4);     // Catch: Throwable -> L11
        monitor-exit(r1);
        jh4.n(r2, this);
        return;
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object r1) {
        return rr2.F(this).c.contains(r1);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection r1) {
        return rr2.F(this).c.containsAll(r1);
    }

    @Override // defpackage.rl4
    public final void d(tl4 r2) {
        r2.b = this.n;
        this.n = (ql4) r2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int r7, int r8) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L19
        r1.getClass();     // Catch: Throwable -> L19
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L19
        int r3 = r2.d;     // Catch: Throwable -> L19
        y1 r4 = r2.c;     // Catch: Throwable -> L19
        monitor-exit(r0);
        r4.getClass();
        xf3 r5 = r4.f();
        r5.subList(r7, r8).clear();
        y1 r6 = r5.d();
        if (h12.c(r6, r4) == true) goto L18;
        ql4 r9 = this.n;
        r9.getClass();
        Object r10 = jh4.c;
        monitor-enter(r10);
        ch4 r11 = jh4.j();     // Catch: Throwable -> L15
        boolean r12 = rr2.e((ql4) jh4.w(r9, this, r11), r3, r6, true);     // Catch: Throwable -> L15
        monitor-exit(r10);
        jh4.n(r11, this);
        if (r12 == false) goto L2;
        return;
    L15:
        th = move-exception;
        throw th;
    L18:
        return;
    L19:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List
    public final Object get(int r1) {
        return rr2.F(this).c.get(r1);
    }

    @Override // java.util.List
    public final int indexOf(Object r1) {
        return rr2.F(this).c.indexOf(r1);
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
    public final int lastIndexOf(Object r1) {
        return rr2.F(this).c.lastIndexOf(r1);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new dm1(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object r7) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L24
        r1.getClass();     // Catch: Throwable -> L24
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L24
        int r3 = r2.d;     // Catch: Throwable -> L24
        y1 r4 = r2.c;     // Catch: Throwable -> L24
        monitor-exit(r0);
        r4.getClass();
        int r5 = r4.indexOf(r7);
        if (r5 == (-1)) goto L9;
        y1 r6 = r4.h(r5);
    L11:
        if (r6.equals(r4) == true) goto L12;
        ql4 r8 = this.n;
        r8.getClass();
        Object r9 = jh4.c;
        monitor-enter(r9);
        ch4 r10 = jh4.j();     // Catch: Throwable -> L21
        boolean r11 = rr2.e((ql4) jh4.w(r8, this, r10), r3, r6, true);     // Catch: Throwable -> L21
        monitor-exit(r9);
        jh4.n(r10, this);
        if (r11 == false) goto L2;
        return true;
    L21:
        th = move-exception;
        throw th;
    L12:
        return false;
    L9:
        r6 = r4;
    L24:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection r7) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L19
        r1.getClass();     // Catch: Throwable -> L19
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L19
        int r3 = r2.d;     // Catch: Throwable -> L19
        y1 r4 = r2.c;     // Catch: Throwable -> L19
        monitor-exit(r0);
        r4.getClass();
        y1 r5 = r4.g(new x1(0, r7));
        if (h12.c(r5, r4) == true) goto L8;
        ql4 r6 = this.n;
        r6.getClass();
        Object r8 = jh4.c;
        monitor-enter(r8);
        ch4 r9 = jh4.j();     // Catch: Throwable -> L16
        boolean r10 = rr2.e((ql4) jh4.w(r6, this, r9), r3, r5, true);     // Catch: Throwable -> L16
        monitor-exit(r8);
        jh4.n(r9, this);
        if (r10 == false) goto L2;
        return true;
    L16:
        th = move-exception;
        throw th;
    L8:
        return false;
    L19:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection r3) {
        return rr2.N(this, new x1(2, r3));
    }

    @Override // java.util.List
    public final Object set(int r8, Object r9) {
        Object r0 = get(r8);
    L3:
        Object r1 = rr2.b;
        monitor-enter(r1);
        ql4 r2 = this.n;     // Catch: Throwable -> L20
        r2.getClass();     // Catch: Throwable -> L20
        ql4 r3 = (ql4) jh4.h(r2);     // Catch: Throwable -> L20
        int r4 = r3.d;     // Catch: Throwable -> L20
        y1 r5 = r3.c;     // Catch: Throwable -> L20
        monitor-exit(r1);
        r5.getClass();
        y1 r6 = r5.i(r8, r9);
        if (r6.equals(r5) == true) goto L16;
        ql4 r7 = this.n;
        r7.getClass();
        Object r10 = jh4.c;
        monitor-enter(r10);
        ch4 r11 = jh4.j();     // Catch: Throwable -> L17
        boolean r12 = rr2.e((ql4) jh4.w(r7, this, r11), r4, r6, false);     // Catch: Throwable -> L17
        monitor-exit(r10);
        jh4.n(r11, this);
        if (r12 == false) goto L3;
    L17:
        th = move-exception;
        throw th;
    L16:
        return r0;
    L20:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return rr2.F(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int r2, int r3) {
        if (r2 < 0) goto L7;
        if (r2 > r3) goto L7;
        if (r3 > size()) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == true) goto L11;
        oo3.a("fromIndex or toIndex are out of bounds");
    L11:
        return new dn4(this, r2, r3);
    L7:
        r0 = false;
        goto L8
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zz1.I(this);
    }

    public final String toString() {
        ql4 r0 = this.n;
        r0.getClass();
        return "SnapshotStateList(value=" + ((ql4) jh4.h(r0)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        y1 r2 = rr2.F(this).c;
        int r5 = r2.a();
        r3.writeInt(r5);
        int r0 = 0;
    L3:
        if (r0 >= r5) goto L5;
        r3.writeValue(r2.get(r0));
        r0 = r0 + 1;
        goto L3
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] r1) {
        return zz1.J(this, r1);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r2) {
        return new dm1(this, r2);
    }

    public rh4() {
        this(og4.o);
    }

    @Override // java.util.List
    public final void add(int r7, Object r8) {
    L2:
        Object r0 = rr2.b;
        monitor-enter(r0);
        ql4 r1 = this.n;     // Catch: Throwable -> L19
        r1.getClass();     // Catch: Throwable -> L19
        ql4 r2 = (ql4) jh4.h(r1);     // Catch: Throwable -> L19
        int r3 = r2.d;     // Catch: Throwable -> L19
        y1 r4 = r2.c;     // Catch: Throwable -> L19
        monitor-exit(r0);
        r4.getClass();
        y1 r5 = r4.b(r7, r8);
        if (r5.equals(r4) == true) goto L15;
        ql4 r6 = this.n;
        r6.getClass();
        Object r9 = jh4.c;
        monitor-enter(r9);
        ch4 r10 = jh4.j();     // Catch: Throwable -> L16
        boolean r11 = rr2.e((ql4) jh4.w(r6, this, r10), r3, r5, true);     // Catch: Throwable -> L16
        monitor-exit(r9);
        jh4.n(r10, this);
        if (r11 == false) goto L2;
        return;
    L16:
        th = move-exception;
        throw th;
    L15:
        return;
    L19:
        th = move-exception;
        throw th;
    }

    @Override // java.util.List
    public final boolean addAll(int r2, Collection r3) {
        return rr2.N(this, new v91(r2, r3));
    }

    @Override // java.util.List
    public final Object remove(int r8) {
        Object r0 = get(r8);
    L3:
        Object r1 = rr2.b;
        monitor-enter(r1);
        ql4 r2 = this.n;     // Catch: Throwable -> L20
        r2.getClass();     // Catch: Throwable -> L20
        ql4 r3 = (ql4) jh4.h(r2);     // Catch: Throwable -> L20
        int r4 = r3.d;     // Catch: Throwable -> L20
        y1 r5 = r3.c;     // Catch: Throwable -> L20
        monitor-exit(r1);
        r5.getClass();
        y1 r6 = r5.h(r8);
        if (r6.equals(r5) == true) goto L16;
        ql4 r7 = this.n;
        r7.getClass();
        Object r9 = jh4.c;
        monitor-enter(r9);
        ch4 r10 = jh4.j();     // Catch: Throwable -> L17
        boolean r11 = rr2.e((ql4) jh4.w(r7, this, r10), r4, r6, true);     // Catch: Throwable -> L17
        monitor-exit(r9);
        jh4.n(r10, this);
        if (r11 == false) goto L3;
    L17:
        th = move-exception;
        throw th;
    L16:
        return r0;
    L20:
        th = move-exception;
        throw th;
    }
}
