package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qv3 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public Object p;
    public int q;
    public Object r;
    public Object s;
    public /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qv3(Object obj, Object obj2, Object obj3, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                qv3 qv3Var = new qv3((tv3) this.s, (sv3) this.t, (ed) obj2, vd0Var, 0);
                qv3Var.p = obj;
                return qv3Var;
            case 1:
                qv3 qv3Var2 = new qv3((gf1) obj2, vd0Var);
                qv3Var2.t = obj;
                return qv3Var2;
            default:
                qv3 qv3Var3 = new qv3((hw4) this.s, (g74) this.t, (jx3) obj2, vd0Var, 2);
                qv3Var3.p = obj;
                return qv3Var3;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((qv3) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 1:
                ((qv3) create((q81) obj, (vd0) obj2)).invokeSuspend(j15Var);
                return xe0.n;
            default:
                return ((qv3) create((e74) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02d9 A[Catch: all -> 0x0303, TryCatch #2 {all -> 0x0303, blocks: (B:103:0x02c6, B:104:0x02cc, B:106:0x02d1, B:107:0x02d2, B:109:0x02d9, B:111:0x02e7, B:113:0x02ed, B:116:0x02f3, B:118:0x02f7, B:119:0x02fb, B:120:0x02fe, B:124:0x0305, B:144:0x0354, B:145:0x0355, B:105:0x02cd), top: B:174:0x02c6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02e7 A[Catch: all -> 0x0303, TryCatch #2 {all -> 0x0303, blocks: (B:103:0x02c6, B:104:0x02cc, B:106:0x02d1, B:107:0x02d2, B:109:0x02d9, B:111:0x02e7, B:113:0x02ed, B:116:0x02f3, B:118:0x02f7, B:119:0x02fb, B:120:0x02fe, B:124:0x0305, B:144:0x0354, B:145:0x0355, B:105:0x02cd), top: B:174:0x02c6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ed A[Catch: all -> 0x0303, TryCatch #2 {all -> 0x0303, blocks: (B:103:0x02c6, B:104:0x02cc, B:106:0x02d1, B:107:0x02d2, B:109:0x02d9, B:111:0x02e7, B:113:0x02ed, B:116:0x02f3, B:118:0x02f7, B:119:0x02fb, B:120:0x02fe, B:124:0x0305, B:144:0x0354, B:145:0x0355, B:105:0x02cd), top: B:174:0x02c6, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x0320  */
    /* JADX WARN: Code duplicated, block: B:127:0x0322  */
    /* JADX WARN: Code duplicated, block: B:132:0x0331 A[Catch: all -> 0x0335, TryCatch #5 {all -> 0x0335, blocks: (B:130:0x032d, B:132:0x0331, B:135:0x0337, B:137:0x033d), top: B:179:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:137:0x033d A[Catch: all -> 0x0335, TRY_LEAVE, TryCatch #5 {all -> 0x0335, blocks: (B:130:0x032d, B:132:0x0331, B:135:0x0337, B:137:0x033d), top: B:179:0x032d }] */
    /* JADX WARN: Code duplicated, block: B:172:0x02cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x032d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a5 A[Catch: all -> 0x013f, PHI: r2 r4 r7 r8
  0x01a5: PHI (r2v21 java.lang.Object) = (r2v20 java.lang.Object), (r2v25 java.lang.Object) binds: [B:43:0x01a2, B:35:0x0158] A[DONT_GENERATE, DONT_INLINE]
  0x01a5: PHI (r4v27 ??) = (r4v41 ??), (r4v42 ??) binds: [B:43:0x01a2, B:35:0x0158] A[DONT_GENERATE, DONT_INLINE]
  0x01a5: PHI (r7v15 ??) = (r7v44 ??), (r7v45 ??) binds: [B:43:0x01a2, B:35:0x0158] A[DONT_GENERATE, DONT_INLINE]
  0x01a5: PHI (r8v8 q81) = (r8v7 q81), (r8v12 q81) binds: [B:43:0x01a2, B:35:0x0158] A[DONT_GENERATE, DONT_INLINE], TryCatch #8 {all -> 0x013f, blocks: (B:35:0x0158, B:45:0x01a5, B:42:0x0194, B:47:0x01af, B:29:0x013b), top: B:185:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x01af A[Catch: all -> 0x013f, TRY_LEAVE, TryCatch #8 {all -> 0x013f, blocks: (B:35:0x0158, B:45:0x01a5, B:42:0x0194, B:47:0x01af, B:29:0x013b), top: B:185:0x0124 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [rp] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [y00] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, y00] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, y00] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r7v12, types: [pz1] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, pz1] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, pz1] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0082 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01ad -> B:42:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01c1 -> B:42:0x0194). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv3(gf1 gf1Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.o = 1;
        this.u = gf1Var;
    }
}
