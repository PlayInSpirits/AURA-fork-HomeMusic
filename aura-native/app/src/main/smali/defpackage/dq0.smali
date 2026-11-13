.class public final Ldefpackage/dq0;
.super Ldefpackage/b3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    packed-switch p2, :pswitch_data_0

    .line 3
    .line 4
    .line 5
    const-string p2, "android.credentials.TYPE_PASSWORD_CREDENTIAL"

    .line 6
    .line 7
    invoke-direct {p0, p2, p3}, Ldefpackage/b3;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-lez p0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "password should not be empty"

    .line 18
    .line 19
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0

    .line 23
    :pswitch_0
    const-string p2, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL"

    .line 24
    .line 25
    invoke-direct {p0, p2, p3}, Ldefpackage/b3;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    :cond_1
    const-string p0, "authenticationResponseJson must not be empty, and must be a valid JSON"

    .line 41
    .line 42
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    invoke-direct/range {p0 .. p2}, Ldefpackage/b3;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
