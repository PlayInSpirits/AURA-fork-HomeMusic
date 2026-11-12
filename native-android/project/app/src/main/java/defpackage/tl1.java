package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tl1 implements Iterable, x32 {
    public final String[] n;

    public tl1(String[] strArr) {
        strArr.getClass();
        this.n = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.n;
        strArr.getClass();
        int length = strArr.length - 2;
        int iN = q05.n(length, 0, -2);
        if (iN > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iN) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        String str = (String) ti.k0(i * 2, this.n);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final sl1 d() {
        sl1 sl1Var = new sl1();
        ArrayList arrayList = sl1Var.a;
        arrayList.getClass();
        String[] strArr = this.n;
        strArr.getClass();
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        arrayList.addAll(listAsList);
        return sl1Var;
    }

    public final String e(int i) {
        String str = (String) ti.k0((i * 2) + 1, this.n);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tl1) {
            return Arrays.equals(this.n, ((tl1) obj).n);
        }
        return false;
    }

    public final List f(String str) {
        str.getClass();
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
        }
        List listQ0 = arrayList != null ? q40.Q0(arrayList) : null;
        return listQ0 == null ? u01.n : listQ0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        kd3[] kd3VarArr = new kd3[size];
        for (int i = 0; i < size; i++) {
            kd3VarArr[i] = new kd3(b(i), e(i));
        }
        return new x0(kd3VarArr);
    }

    public final int size() {
        return this.n.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strB = b(i);
            String strE = e(i);
            sb.append(strB);
            sb.append(": ");
            if (xe5.l(strB)) {
                strE = "██";
            }
            sb.append(strE);
            sb.append("\n");
        }
        return sb.toString();
    }
}
