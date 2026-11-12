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

    @Override // defpackage.df, defpackage.k70, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return z52.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jz4.r(this);
        kb4.T(this);
        super.onCreate(bundle);
        setContentView(R.layout.fragment_settings);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.settings_toolbar);
        materialToolbar.setTitle(R.string.lan_title);
        materialToolbar.setNavigationOnClickListener(new p6(22, this));
        View viewFindViewById = findViewById(android.R.id.content);
        er1 er1Var = new er1(10);
        WeakHashMap weakHashMap = j65.a;
        a65.c(viewFindViewById, er1Var);
        if (bundle == null) {
            md1 md1VarK = k();
            md1VarK.getClass();
            po poVar = new po(md1VarK);
            poVar.j(R.id.settings_container, new h62(), null);
            poVar.e(false);
        }
    }
}
