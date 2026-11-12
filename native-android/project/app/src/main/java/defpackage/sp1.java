package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sp1 implements ac4 {
    public static final sp1 b = null;
    public final /* synthetic */ int a;

    static {
        b = new sp1(0);
    }

    public /* synthetic */ sp1(int r1) {
        this.a = r1;
    }

    @Override // defpackage.ac4
    public final ya4 a(long r5, r62 r7, oo0 r8) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        float r4 = r8.V(30.0f);
        return new nb3(new wv3(0.0f, -r4, Float.intBitsToFloat((int) (r5 >> 32)), Float.intBitsToFloat((int) (r5 & 4294967295L)) + r4));
    L5:
        return new nb3(bu.d(0, r5));
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        return "RectangleShape";
    L5:
        return super.toString();
    }
}
