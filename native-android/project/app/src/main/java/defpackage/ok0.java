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
    public final /* synthetic */ int n = 1;
    public final /* synthetic */ DefaultErrorActivity o;

    public /* synthetic */ ok0(DefaultErrorActivity defaultErrorActivity) {
        this.o = defaultErrorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.n;
        DefaultErrorActivity defaultErrorActivity = this.o;
        switch (i) {
            case 0:
                int i2 = DefaultErrorActivity.N;
                Application application = sg0.a;
                defaultErrorActivity.finish();
                Process.killProcess(Process.myPid());
                System.exit(10);
                break;
            default:
                int i3 = DefaultErrorActivity.N;
                e9 e9Var = new e9(defaultErrorActivity);
                a9 a9Var = e9Var.a;
                a9Var.d = a9Var.a.getText(R.string.customactivityoncrash_error_activity_error_details_title);
                a9Var.f = sg0.b(defaultErrorActivity, defaultErrorActivity.getIntent());
                TextView textView = (TextView) e9Var.setPositiveButton(R.string.customactivityoncrash_error_activity_error_details_close, null).e(R.string.customactivityoncrash_error_activity_error_details_copy, new vr(1, defaultErrorActivity)).h().findViewById(android.R.id.message);
                if (textView != null) {
                    textView.setTextSize(0, defaultErrorActivity.getResources().getDimension(R.dimen.customactivityoncrash_error_activity_error_details_text_size));
                }
                break;
        }
    }

    public /* synthetic */ ok0(DefaultErrorActivity defaultErrorActivity, oz ozVar) {
        this.o = defaultErrorActivity;
    }
}
