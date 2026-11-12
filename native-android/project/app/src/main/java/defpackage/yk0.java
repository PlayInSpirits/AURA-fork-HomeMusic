package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 implements gn1 {
    public final /* synthetic */ al0 n;

    public yk0(al0 r1) {
        this.n = r1;
    }

    @Override // defpackage.gn1
    public final void a() {
        this.n.r.remove(this);
    }

    @Override // defpackage.gn1
    public final boolean b(Uri r9, x7 r10, boolean r11) {
        al0 r8 = this.n;
        HashMap r12 = r8.q;
        if (r8.y != null) goto L39;
        long r2 = SystemClock.elapsedRealtime();
        cn1 r0 = r8.w;
        String r4 = f35.a;
        List r1 = r0.e;
        int r5 = 0;
        int r6 = 0;
    L6:
        if (r5 >= r1.size()) goto L13;
        zk0 r7 = (zk0) r12.get(((bn1) r1.get(r5)).a);
        if (r7 == null) goto L12;
        if (r2 >= r7.u) goto L12;
        r6 = r6 + 1;
    L12:
        r5 = r5 + 1;
        goto L6
    L13:
        int r3 = r8.w.e.size();
        r8.p.getClass();
        IOException r13 = (IOException) r10.p;
        if ((r13 instanceof HttpDataSource$InvalidResponseCodeException) == false) goto L31;
        int r14 = ((HttpDataSource$InvalidResponseCodeException) r13).p;
        if (r14 == 403) goto L29;
        if (r14 == 404) goto L29;
        if (r14 == 410) goto L29;
        if (r14 == 416) goto L29;
        if (r14 == 500) goto L29;
        if (r14 != 503) goto L31;
    L29:
        if ((r3 - r6) <= 1) goto L31;
        dd2 r15 = new dd2(2, 60000);
    L32:
        if (r15 == null) goto L39;
        if (r15.a != 2) goto L39;
        zk0 r16 = (zk0) r12.get(r9);
        if (r16 == null) goto L39;
        return zk0.a(r16, r15.b);
    L31:
        r15 = null;
    L39:
        return false;
    }
}
