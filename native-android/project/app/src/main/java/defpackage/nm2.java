package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nm2 {
    public static MediaDescription a(MediaDescription.Builder r0) {
        return r0.build();
    }

    public static MediaDescription.Builder b() {
        return new MediaDescription.Builder();
    }

    public static CharSequence c(MediaDescription r0) {
        return r0.getDescription();
    }

    public static Bundle d(MediaDescription r0) {
        return r0.getExtras();
    }

    public static Bitmap e(MediaDescription r0) {
        return r0.getIconBitmap();
    }

    public static Uri f(MediaDescription r0) {
        return r0.getIconUri();
    }

    public static String g(MediaDescription r0) {
        return r0.getMediaId();
    }

    public static CharSequence h(MediaDescription r0) {
        return r0.getSubtitle();
    }

    public static CharSequence i(MediaDescription r0) {
        return r0.getTitle();
    }

    public static void j(MediaDescription.Builder r0, CharSequence r1) {
        r0.setDescription(r1);
    }

    public static void k(MediaDescription.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    public static void l(MediaDescription.Builder r0, Bitmap r1) {
        r0.setIconBitmap(r1);
    }

    public static void m(MediaDescription.Builder r0, Uri r1) {
        r0.setIconUri(r1);
    }

    public static void n(MediaDescription.Builder r0, String r1) {
        r0.setMediaId(r1);
    }

    public static void o(MediaDescription.Builder r0, CharSequence r1) {
        r0.setSubtitle(r1);
    }

    public static void p(MediaDescription.Builder r0, CharSequence r1) {
        r0.setTitle(r1);
    }
}
