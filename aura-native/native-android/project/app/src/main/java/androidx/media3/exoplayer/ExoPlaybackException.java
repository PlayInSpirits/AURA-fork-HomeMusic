package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import defpackage.f35;
import defpackage.mt2;
import defpackage.rr2;
import defpackage.tb1;
import defpackage.tb4;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final int A;
    public final mt2 B;
    public final boolean C;
    public final int w;
    public final String x;
    public final int y;
    public final tb1 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, Throwable th, int i2, String str, int i3, tb1 tb1Var, int i4, mt2 mt2Var, boolean z) {
        String str2;
        int i5;
        tb1 tb1Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            tb1Var2 = tb1Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            tb1Var2 = tb1Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            tb1Var2 = tb1Var;
            sb.append(tb1Var2);
            sb.append(", format_supported=");
            String str4 = f35.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    tb4.a();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str2, i5, tb1Var2, i4, mt2Var, SystemClock.elapsedRealtime(), z);
    }

    @Override // androidx.media3.common.PlaybackException
    public final boolean a(PlaybackException playbackException) {
        if (!super.a(playbackException)) {
            return false;
        }
        String str = f35.a;
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
        return this.w == exoPlaybackException.w && Objects.equals(this.x, exoPlaybackException.x) && this.y == exoPlaybackException.y && Objects.equals(this.z, exoPlaybackException.z) && this.A == exoPlaybackException.A && Objects.equals(this.B, exoPlaybackException.B) && this.C == exoPlaybackException.C;
    }

    public final ExoPlaybackException b(mt2 mt2Var) {
        String message = getMessage();
        String str = f35.a;
        return new ExoPlaybackException(message, getCause(), this.n, this.w, this.x, this.y, this.z, this.A, mt2Var, this.o, this.C);
    }

    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, tb1 tb1Var, int i4, mt2 mt2Var, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        rr2.l(!z || i2 == 1);
        rr2.l(th != null || i2 == 3);
        this.w = i2;
        this.x = str2;
        this.y = i3;
        this.z = tb1Var;
        this.A = i4;
        this.B = mt2Var;
        this.C = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
