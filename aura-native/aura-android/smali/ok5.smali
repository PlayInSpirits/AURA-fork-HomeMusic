.class public final Lok5;
.super Lcom/google/android/gms/common/internal/a;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lsk5;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lsk5;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Lsk5;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, Lsk5;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final c()[Lp61;
    .locals 1

    .line 1
    sget-object p0, Lgh0;->i:Lp61;

    .line 2
    .line 3
    sget-object v0, Lgh0;->h:Lp61;

    .line 4
    .line 5
    filled-new-array {p0, v0}, [Lp61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d()Landroid/os/Bundle;
    .locals 1

    .line 1
    const-string p0, "FIDO2_ACTION_START_SERVICE"

    .line 2
    .line 3
    const-string v0, "com.google.android.gms.fido.fido2.regular.START"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService"

    .line 2
    .line 3
    return-object p0
.end method

.method public final f0()I
    .locals 0

    .line 1
    const p0, 0xc65d40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final g()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.fido.fido2.regular.START"

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
