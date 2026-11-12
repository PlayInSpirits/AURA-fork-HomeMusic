package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 {
    public static final gu0 b = null;
    public static final gu0 c = null;
    public static final gu0 d = null;
    public static final gu0 e = null;
    public static final gu0 f = null;
    public static final ab3 g = null;
    public static final boolean h = false;
    public final /* synthetic */ int a;

    static {
        b = new gu0(2);
        c = new gu0(0);
        gu0 r0 = new gu0(1);
        d = r0;
        e = new gu0(3);
        f = r0;
        g = ab3.a(r0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        h = true;
    }

    public /* synthetic */ gu0(int r1) {
        this.a = r1;
    }

    public final int a(int r3, int r4, int r5, int r6) {
        switch(this.a) {
            case 0: goto L11;
            case 1: goto L15;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        return 2;
    L15:
        return 2;
    L6:
        if (h == true) goto L16;
        return 1;
    L16:
        return 2;
    L11:
        if (b(r3, r4, r5, r6) != 1.0f) goto L14;
        return 2;
    L14:
        return b.a(r3, r4, r5, r6);
    }

    public final float b(int r2, int r3, int r4, int r5) {
        switch(this.a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        return 1.0f;
    L6:
        if (h == true) goto L17;
        int r1 = Math.max(r3 / r5, r2 / r4);
        if (r1 != 0) goto L12;
        return 1.0f;
    L12:
        return 1.0f / Integer.highestOneBit(r1);
    L17:
        return Math.min(r4 / r2, r5 / r3);
    L14:
        return Math.max(r4 / r2, r5 / r3);
    L16:
        return Math.min(1.0f, b.b(r2, r3, r4, r5));
    }
}
