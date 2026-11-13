package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class zf2 {
    public int n;
    public int o;
    public int p;
    public Object q;

    public zf2() {
        if (xi4.o == null) {
            xi4.o = new xi4(26);
        }
    }

    public int a(int i) {
        if (i < this.p) {
            return ((ByteBuffer) this.q).getShort(this.o + i);
        }
        return 0;
    }

    public void b() {
        if (((ag2) this.q).u == this.p) {
            return;
        }
        kf2.c();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.n;
            ag2 ag2Var = (ag2) this.q;
            if (i >= ag2Var.s || ag2Var.p[i] >= 0) {
                return;
            } else {
                this.n = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.o) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.o) {
            tag = c(view);
        } else {
            tag = view.getTag(this.n);
            if (!((Class) this.q).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate d = j65.d(view);
            z2 z2Var = d != null ? d instanceof y2 ? ((y2) d).a : new z2(d) : null;
            if (z2Var == null) {
                z2Var = new z2();
            }
            j65.o(view, z2Var);
            view.setTag(this.n, obj);
            j65.i(view, this.p);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.n < ((ag2) this.q).s;
    }

    public void remove() {
        ag2 ag2Var = (ag2) this.q;
        b();
        if (this.o == -1) {
            kf2.o("Call next() before removing element from the iterator.");
            return;
        }
        ag2Var.c();
        ag2Var.k(this.o);
        this.o = -1;
        this.p = ag2Var.u;
    }
}
