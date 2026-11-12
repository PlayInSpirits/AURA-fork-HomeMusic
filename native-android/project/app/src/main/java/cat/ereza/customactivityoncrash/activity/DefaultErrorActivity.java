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

    @Override // defpackage.nc1, defpackage.l70, defpackage.k70, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(ft3.a);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentView(R.layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        oz ozVarC = sg0.c(getIntent());
        if (ozVarC == null) {
            finish();
            return;
        }
        if (ozVarC.p != null) {
            button.setText(R.string.customactivityoncrash_error_activity_restart_app);
            button.setOnClickListener(new j8(7, this, ozVarC));
        } else {
            button.setOnClickListener(new ok0(this, ozVarC));
        }
        ((Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button)).setOnClickListener(new ok0(this));
        Integer num = ozVarC.n;
        ImageView imageView = (ImageView) findViewById(R.id.customactivityoncrash_error_activity_image);
        if (num != null) {
            Resources resources = getResources();
            int iIntValue = num.intValue();
            Resources.Theme theme = getTheme();
            ThreadLocal threadLocal = g14.a;
            imageView.setImageDrawable(resources.getDrawable(iIntValue, theme));
        }
    }
}
