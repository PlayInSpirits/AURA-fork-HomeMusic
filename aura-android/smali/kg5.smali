.class public final Lkg5;
.super Ldj1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final l:Lrf2;

.field public static final m:Lrf2;


# instance fields
.field public final k:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lpa;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lu02;

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lrf2;

    .line 14
    .line 15
    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    .line 16
    .line 17
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lkg5;->l:Lrf2;

    .line 21
    .line 22
    new-instance v0, Lpa;

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lu02;

    .line 29
    .line 30
    const/4 v2, 0x7

    .line 31
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Lrf2;

    .line 35
    .line 36
    const-string v3, "Auth.Api.Identity.SignIn.API"

    .line 37
    .line 38
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 39
    .line 40
    .line 41
    sput-object v2, Lkg5;->m:Lrf2;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ldh5;)V
    .locals 6

    .line 22
    sget-object v5, Lcj1;->c:Lcj1;

    const/4 v2, 0x0

    .line 23
    sget-object v3, Lkg5;->m:Lrf2;

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 24
    invoke-static {}, Lmg5;->a()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lkg5;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/credentials/playservices/HiddenActivity;Ldh5;)V
    .locals 6

    .line 19
    sget-object v3, Lkg5;->m:Lrf2;

    sget-object v5, Lcj1;->c:Lcj1;

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 20
    invoke-direct/range {v0 .. v5}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 21
    invoke-static {}, Lmg5;->a()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lkg5;->k:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/credentials/playservices/HiddenActivity;Lxg5;)V
    .locals 6

    .line 1
    sget-object v3, Lkg5;->l:Lrf2;

    .line 2
    .line 3
    sget-object v5, Lcj1;->c:Lcj1;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v4, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lmg5;->a()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iput-object p0, v0, Lkg5;->k:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public static c(Landroid/content/Intent;)Ltd4;
    .locals 4

    .line 1
    sget-object v0, Lcom/google/android/gms/common/api/Status;->t:Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 6
    .line 7
    const-string v2, "status"

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    move-object v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v2, v1}, Lsu3;->o([BLandroid/os/Parcelable$Creator;)Lk44;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    check-cast v1, Lcom/google/android/gms/common/api/Status;

    .line 23
    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    iget v2, v1, Lcom/google/android/gms/common/api/Status;->n:I

    .line 27
    .line 28
    if-gtz v2, :cond_3

    .line 29
    .line 30
    sget-object v1, Ltd4;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 31
    .line 32
    const-string v2, "sign_in_credential"

    .line 33
    .line 34
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    invoke-static {p0, v1}, Lsu3;->o([BLandroid/os/Parcelable$Creator;)Lk44;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :goto_1
    check-cast v3, Ltd4;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    new-instance p0, Lcom/google/android/gms/common/api/ApiException;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_3
    new-instance p0, Lcom/google/android/gms/common/api/ApiException;

    .line 57
    .line 58
    invoke-direct {p0, v1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 59
    .line 60
    .line 61
    throw p0

    .line 62
    :cond_4
    new-instance p0, Lcom/google/android/gms/common/api/ApiException;

    .line 63
    .line 64
    sget-object v0, Lcom/google/android/gms/common/api/Status;->v:Lcom/google/android/gms/common/api/Status;

    .line 65
    .line 66
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 67
    .line 68
    .line 69
    throw p0

    .line 70
    :cond_5
    new-instance p0, Lcom/google/android/gms/common/api/ApiException;

    .line 71
    .line 72
    invoke-direct {p0, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 73
    .line 74
    .line 75
    throw p0
.end method
