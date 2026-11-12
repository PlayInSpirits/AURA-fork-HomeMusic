package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.eddyizm.tempus.glide.CustomGlideModule;
import defpackage.d04;
import defpackage.ey3;
import defpackage.hi1;
import defpackage.y41;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final CustomGlideModule i = new CustomGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.eddyizm.tempus.glide.CustomGlideModule");
        }
    }

    @Override // defpackage.g12
    public final void G() {
        this.i.getClass();
    }

    @Override // defpackage.g12
    public final void M(Context context, a aVar, ey3 ey3Var) {
        this.i.M(context, aVar, ey3Var);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final Set V() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public final d04 W() {
        return new y41(17);
    }

    @Override // defpackage.g12
    public final void e(Context context, hi1 hi1Var) {
        this.i.e(context, hi1Var);
    }
}
