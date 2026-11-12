package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int n;

    public /* synthetic */ u6(int i) {
        this.n = i;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0180 A[Catch: all -> 0x012d, TryCatch #8 {all -> 0x012d, blocks: (B:53:0x00d5, B:55:0x00fc, B:59:0x0105, B:61:0x0109, B:64:0x0111, B:67:0x0118, B:69:0x0120, B:72:0x0131, B:74:0x0139, B:81:0x014d, B:90:0x0166, B:92:0x0180, B:93:0x018c, B:84:0x0156, B:87:0x015f), top: B:230:0x00d5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v7 java.lang.Object, still in use, count: 2, list:
          (r9v7 java.lang.Object) from 0x0246: PHI (r9 I:??) = (r9v1 java.lang.Object), (r9v7 java.lang.Object) binds: [B:145:0x0245, B:142:0x0241] A[DONT_GENERATE, DONT_INLINE]
          (r9v7 java.lang.Object) from 0x0237: CHECK_CAST (vz) (r9v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6.run():void");
    }
}
