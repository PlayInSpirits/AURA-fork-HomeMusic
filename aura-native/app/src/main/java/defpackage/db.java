/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import android.view.ContentInfo;
import android.view.RoundedCorner;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import android.view.View;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationCallback;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import defpackage.he;
import java.util.ArrayList;

public abstract class db {
    public static int A(AudioProfile audioProfile) {
        return audioProfile.getFormat();
    }

    public static RoundedCorner B(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(1);
    }

    public static Surface C(ScrollCaptureSession scrollCaptureSession) {
        return scrollCaptureSession.getSurface();
    }

    public static void D(MediaCodec mediaCodec, ArrayList arrayList) {
        mediaCodec.subscribeToVendorParameters(arrayList);
    }

    public static int a(AudioProfile audioProfile) {
        return audioProfile.getEncapsulationType();
    }

    public static int b(RoundedCorner roundedCorner) {
        return roundedCorner.getRadius();
    }

    public static Bitmap c(Bitmap bitmap) {
        return bitmap.asShared();
    }

    public static AudioProfile d(Object object) {
        return (AudioProfile)object;
    }

    public static ContentInfo.Builder e(ClipData clipData, int n16) {
        return new ContentInfo.Builder(clipData, n16);
    }

    public static ContentInfo f(ContentInfo.Builder builder) {
        return builder.build();
    }

    public static RoundedCorner g(WindowInsets windowInsets) {
        return windowInsets.getRoundedCorner(0);
    }

    public static ScrollCaptureSession h(Object object) {
        return (ScrollCaptureSession)object;
    }

    public static Surface i(ScrollCaptureSession scrollCaptureSession) {
        return scrollCaptureSession.getSurface();
    }

    public static TranslationRequestValue j(he he6) {
        return TranslationRequestValue.forText(he6);
    }

    public static TranslationResponseValue k(ViewTranslationResponse viewTranslationResponse) {
        return viewTranslationResponse.getValue("android:text");
    }

    public static ViewTranslationRequest.Builder l(AutofillId autofillId, long l16) {
        return new ViewTranslationRequest.Builder(autofillId, l16);
    }

    public static ViewTranslationRequest m(ViewTranslationRequest.Builder builder) {
        return builder.build();
    }

    public static ViewTranslationResponse n(Object object) {
        return (ViewTranslationResponse)object;
    }

    public static CharSequence o(TranslationResponseValue translationResponseValue) {
        return translationResponseValue.getText();
    }

    public static void p() {
    }

    public static void q(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void r(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static void s(Canvas canvas, int[] nArray, int n16, float[] fArray, int n17, int n18, Font font, Paint paint) {
        canvas.drawGlyphs(nArray, n16, fArray, n17, n18, font, paint);
    }

    public static void t(AudioTrack audioTrack, LogSessionId logSessionId) {
        audioTrack.setLogSessionId(logSessionId);
    }

    public static void u(MediaCodec mediaCodec, ArrayList arrayList) {
        mediaCodec.unsubscribeFromVendorParameters(arrayList);
    }

    public static void v(ContentInfo.Builder builder, int n16) {
        builder.setFlags(n16);
    }

    public static void w(View view) {
        view.clearViewTranslationCallback();
    }

    public static void x(View view, ViewTranslationCallback viewTranslationCallback) {
        view.setViewTranslationCallback(viewTranslationCallback);
    }

    public static void y(ViewTranslationRequest.Builder builder, TranslationRequestValue translationRequestValue) {
        builder.setValue("android:text", translationRequestValue);
    }

    public static int[] z(AudioProfile audioProfile) {
        return audioProfile.getChannelMasks();
    }
}

