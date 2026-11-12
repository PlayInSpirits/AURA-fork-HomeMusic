package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 extends gb3 implements Serializable {
    public final Comparator[] n;

    public h90(kw kwVar, kw kwVar2) {
        this.n = new Comparator[]{kwVar, kwVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.n;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h90) {
            return Arrays.equals(this.n, ((h90) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.n);
    }

    public final String toString() {
        return b11.q(new StringBuilder("Ordering.compound("), Arrays.toString(this.n), ")");
    }
}
