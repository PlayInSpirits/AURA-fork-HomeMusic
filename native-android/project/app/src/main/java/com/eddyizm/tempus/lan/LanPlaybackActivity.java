package com.eddyizm.tempus.lan;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import app.homemusic.R;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.a65;
import defpackage.df;
import defpackage.er1;
import defpackage.h62;
import defpackage.j65;
import defpackage.jz4;
import defpackage.kb4;
import defpackage.md1;
import defpackage.p6;
import defpackage.po;
import defpackage.z52;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class LanPlaybackActivity extends df {
    public static final /* synthetic */ int N = 0;

    public LanPlaybackActivity() {
    }

    @Override // defpackage.df, defpackage.k70, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        r2.getClass();
        if (z52.a(r2) == false) goto L5;
        return true;
    L5:
        if (super.dispatchKeyEvent(r2) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r4) {
        jz4.r(this);
        kb4.T(this);
        super.onCreate(r4);
        setContentView(R.layout.fragment_settings);
        MaterialToolbar r0 = (MaterialToolbar) findViewById(R.id.settings_toolbar);
        r0.setTitle(R.string.lan_title);
        r0.setNavigationOnClickListener(new p6(22, this));
        View r1 = findViewById(android.R.id.content);
        er1 r2 = new er1(10);
        WeakHashMap r3 = j65.a;
        a65.c(r1, r2);
        if (r4 != null) goto L6;
        md1 r5 = k();
        r5.getClass();
        po r6 = new po(r5);
        r6.j(R.id.settings_container, new h62(), null);
        r6.e(false);
        return;
    }
}
