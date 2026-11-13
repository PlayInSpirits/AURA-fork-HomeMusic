package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class is2 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ al3 g;

    public is2(int i, int i2, int i3, String str, Handler handler, al3 al3Var) {
        this.f = handler;
        this.g = al3Var;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        is2 is2Var;
        if (this.e != null) {
            is2Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            is2Var = this;
            is2Var.e = new q85(is2Var, this.a, this.b, this.d, this.c);
        } else {
            is2Var = this;
            is2Var.e = new x52(is2Var, is2Var.a, is2Var.b, is2Var.d);
        }
        return is2Var.e;
    }
}
