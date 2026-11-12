package defpackage;

import com.eddyizm.tempus.service.MediaService;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j52 implements oi3 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ j52(int r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.oi3
    public final void B(qi3 r6, ni3 r7) {
        int r0 = this.n;
        boolean r2 = true;
        Object r5 = this.o;
        switch(r0) {
            case 0: goto L31;
            case 1: goto L13;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        w12 r8 = (w12) r5;
        ((zm4) r8.h).a();
        ((an4) r8.i).a();
        ((bn4) r8.j).a();
        ((cn4) r8.k).a();
        return;
    L6:
        r6.getClass();
        w71 r9 = r7.a;
        if (r9.a.get(1) == false) goto L10;
        is3.d = false;
    L10:
        if (r9.a(new int[]{0, 1, 4, 8, 9}) == false) goto L33;
        is3.a(r6, (MediaService) r5);
        return;
    L33:
        return;
    L13:
        w71 r10 = r7.a;
        if (r10.a.get(1) == true) goto L20;
        if (r10.a.get(5) == true) goto L20;
        if (r10.a.get(4) == true) goto L20;
        return;
    L20:
        if (r6.a() == null) goto L22;
        String r11 = r6.a().a;
    L24:
        if (r6.g() == 3) goto L26;
    L28:
        r2 = false;
    L29:
        ((li3) ((om1) r5).o).c(r11, r2);
        return;
    L26:
        if (r6.q() == false) goto L28;
    L22:
        r11 = null;
        goto L24
    L31:
        r6.getClass();
        ((ArrayBlockingQueue) r5).offer(Boolean.TRUE);
    }
}
