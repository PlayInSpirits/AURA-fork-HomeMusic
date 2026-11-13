/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.app.PictureInPictureUiState;
import android.app.job.JobInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.text.StaticLayout;
import android.view.WindowInsets;
import defpackage.gq0;
import defpackage.jf2;
import java.util.List;

public abstract class vk {
    public static LoudnessCodecController a(int n16, jf2 jf22) {
        return LoudnessCodecController.create(n16, gq0.n, jf22);
    }

    public static List b(WindowInsets windowInsets, int n16) {
        return windowInsets.getBoundingRects(n16);
    }

    public static void c(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.isTransitioningToPip();
    }

    public static void d(JobInfo.Builder builder, String string) {
        builder.setTraceTag(string);
    }

    public static void e(LoudnessCodecController loudnessCodecController) {
        loudnessCodecController.close();
    }

    public static void f(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public static void g(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }

    public static void h(StaticLayout.Builder builder) {
        builder.setUseBoundsForWidth(false);
    }

    public static boolean i(LoudnessCodecController loudnessCodecController, MediaCodec mediaCodec) {
        return loudnessCodecController.addMediaCodec(mediaCodec);
    }

    public static List j(WindowInsets windowInsets, int n16) {
        return windowInsets.getBoundingRectsIgnoringVisibility(n16);
    }

    public static void k(MediaCodec mediaCodec) {
        mediaCodec.detachOutputSurface();
    }
}

