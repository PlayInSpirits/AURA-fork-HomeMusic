package defpackage;

import android.content.Context;
import com.eddyizm.tempus.service.MediaService;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n31 implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaService o;

    public /* synthetic */ n31(MediaService r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.go4
    public final Object get() {
        int r0 = this.n;
        MediaService r6 = this.o;
        switch(r0) {
            case 0: goto L21;
            case 1: goto L19;
            case 2: goto L16;
            default: goto L4;
        };
    L4:
        gy3 r1 = vj0.C;
        monitor-enter(vj0.class);
    L9:
        th = move-exception;
        throw th;
    L7:
        if (vj0.I != null) goto L11;
        Context r7 = r6.getApplicationContext();     // Catch: Throwable -> L9
        HashMap r2 = new HashMap(8);     // Catch: Throwable -> L9
        r2.put(0, 1000000L);     // Catch: Throwable -> L9
        r2.put(2, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(3, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(4, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(5, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(10, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(9, -9223372036854775807L);     // Catch: Throwable -> L9
        r2.put(7, -9223372036854775807L);     // Catch: Throwable -> L9
        vj0.I = new vj0(r7, r2);     // Catch: Throwable -> L9
    L11:
        vj0 r8 = vj0.I;     // Catch: Throwable -> L9
        monitor-exit(vj0.class);
        return r8;
    L16:
        rv2 r3 = new rv2(25);
        return new pn0(jn0.F0, r3, r6);
    L19:
        return new dm0(r6, new sk0());
    L21:
        return new pm0(r6);
    }
}
