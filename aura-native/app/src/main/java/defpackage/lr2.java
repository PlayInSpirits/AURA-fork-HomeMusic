package defpackage;

import android.media.session.MediaSessionManager;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class lr2 extends kr2 {
    public lr2(android.content.Context a0, java.lang.String a1, android.os.Bundle a2) {
        super(a0, a1, a2);
    }

    @Override // defpackage.kr2
    public final ms2 b() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo;
        currentControllerInfo = this.a.getCurrentControllerInfo();
        return new ms2(currentControllerInfo);
    }

    @Override // defpackage.kr2
    public final void c(ms2 ms2Var) {
    }
}
