package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nc {
    public final Path a;
    public RectF b;
    public float[] c;

    public nc(Path path) {
        this.a = path;
    }

    public static void a(nc ncVar, nc ncVar2) {
        ncVar.a.addPath(ncVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(nc ncVar, g34 g34Var) {
        Path.Direction direction;
        if (ncVar.b == null) {
            ncVar.b = new RectF();
        }
        RectF rectF = ncVar.b;
        rectF.getClass();
        float f = g34Var.a;
        long j = g34Var.h;
        long j2 = g34Var.g;
        long j3 = g34Var.f;
        long j4 = g34Var.e;
        rectF.set(f, g34Var.b, g34Var.c, g34Var.d);
        if (ncVar.c == null) {
            ncVar.c = new float[8];
        }
        float[] fArr = ncVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ncVar.a;
        RectF rectF2 = ncVar.b;
        rectF2.getClass();
        float[] fArr2 = ncVar.c;
        fArr2.getClass();
        int iOrdinal = fe3.n.ordinal();
        if (iOrdinal == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iOrdinal != 1) {
                er1.n();
                return;
            }
            direction = Path.Direction.CW;
        }
        path.addRoundRect(rectF2, fArr2, direction);
    }
}
