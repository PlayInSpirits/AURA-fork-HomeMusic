package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class v9 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public v9(MainActivity mainActivity) {
        this.a = 4;
        this.b = mainActivity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                w9 w9Var = (w9) obj;
                w9Var.c.execute(new u9(w9Var, 2));
                break;
            case 1:
                ((b3) obj).l();
                break;
            case 2:
                if (!isInitialStickyBroadcast()) {
                    ql qlVar = (ql) obj;
                    qlVar.a(nl.c(context, intent, qlVar.i, qlVar.h));
                    break;
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                context.getClass();
                intent.getClass();
                sr srVar = (sr) obj;
                switch (srVar.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            cx.f().b(tr.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        srVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        srVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        srVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        srVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            cx.f().b(ur.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode == -1980154005) {
                                    if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                        srVar.b(Boolean.TRUE);
                                        break;
                                    }
                                } else if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    srVar.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            cx.f().b(cm4.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        srVar.b(Boolean.FALSE);
                                        break;
                                    }
                                } else if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    srVar.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            case 4:
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    MainActivity mainActivity = (MainActivity) obj;
                    if (!intent.getBooleanExtra("noConnectivity", false)) {
                        ((TextView) mainActivity.R.b).setVisibility(8);
                        break;
                    } else {
                        ((TextView) mainActivity.R.b).setVisibility(0);
                        break;
                    }
                }
                break;
            case 5:
                EqualizerFragment equalizerFragment = (EqualizerFragment) obj;
                if (h12.c(intent != null ? intent.getAction() : null, "com.eddyizm.tempus.service.EQUALIZER_UPDATED")) {
                    EqualizerFragment.h0(equalizerFragment);
                    EqualizerFragment.i0(equalizerFragment);
                    break;
                }
                break;
            case 6:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((ep2) obj).dismiss();
                    break;
                }
                break;
            case 7:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((xk2) ((wo0) ((ls2) obj).m.p).n).a.dispatchMediaButtonEvent(keyEvent);
                    break;
                }
                break;
            case 8:
                ((v53) obj).a.execute(new ur2(7, this, context));
                break;
            case 9:
                ((ip0) obj).c();
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    ((hq1) obj).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
