package defpackage;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class i93 extends rx1 {
    public final /* synthetic */ int d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i93(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        dd5 dd5Var = (dd5) this.b;
        long millis = timeUnit.toMillis(j);
        dd5Var.getClass();
        String str = dd5.y;
        if (millis < 900000) {
            cx.f().k(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        if (j2 < 900000) {
            cx.f().k(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        dd5Var.h = j2 >= 900000 ? j2 : 900000L;
        if (j3 < 300000) {
            cx.f().k(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j3 > dd5Var.h) {
            cx.f().k(str, "Flex duration greater than interval duration; Changed to " + j2);
        }
        dd5Var.i = gb.n(j3, 300000L, dd5Var.h);
    }

    @Override // defpackage.rx1
    public final bd5 c() {
        int i = this.d;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                return new j93((UUID) this.a, (dd5) this.b, (LinkedHashSet) serializable);
            default:
                dd5 dd5Var = (dd5) this.b;
                if (!dd5Var.q) {
                    return new kf3((UUID) this.a, dd5Var, (LinkedHashSet) serializable);
                }
                kf2.n("PeriodicWorkRequests cannot be expedited");
                return null;
        }
    }

    public /* synthetic */ i93(Class cls) {
        super(cls);
    }
}
