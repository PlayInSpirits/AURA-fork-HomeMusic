package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j82 extends r14 implements wf1 {
    public on3 o;
    public on3 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ lm0 s;

    public j82(lm0 r1, vd0 r2) {
        this.s = r1;
        super(r2);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r2, vd0 r3) {
        j82 r0 = new j82(this.s, r3);
        r0.r = r2;
        return r0;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r1, Object r2) {
        return ((j82) create((hp4) r1, (vd0) r2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:19:0x0062). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r14) {
        zd3 r0 = this.s.c;
        int r1 = this.q;
        on3 r2 = null;
        ln3 r3 = ln3.n;
        xe0 r6 = xe0.n;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L7;
        on3 r4 = this.p;
        on3 r5 = this.o;
        hp4 r7 = (hp4) this.r;
        kb4.X(r14);
    L19:
        kn3 r15 = (kn3) r14;
        List r8 = r15.a;
        int r9 = r8.size();
        int r10 = 0;
    L20:
        if (r10 >= r9) goto L25;
        if (gi1.h((on3) r8.get(r10)) == false) goto L23;
        r10 = r10 + 1;
        goto L20
    L23:
        on3 r16 = r5;
        r2 = r4;
    L14:
        if (r2 != null) goto L26;
        this.r = r7;
        this.o = r16;
        this.p = r2;
        this.q = 2;
        Object r11 = r7.a(r3, this);
        if (r11 != r6) goto L18;
    L17:
        return r6;
    L18:
        on3 r12 = r2;
        r5 = r16;
        r14 = r11;
        r4 = r12;
        goto L19
    L26:
        r0.setValue(new g83(g83.d(r2.c, r16.c)));
        return j15.a;
    L25:
        on3 r13 = r5;
        r2 = (on3) r15.a.get(0);
        r16 = r13;
        goto L14
    L7:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        hp4 r17 = (hp4) this.r;
        kb4.X(r14);
    L13:
        r16 = (on3) r14;
        r0.setValue(new g83(0));
        r7 = r17;
        goto L14
    L10:
        kb4.X(r14);
        r17 = (hp4) this.r;
        this.r = r17;
        this.q = 1;
        r14 = vq4.a(r17, r3, this);
        if (r14 != r6) goto L13;
        goto L13
    }
}
