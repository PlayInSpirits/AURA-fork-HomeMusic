package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vq2 {
    public final qq2 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final om1 d;
    public xk0 e;

    public vq2(qq2 qq2Var, boolean z) {
        this.a = qq2Var;
        this.d = qq2Var.o;
        this.c = z;
    }

    public final wq2 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wq2 wq2Var = (wq2) obj;
            if (wq2Var.b.equals(str)) {
                return wq2Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.o).getPackageName() + " }";
    }
}
