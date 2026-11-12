package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kb1 extends r14 implements wf1 {
    public final /* synthetic */ int o;
    public Object p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ sf1 s;

    public kb1(ne0 r2, wf1 r3, vd0 r4) {
        this.o = 0;
        this.r = r2;
        this.s = r3;
        super(r4);
    }

    @Override // defpackage.jp
    public final vd0 create(Object r3, vd0 r4) {
        int r0 = this.o;
        sf1 r1 = this.s;
        switch(r0) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        kb1 r2 = new kb1((gf1) r1, r4);
        r2.r = r3;
        return r2;
    L6:
        kb1 r5 = new kb1((ne0) this.r, (wf1) r1, r4);
        r5.p = r3;
        return r5;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r0 = this.o;
        j15 r1 = j15.a;
        switch(r0) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((kb1) create((ba4) r3, (vd0) r4)).invokeSuspend(r1);
    L7:
        return ((kb1) create((hp4) r3, (vd0) r4)).invokeSuspend(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [hp4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hp4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [wf1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0040 -> B:14:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x009a -> B:25:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00af -> B:25:0x006a). Please report as a decompilation issue!!! */
    @Override // defpackage.jp
    public final Object invokeSuspend(Object r13) {
        int r0 = this.o;
        j15 r1 = j15.a;
        sf1 r2 = this.s;
        ?? r3 = "call to 'resume' before 'invoke' with coroutine";
        xe0 r4 = xe0.n;
        switch(r0) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        int r5 = this.q;
        if (r5 == 0) goto L9;
        if (r5 != 1) goto L8;
        Object r6 = this.p;
        ba4 r7 = (ba4) this.r;
        kb4.X(r13);
    L14:
        if (r6 == null) goto L55;
    L10:
        Object r14 = ((gf1) r2).invoke();
        if (r14 == null) goto L13;
        this.r = r7;
        this.p = r14;
        this.q = 1;
        r7.b(this, r14);
        return r4;
    L13:
        r6 = null;
        goto L14
    L55:
        return r1;
    L8:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L9:
        kb4.X(r13);
        r7 = (ba4) this.r;
        goto L10
    L16:
        ne0 r8 = (ne0) this.r;
        int r9 = this.q;
        ln3 r10 = ln3.p;
        if (r9 == 0) goto L31;
        if (r9 == 1) goto L28;
        if (r9 == 2) goto L23;
        if (r9 != 3) goto L22;
        hp4 r11 = (hp4) this.p;
        kb4.X(r13);
        ?? r12 = r11;
    L25:
        ?? r15 = r12;
    L33:
        if (gb.L(r8) == false) goto L56;
        this.p = r15;     // Catch: CancellationException -> L41
        this.q = 1;     // Catch: CancellationException -> L41
        if (((wf1) r2).invoke(r15, this) == r4) goto L57;
        r3 = r15;
    L38:
        this.p = r3;     // Catch: CancellationException -> L26
        this.q = 2;     // Catch: CancellationException -> L26
        Object r16 = xl.f(r3, r10, this);     // Catch: CancellationException -> L26
        r12 = r3;
        if (r16 != r4) goto L25;
    L57:
        return r4;
    L41:
        e = move-exception;
        r3 = r15;
        e = e;
    L44:
        if (gb.L(r8) == false) goto L48;
        this.p = r3;
        this.q = 3;
        Object r17 = xl.f(r3, r10, this);
        r12 = r3;
        if (r17 != r4) goto L25;
    L48:
        throw e;
    L56:
        return r1;
    L22:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L23:
        hp4 r18 = (hp4) this.p;
        kb4.X(r13);     // Catch: CancellationException -> L26
        r12 = r18;
        goto L25
    L28:
        hp4 r19 = (hp4) this.p;
        kb4.X(r13);     // Catch: CancellationException -> L26
        r3 = r19;
        goto L38
    L31:
        kb4.X(r13);
        r15 = (hp4) this.p;
    L26:
        e = e;
        goto L44
    }

    public kb1(gf1 r2, vd0 r3) {
        this.o = 1;
        this.s = r2;
        super(r3);
    }
}
