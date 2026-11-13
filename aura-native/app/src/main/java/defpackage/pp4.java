package defpackage;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pp4 extends rz0 {
    public final WeakReference n;

    public pp4(SwitchCompat switchCompat) {
        this.n = new WeakReference(switchCompat);
    }

    @Override // defpackage.rz0
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.n.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // defpackage.rz0
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.n.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
