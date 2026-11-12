package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep1 implements View.OnClickListener {
    public final /* synthetic */ int n;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.n) {
            case 0:
                str = "podcast_section_visibility";
                break;
            default:
                str = "radio_section_visibility";
                break;
        }
        xa3.t(str, false);
    }
}
