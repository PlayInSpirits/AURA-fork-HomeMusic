package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sr extends xb0 {
    public final v9 f;
    public final /* synthetic */ int g;

    public sr(Context r1, bq4 r2, int r3) {
        this.g = r3;
        super(r2, r1);
        this.f = new v9(3, this);
    }

    @Override // defpackage.xb0
    public final Object a() {
        int r0 = this.g;
        Context r6 = this.b;
        boolean r7 = true;
        switch(r0) {
            case 0: goto L34;
            case 1: goto L23;
            default: goto L4;
        };
    L4:
        Intent r9 = r6.registerReceiver(null, e());
        if (r9 == null) goto L22;
        if (r9.getAction() == null) goto L22;
        String r10 = r9.getAction();
        if (r10 == null) goto L20;
        int r1 = r10.hashCode();
        if (r1 != (-1181163412)) goto L14;
        r10.equals("android.intent.action.DEVICE_STORAGE_LOW");
        goto L20
    L14:
        if (r1 != (-730838620)) goto L20;
        if (r10.equals("android.intent.action.DEVICE_STORAGE_OK") == true) goto L22;
    L20:
        r7 = false;
    L22:
        return Boolean.valueOf(r7);
    L23:
        Intent r11 = r6.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (r11 != null) goto L26;
        cx.f().d(ur.a, "getInitialState - null intent received");
        return Boolean.FALSE;
    L26:
        int r2 = r11.getIntExtra("status", -1);
        float r3 = r11.getIntExtra("level", -1) / r11.getIntExtra("scale", -1);
        if (r2 == 1) goto L33;
        if (r3 > 0.15f) goto L33;
        r7 = false;
    L33:
        return Boolean.valueOf(r7);
    L34:
        Intent r12 = r6.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (r12 != null) goto L37;
        cx.f().d(tr.a, "getInitialState - null intent received");
        return Boolean.FALSE;
    L37:
        int r13 = r12.getIntExtra("status", -1);
        if (r13 == 2) goto L44;
        if (r13 == 5) goto L44;
        r7 = false;
    L44:
        return Boolean.valueOf(r7);
    }

    @Override // defpackage.xb0
    public final void c() {
        cx.f().b(lv.a, getClass().getSimpleName().concat(": registering receiver"));
        v9 r0 = this.f;
        IntentFilter r1 = e();
        this.b.registerReceiver(r0, r1);
    }

    @Override // defpackage.xb0
    public final void d() {
        cx.f().b(lv.a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.b.unregisterReceiver(this.f);
    }

    public final IntentFilter e() {
        switch(this.g) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        IntentFilter r1 = new IntentFilter();
        r1.addAction("android.intent.action.DEVICE_STORAGE_OK");
        r1.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return r1;
    L6:
        IntentFilter r2 = new IntentFilter();
        r2.addAction("android.intent.action.BATTERY_OKAY");
        r2.addAction("android.intent.action.BATTERY_LOW");
        return r2;
    L8:
        IntentFilter r3 = new IntentFilter();
        r3.addAction("android.os.action.CHARGING");
        r3.addAction("android.os.action.DISCHARGING");
        return r3;
    }
}
