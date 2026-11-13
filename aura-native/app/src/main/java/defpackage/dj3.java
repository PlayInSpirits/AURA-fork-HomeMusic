package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class dj3 implements oi3, View.OnClickListener, PopupWindow.OnDismissListener {
    public final /* synthetic */ PlayerControlView n;

    public dj3(PlayerControlView playerControlView) {
        this.n = playerControlView;
    }

    @Override // defpackage.oi3
    public final void B(qi3 qi3Var, ni3 ni3Var) {
        w71 w71Var = ni3Var.a;
        boolean a = w71Var.a(4, 5, 13);
        PlayerControlView playerControlView = this.n;
        if (a) {
            float[] fArr = PlayerControlView.U0;
            playerControlView.l();
        }
        if (w71Var.a(4, 5, 7, 13)) {
            float[] fArr2 = PlayerControlView.U0;
            playerControlView.n();
        }
        if (w71Var.a(8, 13)) {
            float[] fArr3 = PlayerControlView.U0;
            playerControlView.o();
        }
        if (w71Var.a(9, 13)) {
            float[] fArr4 = PlayerControlView.U0;
            playerControlView.q();
        }
        if (w71Var.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = PlayerControlView.U0;
            playerControlView.k();
        }
        if (w71Var.a(11, 0, 13)) {
            float[] fArr6 = PlayerControlView.U0;
            playerControlView.r();
        }
        if (w71Var.a(12, 13)) {
            float[] fArr7 = PlayerControlView.U0;
            playerControlView.m();
        }
        if (w71Var.a(2, 13)) {
            float[] fArr8 = PlayerControlView.U0;
            playerControlView.s();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView playerControlView = this.n;
        ImageView imageView = playerControlView.Q;
        View view2 = playerControlView.V;
        View view3 = playerControlView.U;
        View view4 = playerControlView.T;
        qj3 qj3Var = playerControlView.n;
        qi3 qi3Var = playerControlView.D0;
        if (qi3Var == null) {
            return;
        }
        qj3Var.g();
        if (playerControlView.H == view) {
            if (qi3Var.S0(9)) {
                qi3Var.H0();
                return;
            }
            return;
        }
        if (playerControlView.G == view) {
            if (qi3Var.S0(7)) {
                qi3Var.S();
                return;
            }
            return;
        }
        if (playerControlView.J == view) {
            if (qi3Var.g() == 4 || !qi3Var.S0(12)) {
                return;
            }
            qi3Var.I0();
            return;
        }
        if (playerControlView.K == view) {
            if (qi3Var.S0(11)) {
                qi3Var.J0();
                return;
            }
            return;
        }
        if (playerControlView.I == view) {
            if (f35.d0(qi3Var, playerControlView.H0)) {
                f35.I(qi3Var);
                return;
            } else {
                if (qi3Var.S0(1)) {
                    qi3Var.c();
                    return;
                }
                return;
            }
        }
        if (playerControlView.N == view) {
            if (qi3Var.S0(15)) {
                int h = qi3Var.h();
                int i = playerControlView.N0;
                for (int i2 = 1; i2 <= 2; i2++) {
                    int i3 = (h + i2) % 3;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2 && (i & 2) != 0) {
                            }
                        } else if ((i & 1) == 0) {
                        }
                    }
                    h = i3;
                }
                qi3Var.p0(h);
                return;
            }
            return;
        }
        if (playerControlView.O == view) {
            if (qi3Var.S0(14)) {
                qi3Var.s(!qi3Var.D0());
                return;
            }
            return;
        }
        if (view4 == view) {
            qj3Var.f();
            playerControlView.d(playerControlView.z, view4);
            return;
        }
        if (view3 == view) {
            qj3Var.f();
            playerControlView.d(playerControlView.A, view3);
        } else if (view2 == view) {
            qj3Var.f();
            playerControlView.d(playerControlView.C, view2);
        } else if (imageView == view) {
            qj3Var.f();
            playerControlView.d(playerControlView.B, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.n;
        if (playerControlView.T0) {
            playerControlView.n.g();
        }
    }
}
