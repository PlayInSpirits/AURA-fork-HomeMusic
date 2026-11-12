package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ji2;
import defpackage.t92;
import defpackage.x92;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    public final x92 n;

    public LifecycleCallback(x92 x92Var) {
        this.n = x92Var;
    }

    private static x92 getChimeraLifecycleFragmentImpl(t92 t92Var) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final Activity a() {
        Activity activityE = this.n.e();
        ji2.m(activityE);
        return activityE;
    }

    public void b(int i, int i2, Intent intent) {
    }

    public void c(Bundle bundle) {
    }

    public void d() {
    }

    public void e(Bundle bundle) {
    }

    public void f() {
    }

    public void g() {
    }
}
