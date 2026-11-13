package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tm2 {
    public tm2() {
        super();
    }

    public String a;
    public Uri b;
    public String c;
    public um2 d;
    public xm2 e;
    public List f;
    public String g;
    public yw1 h;
    public sm2 i;
    public long j;
    public do2 k;
    public zm2 l;
    public cn2 m;

    public final gn2 a() {
        bn2 bn2Var;
        xm2 xm2Var = this.e;
        rr2.w(((Uri) xm2Var.e) == null || ((UUID) xm2Var.d) != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            xm2 xm2Var2 = this.e;
            bn2Var = new bn2(uri, str, ((UUID) xm2Var2.d) != null ? new ym2(xm2Var2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            bn2Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        um2 um2Var = this.d;
        um2Var.getClass();
        wm2 wm2Var = new wm2(um2Var);
        zm2 zm2Var = this.l;
        zm2Var.getClass();
        an2 an2Var = new an2(zm2Var);
        do2 do2Var = this.k;
        if (do2Var == null) {
            do2Var = do2.K;
        }
        return new gn2(str3, wm2Var, bn2Var, an2Var, do2Var, this.m);
    }
}
