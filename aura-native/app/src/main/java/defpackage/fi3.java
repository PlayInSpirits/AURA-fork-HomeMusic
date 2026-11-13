package defpackage;

import android.content.Context;
import android.util.Range;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class fi3 {
    public final Context a;
    public final e55 b;
    public ii3 c;
    public boolean d;
    public vp4 e;
    public boolean f;
    public long g = 15000;
    public final f55 h;

    public fi3(Context context, e55 e55Var) {
        this.a = context.getApplicationContext();
        this.b = e55Var;
        f55 f55Var = new f55();
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        f55Var.d = range;
        f55Var.c = ((Double) range.getUpper()).doubleValue();
        f55Var.a = -9223372036854775807L;
        f55Var.b = -9223372036854775807L;
        this.h = f55Var;
        this.e = vp4.a;
    }
}
