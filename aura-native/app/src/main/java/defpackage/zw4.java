package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zw4 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public Iterator o;
    public final Object p;

    public zw4(tq4 tq4Var) {
        this.n = 0;
        this.p = tq4Var;
        this.o = ((aa4) tq4Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.n) {
        }
        return this.o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.p;
        switch (i) {
            case 0:
                return ((tq4) obj).c.invoke(this.o.next());
            default:
                Object next = this.o.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                x0 x0Var = viewGroup != null ? new x0(3, viewGroup) : null;
                if (x0Var == null || !x0Var.hasNext()) {
                    while (!this.o.hasNext() && !arrayList.isEmpty()) {
                        this.o = (Iterator) q40.C0(arrayList);
                        v40.q0(arrayList);
                    }
                } else {
                    arrayList.add(this.o);
                    this.o = x0Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public zw4(x0 x0Var) {
        this.n = 1;
        this.p = new ArrayList();
        this.o = x0Var;
    }
}
