package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ka implements wf1 {
    public final ra n;

    public ka(ra raVar) {
        this.n = raVar;
    }

    @Override // defpackage.wf1
    public final Object invoke(Object obj, Object obj2) {
        int i = ((o91) obj).a;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        Integer b = r91.b(i);
        if (b != null) {
            int intValue = b.intValue();
            this.n.playSoundEffect(Build.VERSION.SDK_INT >= 31 ? pe.a.a(intValue, booleanValue) : SoundEffectConstants.getContantForFocusDirection(intValue));
        }
        return j15.a;
    }
}
