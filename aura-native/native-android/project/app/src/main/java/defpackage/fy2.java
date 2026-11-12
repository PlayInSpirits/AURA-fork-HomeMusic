package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fy2 extends ep4 implements wf1 {
    public fx3 o;
    public fx3 p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gx3 t;
    public final /* synthetic */ jx3 u;
    public final /* synthetic */ jx3 v;
    public final /* synthetic */ float w;
    public final /* synthetic */ hy2 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ g74 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy2(gx3 gx3Var, jx3 jx3Var, jx3 jx3Var2, float f, hy2 hy2Var, float f2, g74 g74Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.t = gx3Var;
        this.u = jx3Var;
        this.v = jx3Var2;
        this.w = f;
        this.x = hy2Var;
        this.y = f2;
        this.z = g74Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        fy2 fy2Var = new fy2(this.t, this.u, this.v, this.w, this.x, this.y, this.z, vd0Var);
        fy2Var.s = obj;
        return fy2Var;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        return ((fy2) create((e74) obj, (vd0) obj2)).invokeSuspend(j15.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0077  */
    /* JADX WARN: Code duplicated, block: B:17:0x0095  */
    /* JADX WARN: Code duplicated, block: B:19:0x009f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:26:0x0139  */
    /* JADX WARN: Code duplicated, block: B:29:0x013e A[EDGE_INSN: B:29:0x013e->B:30:0x0140 BREAK  A[LOOP:0: B:13:0x0071->B:43:0x019c]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:35:0x0163  */
    /* JADX WARN: Code duplicated, block: B:42:0x019a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0163 -> B:36:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0174 -> B:37:0x0171). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
