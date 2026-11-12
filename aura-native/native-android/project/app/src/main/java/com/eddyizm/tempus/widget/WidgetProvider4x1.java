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
    public static void a(Context context, RemoteViews remoteViews, int i, String str, String str2, String str3) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i, new Intent(context, (Class<?>) WidgetProvider4x1.class).setAction("tempo.widget.PLAY_PAUSE"), 201326592);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, i + 1, new Intent(context, (Class<?>) WidgetProvider4x1.class).setAction("tempo.widget.NEXT"), 201326592);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, i + 2, new Intent(context, (Class<?>) WidgetProvider4x1.class).setAction("tempo.widget.PREV"), 201326592);
        PendingIntent broadcast4 = PendingIntent.getBroadcast(context, i + 3, new Intent(context, (Class<?>) WidgetProvider4x1.class).setAction("tempo.widget.SHUFFLE"), 201326592);
        PendingIntent broadcast5 = PendingIntent.getBroadcast(context, i + 4, new Intent(context, (Class<?>) WidgetProvider4x1.class).setAction("tempo.widget.REPEAT"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.btn_play_pause, broadcast);
        remoteViews.setOnClickPendingIntent(R.id.btn_next, broadcast2);
        remoteViews.setOnClickPendingIntent(R.id.btn_prev, broadcast3);
        remoteViews.setOnClickPendingIntent(R.id.btn_shuffle, broadcast4);
        remoteViews.setOnClickPendingIntent(R.id.btn_repeat, broadcast5);
        PendingIntent pendingIntentB = b(i + 10, context, null);
        remoteViews.setOnClickPendingIntent(R.id.root, pendingIntentB);
        PendingIntent pendingIntentB2 = b(i + 20, context, str);
        PendingIntent pendingIntentB3 = b(i + 21, context, str3);
        PendingIntent pendingIntentB4 = b(i + 22, context, str2);
        remoteViews.setOnClickPendingIntent(R.id.album_art, pendingIntentB2 != null ? pendingIntentB2 : pendingIntentB);
        remoteViews.setOnClickPendingIntent(R.id.title, pendingIntentB2 != null ? pendingIntentB2 : pendingIntentB);
        if (pendingIntentB3 != null) {
            pendingIntentB2 = pendingIntentB3;
        } else if (pendingIntentB2 == null) {
            pendingIntentB2 = pendingIntentB;
        }
        remoteViews.setOnClickPendingIntent(R.id.subtitle, pendingIntentB2);
        if (pendingIntentB4 != null) {
            pendingIntentB = pendingIntentB4;
        }
        remoteViews.setOnClickPendingIntent(R.id.album, pendingIntentB);
    }

    public static PendingIntent b(int i, Context context, String str) {
        Intent intent = !TextUtils.isEmpty(str) ? new Intent("android.intent.action.VIEW", Uri.parse(str), context, MainActivity.class) : new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(603979776);
        TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
        taskStackBuilderCreate.addNextIntentWithParentStack(intent);
        return taskStackBuilderCreate.getPendingIntent(i, 201326592);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i, bundle);
        RemoteViews remoteViewsQ = ji2.q(context, i);
        a(context, remoteViewsQ, i, null, null, null);
        appWidgetManager.updateAppWidget(i, remoteViewsQ);
        ji2.I(context);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xc5 xc5Var;
        super.onReceive(context, intent);
        String action = intent.getAction();
        Log.d("TempoWidget", "onReceive action=" + action);
        if (!"tempo.widget.PLAY_PAUSE".equals(action) && !"tempo.widget.NEXT".equals(action) && !"tempo.widget.PREV".equals(action) && !"tempo.widget.SHUFFLE".equals(action) && !"tempo.widget.REPEAT".equals(action)) {
            if ("android.appwidget.action.APPWIDGET_UPDATE".equals(action)) {
                ji2.I(context);
                return;
            }
            return;
        }
        Log.d("TempoWidget", "dispatch action=" + action);
        Context applicationContext = context.getApplicationContext();
        cb4 cb4Var = new cb4(applicationContext, new ComponentName(applicationContext, (Class<?>) MediaService.class));
        Bundle bundle = Bundle.EMPTY;
        tv1 tv1Var = new tv1();
        Looper looperX = f35.x();
        bl2 bl2Var = new bl2(looperX);
        if (cb4Var.a.e()) {
            xc5Var = new xc5(4, new fi0(new x7(applicationContext)));
        } else {
            xc5Var = null;
        }
        f35.W(new Handler(looperX), new pk2(bl2Var, new sk2(applicationContext, cb4Var, bundle, tv1Var, looperX, bl2Var, xc5Var), 0));
        bl2Var.f(new qo2(bl2Var, action, context, 20), gq0.n);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        for (int i : iArr) {
            RemoteViews remoteViewsQ = ji2.q(context, i);
            a(context, remoteViewsQ, i, null, null, null);
            appWidgetManager.updateAppWidget(i, remoteViewsQ);
        }
    }
}
