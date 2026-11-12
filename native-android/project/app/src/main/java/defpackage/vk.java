package defpackage;

import android.app.PictureInPictureUiState;
import android.app.job.JobInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.text.StaticLayout;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class vk {
    public static /* bridge */ /* synthetic */ LoudnessCodecController a(int r1, jf2 r2) {
        return LoudnessCodecController.create(r1, gq0.n, r2);
    }

    public static /* bridge */ /* synthetic */ List b(WindowInsets r0, int r1) {
        return r0.getBoundingRects(r1);
    }

    public static /* bridge */ /* synthetic */ void c(PictureInPictureUiState r0) {
        r0.isTransitioningToPip();
    }

    public static /* bridge */ /* synthetic */ void d(JobInfo.Builder r0, String r1) {
        r0.setTraceTag(r1);
    }

    public static /* bridge */ /* synthetic */ void e(LoudnessCodecController r0) {
        r0.close();
    }

    public static /* bridge */ /* synthetic */ void f(LoudnessCodecController r0, MediaCodec r1) {
        r0.removeMediaCodec(r1);
    }

    public static /* bridge */ /* synthetic */ void g(MediaCodec r0) {
        r0.detachOutputSurface();
    }

    public static /* bridge */ /* synthetic */ void h(StaticLayout.Builder r1) {
        r1.setUseBoundsForWidth(false);
    }

    public static /* bridge */ /* synthetic */ boolean i(LoudnessCodecController r0, MediaCodec r1) {
        return r0.addMediaCodec(r1);
    }

    public static /* bridge */ /* synthetic */ List j(WindowInsets r0, int r1) {
        return r0.getBoundingRectsIgnoringVisibility(r1);
    }

    public static /* bridge */ /* synthetic */ void k(MediaCodec r0) {
        r0.detachOutputSurface();
    }
}
