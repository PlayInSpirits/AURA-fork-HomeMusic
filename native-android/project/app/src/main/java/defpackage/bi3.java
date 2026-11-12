package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bi3 {
    public static void a(PlaybackState.Builder r0, PlaybackState.CustomAction r1) {
        r0.addCustomAction(r1);
    }

    public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder r0) {
        return r0.build();
    }

    public static PlaybackState c(PlaybackState.Builder r0) {
        return r0.build();
    }

    public static PlaybackState.Builder d() {
        return new PlaybackState.Builder();
    }

    public static PlaybackState.CustomAction.Builder e(String r1, CharSequence r2, int r3) {
        return new PlaybackState.CustomAction.Builder(r1, r2, r3);
    }

    public static String f(PlaybackState.CustomAction r0) {
        return r0.getAction();
    }

    public static long g(PlaybackState r2) {
        return r2.getActions();
    }

    public static long h(PlaybackState r2) {
        return r2.getActiveQueueItemId();
    }

    public static long i(PlaybackState r2) {
        return r2.getBufferedPosition();
    }

    public static List<PlaybackState.CustomAction> j(PlaybackState r0) {
        return r0.getCustomActions();
    }

    public static CharSequence k(PlaybackState r0) {
        return r0.getErrorMessage();
    }

    public static Bundle l(PlaybackState.CustomAction r0) {
        return r0.getExtras();
    }

    public static int m(PlaybackState.CustomAction r0) {
        return r0.getIcon();
    }

    public static long n(PlaybackState r2) {
        return r2.getLastPositionUpdateTime();
    }

    public static CharSequence o(PlaybackState.CustomAction r0) {
        return r0.getName();
    }

    public static float p(PlaybackState r0) {
        return r0.getPlaybackSpeed();
    }

    public static long q(PlaybackState r2) {
        return r2.getPosition();
    }

    public static int r(PlaybackState r0) {
        return r0.getState();
    }

    public static void s(PlaybackState.Builder r0, long r1) {
        r0.setActions(r1);
    }

    public static void t(PlaybackState.Builder r0, long r1) {
        r0.setActiveQueueItemId(r1);
    }

    public static void u(PlaybackState.Builder r0, long r1) {
        r0.setBufferedPosition(r1);
    }

    public static void v(PlaybackState.Builder r0, CharSequence r1) {
        r0.setErrorMessage(r1);
    }

    public static void w(PlaybackState.CustomAction.Builder r0, Bundle r1) {
        r0.setExtras(r1);
    }

    public static void x(PlaybackState.Builder r0, int r1, long r2, float r4, long r5) {
        r0.setState(r1, r2, r4, r5);
    }
}
