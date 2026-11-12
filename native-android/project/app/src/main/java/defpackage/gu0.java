package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 {
    public static final gu0 b = new gu0(2);
    public static final gu0 c = new gu0(0);
    public static final gu0 d;
    public static final gu0 e;
    public static final gu0 f;
    public static final ab3 g;
    public static final boolean h;
    public final /* synthetic */ int a;

    static {
        gu0 gu0Var = new gu0(1);
        d = gu0Var;
        e = new gu0(3);
        f = gu0Var;
        g = ab3.a(gu0Var, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ gu0(int i) {
        this.a = i;
    }

    public final int a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                if (b(i, i2, i3, i4) == 1.0f) {
                    return 2;
                }
                return b.a(i, i2, i3, i4);
            case 1:
                return 2;
            case 2:
                return h ? 2 : 1;
            default:
                return 2;
        }
    }

    public final float b(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.min(1.0f, b.b(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (h) {
                    return Math.min(i3 / i, i4 / i2);
                }
                int iMax = Math.max(i2 / i4, i / i3);
                if (iMax == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(iMax);
            default:
                return 1.0f;
        }
    }
}
