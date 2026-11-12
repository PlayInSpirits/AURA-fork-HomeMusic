package com.eddyizm.tempus.glide;

import android.content.Context;
import com.bumptech.glide.a;
import com.eddyizm.tempus.App;
import defpackage.ab3;
import defpackage.e20;
import defpackage.ei1;
import defpackage.ey3;
import defpackage.g04;
import defpackage.g12;
import defpackage.hg3;
import defpackage.hi1;
import defpackage.iu0;
import defpackage.ji0;
import defpackage.na4;
import defpackage.om1;
import defpackage.rf2;
import defpackage.vi0;
import defpackage.vw2;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class CustomGlideModule extends g12 {
    public CustomGlideModule() {
    }

    @Override // defpackage.g12
    public final void M(Context r3, a r4, ey3 r5) {
        ji0 r6 = new ji0(2);
        rf2 r7 = r5.a;
        monitor-enter(r7);
        na4 r0 = (na4) r7.n;     // Catch: Throwable -> L19
        monitor-enter(r0);     // Catch: Throwable -> L19
        ArrayList r1 = r0.M();     // Catch: Throwable -> L14
        r0.e(String.class, InputStream.class, r6);     // Catch: Throwable -> L14
        monitor-exit(r0);     // Catch: Throwable -> L19
        int r2 = r1.size();     // Catch: Throwable -> L19
        int r8 = 0;
    L9:
        if (r8 >= r2) goto L11;
        Object r9 = r1.get(r8);     // Catch: Throwable -> L19
        r8 = r8 + 1;     // Catch: Throwable -> L19
        ((vw2) r9).getClass();     // Catch: Throwable -> L19
        goto L9
    L11:
        ((HashMap) ((om1) r7.o).o).clear();     // Catch: Throwable -> L19
        monitor-exit(r7);
        return;
    L14:
        th = move-exception;
        throw th;     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.g12
    public final void e(Context r5, hi1 r6) {
        App.b().getClass();
        String r4 = App.c().getString("image_cache_size", "500");
        r4.getClass();
        r6.i = new e20(r5, "cache", Integer.parseInt(r4) * 1048576);
        g04 r7 = new g04();
        ab3 r8 = iu0.f;
        vi0 r0 = vi0.o;
        r6.m = new hg3(21, (g04) r7.v(r8, r0).v(ei1.a, r0));
    }
}
