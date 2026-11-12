package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tr4 extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public tr4(boolean r1, boolean r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r2) {
        r2.setUnderlineText(this.a);
        r2.setStrikeThruText(this.b);
    }
}
