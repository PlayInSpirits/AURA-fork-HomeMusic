package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ii1 extends ContextWrapper {
    public static final ch1 k = new ch1();
    public final qj0 a;
    public final sd0 b;
    public final tv1 c;
    public final fi1 d;
    public final List e;
    public final oi f;
    public final i11 g;
    public final d34 h;
    public final int i;
    public g04 j;

    public ii1(Context context, qj0 qj0Var, ll llVar, tv1 tv1Var, fi1 fi1Var, oi oiVar, List list, i11 i11Var, d34 d34Var, int i) {
        super(context.getApplicationContext());
        this.a = qj0Var;
        this.c = tv1Var;
        this.d = fi1Var;
        this.e = list;
        this.f = oiVar;
        this.g = i11Var;
        this.h = d34Var;
        this.i = i;
        this.b = new sd0(llVar);
    }

    public final ey3 a() {
        return (ey3) this.b.get();
    }
}
