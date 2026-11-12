package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp1 implements ac4 {
    public static final sp1 b = new sp1(0);
    public final /* synthetic */ int a;

    public /* synthetic */ sp1(int i) {
        this.a = i;
    }

    @Override // defpackage.ac4
    public final ya4 a(long j, r62 r62Var, oo0 oo0Var) {
        switch (this.a) {
            case 0:
                float fV = oo0Var.V(30.0f);
                return new nb3(new wv3(0.0f, -fV, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fV));
            default:
                return new nb3(bu.d(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
