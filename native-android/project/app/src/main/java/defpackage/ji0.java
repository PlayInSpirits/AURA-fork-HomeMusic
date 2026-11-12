package defpackage;

import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 implements vw2 {
    public final /* synthetic */ int a;
    public final Object b;

    public ji0(int r4) {
        this.a = r4;
        switch(r4) {
            case 1: goto L11;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new i80(21);
        return;
    L6:
        n83 r5 = new n83();
        TimeUnit r2 = TimeUnit.MILLISECONDS;
        r5.b(2500, r2);
        r5.z = ze5.b(2500, r2);
        SSLSocketFactory r0 = x30.b;
        if (r0 == null) goto L9;
        r5.c(r0, x30.a);
    L9:
        this.b = new o83(r5);
        return;
    L11:
        this.b = new si1(11);
    }

    @Override // defpackage.vw2
    public final uw2 a(na4 r2) {
        int r3 = this.a;
        Object r1 = this.b;
        switch(r3) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        int r0 = 3;
        return new mw(r0, (o83) r1);
    L8:
        int r4 = 1;
        return new mw(r4, (i80) r1);
    L7:
        return new ar1((si1) r1);
    }
}
