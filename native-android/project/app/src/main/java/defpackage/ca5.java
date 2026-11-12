package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.eddyizm.tempus.widget.WidgetProvider4x1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
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

    public ca5(Context r1, String r2, String r3, String r4, boolean r5, ge2 r6, boolean r7, int r8, String r9, String r10, String r11) {
        this.q = r1;
        this.r = r2;
        this.s = r3;
        this.t = r4;
        this.u = r5;
        this.v = r6;
        this.w = r7;
        this.x = r8;
        this.y = r9;
        this.z = r10;
        this.A = r11;
    }

    @Override // defpackage.wq4
    public final void c(Object r18, cx4 r19) {
        Bitmap r5 = (Bitmap) r18;
        Context r1 = this.q;
        AppWidgetManager r13 = AppWidgetManager.getInstance(r1);
        int[] r14 = r13.getAppWidgetIds(new ComponentName(r1, WidgetProvider4x1.class));
        int r15 = r14.length;
        int r2 = 0;
    L3:
        if (r2 >= r15) goto L5;
        int r8 = r14[r2];
        ge2 r3 = this.v;
        String r7 = r3.a;
        String r9 = r3.b;
        int r10 = r3.c;
        boolean r11 = this.w;
        int r12 = this.x;
        int r4 = r2;
        RemoteViews r16 = ji2.r(this.q, this.r, this.s, this.t, r5, this.u, r7, r9, r10, r11, r12, r8);
        String r17 = this.z;
        String r110 = this.A;
        WidgetProvider4x1.a(this.q, r16, r8, this.y, r17, r110);
        r13.updateAppWidget(r8, r16);
        r2 = r4 + 1;
        goto L3
    }

    @Override // defpackage.wq4
    public final void m(Drawable r18) {
        Context r1 = this.q;
        AppWidgetManager r2 = AppWidgetManager.getInstance(r1);
        int[] r3 = r2.getAppWidgetIds(new ComponentName(r1, WidgetProvider4x1.class));
        int r4 = r3.length;
        int r5 = 0;
    L3:
        if (r5 >= r4) goto L5;
        int r16 = r3[r5];
        ge2 r6 = this.v;
        String r11 = r6.a;
        String r12 = r6.b;
        int r13 = r6.c;
        boolean r14 = this.w;
        int r15 = this.x;
        RemoteViews r7 = ji2.r(this.q, this.r, this.s, this.t, null, this.u, r11, r12, r13, r14, r15, r16);
        String r9 = this.z;
        String r10 = this.A;
        WidgetProvider4x1.a(this.q, r7, r16, this.y, r9, r10);
        r2.updateAppWidget(r16, r7);
        r5 = r5 + 1;
        goto L3
    }
}
