package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.eddyizm.tempus.widget.WidgetProvider4x1;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ca5 extends zg0 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Context q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ ge2 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public ca5(Context context, String str, String str2, String str3, boolean z, ge2 ge2Var, boolean z2, int i, String str4, String str5, String str6) {
        this.q = context;
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = z;
        this.v = ge2Var;
        this.w = z2;
        this.x = i;
        this.y = str4;
        this.z = str5;
        this.A = str6;
    }

    @Override // defpackage.wq4
    public final void c(Object obj, cx4 cx4Var) {
        Bitmap bitmap = (Bitmap) obj;
        Context context = this.q;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider4x1.class));
        for (int i : appWidgetIds) {
            ge2 ge2Var = this.v;
            RemoteViews r = ji2.r(this.q, this.r, this.s, this.t, bitmap, this.u, ge2Var.a, ge2Var.b, ge2Var.c, this.w, this.x, i);
            WidgetProvider4x1.a(this.q, r, i, this.y, this.z, this.A);
            appWidgetManager.updateAppWidget(i, r);
        }
    }

    @Override // defpackage.wq4
    public final void m(Drawable drawable) {
        Context context = this.q;
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        for (int i : appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider4x1.class))) {
            ge2 ge2Var = this.v;
            RemoteViews r = ji2.r(this.q, this.r, this.s, this.t, null, this.u, ge2Var.a, ge2Var.b, ge2Var.c, this.w, this.x, i);
            WidgetProvider4x1.a(this.q, r, i, this.y, this.z, this.A);
            appWidgetManager.updateAppWidget(i, r);
        }
    }
}
