package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 extends r14 implements wf1 {
    public bh1 o;
    public z03 p;
    public long[] q;
    public int r;
    public int s;
    public int t;
    public int u;
    public long v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z03 y;
    public final /* synthetic */ bh1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y03(z03 z03Var, bh1 bh1Var, vd0 vd0Var) {
        super(vd0Var);
        this.y = z03Var;
        this.z = bh1Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        y03 y03Var = new y03(this.y, this.z, vd0Var);
        y03Var.x = obj;
        return y03Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((y03) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.w
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.u
            int r5 = r0.t
            long r6 = r0.v
            int r8 = r0.s
            int r9 = r0.r
            long[] r10 = r0.q
            z03 r11 = r0.p
            bh1 r12 = r0.o
            java.lang.Object r13 = r0.x
            ba4 r13 = (defpackage.ba4) r13
            defpackage.kb4.X(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.kf2.o(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.kb4.X(r21)
            java.lang.Object r1 = r0.x
            ba4 r1 = (defpackage.ba4) r1
            z03 r5 = r0.y
            x03 r6 = r5.o
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            bh1 r8 = r0.z
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.o = r2
            x03 r3 = r11.o
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.x = r13
            r0.o = r12
            r0.p = r11
            r0.q = r10
            r0.r = r9
            r0.s = r8
            r0.v = r6
            r0.t = r5
            r0.u = r1
            r0.w = r4
            r13.b(r0, r2)
            xe0 r0 = defpackage.xe0.n
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            j15 r0 = defpackage.j15.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y03.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
