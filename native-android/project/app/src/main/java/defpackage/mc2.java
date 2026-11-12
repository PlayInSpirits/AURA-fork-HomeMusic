package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mc2 extends nc2 {
    public final oh0 a;

    public mc2() {
        this.a = oh0.b;
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (mc2.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.a.equals(((mc2) r3).a);
    }

    public final int hashCode() {
        int r0 = mc2.class.getName().hashCode() * 31;
        return this.a.hashCode() + r0;
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
