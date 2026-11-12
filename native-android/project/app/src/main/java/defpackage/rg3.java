package defpackage;

import android.animation.AnimatorSet;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import com.eddyizm.tempus.service.MediaService;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class rg3 {
    public static /* bridge */ /* synthetic */ ComponentName a(Context r0, Intent r1) {
        return r0.startForegroundService(r1);
    }

    public static /* bridge */ /* synthetic */ Intent b(Context r0, jf5 r1, IntentFilter r2, int r3) {
        return r0.registerReceiver(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ Intent c(MediaService r1, v9 r2, IntentFilter r3) {
        return r1.registerReceiver(r2, r3, 4);
    }

    public static /* bridge */ /* synthetic */ String d(TextPaint r0) {
        return r0.getFontVariationSettings();
    }

    public static /* bridge */ /* synthetic */ String e(Parameter r0) {
        return r0.getName();
    }

    public static /* bridge */ /* synthetic */ void f(AnimatorSet r0) {
        r0.reverse();
    }

    public static /* bridge */ /* synthetic */ void g(AnimatorSet r0, long r1) {
        r0.setCurrentPlayTime(r1);
    }

    public static /* bridge */ /* synthetic */ void h(JobInfo.Builder r1) {
        r1.setRequiresStorageNotLow(true);
    }

    public static /* bridge */ /* synthetic */ void i(JobInfo.Builder r0, boolean r1) {
        r0.setRequiresBatteryNotLow(r1);
    }

    public static /* bridge */ /* synthetic */ void j(StaticLayout.Builder r0, int r1) {
        r0.setJustificationMode(r1);
    }

    public static /* bridge */ /* synthetic */ void k(ViewParent r0, View r1, View r2) {
        r0.onDescendantInvalidated(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void l(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setHintText(r1);
    }

    public static /* bridge */ /* synthetic */ void m(AccessibilityNodeInfo r0, boolean r1) {
        r0.setShowingHintText(r1);
    }

    public static /* bridge */ /* synthetic */ void n(AutofillManager r0, ra r1, int r2, Rect r3) {
        r0.notifyViewEntered(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ boolean o(Parameter r0) {
        return r0.isNamePresent();
    }

    public static /* bridge */ /* synthetic */ Parameter[] p(Method r0) {
        return r0.getParameters();
    }

    public static /* bridge */ /* synthetic */ void q(JobInfo.Builder r0, boolean r1) {
        r0.setRequiresStorageNotLow(r1);
    }
}
