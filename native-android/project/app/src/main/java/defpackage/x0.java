package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class x0 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public final Object p;

    public x0(Object[] r2) {
        this.n = 1;
        r2.getClass();
        this.p = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.n;
        Object r3 = this.p;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L13;
            case 2: goto L9;
            default: goto L5;
        };
    L5:
        if (this.o < ((ViewGroup) r3).getChildCount()) goto L7;
        return false;
    L7:
        return true;
    L9:
        if (this.o < ((mj4) r3).e()) goto L11;
        return false;
    L11:
        return true;
    L13:
        if (this.o < ((Object[]) r3).length) goto L15;
        return false;
    L15:
        return true;
    L17:
        if (this.o < ((a1) r3).a()) goto L19;
        return false;
    L19:
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r2 = this.p;
        switch(r0) {
            case 0: goto L17;
            case 1: goto L21;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        int r1 = this.o;
        this.o = r1 + 1;
        View r4 = ((ViewGroup) r2).getChildAt(r1);
        if (r4 == null) goto L8;
        return r4;
    L8:
        throw new IndexOutOfBoundsException();
    L9:
        int r3 = this.o;
        this.o = r3 + 1;
        return ((mj4) r2).f(r3);
    L21:
        int r5 = this.o;     // Catch: ArrayIndexOutOfBoundsException -> L13
        this.o = r5 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L13
        return ((Object[]) r2)[r5];
    L13:
        e = move-exception;
        this.o--;
        kf2.m(e.getMessage());
        return null;
    L17:
        if (hasNext() == false) goto L19;
        int r6 = this.o;
        this.o = r6 + 1;
        return ((a1) r2).get(r6);
    L19:
        tb4.k();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.n) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L4;
        };
    L4:
        ViewGroup r0 = (ViewGroup) this.p;
        int r1 = this.o - 1;
        this.o = r1;
        r0.removeViewAt(r1);
        return;
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L9:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L11:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ x0(int r1, Object r2) {
        this.n = r1;
        this.p = r2;
    }
}
