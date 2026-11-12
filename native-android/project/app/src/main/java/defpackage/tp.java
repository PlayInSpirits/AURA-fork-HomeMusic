package defpackage;

import androidx.work.impl.WorkDatabase;
import com.eddyizm.tempus.lan.LanReceiverService;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int r0 = this.a;
        int r1 = 0;
        Object r7 = this.b;
        switch(r0) {
            case 0: goto L16;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        boolean r2 = LanReceiverService.y;
        return ((gf1) r7).invoke();
    L6:
        WorkDatabase r8 = ((rv1) r7).a;
        Long r3 = r8.w().l("next_alarm_manager_id");
        if (r3 == null) goto L9;
        int r4 = (int) r3.longValue();
    L11:
        if (r4 == Integer.MAX_VALUE) goto L14;
        r1 = r4 + 1;
    L14:
        r8.w().n(new fp3("next_alarm_manager_id", Long.valueOf(r1)));
        return Integer.valueOf(r4);
    L9:
        r4 = 0;
        goto L11
    L16:
        ArrayList r9 = (ArrayList) r7;
        ArrayList r5 = new ArrayList();
        int r6 = r9.size();
    L17:
        if (r1 >= r6) goto L24;
        Object r10 = r9.get(r1);
        r1 = r1 + 1;
        kd3 r11 = (kd3) r10;
        int r12 = ((Number) r11.n).intValue();
        Object r13 = r11.o;
        r13.getClass();
        gn2 r14 = (gn2) r13;
        gn2 r15 = gi1.J(r14);
        if (h12.c(r15.f.a, r14.f.a) == true) goto L21;
        kd3 r16 = new kd3(Integer.valueOf(r12), r15);
    L22:
        if (r16 == null) goto L17;
        r5.add(r16);
        goto L17
    L21:
        r16 = null;
        goto L22
    L24:
        return r5;
    }
}
