package defpackage;

import android.content.Context;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements xr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy1(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }

    @Override // defpackage.xr0
    public final void a() {
        int r0 = this.a;
        Object r1 = this.c;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        a.c((Context) r2).q((i73) r1);
        return;
    L6:
        a.c((Context) r2).q((i73) r1);
        return;
    L8:
        ((z82) r2).p.k(r1);
        return;
    L10:
        f13 r3 = ((ty1) r2).a;
        r3.j((qy1) r1);
    }
}
