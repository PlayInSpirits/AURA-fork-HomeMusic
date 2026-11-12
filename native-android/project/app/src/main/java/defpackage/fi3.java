package defpackage;

import android.content.Context;
import android.util.Range;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fi3 {
    public final Context a;
    public final e55 b;
    public ii3 c;
    public boolean d;
    public vp4 e;
    public boolean f;
    public long g;
    public final f55 h;

    public fi3(Context r4, e55 r5) {
        this.a = r4.getApplicationContext();
        this.b = r5;
        this.g = 15000;
        f55 r6 = new f55();
        Range r7 = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        r6.d = r7;
        r6.c = ((Double) r7.getUpper()).doubleValue();
        r6.a = -9223372036854775807L;
        r6.b = -9223372036854775807L;
        this.h = r6;
        this.e = vp4.a;
    }
}
