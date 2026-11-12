package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f13 implements RandomAccess {
    public Object[] n;
    public c13 o;
    public int p = 0;

    public f13(Object[] objArr) {
        this.n = objArr;
    }

    public final void a(int i, Object obj) {
        int i2 = this.p + 1;
        if (this.n.length < i2) {
            m(i2);
        }
        Object[] objArr = this.n;
        int i3 = this.p;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.p++;
    }

    public final void b(Object obj) {
        int i = this.p + 1;
        if (this.n.length < i) {
            m(i);
        }
        Object[] objArr = this.n;
        int i2 = this.p;
        objArr[i2] = obj;
        this.p = i2 + 1;
    }

    public final void c(int i, f13 f13Var) {
        int i2 = f13Var.p;
        if (i2 == 0) {
            return;
        }
        int i3 = this.p + i2;
        if (this.n.length < i3) {
            m(i3);
        }
        Object[] objArr = this.n;
        int i4 = this.p;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(f13Var.n, 0, objArr, i, i2);
        this.p += i2;
    }

    public final void d(List list, int i) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.p + size;
        if (this.n.length < i2) {
            m(i2);
        }
        Object[] objArr = this.n;
        int i3 = this.p;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.p += size;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.p + size;
        if (this.n.length < i3) {
            m(i3);
        }
        Object[] objArr = this.n;
        int i4 = this.p;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                gb.c0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.p += size;
        return true;
    }

    public final List f() {
        c13 c13Var = this.o;
        if (c13Var != null) {
            return c13Var;
        }
        c13 c13Var2 = new c13(this);
        this.o = c13Var2;
        return c13Var2;
    }

    public final void g() {
        Object[] objArr = this.n;
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.p = 0;
    }

    public final boolean h(Object obj) {
        int i = this.p - 1;
        if (i >= 0) {
            for (int i2 = 0; !h12.c(this.n[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.n;
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            if (h12.c(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    public final Object k(int i) {
        Object[] objArr = this.n;
        Object obj = objArr[i];
        int i2 = this.p;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.p - 1;
        this.p = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.p;
            if (i2 < i3) {
                Object[] objArr = this.n;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.p;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.n[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.p = i5;
        }
    }

    public final void m(int i) {
        Object[] objArr = this.n;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.n = objArr2;
    }
}
