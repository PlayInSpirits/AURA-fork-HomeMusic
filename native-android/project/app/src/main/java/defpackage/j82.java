package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j82 extends r14 implements wf1 {
    public on3 o;
    public on3 p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ lm0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(lm0 lm0Var, vd0 vd0Var) {
        super(vd0Var);
        this.s = lm0Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        j82 j82Var = new j82(this.s, vd0Var);
        j82Var.r = obj;
        return j82Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((j82) create((hp4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007d A[LOOP:0: B:20:0x006c->B:24:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005e -> B:19:0x0062). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            lm0 r0 = r13.s
            zd3 r0 = r0.c
            int r1 = r13.q
            r2 = 0
            ln3 r3 = defpackage.ln3.n
            r4 = 2
            r5 = 1
            xe0 r6 = defpackage.xe0.n
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1f
            on3 r1 = r13.p
            on3 r2 = r13.o
            java.lang.Object r5 = r13.r
            hp4 r5 = (defpackage.hp4) r5
            defpackage.kb4.X(r14)
            goto L62
        L1f:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r13)
            return r2
        L25:
            java.lang.Object r1 = r13.r
            hp4 r1 = (defpackage.hp4) r1
            defpackage.kb4.X(r14)
            goto L40
        L2d:
            defpackage.kb4.X(r14)
            java.lang.Object r14 = r13.r
            r1 = r14
            hp4 r1 = (defpackage.hp4) r1
            r13.r = r1
            r13.q = r5
            java.lang.Object r14 = defpackage.vq4.a(r1, r3, r13)
            if (r14 != r6) goto L40
            goto L5d
        L40:
            on3 r14 = (defpackage.on3) r14
            g83 r5 = new g83
            r7 = 0
            r5.<init>(r7)
            r0.setValue(r5)
            r5 = r1
        L4d:
            if (r2 != 0) goto L8c
            r13.r = r5
            r13.o = r14
            r13.p = r2
            r13.q = r4
            java.lang.Object r1 = r5.a(r3, r13)
            if (r1 != r6) goto L5e
        L5d:
            return r6
        L5e:
            r12 = r2
            r2 = r14
            r14 = r1
            r1 = r12
        L62:
            kn3 r14 = (defpackage.kn3) r14
            java.util.List r7 = r14.a
            int r8 = r7.size()
            r9 = 0
            r10 = r9
        L6c:
            if (r10 >= r8) goto L80
            java.lang.Object r11 = r7.get(r10)
            on3 r11 = (defpackage.on3) r11
            boolean r11 = defpackage.gi1.h(r11)
            if (r11 != 0) goto L7d
            r14 = r2
            r2 = r1
            goto L4d
        L7d:
            int r10 = r10 + 1
            goto L6c
        L80:
            java.util.List r14 = r14.a
            java.lang.Object r14 = r14.get(r9)
            on3 r14 = (defpackage.on3) r14
            r12 = r2
            r2 = r14
            r14 = r12
            goto L4d
        L8c:
            long r1 = r2.c
            long r13 = r14.c
            long r13 = defpackage.g83.d(r1, r13)
            g83 r1 = new g83
            r1.<init>(r13)
            r0.setValue(r1)
            j15 r13 = defpackage.j15.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j82.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
