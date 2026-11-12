package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vq2 {
    public final qq2 a;
    public final ArrayList b;
    public final boolean c;
    public final om1 d;
    public xk0 e;

    public vq2(qq2 r2, boolean r3) {
        this.b = new ArrayList();
        this.a = r2;
        this.d = r2.o;
        this.c = r3;
    }

    public final wq2 a(String r5) {
        ArrayList r4 = this.b;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L7;
        Object r2 = r4.get(r1);
        r1 = r1 + 1;
        wq2 r3 = (wq2) r2;
        if (r3.b.equals(r5) == false) goto L3;
        return r3;
    L7:
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.o).getPackageName() + " }";
    }
}
