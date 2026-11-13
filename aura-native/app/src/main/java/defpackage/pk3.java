package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pk3 extends ClickableSpan {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ qk3 p;

    public pk3(qk3 qk3Var, int i, boolean z) {
        this.p = qk3Var;
        this.n = i;
        this.o = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean z = u52.c().a;
        int i = this.n;
        if (z) {
            u52.a("seek", i + 1);
            return;
        }
        bj2 bj2Var = this.p.o0;
        if (bj2Var != null) {
            bj2Var.O(i + 1);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        boolean z = this.o;
        qk3 qk3Var = this.p;
        if (z) {
            textPaint.setColor(qk3Var.Z().getResources().getColor(R.color.lyricsTextColor, null));
        } else {
            textPaint.setColor(qk3Var.Z().getResources().getColor(R.color.shadowsLyricsTextColor, null));
        }
    }
}
