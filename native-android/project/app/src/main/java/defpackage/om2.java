package defpackage;

import android.media.MediaDescription;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class om2 {
    public static Uri a(MediaDescription r0) {
        return r0.getMediaUri();
    }

    public static void b(MediaDescription.Builder r0, Uri r1) {
        r0.setMediaUri(r1);
    }
}
