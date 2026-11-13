package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class x0 implements Iterator, x32 {
    public final /* synthetic */ int n;
    public int o;
    public final Object p;

    public x0(Object[] objArr) {
        this.n = 1;
        objArr.getClass();
        this.p = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.n;
        Object obj = this.p;
        switch (i) {
            case 0:
                if (this.o < ((a1) obj).a()) {
                    break;
                }
                break;
            case 1:
                if (this.o < ((Object[]) obj).length) {
                    break;
                }
                break;
            case 2:
                if (this.o < ((mj4) obj).e()) {
                    break;
                }
                break;
            default:
                if (this.o < ((ViewGroup) obj).getChildCount()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.n;
        Object obj = this.p;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    tb4.k();
                    return null;
                }
                int i2 = this.o;
                this.o = i2 + 1;
                return ((a1) obj).get(i2);
            case 1:
                try {
                    int i3 = this.o;
                    this.o = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.o--;
                    kf2.m(e.getMessage());
                    return null;
                }
            case 2:
                int i4 = this.o;
                this.o = i4 + 1;
                return ((mj4) obj).f(i4);
            default:
                int i5 = this.o;
                this.o = i5 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i5);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.n) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.p;
                int i = this.o - 1;
                this.o = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ x0(int i, Object obj) {
        this.n = i;
        this.p = obj;
    }
}
