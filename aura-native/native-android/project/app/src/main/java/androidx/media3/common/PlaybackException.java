package androidx.media3.common;

import android.os.Bundle;
import android.os.SystemClock;
import defpackage.f35;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception {
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final int n;
    public final long o;
    public final Bundle p;

    static {
        String str = f35.a;
        q = Integer.toString(0, 36);
        r = Integer.toString(1, 36);
        s = Integer.toString(2, 36);
        t = Integer.toString(3, 36);
        u = Integer.toString(4, 36);
        v = Integer.toString(5, 36);
    }

    public PlaybackException(String str, Exception exc, int i) {
        this(str, exc, i, Bundle.EMPTY, SystemClock.elapsedRealtime());
    }

    public boolean a(PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            Throwable cause = getCause();
            Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null && cause2 == null) {
                }
            } else if (!Objects.equals(cause.getMessage(), cause2.getMessage()) || !cause.getClass().equals(cause2.getClass())) {
                return false;
            }
            if (this.n == playbackException.n && Objects.equals(getMessage(), playbackException.getMessage()) && this.o == playbackException.o) {
                return true;
            }
        }
        return false;
    }

    public PlaybackException(String str, Throwable th, int i, Bundle bundle, long j) {
        super(str, th);
        this.n = i;
        this.p = bundle;
        this.o = j;
    }
}
