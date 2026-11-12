package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pp4 extends rz0 {
    public final WeakReference n;

    public pp4(SwitchCompat r2) {
        this.n = new WeakReference(r2);
    }

    @Override // defpackage.rz0
    public final void a() {
        SwitchCompat r0 = (SwitchCompat) this.n.get();
        if (r0 == null) goto L6;
        r0.c();
        return;
    }

    @Override // defpackage.rz0
    public final void b() {
        SwitchCompat r0 = (SwitchCompat) this.n.get();
        if (r0 == null) goto L6;
        r0.c();
        return;
    }
}
