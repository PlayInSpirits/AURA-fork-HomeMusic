package com.eddyizm.tempus.widget;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import app.homemusic.R;
import com.eddyizm.tempus.service.MediaService;
import com.eddyizm.tempus.ui.activity.MainActivity;
import defpackage.bl2;
import defpackage.cb4;
import defpackage.f35;
import defpackage.fi0;
import defpackage.gq0;
import defpackage.ji2;
import defpackage.pk2;
import defpackage.qo2;
import defpackage.sk2;
import defpackage.tv1;
import defpackage.x7;
import defpackage.xc5;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class WidgetProvider4x1 extends AppWidgetProvider {
    public WidgetProvider4x1() {
    }

    public static void a(Context r8, RemoteViews r9, int r10, String r11, String r12, String r13) {
        PendingIntent r0 = PendingIntent.getBroadcast(r8, r10, new Intent(r8, WidgetProvider4x1.class).setAction("tempo.widget.PLAY_PAUSE"), 201326592);
        PendingIntent r3 = PendingIntent.getBroadcast(r8, r10 + 1, new Intent(r8, WidgetProvider4x1.class).setAction("tempo.widget.NEXT"), 201326592);
        PendingIntent r4 = PendingIntent.getBroadcast(r8, r10 + 2, new Intent(r8, WidgetProvider4x1.class).setAction("tempo.widget.PREV"), 201326592);
        PendingIntent r5 = PendingIntent.getBroadcast(r8, r10 + 3, new Intent(r8, WidgetProvider4x1.class).setAction("tempo.widget.SHUFFLE"), 201326592);
        PendingIntent r1 = PendingIntent.getBroadcast(r8, r10 + 4, new Intent(r8, WidgetProvider4x1.class).setAction("tempo.widget.REPEAT"), 201326592);
        r9.setOnClickPendingIntent(R.id.btn_play_pause, r0);
        r9.setOnClickPendingIntent(R.id.btn_next, r3);
        r9.setOnClickPendingIntent(R.id.btn_prev, r4);
        r9.setOnClickPendingIntent(R.id.btn_shuffle, r5);
        r9.setOnClickPendingIntent(R.id.btn_repeat, r1);
        PendingIntent r2 = b(r10 + 10, r8, null);
        r9.setOnClickPendingIntent(R.id.root, r2);
        PendingIntent r14 = b(r10 + 20, r8, r11);
        PendingIntent r15 = b(r10 + 21, r8, r13);
        PendingIntent r16 = b(r10 + 22, r8, r12);
        if (r14 == null) goto L5;
        PendingIntent r17 = r14;
    L6:
        r9.setOnClickPendingIntent(R.id.album_art, r17);
        if (r14 == null) goto L9;
        PendingIntent r18 = r14;
    L10:
        r9.setOnClickPendingIntent(R.id.title, r18);
        if (r15 == null) goto L13;
        r14 = r15;
    L16:
        r9.setOnClickPendingIntent(R.id.subtitle, r14);
        if (r16 == null) goto L19;
        r2 = r16;
    L19:
        r9.setOnClickPendingIntent(R.id.album, r2);
        return;
    L13:
        if (r14 != null) goto L16;
        r14 = r2;
        goto L16
    L9:
        r18 = r2;
        goto L10
    L5:
        r17 = r2;
        goto L6
    }

    public static PendingIntent b(int r3, Context r4, String r5) {
        if (TextUtils.isEmpty(r5) == true) goto L5;
        Intent r0 = new Intent("android.intent.action.VIEW", Uri.parse(r5), r4, MainActivity.class);
    L6:
        r0.addFlags(603979776);
        TaskStackBuilder r6 = TaskStackBuilder.create(r4);
        r6.addNextIntentWithParentStack(r0);
        return r6.getPendingIntent(r3, 201326592);
    L5:
        r0 = new Intent(r4, MainActivity.class);
        goto L6
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context r7, AppWidgetManager r8, int r9, Bundle r10) {
        super.onAppWidgetOptionsChanged(r7, r8, r9, r10);
        RemoteViews r1 = ji2.q(r7, r9);
        a(r7, r1, r9, null, null, null);
        r8.updateAppWidget(r9, r1);
        ji2.I(r7);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context r10, Intent r11) {
        super.onReceive(r10, r11);
        String r9 = r11.getAction();
        Log.d("TempoWidget", "onReceive action=" + r9);
        if ("tempo.widget.PLAY_PAUSE".equals(r9) == false) goto L5;
    L17:
        Log.d("TempoWidget", "dispatch action=" + r9);
        Context r2 = r10.getApplicationContext();
        cb4 r3 = new cb4(r2, new ComponentName(r2, MediaService.class));
        Bundle r4 = Bundle.EMPTY;
        tv1 r5 = new tv1();
        Looper r6 = f35.x();
        bl2 r7 = new bl2(r6);
        if (r3.a.e() == false) goto L21;
        xc5 r12 = new xc5(4, new fi0(new x7(r2)));
    L22:
        f35.W(new Handler(r6), new pk2(r7, new sk2(r2, r3, r4, r5, r6, r7, r12), 0));
        r7.f(new qo2(r7, r9, r10, 20), gq0.n);
        return;
    L21:
        r12 = null;
        goto L22
    L5:
        if ("tempo.widget.NEXT".equals(r9) == true) goto L17;
        if ("tempo.widget.PREV".equals(r9) == true) goto L17;
        if ("tempo.widget.SHUFFLE".equals(r9) == true) goto L17;
        if ("tempo.widget.REPEAT".equals(r9) == true) goto L17;
        if ("android.appwidget.action.APPWIDGET_UPDATE".equals(r9) == false) goto L24;
        ji2.I(r10);
        return;
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context r8, AppWidgetManager r9, int[] r10) {
        int r7 = r10.length;
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L5;
        int r3 = r10[r0];
        RemoteViews r2 = ji2.q(r8, r3);
        a(r8, r2, r3, null, null, null);
        r9.updateAppWidget(r3, r2);
        r0 = r0 + 1;
        goto L3
    }
}
