package defpackage;

import androidx.media3.common.PlaybackException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class hj0 implements qc2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ PlaybackException o;

    public /* synthetic */ hj0(q9 q9Var, PlaybackException playbackException) {
        this.n = 0;
        this.o = playbackException;
    }

    @Override // defpackage.qc2
    public final void invoke(Object obj) {
        int i = this.n;
        PlaybackException playbackException = this.o;
        switch (i) {
            case 0:
                ((ho2) obj).o = playbackException;
                break;
            case 1:
                ((oi3) obj).P(playbackException);
                break;
            case 2:
                ((oi3) obj).S(playbackException);
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                ((oi3) obj).P(playbackException);
                break;
            default:
                ((oi3) obj).S(playbackException);
                break;
        }
    }

    public /* synthetic */ hj0(int i, PlaybackException playbackException) {
        this.n = i;
        this.o = playbackException;
    }
}
