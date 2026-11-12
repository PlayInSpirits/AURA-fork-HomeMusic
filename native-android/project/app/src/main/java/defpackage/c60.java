package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c60 extends ep4 implements wf1 {
    public y00 o;
    public byte[] p;
    public int q;
    public int r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ p81[] u;
    public final /* synthetic */ zf0 v;
    public final /* synthetic */ kc5 w;
    public final /* synthetic */ q81 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(p81[] p81VarArr, zf0 zf0Var, kc5 kc5Var, q81 q81Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.u = p81VarArr;
        this.v = zf0Var;
        this.w = kc5Var;
        this.x = q81Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        c60 c60Var = new c60(this.u, this.v, this.w, this.x, vd0Var);
        c60Var.t = obj;
        return c60Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((c60) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[DONT_INVERT, EDGE_INSN: B:42:0x00b8->B:20:0x0075 BREAK  A[LOOP:0: B:31:0x0097->B:48:?]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:31:0x0097->B:48:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00dc -> B:20:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c60.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
