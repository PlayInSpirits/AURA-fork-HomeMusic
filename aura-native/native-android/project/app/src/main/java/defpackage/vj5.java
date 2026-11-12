package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj5 extends ak5 {
    public final boolean n;

    public vj5(boolean z) {
        this.n = z;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ak5 ak5Var = (ak5) obj;
        int iA = ak5Var.a();
        int iD = ak5.d((byte) -32);
        if (iD != iA) {
            return iD - ak5Var.a();
        }
        return (true != this.n ? 20 : 21) - (true != ((vj5) ak5Var).n ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vj5.class == obj.getClass() && this.n == ((vj5) obj).n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -32)), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return Boolean.toString(this.n);
    }
}
