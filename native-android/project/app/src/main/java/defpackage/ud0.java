package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends ContextWrapper {
    public static Configuration f;
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public ud0(Context r1, int r2) {
        super(r1);
        this.a = r2;
    }

    public final void a(Configuration r2) {
        if (this.e == null) goto L5;
        kf2.o("getResources() or getAssets() has already been called");
        return;
    L5:
        if (this.d != null) goto L8;
        this.d = new Configuration(r2);
        return;
    L8:
        kf2.o("Override configuration has already been set");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context r1) {
        super.attachBaseContext(r1);
    }

    public final void b() {
        if (this.b != null) goto L7;
        this.b = getResources().newTheme();
        Resources.Theme r0 = getBaseContext().getTheme();
        if (r0 == null) goto L7;
        this.b.setTo(r0);
    L7:
        this.b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e != null) goto L17;
        Configuration r0 = this.d;
        if (r0 != null) goto L7;
    L15:
        this.e = super.getResources();
        goto L17
    L7:
        if (Build.VERSION.SDK_INT >= 26) goto L9;
    L14:
        this.e = createConfigurationContext(this.d).getResources();
        goto L17
    L9:
        if (f != null) goto L12;
        Configuration r1 = new Configuration();
        r1.fontScale = 0.0f;
        f = r1;
    L12:
        if (r0.equals(f) == false) goto L14;
    L17:
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String r2) {
        if ("layout_inflater".equals(r2) == false) goto L10;
        if (this.c != null) goto L8;
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    L8:
        return this.c;
    L10:
        return getBaseContext().getSystemService(r2);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme r0 = this.b;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (this.a != 0) goto L8;
        this.a = R.style.Theme_AppCompat_Light;
    L8:
        b();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
        if (this.a == r2) goto L6;
        this.a = r2;
        b();
        return;
    }
}
