package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends r14 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(Object obj, vd0 vd0Var, int i) {
        super(vd0Var);
        this.o = i;
        this.r = obj;
    }

    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                sb sbVar = new sb((tb) obj2, vd0Var, 0);
                sbVar.q = obj;
                return sbVar;
            default:
                sb sbVar2 = new sb((View) obj2, vd0Var, 1);
                sbVar2.q = obj;
                return sbVar2;
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.o;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((sb) create((hp4) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((sb) create((ba4) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[LOOP:1: B:45:0x00e1->B:49:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b4 -> B:38:0x00b7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
