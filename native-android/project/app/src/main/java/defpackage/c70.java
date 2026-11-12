package defpackage;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c70 implements gf1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ nc1 o;

    public /* synthetic */ c70(nc1 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // defpackage.gf1
    public final Object invoke() {
        int r0 = this.n;
        int r1 = 0;
        nc1 r4 = this.o;
        switch(r0) {
            case 0: goto L21;
            case 1: goto L20;
            case 2: goto L17;
            case 3: goto L11;
            default: goto L4;
        };
    L4:
        a93 r2 = new a93(new b70(r4, r1));
        if (Build.VERSION.SDK_INT >= 33) goto L7;
    L10:
        return r2;
    L7:
        if (h12.c(Looper.myLooper(), Looper.getMainLooper()) == true) goto L9;
        new Handler(Looper.getMainLooper()).post(new k6(15, r4, r2));
        goto L10
    L9:
        r4.n.a(new d70(r1, r2, r4));
        goto L10
    L11:
        Application r3 = r4.getApplication();
        if (r4.getIntent() == null) goto L14;
        Bundle r5 = r4.getIntent().getExtras();
    L16:
        return new k54(r3, r4, r5);
    L14:
        r5 = null;
        goto L16
    L17:
        iq0 r6 = new iq0();
        r4.i().b().c.e(r6);
        return r6;
    L21:
        r4.reportFullyDrawn();
        return j15.a;
    L20:
        return new ff1(r4.s, new c70(r4, r1));
    }
}
