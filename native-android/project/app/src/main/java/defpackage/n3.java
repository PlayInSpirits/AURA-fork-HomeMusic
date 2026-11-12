package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.text.LineBreakConfig;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n3 {
    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder A(LineBreakConfig.Builder r0, int r1) {
        return r0.setLineBreakWordStyle(r1);
    }

    public static /* bridge */ /* synthetic */ List B(AudioManager r0, AudioAttributes r1) {
        return r0.getDirectProfilesForAttributes(r1);
    }

    public static /* bridge */ /* synthetic */ void C(OnBackInvokedDispatcher r0, OnBackInvokedCallback r1) {
        r0.unregisterOnBackInvokedCallback(r1);
    }

    public static /* bridge */ /* synthetic */ long a(Choreographer.FrameData r2) {
        return r2.getFrameTimeNanos();
    }

    public static /* bridge */ /* synthetic */ long b(Choreographer.FrameTimeline r2) {
        return r2.getExpectedPresentationTimeNanos();
    }

    public static /* synthetic */ LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig.Builder d(LineBreakConfig.Builder r0, int r1) {
        return r0.setLineBreakStyle(r1);
    }

    public static /* bridge */ /* synthetic */ LineBreakConfig e(LineBreakConfig.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ BoringLayout.Metrics f(CharSequence r2, TextPaint r3, TextDirectionHeuristic r4) {
        return BoringLayout.isBoring(r2, r3, r4, true, null);
    }

    public static /* synthetic */ BoringLayout g(CharSequence r12, TextPaint r13, int r14, Layout.Alignment r15, BoringLayout.Metrics r16, boolean r17, TextUtils.TruncateAt r18, int r19) {
        return new BoringLayout(r12, r13, r14, r15, 1.0f, 0.0f, r16, r17, r18, r19, true);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback i(Object r0) {
        return (OnBackInvokedCallback) r0;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher j(l70 r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher k(n70 r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher l(Activity r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m(View r0) {
        return r0.findOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher n(Object r0) {
        return (OnBackInvokedDispatcher) r0;
    }

    public static /* bridge */ /* synthetic */ Object o(Intent r2) {
        return r2.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static /* bridge */ /* synthetic */ Object p(Bundle r2) {
        return r2.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
    }

    public static /* bridge */ /* synthetic */ ArrayList q(Intent r2) {
        return r2.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static /* bridge */ /* synthetic */ List r(AudioManager r0, AudioAttributes r1) {
        return r0.getAudioDevicesForAttributes(r1);
    }

    public static /* bridge */ /* synthetic */ void s(StaticLayout.Builder r0, LineBreakConfig r1) {
        r0.setLineBreakConfig(r1);
    }

    public static /* bridge */ /* synthetic */ void t(Choreographer r0, j55 r1) {
        r0.postVsyncCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void u(OnBackInvokedDispatcher r0, int r1, OnBackInvokedCallback r2) {
        r0.registerOnBackInvokedCallback(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void v(OnBackInvokedDispatcher r1, vf r2) {
        r1.registerOnBackInvokedCallback(1000000, r2);
    }

    public static /* bridge */ /* synthetic */ void w(OnBackInvokedDispatcher r0, OnBackInvokedCallback r1) {
        r0.unregisterOnBackInvokedCallback(r1);
    }

    public static /* bridge */ /* synthetic */ boolean x(BoringLayout r0) {
        return r0.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean y(StaticLayout r0) {
        return r0.isFallbackLineSpacingEnabled();
    }

    public static /* bridge */ /* synthetic */ Choreographer.FrameTimeline[] z(Choreographer.FrameData r0) {
        return r0.getFrameTimelines();
    }
}
