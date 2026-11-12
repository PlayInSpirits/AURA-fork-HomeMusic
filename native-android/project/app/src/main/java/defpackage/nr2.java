package defpackage;

import android.media.MediaDescription;
import android.media.session.MediaSession;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nr2 {
    public static MediaSession.QueueItem a(MediaDescription r1, long r2) {
        return new MediaSession.QueueItem(r1, r2);
    }

    public static MediaDescription b(MediaSession.QueueItem r0) {
        return r0.getDescription();
    }

    public static long c(MediaSession.QueueItem r2) {
        return r2.getQueueId();
    }
}
