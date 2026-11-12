package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qx implements ci0 {
    public final ci0 n;
    public final se4 o;

    public qx(ci0 ci0Var, se4 se4Var) {
        se4Var.getClass();
        this.n = ci0Var;
        this.o = se4Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) {
        Object next;
        long jLongValue;
        List list;
        String str;
        Long lM0;
        ii0Var.getClass();
        ci0 ci0Var = this.n;
        long jB = ci0Var.b(ii0Var);
        String str2 = ii0Var.h;
        if (str2 != null) {
            se4 se4Var = this.o;
            Map mapJ = ci0Var.j();
            mapJ.getClass();
            Iterator it = mapJ.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!"Content-Range".equalsIgnoreCase((String) ((Map.Entry) next).getKey()));
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (list = (List) entry.getValue()) == null || (str = (String) q40.x0(list)) == null || (lM0 = xm4.m0(qm4.K0(qm4.G0(str, '/', "")).toString())) == null) {
                jLongValue = -1;
            } else {
                Long l = lM0.longValue() > 0 ? lM0 : null;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
            }
            if (jLongValue != -1) {
                try {
                    se4Var.getClass();
                    if (nd0.a(se4Var.i(str2)) == -1) {
                        xc5 xc5Var = new xc5(5);
                        xc5Var.m(Long.valueOf(jLongValue), "exo_len");
                        se4Var.c(str2, xc5Var);
                        return jB;
                    }
                } catch (Cache$CacheException e) {
                    Log.w("CacheLength", "length of " + str2 + " not stored: " + e);
                }
            }
        }
        return jB;
    }

    @Override // defpackage.ci0
    public final void c(rw4 rw4Var) {
        rw4Var.getClass();
        this.n.c(rw4Var);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.n.close();
    }

    @Override // defpackage.ci0
    public final Map j() {
        Map mapJ = this.n.j();
        mapJ.getClass();
        return mapJ;
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.n.m();
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        return this.n.read(bArr, i, i2);
    }
}
