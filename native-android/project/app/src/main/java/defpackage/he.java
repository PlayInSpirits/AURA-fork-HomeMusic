package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class he implements CharSequence {
    public final List n;
    public final String o;
    public final ArrayList p;
    public final ArrayList q;

    static {
        xc5 xc5Var = s54.a;
    }

    public he(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.n = list;
        this.o = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ge geVar = (ge) list.get(i);
                Object obj = geVar.a;
                if (obj instanceof ij4) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(geVar);
                } else if (obj instanceof sd3) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(geVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.p = arrayList;
        this.q = arrayList2;
        List listK0 = arrayList2 != null ? q40.K0(arrayList2, new ca1(10)) : null;
        if (listK0 == null || listK0.isEmpty()) {
            return;
        }
        int i2 = ((ge) q40.w0(listK0)).c;
        h03 h03Var = c02.a;
        h03 h03Var2 = new h03(1);
        h03Var2.a(i2);
        int size2 = listK0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            ge geVar2 = (ge) listK0.get(i3);
            while (true) {
                int i4 = h03Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    kf2.m("IntList is empty.");
                    throw null;
                }
                int i5 = h03Var2.a[i4 - 1];
                if (geVar2.b < i5) {
                    int i6 = geVar2.c;
                    if (i6 > i5) {
                        dz1.a("Paragraph overlap not allowed, end " + i6 + " should be less than or equal to " + i5);
                        break;
                    }
                    break;
                }
                h03Var2.c(i4 - 1);
            }
            h03Var2.a(geVar2.c);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.o.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return h12.c(this.o, heVar.o) && h12.c(this.n, heVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.o.hashCode() * 31;
        List list = this.n;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.o.length();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            dz1.a("start (" + i + ") should be less or equal to end (" + i2 + ")");
        }
        String str = this.o;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        int i3 = ie.a;
        if (i > i2) {
            dz1.a("start (" + i + ") should be less than or equal to end (" + i2 + ")");
        }
        List list = this.n;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ge geVar = (ge) list.get(i4);
                int i5 = geVar.b;
                int i6 = geVar.c;
                if (ie.a(i, i2, i5, i6)) {
                    arrayList.add(new ge(Math.max(i, geVar.b) - i, Math.min(i2, i6) - i, geVar.a, geVar.d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new he(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.o;
    }

    public /* synthetic */ he(String str) {
        this(str, u01.n);
    }

    public he(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
