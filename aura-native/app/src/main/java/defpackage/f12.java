package defpackage;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class f12 {
    public final int a;
    public final int b;
    public final wo0 c;

    public f12(int i, int i2, wo0 wo0Var) {
        this.a = i;
        this.b = i2;
        this.c = wo0Var;
        if (i < 0) {
            fz1.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        fz1.a("size should be > 0");
    }
}
