package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Process;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import app.homemusic.R;
import com.eddyizm.tempus.ui.crash.CrashActivity;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class if0 extends kc1 {
    public oz l0;
    public Button m0;
    public Button n0;
    public TextView o0;

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_crash_info, viewGroup, false);
        this.m0 = (Button) viewInflate.findViewById(R.id.crashInfoButtonClose);
        this.n0 = (Button) viewInflate.findViewById(R.id.crashInfoButtonRestart);
        this.o0 = (TextView) viewInflate.findViewById(R.id.crashInfoDeviceData);
        return viewInflate;
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        this.l0 = ((CrashActivity) e()).O;
        final int i = 0;
        this.m0.setOnClickListener(new View.OnClickListener(this) { // from class: hf0
            public final /* synthetic */ if0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                if0 if0Var = this.o;
                switch (i2) {
                    case 0:
                        nc1 nc1VarE = if0Var.e();
                        oz ozVar = if0Var.l0;
                        Application application = sg0.a;
                        ozVar.getClass();
                        nc1VarE.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(10);
                        break;
                    default:
                        sg0.d(if0Var.e(), if0Var.l0);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.n0.setOnClickListener(new View.OnClickListener(this) { // from class: hf0
            public final /* synthetic */ if0 o;

            {
                this.o = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                if0 if0Var = this.o;
                switch (i3) {
                    case 0:
                        nc1 nc1VarE = if0Var.e();
                        oz ozVar = if0Var.l0;
                        Application application = sg0.a;
                        ozVar.getClass();
                        nc1VarE.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(10);
                        break;
                    default:
                        sg0.d(if0Var.e(), if0Var.l0);
                        break;
                }
            }
        });
        this.o0.setText(bu.m(Z()));
        this.o0.setTypeface(Typeface.MONOSPACE);
        this.o0.setMovementMethod(new ScrollingMovementMethod());
    }
}
