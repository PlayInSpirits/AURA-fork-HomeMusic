package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class og4 extends y1 {
    public static final og4 o = new og4(new Object[0]);
    public final Object[] n;

    public og4(Object[] objArr) {
        this.n = objArr;
    }

    @Override // defpackage.y
    public final int a() {
        return this.n.length;
    }

    @Override // defpackage.y1
    public final y1 b(int i, Object obj) {
        Object[] objArr = this.n;
        uo.i(i, objArr.length);
        if (i == objArr.length) {
            return d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ti.c0(0, i, 6, objArr, objArr2);
            ti.Z(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new og4(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ti.Z(i + 1, i, objArr.length - 1, objArr, copyOf);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new wf3(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.y1
    public final y1 d(Object obj) {
        Object[] objArr = this.n;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new og4(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new wf3(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.y1
    public final y1 e(Collection collection) {
        Object[] objArr = this.n;
        if (collection.size() + objArr.length > 32) {
            xf3 f = f();
            f.addAll(collection);
            return f.d();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new og4(copyOf);
    }

    @Override // defpackage.y1
    public final xf3 f() {
        return new xf3(this, null, this.n, 0);
    }

    @Override // defpackage.y1
    public final y1 g(x1 x1Var) {
        Object[] objArr = this.n;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) x1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? o : new og4(ti.e0(objArr2, 0, length));
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.n;
        uo.e(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.y1
    public final y1 h(int i) {
        Object[] objArr = this.n;
        uo.e(i, objArr.length);
        if (objArr.length == 1) {
            return o;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        ti.Z(i, i + 1, objArr.length, objArr, copyOf);
        return new og4(copyOf);
    }

    @Override // defpackage.y1
    public final y1 i(int i, Object obj) {
        Object[] objArr = this.n;
        uo.e(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new og4(copyOf);
    }

    @Override // defpackage.a1, java.util.List
    public final int indexOf(Object obj) {
        return ti.m0(this.n, obj);
    }

    @Override // defpackage.a1, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.n;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.a1, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.n;
        uo.i(i, objArr.length);
        return new vv(objArr, i, objArr.length);
    }
}
