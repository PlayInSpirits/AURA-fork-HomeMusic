package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci3 {
    public static Bundle a(PlaybackState r0) {
        return r0.getExtras();
    }

    public static void b(PlaybackState.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }
}
