package defpackage;

import android.app.Application;
import android.os.Process;
import android.view.View;
import android.widget.TextView;
import app.homemusic.R;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ok0 implements View.OnClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ DefaultErrorActivity o;

    public /* synthetic */ ok0(DefaultErrorActivity r2) {
        this.n = 1;
        this.o = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r4) {
        int r5 = this.n;
        DefaultErrorActivity r3 = this.o;
        switch(r5) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        int r6 = DefaultErrorActivity.N;
        e9 r7 = new e9(r3);
        a9 r0 = r7.a;
        r0.d = r0.a.getText(R.string.customactivityoncrash_error_activity_error_details_title);
        r0.f = sg0.b(r3, r3.getIntent());
        TextView r8 = (TextView) r7.setPositiveButton(R.string.customactivityoncrash_error_activity_error_details_close, null).e(R.string.customactivityoncrash_error_activity_error_details_copy, new vr(1, r3)).h().findViewById(android.R.id.message);
        if (r8 == null) goto L10;
        r8.setTextSize(0, r3.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
        return;
    L10:
        return;
    L8:
        int r9 = DefaultErrorActivity.N;
        Application r10 = sg0.a;
        r3.finish();
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public /* synthetic */ ok0(DefaultErrorActivity r1, oz r2) {
        this.n = 0;
        this.o = r1;
    }
}
