package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vj5 extends ak5 {
    public final boolean n;

    public vj5(boolean r1) {
        this.n = r1;
    }

    @Override // defpackage.ak5
    public final int a() {
        return ak5.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r4) {
        ak5 r5 = (ak5) r4;
        int r0 = r5.a();
        int r1 = ak5.d((byte) -32);
        if (r1 != r0) goto L5;
        vj5 r6 = (vj5) r5;
        int r2 = 21;
        if (true == this.n) goto L9;
        int r3 = 20;
    L11:
        if (true == r6.n) goto L14;
        r2 = 20;
    L14:
        return r3 - r2;
    L9:
        r3 = 21;
        goto L11
    L5:
        return r1 - r5.a();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (vj5.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (this.n != ((vj5) r5).n) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(ak5.d((byte) -32)), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return Boolean.toString(this.n);
    }
}
