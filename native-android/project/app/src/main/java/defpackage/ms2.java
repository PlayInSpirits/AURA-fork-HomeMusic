package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 {
    public final os2 a;

    public ms2(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String packageName = remoteUserInfo.getPackageName();
        if (packageName == null) {
            nz2.n("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(packageName)) {
            kf2.n("packageName should be nonempty");
            throw null;
        }
        this.a = new ns2(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms2)) {
            return false;
        }
        return this.a.equals(((ms2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ms2(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new ns2(str, i, i2);
                    return;
                } else {
                    this.a = new os2(str, i, i2);
                    return;
                }
            }
            kf2.n("packageName should be nonempty");
            throw null;
        }
        nz2.n("package shouldn't be null");
        throw null;
    }
}
