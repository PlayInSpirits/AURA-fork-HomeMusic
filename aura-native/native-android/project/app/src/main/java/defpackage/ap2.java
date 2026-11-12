package defpackage;

import android.view.KeyEvent;
import android.widget.SeekBar;
import java.util.Collections;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ap2 extends uo {
    public final /* synthetic */ int u;
    public final /* synthetic */ KeyEvent.Callback v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap2(KeyEvent.Callback callback, int i) {
        super(14);
        this.u = i;
        this.v = callback;
    }

    private final void W() {
    }

    @Override // defpackage.uo
    public void D() {
        switch (this.u) {
            case 0:
                ((cp2) this.v).b();
                break;
        }
    }

    @Override // defpackage.uo
    public void E() {
        switch (this.u) {
            case 0:
                ((cp2) this.v).b();
                break;
        }
    }

    @Override // defpackage.uo
    public void F() {
        switch (this.u) {
            case 0:
                ((cp2) this.v).b();
                break;
        }
    }

    @Override // defpackage.uo
    public void G() {
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 0:
                ((cp2) callback).b();
                break;
            case 1:
                ((ep2) callback).j();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((aq2) callback).i();
                break;
            case 4:
                ((lq2) callback).p();
                break;
        }
    }

    @Override // defpackage.uo
    public final void H(wq2 wq2Var) {
        tq2 tq2VarA;
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 0:
                ((cp2) callback).b();
                break;
            case 1:
                ((ep2) callback).j();
                break;
            case 2:
                ((qp2) callback).t(true);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((aq2) callback).i();
                break;
            default:
                lq2 lq2Var = (lq2) callback;
                if (wq2Var == lq2Var.w && wq2.b() != null) {
                    vq2 vq2Var = wq2Var.a;
                    vq2Var.getClass();
                    yq2.b();
                    for (wq2 wq2Var2 : Collections.unmodifiableList(vq2Var.b)) {
                        if (!Collections.unmodifiableList(lq2Var.w.v).contains(wq2Var2) && (tq2VarA = lq2Var.w.a()) != null && tq2VarA.n(wq2Var2) && !lq2Var.y.contains(wq2Var2)) {
                            lq2Var.q();
                            lq2Var.o();
                            break;
                        }
                    }
                }
                lq2Var.p();
                break;
        }
    }

    @Override // defpackage.uo
    public void I() {
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 0:
                ((cp2) callback).b();
                break;
            case 1:
                ((ep2) callback).j();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((aq2) callback).i();
                break;
            case 4:
                ((lq2) callback).p();
                break;
        }
    }

    @Override // defpackage.uo
    public void J(wq2 wq2Var) {
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 0:
                ((cp2) callback).b();
                break;
            case 1:
                ((ep2) callback).dismiss();
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((aq2) callback).dismiss();
                break;
            case 4:
                lq2 lq2Var = (lq2) callback;
                lq2Var.w = wq2Var;
                lq2Var.q();
                lq2Var.o();
                break;
        }
    }

    @Override // defpackage.uo
    public void K() {
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 0:
                ((cp2) callback).b();
                break;
            case 2:
                ((qp2) callback).t(false);
                break;
            case 4:
                ((lq2) callback).p();
                break;
        }
    }

    @Override // defpackage.uo
    public void L(wq2 wq2Var) {
        dq2 dq2Var;
        int i = this.u;
        KeyEvent.Callback callback = this.v;
        switch (i) {
            case 2:
                qp2 qp2Var = (qp2) callback;
                SeekBar seekBar = (SeekBar) qp2Var.e0.get(wq2Var);
                int i2 = wq2Var.p;
                int i3 = qp2.B0;
                if (seekBar != null && qp2Var.Z != wq2Var) {
                    seekBar.setProgress(i2);
                    break;
                }
                break;
            case 4:
                int i4 = lq2.g0;
                lq2 lq2Var = (lq2) callback;
                if (lq2Var.K != wq2Var && (dq2Var = (dq2) lq2Var.J.get(wq2Var.c)) != null) {
                    int i5 = dq2Var.u.p;
                    dq2Var.t(i5 == 0);
                    dq2Var.w.setProgress(i5);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.uo
    public void M() {
        int i = this.u;
    }
}
