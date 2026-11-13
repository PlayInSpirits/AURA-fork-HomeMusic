/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import defpackage.kf2;
import defpackage.nz2;
import defpackage.os2;
import defpackage.sr0;

public final class ms2 {
    public final os2 a;

    public ms2(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String string = sr0.o(remoteUserInfo);
        if (string != null) {
            if (!TextUtils.isEmpty(string)) {
                this.a = new os2(sr0.o(remoteUserInfo), sr0.b(remoteUserInfo), sr0.u(remoteUserInfo));
                return;
            }
            kf2.n("packageName should be nonempty");
            throw null;
        }
        nz2.n("package shouldn't be null");
        throw null;
    }

    public ms2(String string, int n16, int n17) {
        if (string != null) {
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new os2(string, n16, n17);
                    return;
                }
                this.a = new os2(string, n16, n17);
                return;
            }
            kf2.n("packageName should be nonempty");
            throw null;
        }
        nz2.n("package shouldn't be null");
        throw null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ms2)) {
            return false;
        }
        object = ((ms2)object).a;
        return this.a.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

