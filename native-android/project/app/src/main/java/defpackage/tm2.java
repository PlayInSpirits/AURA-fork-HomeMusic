package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tm2 {
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
        xm2 r0 = this.e;
        if (((Uri) r0.e) != null) goto L5;
    L8:
        boolean r1 = true;
    L9:
        rr2.w(r1);
        Uri r2 = this.b;
        ym2 r3 = null;
        if (r2 == null) goto L15;
        String r4 = this.c;
        xm2 r5 = this.e;
        if (((UUID) r5.d) == null) goto L14;
        r3 = new ym2(r5);
    L14:
        bn2 r6 = new bn2(r2, r4, r3, this.i, this.f, this.g, this.h, this.j);
    L16:
        String r7 = this.a;
        if (r7 == null) goto L19;
    L18:
        String r8 = r7;
        um2 r9 = this.d;
        r9.getClass();
        wm2 r10 = new wm2(r9);
        zm2 r11 = this.l;
        r11.getClass();
        an2 r12 = new an2(r11);
        do2 r13 = this.k;
        if (r13 != null) goto L25;
        r13 = do2.K;
    L25:
        return new gn2(r8, r10, r6, r12, r13, this.m);
    L19:
        r7 = "";
        goto L18
    L15:
        r6 = null;
        goto L16
    L5:
        if (((UUID) r0.d) != null) goto L8;
        r1 = false;
        goto L9
    }
}
