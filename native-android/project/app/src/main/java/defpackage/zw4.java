package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zw4 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public Iterator o;
    public final Object p;

    public zw4(tq4 r2) {
        this.n = 0;
        this.p = r2;
        this.o = ((aa4) r2.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.o.hasNext();
    L7:
        return this.o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r0 = this.n;
        Object r1 = this.p;
        switch(r0) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        Object r2 = this.o.next();
        ArrayList r3 = (ArrayList) r1;
        View r4 = (View) r2;
        x0 r5 = null;
        if ((r4 instanceof ViewGroup) == false) goto L7;
        ViewGroup r6 = (ViewGroup) r4;
    L8:
        if (r6 == null) goto L10;
        r5 = new x0(3, r6);
    L10:
        if (r5 == null) goto L15;
        if (r5.hasNext() == false) goto L15;
        r3.add(this.o);
        this.o = r5;
    L19:
        return r2;
    L15:
        if (this.o.hasNext() == true) goto L19;
        if (r3.isEmpty() == true) goto L19;
        this.o = (Iterator) q40.C0(r3);
        v40.q0(r3);
        goto L15
    L7:
        r6 = null;
        goto L8
    L21:
        return ((tq4) r1).c.invoke(this.o.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.n) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public zw4(x0 r2) {
        this.n = 1;
        this.p = new ArrayList();
        this.o = r2;
    }
}
