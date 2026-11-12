package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ka implements wf1 {
    public final ra n;

    public ka(ra r1) {
        this.n = r1;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object r3, Object r4) {
        int r5 = ((o91) r3).a;
        boolean r6 = ((Boolean) r4).booleanValue();
        Integer r7 = r91.b(r5);
        if (r7 == null) goto L10;
        int r8 = r7.intValue();
        if (Build.VERSION.SDK_INT < 31) goto L7;
        int r9 = pe.a.a(r8, r6);
    L8:
        this.n.playSoundEffect(r9);
        goto L10
    L7:
        r9 = SoundEffectConstants.getContantForFocusDirection(r8);
    L10:
        return j15.a;
    }
}
