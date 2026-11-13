/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import defpackage.ai3;

public final class xh3
implements View.OnClickListener {
    public final int n;
    public final ai3 o;
    public final Slider p;
    public final TextView q;
    public final Button r;
    public final Button s;

    public xh3(ai3 ai32, Slider slider, TextView textView, Button button, Button button2, int n16) {
        this.n = n16;
        this.o = ai32;
        this.p = slider;
        this.q = textView;
        this.r = button;
        this.s = button2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.n) {
            default: {
                view = this.s;
                this.o.w0(this.p, this.q, this.r, (Button)view, 0.05f);
                return;
            }
            case 0: 
        }
        view = this.s;
        this.o.w0(this.p, this.q, this.r, (Button)view, -0.05f);
    }
}

