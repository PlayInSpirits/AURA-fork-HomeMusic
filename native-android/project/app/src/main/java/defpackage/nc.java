package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc {
    public final Path a;
    public RectF b;
    public float[] c;

    public nc(Path r1) {
        this.a = r1;
    }

    public static void a(nc r2, nc r3) {
        r2.a.addPath(r3.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(nc r14, g34 r15) {
        if (r14.b != null) goto L5;
        r14.b = new RectF();
    L5:
        RectF r0 = r14.b;
        r0.getClass();
        float r1 = r15.a;
        long r2 = r15.h;
        long r4 = r15.g;
        long r6 = r15.f;
        long r8 = r15.e;
        r0.set(r1, r15.b, r15.c, r15.d);
        if (r14.c != null) goto L8;
        r14.c = new float[8];
    L8:
        float[] r16 = r14.c;
        r16.getClass();
        r16[0] = Float.intBitsToFloat((int) (r8 >> 32));
        r16[1] = Float.intBitsToFloat((int) (r8 & 4294967295L));
        r16[2] = Float.intBitsToFloat((int) (r6 >> 32));
        r16[3] = Float.intBitsToFloat((int) (r6 & 4294967295L));
        r16[4] = Float.intBitsToFloat((int) (r4 >> 32));
        r16[5] = Float.intBitsToFloat((int) (r4 & 4294967295L));
        r16[6] = Float.intBitsToFloat((int) (r2 >> 32));
        r16[7] = Float.intBitsToFloat((int) (r2 & 4294967295L));
        Path r17 = r14.a;
        RectF r3 = r14.b;
        r3.getClass();
        float[] r18 = r14.c;
        r18.getClass();
        int r5 = fe3.n.ordinal();
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L12;
        Path.Direction r7 = Path.Direction.CW;
    L15:
        r17.addRoundRect(r3, r18, r7);
        return;
    L12:
        er1.n();
        return;
    L14:
        r7 = Path.Direction.CCW;
        goto L15
    }
}
