/*
 * Decompiled with CFR 0.152.
 */
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
import defpackage.jf5;
import defpackage.ra;
import defpackage.v9;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public abstract class rg3 {
    public static ComponentName a(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }

    public static Intent b(Context context, jf5 jf52, IntentFilter intentFilter, int n16) {
        return context.registerReceiver(jf52, intentFilter, n16);
    }

    public static Intent c(MediaService mediaService, v9 v96, IntentFilter intentFilter) {
        return ((Context)mediaService).registerReceiver(v96, intentFilter, 4);
    }

    public static String d(TextPaint textPaint) {
        return textPaint.getFontVariationSettings();
    }

    public static String e(Parameter parameter) {
        return parameter.getName();
    }

    public static void f(AnimatorSet animatorSet) {
        animatorSet.reverse();
    }

    public static void g(AnimatorSet animatorSet, long l16) {
        animatorSet.setCurrentPlayTime(l16);
    }

    public static void h(JobInfo.Builder builder) {
        builder.setRequiresStorageNotLow(true);
    }

    public static void i(JobInfo.Builder builder, boolean bl5) {
        builder.setRequiresBatteryNotLow(bl5);
    }

    public static void j(StaticLayout.Builder builder, int n16) {
        builder.setJustificationMode(n16);
    }

    public static void k(ViewParent viewParent, View view, View view2) {
        viewParent.onDescendantInvalidated(view, view2);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    public static void m(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl5) {
        accessibilityNodeInfo.setShowingHintText(bl5);
    }

    public static void n(AutofillManager autofillManager, ra ra6, int n16, Rect rect) {
        autofillManager.notifyViewEntered(ra6, n16, rect);
    }

    public static boolean o(Parameter parameter) {
        return parameter.isNamePresent();
    }

    public static Parameter[] p(Method method) {
        return method.getParameters();
    }

    public static void q(JobInfo.Builder builder, boolean bl5) {
        builder.setRequiresStorageNotLow(bl5);
    }
}

