package defpackage;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class xd5 {
    public static final xd5 a = new xd5();

    public final long a(Paint paint) {
        int i = x40.h;
        long colorLong = paint.getColorLong();
        long j = 63 & colorLong;
        return j < 16 ? colorLong : (colorLong & (-64)) | (j + 1);
    }

    public final void b(Paint paint, int i) {
        paint.setBlendMode(q05.A(i));
    }

    public final void c(Paint paint, long j) {
        int i = (int) (63 & j);
        paint.setColor((i == s50.x.c || i == s50.s.c || i == s50.t.c) ? uc5.Z(x40.a(j, s50.e)) : uc5.Z(j));
    }
}
