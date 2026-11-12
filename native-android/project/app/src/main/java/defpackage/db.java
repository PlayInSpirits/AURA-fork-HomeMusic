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
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class db {
    public static /* bridge */ /* synthetic */ int A(AudioProfile r0) {
        return r0.getFormat();
    }

    public static /* bridge */ /* synthetic */ RoundedCorner B(WindowInsets r1) {
        return r1.getRoundedCorner(1);
    }

    public static /* bridge */ /* synthetic */ Surface C(ScrollCaptureSession r0) {
        return r0.getSurface();
    }

    public static /* bridge */ /* synthetic */ void D(MediaCodec r0, ArrayList r1) {
        r0.subscribeToVendorParameters(r1);
    }

    public static /* bridge */ /* synthetic */ int a(AudioProfile r0) {
        return r0.getEncapsulationType();
    }

    public static /* bridge */ /* synthetic */ int b(RoundedCorner r0) {
        return r0.getRadius();
    }

    public static /* bridge */ /* synthetic */ Bitmap c(Bitmap r0) {
        return r0.asShared();
    }

    public static /* bridge */ /* synthetic */ AudioProfile d(Object r0) {
        return (AudioProfile) r0;
    }

    public static /* synthetic */ ContentInfo.Builder e(ClipData r1, int r2) {
        return new ContentInfo.Builder(r1, r2);
    }

    public static /* bridge */ /* synthetic */ ContentInfo f(ContentInfo.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ RoundedCorner g(WindowInsets r1) {
        return r1.getRoundedCorner(0);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession h(Object r0) {
        return (ScrollCaptureSession) r0;
    }

    public static /* bridge */ /* synthetic */ Surface i(ScrollCaptureSession r0) {
        return r0.getSurface();
    }

    public static /* bridge */ /* synthetic */ TranslationRequestValue j(he r0) {
        return TranslationRequestValue.forText(r0);
    }

    public static /* bridge */ /* synthetic */ TranslationResponseValue k(ViewTranslationResponse r1) {
        return r1.getValue("android:text");
    }

    public static /* synthetic */ ViewTranslationRequest.Builder l(AutofillId r1, long r2) {
        return new ViewTranslationRequest.Builder(r1, r2);
    }

    public static /* bridge */ /* synthetic */ ViewTranslationRequest m(ViewTranslationRequest.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse n(Object r0) {
        return (ViewTranslationResponse) r0;
    }

    public static /* bridge */ /* synthetic */ CharSequence o(TranslationResponseValue r0) {
        return r0.getText();
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void q(Canvas r0, NinePatch r1, Rect r2, Paint r3) {
        r0.drawPatch(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ void r(Canvas r0, NinePatch r1, RectF r2, Paint r3) {
        r0.drawPatch(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ void s(Canvas r0, int[] r1, int r2, float[] r3, int r4, int r5, Font r6, Paint r7) {
        r0.drawGlyphs(r1, r2, r3, r4, r5, r6, r7);
    }

    public static /* bridge */ /* synthetic */ void t(AudioTrack r0, LogSessionId r1) {
        r0.setLogSessionId(r1);
    }

    public static /* bridge */ /* synthetic */ void u(MediaCodec r0, ArrayList r1) {
        r0.unsubscribeFromVendorParameters(r1);
    }

    public static /* bridge */ /* synthetic */ void v(ContentInfo.Builder r0, int r1) {
        r0.setFlags(r1);
    }

    public static /* bridge */ /* synthetic */ void w(View r0) {
        r0.clearViewTranslationCallback();
    }

    public static /* bridge */ /* synthetic */ void x(View r0, ViewTranslationCallback r1) {
        r0.setViewTranslationCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void y(ViewTranslationRequest.Builder r1, TranslationRequestValue r2) {
        r1.setValue("android:text", r2);
    }

    public static /* bridge */ /* synthetic */ int[] z(AudioProfile r0) {
        return r0.getChannelMasks();
    }
}
