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
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class j3 {
    public static /* bridge */ /* synthetic */ void A(AppBarLayout r0, boolean r1) {
        r0.setKeyboardNavigationCluster(r1);
    }

    public static /* bridge */ /* synthetic */ boolean B(AccessibilityNodeInfo r0) {
        return r0.isShowingHintText();
    }

    public static /* bridge */ /* synthetic */ int C(AudioManager r0, AudioFocusRequest r1) {
        return r0.requestAudioFocus(r1);
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config D() {
        return Bitmap.Config.HARDWARE;
    }

    public static /* bridge */ /* synthetic */ int a(Configuration r0) {
        return r0.colorMode;
    }

    public static /* bridge */ /* synthetic */ int b(AudioManager r0, AudioFocusRequest r1) {
        return r0.abandonAudioFocusRequest(r1);
    }

    public static /* bridge */ /* synthetic */ PackageInfo c() {
        return WebView.getCurrentWebViewPackage();
    }

    public static /* bridge */ /* synthetic */ Bitmap.Config d() {
        return Bitmap.Config.RGBA_F16;
    }

    public static /* bridge */ /* synthetic */ Bitmap e(int r6, int r7, Bitmap.Config r8, ColorSpace r9) {
        return Bitmap.createBitmap(null, r6, r7, r8, true, r9);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int r1) {
        return new AudioFocusRequest.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder g(AudioFocusRequest.Builder r0, AudioAttributes r1) {
        return r0.setAudioAttributes(r1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder h(AudioFocusRequest.Builder r0, AudioManager.OnAudioFocusChangeListener r1, Handler r2) {
        return r0.setOnAudioFocusChangeListener(r1, r2);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder i(AudioFocusRequest.Builder r0, boolean r1) {
        return r0.setWillPauseWhenDucked(r1);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest j(AudioFocusRequest.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest k(Object r0) {
        return (AudioFocusRequest) r0;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
    }

    public static /* bridge */ /* synthetic */ AutofillId m(ra r0) {
        return r0.getAutofillId();
    }

    public static /* bridge */ /* synthetic */ AutofillValue n(Object r0) {
        return (AutofillValue) r0;
    }

    public static /* bridge */ /* synthetic */ void o(ra r1) {
        r1.setImportantForAutofill(1);
    }

    public static /* bridge */ /* synthetic */ void p(Context r1, BroadcastReceiver r2, IntentFilter r3) {
        r1.registerReceiver(r2, r3, 2);
    }

    public static /* bridge */ /* synthetic */ void q(Configuration r0, int r1) {
        r0.colorMode = r1;
    }

    public static /* bridge */ /* synthetic */ void r(View r0, int r1) {
        r0.setFocusable(r1);
    }

    public static /* bridge */ /* synthetic */ void s(View r0, boolean r1) {
        r0.setDefaultFocusHighlightEnabled(r1);
    }

    public static /* bridge */ /* synthetic */ void t(ViewStructure r1) {
        r1.setInputType(129);
    }

    public static /* bridge */ /* synthetic */ void u(ViewStructure r0, AutofillId r1, int r2) {
        r0.setAutofillId(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void v(ViewStructure r0, AutofillValue r1) {
        r0.setAutofillValue(r1);
    }

    public static /* bridge */ /* synthetic */ void w(ViewStructure r0, boolean r1) {
        r0.setDataIsSensitive(r1);
    }

    public static /* bridge */ /* synthetic */ void x(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setHintText(r1);
    }

    public static /* bridge */ /* synthetic */ void y(AccessibilityNodeInfo r0, ArrayList r1) {
        r0.setAvailableExtraData(r1);
    }

    public static /* bridge */ /* synthetic */ void z(AccessibilityNodeInfo r0, boolean r1) {
        r0.setShowingHintText(r1);
    }
}
