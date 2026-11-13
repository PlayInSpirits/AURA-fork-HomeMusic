/*
 * Decompiled with CFR 0.152.
 */
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
import defpackage.j55;
import defpackage.l70;
import defpackage.n70;
import defpackage.vf;
import java.util.ArrayList;
import java.util.List;

public abstract class n3 {
    public static LineBreakConfig.Builder A(LineBreakConfig.Builder builder, int n16) {
        return builder.setLineBreakWordStyle(n16);
    }

    public static List B(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getDirectProfilesForAttributes(audioAttributes);
    }

    public static void C(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static long a(Choreographer.FrameData frameData) {
        return frameData.getFrameTimeNanos();
    }

    public static long b(Choreographer.FrameTimeline frameTimeline) {
        return frameTimeline.getExpectedPresentationTimeNanos();
    }

    public static LineBreakConfig.Builder c() {
        return new LineBreakConfig.Builder();
    }

    public static LineBreakConfig.Builder d(LineBreakConfig.Builder builder, int n16) {
        return builder.setLineBreakStyle(n16);
    }

    public static LineBreakConfig e(LineBreakConfig.Builder builder) {
        return builder.build();
    }

    public static BoringLayout.Metrics f(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static BoringLayout g(CharSequence charSequence, TextPaint textPaint, int n16, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean bl5, TextUtils.TruncateAt truncateAt, int n17) {
        return new BoringLayout(charSequence, textPaint, n16, alignment, 1.0f, 0.0f, metrics, bl5, truncateAt, n17, true);
    }

    public static AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static OnBackInvokedCallback i(Object object) {
        return (OnBackInvokedCallback)object;
    }

    public static OnBackInvokedDispatcher j(l70 l702) {
        return l702.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedDispatcher k(n70 n702) {
        return n702.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedDispatcher l(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedDispatcher m(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedDispatcher n(Object object) {
        return (OnBackInvokedDispatcher)object;
    }

    public static Object o(Intent intent) {
        return intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static Object p(Bundle bundle) {
        return bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
    }

    public static ArrayList q(Intent intent) {
        return intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static List r(AudioManager audioManager, AudioAttributes audioAttributes) {
        return audioManager.getAudioDevicesForAttributes(audioAttributes);
    }

    public static void s(StaticLayout.Builder builder, LineBreakConfig lineBreakConfig) {
        builder.setLineBreakConfig(lineBreakConfig);
    }

    public static void t(Choreographer choreographer, j55 j552) {
        choreographer.postVsyncCallback(j552);
    }

    public static void u(OnBackInvokedDispatcher onBackInvokedDispatcher, int n16, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(n16, onBackInvokedCallback);
    }

    public static void v(OnBackInvokedDispatcher onBackInvokedDispatcher, vf vf6) {
        onBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, vf6);
    }

    public static void w(OnBackInvokedDispatcher onBackInvokedDispatcher, OnBackInvokedCallback onBackInvokedCallback) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    public static boolean x(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean y(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static Choreographer.FrameTimeline[] z(Choreographer.FrameData frameData) {
        return frameData.getFrameTimelines();
    }
}

