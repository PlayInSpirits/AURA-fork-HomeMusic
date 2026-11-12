package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oc5 extends jw2 {
    public final /* synthetic */ int c;

    public /* synthetic */ oc5(int r1, int r2, int r3) {
        this.c = r3;
        super(r1, r2);
    }

    @Override // defpackage.jw2
    public final void a(we1 r1) {
        switch(this.c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        r1.q("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
        return;
    L6:
        r1.q("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
