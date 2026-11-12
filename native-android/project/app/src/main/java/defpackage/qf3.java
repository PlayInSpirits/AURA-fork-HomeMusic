package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qf3 extends w1 {
    public final /* synthetic */ int n;
    public final lf3 o;

    public /* synthetic */ qf3(int r1, lf3 r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.w1
    public final int a() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.r;
    L7:
        return this.o.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object r1) {
        switch(this.n) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        Map.Entry r2 = (Map.Entry) r1;
        throw new UnsupportedOperationException();
    L5:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch(this.n) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.o.clear();
        return;
    L6:
        this.o.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r3) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.containsKey(r3);
    L7:
        if ((r3 instanceof Map.Entry) == false) goto L21;
        Map.Entry r4 = (Map.Entry) r3;
        Object r0 = r4.getKey();
        lf3 r2 = this.o;
        Object r1 = r2.get(r0);
        if (r1 == null) goto L13;
        return r1.equals(r4.getValue());
    L13:
        if (r4.getValue() == null) goto L15;
        return false;
    L15:
        if (r2.containsKey(r4.getKey()) == false) goto L20;
        return true;
    L20:
        return false;
    L21:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch(this.n) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        yx4[] r2 = new yx4[8];
        int r3 = 0;
    L5:
        if (r3 >= 8) goto L8;
        r2[r3] = new zx4(1);
        r3 = r3 + 1;
        goto L5
    L8:
        return new sf3(this.o, r2);
    L10:
        return new rf3(this.o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r3) {
        switch(this.n) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        lf3 r2 = this.o;
        if (r2.containsKey(r3) == false) goto L13;
        r2.remove(r3);
        return true;
    L13:
        return false;
    L9:
        if ((r3 instanceof Map.Entry) == false) goto L14;
        Map.Entry r4 = (Map.Entry) r3;
        Object r0 = r4.getKey();
        Object r5 = r4.getValue();
        return this.o.remove(r0, r5);
    L14:
        return false;
    }
}
