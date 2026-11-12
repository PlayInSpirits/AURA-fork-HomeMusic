package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x70 extends ep4 implements wf1 {
    public final /* synthetic */ int o;
    public int p;
    public Object q;
    public Object r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x70(Object obj, Object obj2, Object obj3, Object obj4, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.q = obj;
        this.r = obj2;
        this.s = obj3;
        this.t = obj4;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.io.Serializable, java.lang.String[]] */
    @Override // defpackage.jp
    public final vd0 create(Object obj, vd0 vd0Var) {
        int i = this.o;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                return new x70((a80) this.q, (ScrollCaptureSession) this.r, (Rect) this.s, (Consumer) obj2, vd0Var, 0);
            case 1:
                return new x70((c52) this.q, (dd5) this.r, (AtomicInteger) this.s, (ic2) obj2, vd0Var, 1);
            case 2:
                return new x70((ConstraintTrackingWorker) this.q, (oc2) this.r, (c52) this.s, (dd5) obj2, vd0Var, 2);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                x70 x70Var = new x70((p81) this.r, (nl4) this.s, (Float) obj2, vd0Var, 3);
                x70Var.q = obj;
                return x70Var;
            case 4:
                return new x70((il4) this.q, (p81) this.r, (nl4) this.s, (Float) obj2, vd0Var, 4);
            case 5:
                x70 x70Var2 = new x70((b13) this.s, (ty1) obj2, vd0Var);
                x70Var2.r = obj;
                return x70Var2;
            case 6:
                x70 x70Var3 = new x70((hw4) obj2, vd0Var);
                x70Var3.s = obj;
                return x70Var3;
            case 7:
                x70 x70Var4 = new x70((jy4) this.r, (int[]) this.s, (String[]) obj2, vd0Var, 7);
                x70Var4.q = obj;
                return x70Var4;
            case 8:
                return new x70((jx3) this.q, (tv3) this.r, (ba2) this.s, (ed1) obj2, vd0Var, 8);
            default:
                return new x70((oc2) this.q, (dd5) this.r, (qc5) this.s, (Context) obj2, vd0Var, 9);
        }
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.o;
        xe0 xe0Var = xe0.n;
        j15 j15Var = j15.a;
        switch (i) {
            case 0:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 1:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 2:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((x70) create((gd4) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 4:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 5:
                ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
                return xe0Var;
            case 6:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            case 7:
                ((x70) create((q81) obj, (vd0) obj2)).invokeSuspend(j15Var);
                return xe0Var;
            case 8:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
            default:
                return ((x70) create((we0) obj, (vd0) obj2)).invokeSuspend(j15Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x025d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0273  */
    /* JADX WARN: Code duplicated, block: B:119:0x0295  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0271 -> B:109:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0292 -> B:109:0x023d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01f9 -> B:86:0x01c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.jp
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x70.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(hw4 hw4Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.o = 6;
        this.t = hw4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x70(Object obj, Object obj2, Serializable serializable, vd0 vd0Var, int i) {
        super(2, vd0Var);
        this.o = i;
        this.r = obj;
        this.s = obj2;
        this.t = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(b13 b13Var, ty1 ty1Var, vd0 vd0Var) {
        super(2, vd0Var);
        this.o = 5;
        this.s = b13Var;
        this.t = ty1Var;
    }
}
