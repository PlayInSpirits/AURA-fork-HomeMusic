package cat.ereza.customactivityoncrash.activity;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import app.homemusic.R;
import defpackage.df;
import defpackage.ft3;
import defpackage.g14;
import defpackage.j8;
import defpackage.ok0;
import defpackage.oz;
import defpackage.sg0;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultErrorActivity extends df {
    public static final /* synthetic */ int N = 0;

    public DefaultErrorActivity() {
    }

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle r4) {
        super.onCreate(r4);
        TypedArray r5 = obtainStyledAttributes(ft3.a);
        if (r5.hasValue(117) == true) goto L5;
        setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
    L5:
        r5.recycle();
        setContentView(R.layout.customactivityoncrash_default_error_activity);
        Button r6 = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        oz r0 = sg0.c(getIntent());
        if (r0 != null) goto L10;
        finish();
        return;
    L10:
        if (r0.p == null) goto L12;
        r6.setText(R.string.customactivityoncrash_error_activity_restart_app);
        r6.setOnClickListener(new j8(7, this, r0));
    L13:
        ((Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button)).setOnClickListener(new ok0(this));
        Integer r7 = r0.n;
        ImageView r1 = (ImageView) findViewById(R.id.customactivityoncrash_error_activity_image);
        if (r7 == null) goto L17;
        Resources r2 = getResources();
        int r8 = r7.intValue();
        Resources.Theme r3 = getTheme();
        ThreadLocal r9 = g14.a;
        r1.setImageDrawable(r2.getDrawable(r8, r3));
        return;
    L17:
        return;
    L12:
        r6.setOnClickListener(new ok0(this, r0));
        goto L13
    }
}
