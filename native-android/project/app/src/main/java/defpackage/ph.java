package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ph extends oh {
    public ph() {
    }

    @Override // defpackage.oh, defpackage.qh
    public void a(StaticLayout.Builder r1, TextView r2) {
        r1.setTextDirection(z9.h(r2));
    }

    @Override // defpackage.qh
    public boolean b(TextView r1) {
        return z9.y(r1);
    }
}
