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
    @Override // defpackage.g12
    public final void M(Context context, a aVar, ey3 ey3Var) {
        ArrayList arrayListM;
        ji0 ji0Var = new ji0(2);
        rf2 rf2Var = ey3Var.a;
        synchronized (rf2Var) {
            na4 na4Var = (na4) rf2Var.n;
            synchronized (na4Var) {
                arrayListM = na4Var.M();
                na4Var.e(String.class, InputStream.class, ji0Var);
            }
            int size = arrayListM.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM.get(i);
                i++;
                ((vw2) obj).getClass();
            }
            ((HashMap) ((om1) rf2Var.o).o).clear();
        }
    }

    @Override // defpackage.g12
    public final void e(Context context, hi1 hi1Var) {
        App.b().getClass();
        String string = App.c().getString("image_cache_size", "500");
        string.getClass();
        hi1Var.i = new e20(context, "cache", Integer.parseInt(string) * 1048576);
        g04 g04Var = new g04();
        ab3 ab3Var = iu0.f;
        vi0 vi0Var = vi0.o;
        hi1Var.m = new hg3(21, (g04) g04Var.v(ab3Var, vi0Var).v(ei1.a, vi0Var));
    }
}
