package defpackage;

import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class za0 {
    public static boolean a() {
        Conscrypt.Version r0 = Conscrypt.version();
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.major() == 2) goto L11;
        if (r0.major() > 2) goto L17;
        return false;
    L17:
        return true;
    L11:
        if (r0.minor() == 1) goto L16;
        if (r0.minor() > 1) goto L17;
        return false;
    L16:
        if (r0.patch() >= 0) goto L17;
        return false;
    }
}
