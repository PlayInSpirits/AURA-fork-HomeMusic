package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class yk0 implements gn1 {
    public final /* synthetic */ al0 n;

    public yk0(al0 al0Var) {
        this.n = al0Var;
    }

    @Override // defpackage.gn1
    public final void a() {
        this.n.r.remove(this);
    }

    @Override // defpackage.gn1
    public final boolean b(Uri uri, x7 x7Var, boolean z) {
        zk0 zk0Var;
        int i;
        al0 al0Var = this.n;
        HashMap hashMap = al0Var.q;
        if (al0Var.y == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            cn1 cn1Var = al0Var.w;
            String str = f35.a;
            List list = cn1Var.e;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                zk0 zk0Var2 = (zk0) hashMap.get(((bn1) list.get(i3)).a);
                if (zk0Var2 != null && elapsedRealtime < zk0Var2.u) {
                    i2++;
                }
            }
            int size = al0Var.w.e.size();
            al0Var.p.getClass();
            IOException iOException = (IOException) x7Var.p;
            dd2 dd2Var = ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).p) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) && size - i2 > 1) ? new dd2(2, 60000L) : null;
            if (dd2Var != null && dd2Var.a == 2 && (zk0Var = (zk0) hashMap.get(uri)) != null) {
                return zk0.a(zk0Var, dd2Var.b);
            }
        }
        return false;
    }
}
