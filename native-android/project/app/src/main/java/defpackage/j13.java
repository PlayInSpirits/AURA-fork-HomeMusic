package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j13 extends ep4 implements wf1 {
    public l13 o;
    public Object p;
    public sm0 q;
    public k13 r;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ h13 u;
    public final /* synthetic */ k13 v;
    public final /* synthetic */ r w;
    public final /* synthetic */ sm0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j13(h13 h13Var, k13 k13Var, r rVar, sm0 sm0Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.u = h13Var;
        this.v = k13Var;
        this.w = rVar;
        this.x = sm0Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        j13 j13Var = new j13(this.u, this.v, this.w, this.x, vd0Var);
        j13Var.t = obj;
        return j13Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((j13) create((we0) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j13.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
