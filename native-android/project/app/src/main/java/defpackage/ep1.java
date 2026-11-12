package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep1 implements View.OnClickListener {
    public final /* synthetic */ int n;

    public /* synthetic */ ep1(int r1) {
        this.n = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r1) {
        switch(this.n) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        String r0 = "radio_section_visibility";
    L5:
        xa3.t(r0, false);
        return;
    L7:
        r0 = "podcast_section_visibility";
        goto L5
    }
}
