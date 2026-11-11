.class public final Lr61;
.super Ldj1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final k:Lrf2;

.field public static final l:Lrf2;

.field public static final m:Lrf2;

.field public static n:I = 0x1


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
    new-instance v1, Lrf2;

    .line 8
    .line 9
    new-instance v2, Lu02;

    .line 10
    .line 11
    const/16 v3, 0x9

    .line 12
    .line 13
    invoke-direct {v2, v3}, Lu02;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const-string v3, "Fido.FIDO2_API"

    .line 17
    .line 18
    invoke-direct {v1, v3, v2, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lr61;->k:Lrf2;

    .line 22
    .line 23
    new-instance v0, Lpa;

    .line 24
    .line 25
    const/4 v1, 0x6

    .line 26
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lu02;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 33
    .line 34
    .line 35
    new-instance v2, Lrf2;

    .line 36
    .line 37
    const-string v3, "RestoreCredential.API"

    .line 38
    .line 39
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 40
    .line 41
    .line 42
    sput-object v2, Lr61;->l:Lrf2;

    .line 43
    .line 44
    new-instance v0, Lpa;

    .line 45
    .line 46
    const/4 v1, 0x6

    .line 47
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lu02;

    .line 51
    .line 52
    const/4 v2, 0x4

    .line 53
    invoke-direct {v1, v2}, Lu02;-><init>(I)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Lrf2;

    .line 57
    .line 58
    const-string v3, "ClientTelemetry.API"

    .line 59
    .line 60
    invoke-direct {v2, v3, v1, v0}, Lrf2;-><init>(Ljava/lang/String;Lvr1;Lpa;)V

    .line 61
    .line 62
    .line 63
    sput-object v2, Lr61;->m:Lrf2;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public declared-synchronized c()I
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, Lr61;->n:I

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Ldj1;->a:Landroid/content/Context;

    .line 8
    .line 9
    sget-object v1, Lej1;->c:Lej1;

    .line 10
    .line 11
    const v2, 0xbdfcb8

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v0, v2}, Lfj1;->b(Landroid/content/Context;I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    sput v0, Lr61;->n:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v1, v2, v0, v3}, Lfj1;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Loy0;->a(Landroid/content/Context;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x3

    .line 40
    sput v0, Lr61;->n:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v0, 0x2

    .line 44
    sput v0, Lr61;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    :cond_2
    :goto_0
    monitor-exit p0

    .line 47
    return v0

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v0
.end method
