package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class wb4 extends CharacterStyle implements UpdateAppearance {
    public final pv n;
    public final float o;
    public final zd3 p = uc5.B(new qf4(9205357640488583168L));
    public final dp0 q;

    public wb4(pv pvVar, float f) {
        this.n = pvVar;
        this.o = f;
        wc wcVar = new wc(24, this);
        z05 z05Var = ph4.a;
        this.q = new dp0(wcVar, null);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        gh0.C(textPaint, this.o);
        textPaint.setShader((Shader) this.q.getValue());
    }
}
