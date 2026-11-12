package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i93 extends rx1 {
    public final /* synthetic */ int d;

    public i93(Class r12, long r13, TimeUnit r15) {
        this.d = 1;
        r15.getClass();
        super(r12);
        dd5 r11 = (dd5) this.b;
        long r14 = r15.toMillis(r13);
        r11.getClass();
        String r16 = dd5.y;
        long r0 = 900000;
        if (r14 >= 900000) goto L5;
        cx.f().k(r16, "Interval duration lesser than minimum allowed value; Changed to 900000");
    L5:
        if (r14 >= 900000) goto L7;
        long r3 = 900000;
    L8:
        if (r14 >= 900000) goto L10;
        long r5 = 900000;
    L12:
        if (r3 >= 900000) goto L14;
        cx.f().k(r16, "Interval duration lesser than minimum allowed value; Changed to 900000");
    L14:
        if (r3 < 900000) goto L17;
        r0 = r3;
    L17:
        r11.h = r0;
        if (r5 >= 300000) goto L21;
        cx.f().k(r16, "Flex duration lesser than minimum allowed value; Changed to 300000");
    L21:
        if (r5 <= r11.h) goto L23;
        cx.f().k(r16, "Flex duration greater than interval duration; Changed to " + r3);
    L23:
        r11.i = gb.n(r5, 300000, r11.h);
        return;
    L10:
        r5 = r14;
        goto L12
    L7:
        r3 = r14;
        goto L8
    }

    @Override // defpackage.rx1
    public final bd5 c() {
        int r0 = this.d;
        Serializable r1 = this.c;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        dd5 r2 = (dd5) this.b;
        if (r2.q == false) goto L11;
        kf2.n("PeriodicWorkRequests cannot be expedited");
        return null;
    L11:
        return new kf3((UUID) this.a, r2, (LinkedHashSet) r1);
    L10:
        return new j93((UUID) this.a, (dd5) this.b, (LinkedHashSet) r1);
    }

    public /* synthetic */ i93(Class r2) {
        this.d = 0;
        super(r2);
    }
}
