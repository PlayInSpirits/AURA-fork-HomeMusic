package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zj5 extends ak5 {
    public final String n;

    public zj5(String r1) {
        this.n = r1;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r3) {
        ak5 r4 = (ak5) r3;
        int r0 = r4.a();
        int r1 = ak5.d((byte) 96);
        if (r1 != r0) goto L5;
        String r5 = ((zj5) r4).n;
        int r2 = r5.length();
        String r6 = this.n;
        if (r6.length() == r2) goto L11;
        int r7 = r5.length();
        return r6.length() - r7;
    L11:
        return r6.compareTo(r5);
    L5:
        return r1 - r4.a();
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L8;
        return false;
    L8:
        if (zj5.class == r3.getClass()) goto L12;
        return false;
    L12:
        return this.n.equals(((zj5) r3).n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) 96)), this.n});
    }

    public final String toString() {
        return b11.q(new StringBuilder("\""), this.n, "\"");
    }
}
