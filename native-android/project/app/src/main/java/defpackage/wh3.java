package defpackage;

import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh3 implements dg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai3 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ Button d;
    public final /* synthetic */ Button e;
    public final /* synthetic */ Button[] f;
    public final /* synthetic */ Slider g;
    public final /* synthetic */ MaterialSwitch h;
    public final /* synthetic */ MaterialSwitch i;
    public final /* synthetic */ Slider j;

    public /* synthetic */ wh3(ai3 r2, TextView r3, Button r4, Button r5, Button[] r6, MaterialSwitch r7, MaterialSwitch r8, Slider r9, Slider r10) {
        this.a = 0;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.h = r7;
        this.i = r8;
        this.g = r9;
        this.j = r10;
    }

    @Override // defpackage.dg4
    public final void a(float r11, boolean r12) {
        int r0 = this.a;
        Slider r2 = this.j;
        MaterialSwitch r3 = this.i;
        MaterialSwitch r4 = this.h;
        Slider r5 = this.g;
        Button[] r6 = this.f;
        Button r7 = this.e;
        Button r8 = this.d;
        TextView r9 = this.c;
        ai3 r10 = this.b;
        switch(r0) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        float r13 = ai3.p0(ai3.n0(r11));
        r10.u0(r9, r13);
        ai3.r0(r8, r7, r13);
        ai3.v0(r6[0], ai3.q0(ai3.n0(r5.getValue())), r4.isChecked(), r3.isChecked(), r13);
        if (r12 == false) goto L19;
        r2.setValue(ai3.o0(r13));
        ud3.s0(r13);
        vj3 r14 = r10.B0;
        if (r14 == null) goto L18;
        r14.a(ai3.q0(ai3.n0(r5.getValue())));
        return;
    L18:
        return;
    L19:
        return;
    L11:
        float r15 = ai3.q0(ai3.n0(r11));
        r10.x0(r9, r15);
        ai3.r0(r8, r7, r15);
        ai3.v0(r6[0], r15, r4.isChecked(), r3.isChecked(), ai3.p0(ai3.n0(r5.getValue())));
        if (r12 == false) goto L21;
        r2.setValue(ai3.o0(r15));
        ud3.r0(r15);
        vj3 r16 = r10.B0;
        if (r16 == null) goto L20;
        r16.a(r15);
        return;
    L20:
        return;
    }

    public /* synthetic */ wh3(ai3 r2, TextView r3, Button r4, Button r5, Button[] r6, Slider r7, MaterialSwitch r8, MaterialSwitch r9, Slider r10) {
        this.a = 1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
        this.e = r5;
        this.f = r6;
        this.g = r7;
        this.h = r8;
        this.i = r9;
        this.j = r10;
    }
}
