package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class iy4 extends ep4 implements wf1 {
    public y73[] o;
    public jy4 p;
    public mw4 q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final /* synthetic */ y73[] v;
    public final /* synthetic */ jy4 w;
    public final /* synthetic */ mw4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy4(y73[] y73VarArr, jy4 jy4Var, mw4 mw4Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.v = y73VarArr;
        this.w = jy4Var;
        this.x = mw4Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        return new iy4(this.v, this.w, this.x, vd0Var);
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((iy4) create((ao3) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.u
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.t
            int r4 = r11.s
            int r5 = r11.r
            mw4 r6 = r11.q
            jy4 r7 = r11.p
            y73[] r8 = r11.o
            defpackage.kb4.X(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r11)
            return r1
        L21:
            defpackage.kb4.X(r12)
            y73[] r12 = r11.v
            int r0 = r12.length
            r4 = 0
            jy4 r5 = r11.w
            mw4 r6 = r11.x
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            xe0 r10 = defpackage.xe0.n
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.o = r8
            r11.p = r7
            r11.q = r6
            r11.r = r9
            r11.s = r4
            r11.t = r0
            r11.u = r2
            java.lang.Object r12 = defpackage.jy4.d(r7, r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.er1.n()
            return r1
        L5d:
            r11.o = r8
            r11.p = r7
            r11.q = r6
            r11.r = r9
            r11.s = r4
            r11.t = r0
            r11.u = r3
            java.lang.Object r12 = defpackage.jy4.c(r7, r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            j15 r11 = defpackage.j15.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
