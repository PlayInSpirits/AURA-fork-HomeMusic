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

    public LifecycleCallback(x92 r1) {
        this.n = r1;
    }

    private static x92 getChimeraLifecycleFragmentImpl(t92 r1) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public final Activity a() {
        Activity r0 = this.n.e();
        ji2.m(r0);
        return r0;
    }

    public void b(int r1, int r2, Intent r3) {
    }

    public void c(Bundle r1) {
    }

    public void d() {
    }

    public void e(Bundle r1) {
    }

    public void f() {
    }

    public void g() {
    }
}
