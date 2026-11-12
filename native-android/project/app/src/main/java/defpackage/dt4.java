package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class dt4 implements ActionMode.Callback {
    public final ActionMode.Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;

    public dt4(ActionMode.Callback r1, TextView r2) {
        this.a = r1;
        this.b = r2;
        this.f = false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode r1, MenuItem r2) {
        return this.a.onActionItemClicked(r1, r2);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode r1, Menu r2) {
        return this.a.onCreateActionMode(r1, r2);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode r1) {
        this.a.onDestroyActionMode(r1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode r14, Menu r15) {
        TextView r0 = this.b;
        Context r1 = r0.getContext();
        PackageManager r2 = r1.getPackageManager();
        boolean r3 = this.f;
        Class r4 = Integer.TYPE;
        if (r3 == true) goto L56;
        this.f = true;
        Class<?> r5 = Class.forName("com.android.internal.view.menu.MenuBuilder");     // Catch: Throwable -> L7
        this.c = r5;     // Catch: Throwable -> L7
        this.d = r5.getDeclaredMethod("removeItemAt", new Class[]{r4});     // Catch: Throwable -> L7
        this.e = true;     // Catch: Throwable -> L7
    L7:
        this.c = null;
        this.d = null;
        this.e = false;
    L56:
        if (this.e == true) goto L11;
    L13:
        Method r6 = r15.getClass().getDeclaredMethod("removeItemAt", new Class[]{r4});     // Catch: Throwable -> L55
    L15:
        int r7 = r15.size() - 1;
    L17:
        if (r7 < 0) goto L24;
        MenuItem r8 = r15.getItem(r7);     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
        if (r8.getIntent() == null) goto L23;
        if ("android.intent.action.PROCESS_TEXT".equals(r8.getIntent().getAction()) == false) goto L23;
        r6.invoke(r15, new Object[]{Integer.valueOf(r7)});     // Catch: Throwable -> L55 Throwable -> L55 Throwable -> L55
    L23:
        r7 = r7 - 1;
        goto L17
    L24:
        ArrayList r9 = new ArrayList();
        if ((r1 instanceof Activity) == false) goto L41;
        Iterator<ResolveInfo> r10 = r2.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0).iterator();
    L29:
        if (r10.hasNext() == false) goto L41;
        ResolveInfo r11 = r10.next();
        if (r1.getPackageName().equals(r11.activityInfo.packageName) == true) goto L40;
        ActivityInfo r12 = r11.activityInfo;
        if (r12.exported == false) goto L29;
        String r13 = r12.permission;
        if (r13 == null) goto L40;
        if (r1.checkSelfPermission(r13) != 0) goto L29;
    L40:
        r9.add(r11);
    L41:
        int r16 = 0;
    L43:
        if (r16 >= r9.size()) goto L54;
        ResolveInfo r17 = (ResolveInfo) r9.get(r16);
        MenuItem r18 = r15.add(0, 0, r16 + 100, r17.loadLabel(r2));
        Intent r19 = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if ((r0 instanceof Editable) == true) goto L47;
    L51:
        boolean r110 = false;
    L52:
        Intent r111 = r19.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !r110);
        ActivityInfo r20 = r17.activityInfo;
        r18.setIntent(r111.setClassName(r20.packageName, r20.name)).setShowAsAction(1);
        r16 = r16 + 1;
        goto L43
    L47:
        if (r0.onCheckIsTextEditor() == false) goto L51;
        if (r0.isEnabled() == false) goto L51;
        r110 = true;
        goto L52
    L11:
        if (this.c.isInstance(r15) == false) goto L13;
        r6 = this.d;     // Catch: Throwable -> L55
    L54:
        return this.a.onPrepareActionMode(r14, r15);
    }
}
