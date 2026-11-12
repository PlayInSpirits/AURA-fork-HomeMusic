package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uk3 implements a83 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk3 b;

    public /* synthetic */ uk3(wk3 r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.a83
    public final void b(Object r4) {
        int r0 = this.a;
        boolean r1 = false;
        wk3 r3 = this.b;
        switch(r0) {
            case 0: goto L44;
            case 1: goto L37;
            case 2: goto L33;
            case 3: goto L29;
            case 4: goto L16;
            default: goto L4;
        };
    L4:
        Boolean r5 = (Boolean) r4;
        if (u52.c().a == false) goto L8;
        r3.j0();
        return;
    L8:
        if (r3.w0 == null) goto L47;
        String r2 = (String) r3.u0.b.d();
        yk3 r6 = r3.w0;
        if (r5 != null) goto L12;
    L14:
        r6.q(r2, r1);
        return;
    L12:
        if (r5.booleanValue() == false) goto L14;
        r1 = true;
        goto L14
    L47:
        return;
    L16:
        String r7 = (String) r4;
        if (u52.c().a == false) goto L20;
        r3.j0();
        return;
    L20:
        if (r3.w0 == null) goto L49;
        Boolean r8 = (Boolean) r3.u0.c.d();
        yk3 r9 = r3.w0;
        if (r8 != null) goto L24;
    L26:
        r9.q(r7, r1);
        return;
    L24:
        if (r8.booleanValue() == false) goto L26;
        r1 = true;
        goto L26
    L49:
        return;
    L33:
        List r10 = (List) r4;
        if (u52.c().a == false) goto L50;
        yk3 r11 = r3.w0;
        r11.s = new ArrayList(r10);
        r11.d();
        r3.j0();
        return;
    L50:
        return;
    L37:
        List r12 = (List) r4;
        if (r12 == null) goto L51;
        r3.x0 = (List) r12.stream().map(new bi2(27)).collect(Collectors.toList());
        if (u52.c().a == true) goto L42;
        yk3 r13 = r3.w0;
        r13.s = new ArrayList(r3.x0);
        r13.d();
    L42:
        r3.j0();
        return;
    L51:
        return;
    L44:
        Long r14 = (Long) r4;
        r3.w0.d();
        return;
    L29:
        if (((v52) r4).a == true) goto L31;
        yk3 r15 = r3.w0;
        r15.s = new ArrayList(r3.x0);
        r15.d();
    L31:
        r3.j0();
    }
}
