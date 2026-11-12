package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ip0 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Serializable f;
    public final Object g;
    public Object h;

    public ip0(AssetManager r1, Executor r2, sq3 r3, String r4, File r5) {
        this.a = false;
        this.b = r2;
        this.c = r3;
        this.g = r4;
        this.f = r5;
        int r6 = Build.VERSION.SDK_INT;
        if (r6 < 31) goto L5;
        byte[] r7 = au0.x;
    L11:
        this.d = r7;
        return;
    L5:
        switch(r6) {
            case 24: goto L10;
            case 25: goto L10;
            case 26: goto L9;
            case 27: goto L8;
            case 28: goto L7;
            case 29: goto L7;
            case 30: goto L7;
            default: goto L6;
        };
    L6:
        r7 = null;
        goto L11
    L7:
        r7 = au0.y;
        goto L11
    L8:
        r7 = au0.z;
        goto L11
    L9:
        r7 = au0.A;
        goto L11
    L10:
        r7 = au0.B;
        goto L11
    }

    public FileInputStream a(AssetManager r1, String r2) {
        return r1.openFd(r2).createInputStream();
    L4:
        e = move-exception;
        String r3 = e.getMessage();
        if (r3 != null) goto L8;
        return null;
    L8:
        if (r3.contains("compressed") == false) goto L15;
        ((sq3) this.c).c();
        return null;
    L15:
        return null;
    }

    public void b(int r4, Serializable r5) {
        ((Executor) this.b).execute(new gk(this, r4, r5, 3));
    }

    public void c() {
        ui1 r0 = (ui1) this.c;
        PackageManager r1 = (PackageManager) this.e;
        ArrayList r2 = (ArrayList) this.f;
        if (this.a == false) goto L99;
        ArrayList r3 = new ArrayList();
        if (Build.VERSION.SDK_INT < 30) goto L12;
        Intent r4 = new Intent("android.media.MediaRoute2ProviderService");
        ArrayList r5 = new ArrayList();
        Iterator<ResolveInfo> r6 = r1.queryIntentServices(r4, 0).iterator();
    L9:
        if (r6.hasNext() == false) goto L11;
        r5.add(r6.next().serviceInfo);
        goto L9
    L11:
        r3 = r5;
    L12:
        Iterator<ResolveInfo> r7 = r1.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        int r8 = 0;
    L14:
        if (r7.hasNext() == false) goto L64;
        ServiceInfo r9 = r7.next().serviceInfo;
        if (r9 == null) goto L14;
        if (yq2.c != null) goto L21;
        boolean r10 = false;
    L22:
        if (r10 == false) goto L33;
        if (r3.isEmpty() == true) goto L33;
        int r11 = r3.size();
        int r12 = 0;
    L27:
        if (r12 >= r11) goto L33;
        Object r13 = r3.get(r12);
        r12 = r12 + 1;
        ServiceInfo r14 = (ServiceInfo) r13;
        if (r9.packageName.equals(r14.packageName) == false) goto L27;
        if (r9.name.equals(r14.name) == false) goto L27;
    L33:
        String r15 = r9.packageName;
        String r16 = r9.name;
        int r17 = r2.size();
        int r18 = 0;
    L34:
        if (r18 >= r17) goto L41;
        ComponentName r19 = ((cy3) r2.get(r18)).v;
        if (r19.getPackageName().equals(r15) == false) goto L40;
        if (r19.getClassName().equals(r16) == false) goto L40;
    L42:
        if (r18 < 0) goto L43;
        if (r18 < r8) goto L14;
        cy3 r20 = (cy3) r2.get(r18);
        if (r20.y == true) goto L53;
        r20.y = true;
        r20.l();
    L53:
        if (r20.A == null) goto L55;
    L62:
        int r21 = r8 + 1;
        Collections.swap(r2, r18, r8);
    L47:
        r8 = r21;
        goto L14
    L55:
        if (r20.y == false) goto L62;
        if (r20.r == null) goto L60;
    L61:
        r20.k();
        r20.h();
        goto L62
    L60:
        if (r20.x.isEmpty() == true) goto L62;
    L43:
        cy3 r22 = new cy3((Context) this.b, new ComponentName(r9.packageName, r9.name));
        r22.C = new ss2(this, r22);
        if (r22.y == true) goto L46;
        r22.y = true;
        r22.l();
    L46:
        r21 = r8 + 1;
        r2.add(r8, r22);
        r0.a(r22, false);
    L40:
        r18 = r18 + 1;
        goto L34
    L41:
        r18 = -1;
        goto L42
    L21:
        r10 = yq2.c().p;
        goto L22
    L64:
        if (r8 >= r2.size()) goto L74;
        int r110 = r2.size() - 1;
    L66:
        if (r110 < r8) goto L100;
        cy3 r23 = (cy3) r2.get(r110);
        vq2 r24 = r0.d(r23);
        if (r24 == null) goto L70;
        r23.getClass();
        yq2.b();
        r23.q = null;
        r23.g(null);
        r0.m(r24, null);
        r0.a.b(514, r24);
        r0.k.remove(r24);
    L70:
        r2.remove(r23);
        r23.C = null;
        if (r23.y == false) goto L73;
        r23.y = false;
        r23.l();
    L73:
        r110 = r110 - 1;
        goto L66
    L100:
        return;
    L74:
        return;
    }

    public ip0(Context r3, ui1 r4) {
        this.f = new ArrayList();
        this.g = new v9(9, this);
        this.h = new g5(26, this);
        this.b = r3;
        this.c = r4;
        this.d = new Handler();
        this.e = r3.getPackageManager();
    }
}
