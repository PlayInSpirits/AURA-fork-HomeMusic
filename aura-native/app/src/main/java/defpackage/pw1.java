package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class pw1 extends qw1 {
    public Object[] a;
    public int b;
    public boolean c;

    public pw1(int i) {
        uc5.f(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof rw1) {
                this.b = ((rw1) collection).b(this.b, this.a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void e(int i) {
        Object[] objArr = this.a;
        int b = qw1.b(objArr.length, this.b + i);
        if (b > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, b);
            this.c = false;
        }
    }
}
