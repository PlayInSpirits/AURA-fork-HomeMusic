package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 {
    public final int a;
    public final Integer b;

    public d80(int r1, gb r2, Integer r3) {
        this.a = r1;
        this.b = r3;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d80) == true) goto L8;
        return false;
    L8:
        d80 r6 = (d80) r5;
        if (this.a == r6.a) goto L12;
        return false;
    L12:
        if (h12.c(null, null) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.b, r6.b) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r1 = 0;
        int r0 = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer r2 = this.b;
        if (r2 == null) goto L7;
        r1 = r2.hashCode();
    L7:
        return r0 + r1;
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=null, groupOffset=" + this.b + ")";
    }
}
