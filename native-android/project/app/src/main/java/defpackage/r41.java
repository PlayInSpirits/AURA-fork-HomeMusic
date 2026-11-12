package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class r41 {
    public final sv4 a;
    public final int[] b;

    public r41(sv4 r4, int... r5) {
        if (r5.length != 0) goto L5;
        l93.G("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
    L5:
        this.a = r4;
        this.b = r5;
    }
}
