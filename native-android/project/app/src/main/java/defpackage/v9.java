package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.TextView;
import com.eddyizm.tempus.ui.activity.MainActivity;
import com.eddyizm.tempus.ui.fragment.EqualizerFragment;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public v9(MainActivity r2) {
        this.a = 4;
        this.b = r2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r4, Intent r5) {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L106;
            case 1: goto L104;
            case 2: goto L101;
            case 3: goto L39;
            case 4: goto L33;
            case 5: goto L24;
            case 6: goto L21;
            case 7: goto L13;
            case 8: goto L10;
            case 9: goto L8;
            default: goto L5;
        };
    L8:
        ((ip0) r1).c();
        return;
    L10:
        ((v53) r1).a.execute(new ur2(7, this, r4));
        return;
    L24:
        EqualizerFragment r2 = (EqualizerFragment) r1;
        if (r5 == null) goto L27;
        String r3 = r5.getAction();
    L29:
        if (h12.c(r3, "com.eddyizm.tempus.service.EQUALIZER_UPDATED") == false) goto L112;
        EqualizerFragment.h0(r2);
        EqualizerFragment.i0(r2);
        return;
    L112:
        return;
    L27:
        r3 = null;
        goto L29
    L39:
        r4.getClass();
        r5.getClass();
        sr r6 = (sr) r1;
        switch(r6.g) {
            case 0: goto L77;
            case 1: goto L60;
            default: goto L42;
        };
    L77:
        String r7 = r5.getAction();
        if (r7 == null) goto L132;
        cx.f().b(tr.a, "Received ".concat(r7));
        switch(r7.hashCode()) {
            case -1886648615: goto L96;
            case -54942926: goto L92;
            case 948344062: goto L88;
            case 1019184907: goto L84;
            default: goto L133;
        };
    L133:
        return;
    L84:
        if (r7.equals("android.intent.action.ACTION_POWER_CONNECTED") == false) goto L134;
        r6.b(Boolean.TRUE);
        return;
    L134:
        return;
    L88:
        if (r7.equals("android.os.action.CHARGING") == false) goto L135;
        r6.b(Boolean.TRUE);
        return;
    L135:
        return;
    L92:
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L136;
        r6.b(Boolean.FALSE);
        return;
    L136:
        return;
    L96:
        if (r7.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L137;
        r6.b(Boolean.FALSE);
        return;
    L137:
        return;
    L132:
        return;
    L42:
        if (r5.getAction() == null) goto L124;
        cx.f().b(cm4.a, "Received " + r5.getAction());
        String r8 = r5.getAction();
        if (r8 == null) goto L115;
        int r9 = r8.hashCode();
        if (r9 == (-1181163412)) goto L56;
        if (r9 == (-730838620)) goto L52;
        return;
    L52:
        if (r8.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L126;
        r6.b(Boolean.TRUE);
        return;
    L126:
        return;
    L56:
        if (r8.equals("android.intent.action.DEVICE_STORAGE_LOW") == false) goto L127;
        r6.b(Boolean.FALSE);
        return;
    L127:
        return;
    L115:
        return;
    L124:
        return;
    L60:
        if (r5.getAction() == null) goto L128;
        cx.f().b(ur.a, "Received " + r5.getAction());
        String r10 = r5.getAction();
        if (r10 == null) goto L118;
        int r11 = r10.hashCode();
        if (r11 == (-1980154005)) goto L74;
        if (r11 == 490310653) goto L70;
        return;
    L70:
        if (r10.equals("android.intent.action.BATTERY_LOW") == false) goto L130;
        r6.b(Boolean.FALSE);
        return;
    L130:
        return;
    L74:
        if (r10.equals("android.intent.action.BATTERY_OKAY") == false) goto L131;
        r6.b(Boolean.TRUE);
        return;
    L131:
        return;
    L118:
        return;
    L128:
        return;
    L104:
        ((b3) r1).l();
        return;
    L106:
        w9 r12 = (w9) r1;
        r12.c.execute(new u9(r12, 2));
        return;
    L5:
        if (isInitialStickyBroadcast() == true) goto L108;
        ((hq1) r1).j();
        return;
    L108:
        return;
    L13:
        if (Objects.equals(r5.getAction(), "android.intent.action.MEDIA_BUTTON") == false) goto L109;
        KeyEvent r13 = (KeyEvent) r5.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (r13 == null) goto L110;
        ((xk2) ((wo0) ((ls2) r1).m.p).n).a.dispatchMediaButtonEvent(r13);
        return;
    L110:
        return;
    L109:
        return;
    L21:
        if ("android.intent.action.SCREEN_OFF".equals(r5.getAction()) == false) goto L111;
        ((ep2) r1).dismiss();
        return;
    L111:
        return;
    L33:
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(r5.getAction()) == false) goto L113;
        MainActivity r14 = (MainActivity) r1;
        if (r5.getBooleanExtra("noConnectivity", false) == false) goto L37;
        ((TextView) r14.R.b).setVisibility(0);
        return;
    L37:
        ((TextView) r14.R.b).setVisibility(8);
        return;
    L113:
        return;
    L101:
        if (isInitialStickyBroadcast() == true) goto L138;
        ql r15 = (ql) r1;
        r15.a(nl.c(r4, r5, r15.i, r15.h));
        return;
    }

    public /* synthetic */ v9(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }
}
