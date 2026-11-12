package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends ep4 implements wf1 {
    public final /* synthetic */ int o = 0;
    public jx3 p;
    public jx3 q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ z64 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(jx3 jx3Var, z64 z64Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.q = jx3Var;
        this.t = z64Var;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        z64 z64Var = this.t;
        switch (i) {
            case 0:
                hv0 hv0Var = new hv0(this.q, z64Var, vd0Var);
                hv0Var.s = obj;
                return hv0Var;
            default:
                hv0 hv0Var2 = new hv0(z64Var, vd0Var);
                hv0Var2.s = obj;
                return hv0Var2;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((hv0) create((if1) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((hv0) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[PHI: r7
  0x005f: PHI (r7v15 we0) = (r7v7 we0), (r7v10 we0), (r7v10 we0), (r7v10 we0), (r7v13 we0), (r7v16 we0) binds: [B:19:0x0057, B:52:0x00ec, B:54:0x00f9, B:48:0x00e5, B:34:0x009a, B:12:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8 A[Catch: CancellationException -> 0x00e8, TryCatch #2 {CancellationException -> 0x00e8, blocks: (B:45:0x00d2, B:47:0x00d8, B:51:0x00ea, B:53:0x00ee), top: B:93:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea A[Catch: CancellationException -> 0x00e8, TryCatch #2 {CancellationException -> 0x00e8, blocks: (B:45:0x00d2, B:47:0x00d8, B:51:0x00ea, B:53:0x00ee), top: B:93:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ee A[Catch: CancellationException -> 0x00e8, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00e8, blocks: (B:45:0x00d2, B:47:0x00d8, B:51:0x00ea, B:53:0x00ee), top: B:93:0x00d2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009a -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e5 -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00ec -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f9 -> B:20:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0107 -> B:12:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0153 -> B:83:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0157 -> B:85:0x0159). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:42:0x00ce
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv0(z64 z64Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.t = z64Var;
    }
}
