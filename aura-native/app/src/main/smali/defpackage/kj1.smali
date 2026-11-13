.class public final Ldefpackage/kj1;
.super Ldefpackage/tg0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"

    .line 18
    .line 19
    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"

    .line 23
    .line 24
    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"

    .line 28
    .line 29
    invoke-virtual {v0, p3, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string p3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"

    .line 33
    .line 34
    invoke-virtual {v0, p3, p5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string p3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"

    .line 38
    .line 39
    invoke-virtual {v0, p3, p7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string p3, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"

    .line 43
    .line 44
    invoke-virtual {v0, p3, p6}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 45
    .line 46
    .line 47
    const-string p3, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    .line 48
    .line 49
    invoke-direct {p0, p3, v0}, Ldefpackage/tg0;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ldefpackage/kj1;->c:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p2, p0, Ldefpackage/kj1;->d:Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    const/4 p1, 0x0

    .line 61
    if-lez p0, :cond_1

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-lez p0, :cond_0

    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    const-string p0, "idToken should not be empty"

    .line 71
    .line 72
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw p1

    .line 76
    :cond_1
    const-string p0, "id should not be empty"

    .line 77
    .line 78
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method
