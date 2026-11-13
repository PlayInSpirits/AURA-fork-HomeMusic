package defpackage;

import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class wh3 implements dg4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ai3 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Button d;
    public final /* synthetic */ Button e;
    public final /* synthetic */ Button[] f;
    public final /* synthetic */ Slider g;
    public final /* synthetic */ MaterialSwitch h;
    public final /* synthetic */ MaterialSwitch i;
    public final /* synthetic */ Slider j;

    public /* synthetic */ wh3(ai3 ai3Var, TextView textView, Button button, Button button2, Button[] buttonArr, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, Slider slider, Slider slider2) {
        this.b = ai3Var;
        this.c = textView;
        this.d = button;
        this.e = button2;
        this.f = buttonArr;
        this.h = materialSwitch;
        this.i = materialSwitch2;
        this.g = slider;
        this.j = slider2;
    }

    @Override // defpackage.dg4
    public final void a(float f, boolean z) {
        int i = this.a;
        Slider slider = this.j;
        MaterialSwitch materialSwitch = this.i;
        MaterialSwitch materialSwitch2 = this.h;
        Slider slider2 = this.g;
        Button[] buttonArr = this.f;
        Button button = this.e;
        Button button2 = this.d;
        TextView textView = this.c;
        ai3 ai3Var = this.b;
        switch (i) {
            case 0:
                float q0 = ai3.q0(ai3.n0(f));
                ai3Var.x0(textView, q0);
                ai3.r0(button2, button, q0);
                ai3.v0(buttonArr[0], q0, materialSwitch2.isChecked(), materialSwitch.isChecked(), ai3.p0(ai3.n0(slider2.getValue())));
                if (z) {
                    slider.setValue(ai3.o0(q0));
                    ud3.r0(q0);
                    vj3 vj3Var = ai3Var.B0;
                    if (vj3Var != null) {
                        vj3Var.a(q0);
                        break;
                    }
                }
                break;
            default:
                float p0 = ai3.p0(ai3.n0(f));
                ai3Var.u0(textView, p0);
                ai3.r0(button2, button, p0);
                ai3.v0(buttonArr[0], ai3.q0(ai3.n0(slider2.getValue())), materialSwitch2.isChecked(), materialSwitch.isChecked(), p0);
                if (z) {
                    slider.setValue(ai3.o0(p0));
                    ud3.s0(p0);
                    vj3 vj3Var2 = ai3Var.B0;
                    if (vj3Var2 != null) {
                        vj3Var2.a(ai3.q0(ai3.n0(slider2.getValue())));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ wh3(ai3 ai3Var, TextView textView, Button button, Button button2, Button[] buttonArr, Slider slider, MaterialSwitch materialSwitch, MaterialSwitch materialSwitch2, Slider slider2) {
        this.b = ai3Var;
        this.c = textView;
        this.d = button;
        this.e = button2;
        this.f = buttonArr;
        this.g = slider;
        this.h = materialSwitch;
        this.i = materialSwitch2;
        this.j = slider2;
    }
}
