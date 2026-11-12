package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn2 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ bj2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ List r;

    public /* synthetic */ xn2(bj2 r2, int r3, int r4, ArrayList r5) {
        this.n = 1;
        this.o = r2;
        this.p = r3;
        this.q = r4;
        this.r = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        List r2 = this.r;
        int r3 = this.q;
        int r4 = this.p;
        bj2 r7 = this.o;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        int r5 = r3 + 1;
        r7.P(r4, r5);
        r7.w0(((ArrayList) r2).subList(r4, r5));
        return;
    L6:
        ArrayList r1 = gi1.M(r2);
        new Handler(Looper.getMainLooper()).post(new xn2(r7, r4, r3, r1));
        new vs3().c(r2, true, 0);
    }

    public /* synthetic */ xn2(List r2, bj2 r3, int r4, int r5) {
        this.n = 0;
        this.r = r2;
        this.o = r3;
        this.p = r4;
        this.q = r5;
    }
}
