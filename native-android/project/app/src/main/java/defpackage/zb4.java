package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zb4 extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public zb4(int r1, float r2, float r3, float r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r4) {
        float r0 = this.c;
        int r1 = this.a;
        r4.setShadowLayer(this.d, this.b, r0, r1);
    }
}
