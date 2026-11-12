package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj5 extends ak5 {
    public final String n;

    public zj5(String str) {
        this.n = str;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ak5 ak5Var = (ak5) obj;
        int iA = ak5Var.a();
        int iD = ak5.d((byte) 96);
        if (iD != iA) {
            return iD - ak5Var.a();
        }
        String str = ((zj5) ak5Var).n;
        int length = str.length();
        String str2 = this.n;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zj5.class == obj.getClass()) {
            return this.n.equals(((zj5) obj).n);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) 96)), this.n});
    }

    public final String toString() {
        return b11.q(new StringBuilder("\""), this.n, "\"");
    }
}
