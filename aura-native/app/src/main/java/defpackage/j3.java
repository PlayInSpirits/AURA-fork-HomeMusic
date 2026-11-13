/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.webkit.WebView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ra;
import java.util.ArrayList;

public abstract class j3 {
    public static void A(AppBarLayout appBarLayout, boolean bl5) {
        appBarLayout.setKeyboardNavigationCluster(bl5);
    }

    public static boolean B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isShowingHintText();
    }

    public static int C(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static Bitmap.Config D() {
        return Bitmap.Config.HARDWARE;
    }

    public static int a(Configuration configuration) {
        return configuration.colorMode;
    }

    public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static PackageInfo c() {
        return WebView.getCurrentWebViewPackage();
    }

    public static Bitmap.Config d() {
        return Bitmap.Config.RGBA_F16;
    }

    public static Bitmap e(int n16, int n17, Bitmap.Config config, ColorSpace colorSpace) {
        return Bitmap.createBitmap(null, n16, n17, config, true, colorSpace);
    }

    public static AudioFocusRequest.Builder f(int n16) {
        return new AudioFocusRequest.Builder(n16);
    }

    public static AudioFocusRequest.Builder g(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    public static AudioFocusRequest.Builder h(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
    }

    public static AudioFocusRequest.Builder i(AudioFocusRequest.Builder builder, boolean bl5) {
        return builder.setWillPauseWhenDucked(bl5);
    }

    public static AudioFocusRequest j(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    public static AudioFocusRequest k(Object object) {
        return (AudioFocusRequest)object;
    }

    public static AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static AutofillId m(ra ra6) {
        return ra6.getAutofillId();
    }

    public static AutofillValue n(Object object) {
        return (AutofillValue)object;
    }

    public static void o(ra ra6) {
        ra6.setImportantForAutofill(1);
    }

    public static void p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 2);
    }

    public static void q(Configuration configuration, int n16) {
        configuration.colorMode = n16;
    }

    public static void r(View view, int n16) {
        view.setFocusable(n16);
    }

    public static void s(View view, boolean bl5) {
        view.setDefaultFocusHighlightEnabled(bl5);
    }

    public static void t(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    public static void u(ViewStructure viewStructure, AutofillId autofillId, int n16) {
        viewStructure.setAutofillId(autofillId, n16);
    }

    public static void v(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void w(ViewStructure viewStructure, boolean bl5) {
        viewStructure.setDataIsSensitive(bl5);
    }

    public static void x(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static void y(AccessibilityNodeInfo accessibilityNodeInfo, ArrayList arrayList) {
        accessibilityNodeInfo.setAvailableExtraData(arrayList);
    }

    public static void z(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl5) {
        accessibilityNodeInfo.setShowingHintText(bl5);
    }
}

