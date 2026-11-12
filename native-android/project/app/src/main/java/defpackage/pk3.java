package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pk3 extends ClickableSpan {
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ qk3 p;

    public pk3(qk3 r1, int r2, boolean r3) {
        this.p = r1;
        this.n = r2;
        this.o = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View r3) {
        boolean r4 = u52.c().a;
        int r0 = this.n;
        if (r4 == false) goto L6;
        u52.a("seek", r0 + 1);
        return;
    L6:
        bj2 r2 = this.p.o0;
        if (r2 == null) goto L10;
        r2.O(r0 + 1);
        return;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint r3) {
        super.updateDrawState(r3);
        r3.setUnderlineText(false);
        boolean r1 = this.o;
        qk3 r2 = this.p;
        if (r1 == false) goto L6;
        r3.setColor(r2.Z().getResources().getColor(R.color.lyricsTextColor, null));
        return;
    L6:
        r3.setColor(r2.Z().getResources().getColor(R.color.shadowsLyricsTextColor, null));
    }
}
